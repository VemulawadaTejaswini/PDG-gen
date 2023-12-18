import java.util.*;

public class Main {
    static int N;
    static int W;
    static int[] w;
    static int[] v;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        W = sc.nextInt();
        w = new int[N];
        v = new int[N];
        dp = new int[N + 1][W + 1];

        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        System.out.println(search());
    }

    static int search() {
        for (int j = 0; j <= W; j++) {
            dp[N][j] = 0;
        }
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j <= W; j++) {
                if (j < w[i])
                    dp[i][j] = dp[i + 1][j];
                else
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j - w[i]] + v[i]);
            }
        }
        return dp[0][W];
    }
}
