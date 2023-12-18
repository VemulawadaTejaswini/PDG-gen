// package app;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // long u = sc.nextLong();
        // long D = sc.nextLong();
        // long K = sc.nextLong();

        int N = sc.nextInt();
        // int X = sc.nextInt();

        int[] W = new int[N];
        int s2 = 0;
        for (int i = 0; i < N; i++) {
            W[i] = sc.nextInt();
            s2 += W[i];
        }

        int s1 = 0;
        int minimumDiff = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            s1 += W[i];
            s2 -= W[i];

            minimumDiff = Math.min(minimumDiff, Math.abs(s1 - s2));
        }

        System.out.println(minimumDiff);
    }
}