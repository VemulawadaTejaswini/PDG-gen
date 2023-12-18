import java.util.Scanner;

public class Main {
    private static long max(long x, long y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int W = sc.nextInt();

        long[][] dp = new long[N + 1][W + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= W; j++) {
                dp[i][j] = -1;
            }
        }

        dp[0][0] = 0;
        for (int i = 0; i < N; i++) {
            int w = sc.nextInt();
            int v = sc.nextInt();
            for (int j = 0; j <= W; j++) {
                if (dp[i][j] == -1) {
                    continue;
                }
                dp[i + 1][j] = max(dp[i + 1][j], dp[i][j]);
                if (j + w <= W) {
                    dp[i + 1][j + w] = max(dp[i + 1][j + w], dp[i][j] + v);
                }
            }
        }

        long result = 0;
        for (int j = 0; j <= W; j++) {
            if (dp[N][j] > result) {
                result = dp[N][j];
            }
        }

        System.out.println(result);
    }
}
