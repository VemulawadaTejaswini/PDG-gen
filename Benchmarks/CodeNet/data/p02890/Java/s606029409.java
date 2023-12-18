package com.abc143;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            int x = std.nextInt() - 1;
            a[x]++;
        }

        Integer[] sorted = Arrays.stream(a).sorted().toArray(Integer[]::new);
        int[] s = new int[n + 1];
        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] + sorted[i];
        }

        // 1 ~ n takes
        for (int k = 1; k <= n; k++) {
            final int kIndex = k;
            int l = 0, r = n/k + 1;
            while (l + 1 < r) {
                int c = (l + r) / 2;
                Function<Integer, Boolean> f = integer -> {
                    int i = ~Arrays.binarySearch(sorted, integer, (l1, r1) -> l1.compareTo(r1) >= 0 ? 1 : -1);
                    int sum = integer * (n - i) + s[i];
                    return (sum >= integer * kIndex);
                };

                if (f.apply(c)) {
                    l = c;
                } else {
                    r = c;
                }
            }

            System.out.println(l);
        }

    }
}
