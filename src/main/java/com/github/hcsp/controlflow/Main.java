package com.github.hcsp.controlflow;

public class Main {
    /**
     * 打印从start到end区间所有的奇数，包括start和end本身（若符合条件）。 注意，数字之间用英文逗号分隔。
     *
     * <p>例如，start=1,end=5，则打印1,3,5 又如，start=-2,end=2，则打印-1,1
     *
     * @param start 区间开始
     * @param end 区间结束
     */
    public static void printOddNumbersBetween(int start, int end) {
        int i = start;
        int count = 0;
        while(i <= end) {
            if(i % 2 != 0){
                if(count == 0){
                    System.out.print(i);
                } else {
                    System.out.print(","+i);
                }
                count ++;
            }
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printOddNumbersBetween(1, 5);
        printOddNumbersBetween(-2, 2);
    }
}
