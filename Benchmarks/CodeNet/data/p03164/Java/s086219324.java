import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int W = std.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            w[i] = std.nextInt();
            v[i] = std.nextInt();
        }

        long[][] dp = new long[n + 1][W + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= W; j++) {
                if (j >= w[i]) {
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i + 1][j - w[i]] + v[i]);
                } else {
                    dp[i + 1][j] = dp[i][j];
                }
            }
        }

        System.out.println(dp[n - 1][W]);
    }
}
