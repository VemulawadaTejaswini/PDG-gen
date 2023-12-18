import java.util.Scanner;

class Problem {
    private int N;
    private int W;
    private int[] weights;
    private int[] values;
    private long[][] dp;

    Problem() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        W = sc.nextInt();

        weights = new int[N];
        values = new int[N];
        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }
    }

    private long maximize(int n, int w) {
        if (n >= N || w <= 0) {
            return 0;
        }

        if (dp[n][w] != -1) return dp[n][w];

        long ret = -1;
        if (weights[n] > w) {
            ret = maximize(n + 1, w);
        } else {
            ret = Math.max(
                    maximize(n + 1, w),
                    maximize(n + 1, w - weights[n]) + (long) values[n]
            );
        }

        dp[n][w] = ret;

        return ret;
    }

    long solve() {
        dp = new long[N][W+1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= W; j++) {
                dp[i][j] = -1;
            }
        }

        return maximize(0, W);
    }
}

public class Main {
    public static void main(String[] args) {
        long ans = new Problem().solve();
        System.out.println(ans);
    }
}
