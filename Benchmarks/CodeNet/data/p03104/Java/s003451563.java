//package Beginner121;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();

//        System.out.println(func(a, b));
        System.out.println(func1(b) ^ func1(a - 1));
    }

    private static long func(long from, long num) {
        long xor = 0;
        for (long i = from; i <= num; i++) {
            xor ^= i;
        }
        return xor;
    }

    static long previousPowerOf2(long n)
    {
        // do till only one bit is left
        while ((n & n - 1) !=0)
            n = n & n - 1;	// unset rightmost bit

        // n is now a power of two (less than or equal to n)
        return n;
    }

    private static long func1(long num) {

        if(num <= 3) {
            long xor = 0;
            for (int i = 1; i <= num; i++) {
                xor ^= i;
            }
            return xor;
        } else {
            long num1 = num % 4;
            long from = num - num1;
            long xor = 0;
            for (long i = from; i <= num; i++) {
                xor ^= i;
            }
            return xor;
        }
    }
}