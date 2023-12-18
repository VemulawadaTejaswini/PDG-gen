import java.util.Scanner;

public class Main {
    static class Pair {
        int left;
        int right;

        Pair(int l, int r) {
            left = l;
            right = r;
        }
    }

    static int len(int x) {
        if (x == 1) {
            return x;
        }

        return x * len(x - 1);
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(std.nextInt(), std.nextInt());
        }

        double[][] dp = new double[n+1][n+1];

        for (int i = 0; i < n; i++) {
            Pair start = pairs[i];
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }

                Pair next = pairs[j];
                double l = Math.pow((start.left - next.left), 2);
                double r = Math.pow((start.right - next.right), 2);
                dp[i][j] = Math.sqrt(l + r);
            }
        }

        double ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += dp[i][j];
            }
        }

        ans /= n;
        System.out.println(ans);
    }
}
