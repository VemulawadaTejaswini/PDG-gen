

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static class Pair {
        boolean left;
        int right;
        Pair(boolean l, int r) {
            left = l;
            right = r;
        }
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int x = std.nextInt() - 1;
            a[x]++;
        }

        Arrays.sort(a);
        int[] sorted = a;
        int[] s = new int[n + 1];
        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] + sorted[i];
        }

        // 1 ~ n takes
        int ans = n;
        int i = n;
        for (int k = 1; k <= n; k++) {
            while (true) {
                Pair p = calc(i, k, a, ans, n, s);
                i = p.right;
                if (p.left) {
                    break;
                } else {
                    ans--;
                }
            }

            System.out.println(ans);
        }

    }

    static Pair calc(int i, int k, int[] a, int c, int n, int[] s) {
        while (i > 0 && a[i - 1] >= c) {
            --i;
        }
        int sum = c * (n - i) + s[i];
        return new Pair (sum >= c * k, i);
    }
}
