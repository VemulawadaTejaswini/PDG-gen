//package com.questetra.test.java;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    static final long MOD = 1000000007L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        sc.nextLine();
        final long[] A = new long[N];
        long[] lcd = new long[N];
        Arrays.fill(lcd, 1L);
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextLong();
            if (i != 0) {
                long gcd = gcd(lcd, A[i]);
                lcd[i] = A[i] / gcd;
            } else {
                lcd[i] = A[i];
            }
        }

        //        for (int i = 0; i < A.length; i++) {
        //            System.out.print(":" + lcd[i]);
        //        }
        //        System.out.println();

        long sum = 0;
        long sumB = 0;
        for (int i = 0; i < A.length; i++) {
            long b = 1;
            for (int j = 0; j < A.length; j++) {
                if (i != j) {
                    b = b * lcd[j];
                } else {
                    b = b * lcd[j] / A[j];
                }
            }
            sumB += b;
            b = b % MOD;
            sum += b;
//            System.out.print(":" + b);
        }
//        System.out.println();
//        System.out.println(sumB);
        System.out.println(sum % MOD);
    }

    private static long gcd(long[] n1, long n2) {
        while (true) {
            long n1Result = 1;
            boolean n1IsBigger = false;
            for (int i = 0; n1Result != 0 && i < n1.length; i++) {
                n1Result = n1Result * n1[i];
                if (n1Result >= n2) {
                    n1Result = n1Result % n2;
                    n1IsBigger = true;
                }
            }
            long result;
            if (n1IsBigger) {
                result = n1Result;
            } else {
                result = n2 % n1Result;
                n2 = n1Result;
            }
            if (result == 0) {
                break;
            }
            n2 = result;
            n1 = new long[]{n2};
        }
        return n2;
    }
}