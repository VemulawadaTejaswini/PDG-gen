import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ww = sc.nextInt();
        // 0は使わない
        int[] w = new int[n + 1];
        int[] v = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        long dp[][] = new long[n + 1][100001];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < 100001; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < 100001; j++) {
                if (j - v[i] >= 0) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - v[i]] + w[i]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        for (int i = 100000; i >= 0; i--) {
            if (dp[n][i] <= ww) {
                System.out.println(i);
                return;
            }
        }

        sc.close();
    }
}