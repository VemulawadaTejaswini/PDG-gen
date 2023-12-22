//package com.example.myPackage;

import java.util.Scanner;

public class Main {
    private  static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        String str = s.next();

        int size = str.length();
        long sum =0l;
        for(int i=0;i<size;i++)
        {
            sum += ( str.charAt(i) -'0');

        }
//        System.out.println((int) str.charAt(0));
//        System.out.println(sum);
//        if(sum==0)
//            System.out.println("Yes");
//        else {
            if (sum % 9 == 0)
                System.out.println("Yes");
            else
                System.out.println("No");



    }
}
