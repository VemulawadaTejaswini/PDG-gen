package com.kesarling.atCoder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = Long.parseLong(scanner.nextLine());
        long K = Long.parseLong(scanner.nextLine());
        System.out.prlongln(numbersWithKNonZeroDigits(K,N));
    }

    private static long numbersWithKNonZeroDigits(long K, long N) {
        long count = 0;
        for (long i = 0; i <= N; i++) {
            long num = i;
            long nonZeroDigits = 0;
            while (num != 0) {
                if (num % 10 != 0) {
                    nonZeroDigits++;
                }
                num = num / 10;
            }
            if (nonZeroDigits == K) {
                count++;
            }
        }
        return count;
    }

}
