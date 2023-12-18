import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalValue = 0;
        int n = scan.nextInt();
        int w = scan.nextInt();
        int[] weights = new int[n];
        int[] values = new int[n];

        for (int i = 0; i < n; ++i) {
            weights[i] = scan.nextInt();
            values[i] = scan.nextInt();
            totalValue += values[i];
        }

        int ans = 0;
        long[][] dp = new long[n + 1][totalValue + 1];

        for (int i = 1; i <= totalValue; ++i) {
            dp[0][i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i < n + 1; ++i) {
            for (int j = 0; j <= totalValue; ++j) {
                if (values[i - 1] <= j) {
                    dp[i][j] = Math.min(dp[i - 1][j - values[i - 1]] + weights[i - 1], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }

                if (dp[i][j] <= w) ans = Math.max(ans, j);
            }
        }

        System.out.println(ans);
    }
}