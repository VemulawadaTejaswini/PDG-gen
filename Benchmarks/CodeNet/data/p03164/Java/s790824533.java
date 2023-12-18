import java.util.Arrays;
import java.util.Scanner;

/**
 * Knapsack 1
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int W = sc.nextInt();

            int[] w = new int[N + 1];
            int[] v = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                w[i] = sc.nextInt();
                v[i] = sc.nextInt();
            }

            int V = Arrays.stream(v).sum();

            long[][] dp = new long[N + 1][V + 1];

            for (int i = 0; i <= N; i++) {
                for (int j = 1; j <= V; j++) {
                    dp[i][j] = Long.MAX_VALUE / 2;
                }
            }

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= V; j++) {
                    if (j < v[i]) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - v[i]] + w[i]);
                    }
                }
            }

            long max = 0;
            for (int j = V; j >= 0; j--) {
                if (dp[N][j] <= W) {
                    max = j;
                    break;
                }
            }

            System.out.println(max);
        }
    }

}
