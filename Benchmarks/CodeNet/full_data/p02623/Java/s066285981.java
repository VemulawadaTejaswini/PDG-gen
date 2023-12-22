

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
        }

        int ans = calc(k, a, b, 0, 0, 0);
        System.out.println(ans);
    }

    private static int calc(long k, long[] a, long[] b, int i, int j, int sum) {
        if (k < 0) {
            return sum - 1;
        }
        if (i == a.length && j == b.length) {
            return sum;
        }
        sum++;
        if (i == a.length) {
            return calc(k - b[j], a, b, i, j + 1, sum);
        } else if (j == b.length) {
            return calc(k - a[i], a, b, i + 1, j, sum);
        } else {
            return Math.max(calc(k - a[i], a, b, i + 1, j, sum), calc(k - b[j], a, b, i, j + 1, sum));
        }
    }
}