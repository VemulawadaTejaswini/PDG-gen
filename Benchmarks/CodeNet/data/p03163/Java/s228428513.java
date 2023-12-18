import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int W = scanner.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            w[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
        }
        long res = knapsack(N, W, w, v);
        System.out.println(res);
    }

    private static long knapsack(int N, int W, int[] w, int[] v) {
        // f(i, j): max value of first i items with at most j weight
        // f(N, W)

        // f(i, j) = max:
        //         f(i-1, j)
        //         f(i-1, j-w) + v, if j-w >= 0
        // f(0, *) = 0
        // f(*, 0) = 0
        long[][] dp = new long[N+1][W+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= W; j++) {
                dp[i][j] = dp[i-1][j];
                if (j >= w[i-1]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-w[i-1]] + v[i-1]);
                }
            }
        }
        return dp[N][W];
    }
}
