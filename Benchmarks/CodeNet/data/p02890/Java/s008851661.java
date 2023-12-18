package com.abc143;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        Integer[] a = new Integer[n];
        Arrays.fill(a, 0);

        for (int i = 0; i < n; i++) {
            int x = std.nextInt() - 1;
            a[x]++;
        }

        Arrays.sort(a);
        Integer[] sorted = a;
        int[] s = new int[n + 1];
        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] + sorted[i];
        }

        // 1 ~ n takes
        int ans = n;
        int[] i = { n };
        for (int k = 1; k <= n; k++) {
            final int kIndex = k;
            Function<Integer, Boolean> f = integer -> {
                while (i[0] > 0 && a[i[0] - 1] >= integer) {
                    --i[0];
                }
                int sum = integer * (n - i[0]) + s[i[0]];
                return (sum >= integer * kIndex);
            };

            while (true) {

                if (f.apply(ans)) {
                    break;
                } else {
                    ans--;
                }
            }

            System.out.println(ans);
        }

    }
}
