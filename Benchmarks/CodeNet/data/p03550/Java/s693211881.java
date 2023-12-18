import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int Z = in.nextInt();
            int W = in.nextInt();

            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt();
            }

            int[] p1 = new int[N + 1];
            p1[0] = Z;
            for (int i = 0; i < a.length; i++) {
                p1[i + 1] = a[i];
            }
            int[] p2 = new int[N + 1];
            p2[0] = W;
            for (int i = 0; i < a.length; i++) {
                p2[i + 1] = a[i];
            }
            Utils.debug(p1);
            Utils.debug(p2);

            int score = 0;
            for (int i = 1; i <= N; i++) {
                score = Math.max(score, dfs(i, 0, 0, p1, p2));
            }

            if (Math.random() < 2) {
                for (int i = 0; i < p2.length; i++) {
                    Utils.debug(i, memo[i][0]);
                    Utils.debug(i, memo[i][1]);
                }
                System.out.println("" + score);
                return;
            }

            // int score = Math.abs(Z - W);
            // 自分の位置、プレイヤー、相手の位置
            int[][][] dp = new int[N + 1][2][N + 1];
            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j < dp[i].length; j++) {
                    Arrays.fill(dp[i][j], (j == 0 ? -1 : 1) * (int) 1e9);
                }
            }
            // dp[N - 1][0] = Math.abs(a[N - 1] - W);
            // dp[N - 2][0] = Math.abs(a[N - 2] - a[N - 1]);
            // dp[N - 2][1] = Math.min(Math.abs(a[N - 1] - a[N - 2]), Math.abs(a[N - 1] - a[N - 2]));
            // dp[N - 3][0] = Math.abs(a[N - 2] - a[N - 1]);
            for (int k = 0; k <= N; k++) {
                dp[N][0][k] = Math.abs(p1[N] - p2[k]);
                dp[N][1][k] = Math.abs(p2[N] - p1[k]);
                // dp[k][0][N] = Math.abs(p1[k] - p2[N]);
                // dp[k][1][N] = Math.abs(p2[k] - p1[N]);
            }
            Utils.debug(N, dp[N][0]);
            Utils.debug(N, dp[N][1]);
            for (int k = 0; k <= N; k++) {
                dp[N - 1][0][k] = Math.abs(p1[N - 1] - p2[N]);
                dp[N - 1][1][k] = Math.abs(p2[N - 1] - p1[N]);
                dp[k][0][N - 1] = Math.abs(p1[N] - p2[N - 1]);
                dp[k][1][N - 1] = Math.abs(p2[N] - p1[N - 1]);
            }
            Utils.debug(N - 1, dp[N - 1][0]);
            Utils.debug(N - 1, dp[N - 1][1]);
            for (int i = N - 2; i >= 0; i--) {
                for (int j = 0; j < 2; j++) {
                    // for (int k = 0; k < i; k++) {
                    // dp[i][j][k] = j == 0 ? Math.abs(p1[N] - p2[k]) : Math.abs(p2[N] - p1[k]);
                    // for (int k2 = 0; k2 < i; k2++) {
                    // // dp[i][j][k] = j == 0 ? Math.max(dp[i][j][k], dp[k2][1][i]) : Math.min(dp[i][j][k], dp[k2][0][i]);
                    // dp[i][j][k2] = (int) (j == 0 ? -1e9 : 1e9);
                    // for (int k3 = i + 1; k3 <= N; k3++) {
                    // dp[i][j][k2] = j == 0 ? Math.max(dp[i][j][k2], dp[i][1][k3]) : Math.min(dp[i][j][k2], dp[i][0][k3]);
                    // }
                    // }
                    for (int k2 = i + 1; k2 <= N; k2++) {
                        dp[i][j][k2] = (int) (j == 0 ? -1e9 : 1e9);
                        for (int k3 = k2 + 0; k3 <= N; k3++) {
                            dp[i][j][k2] = j == 0 ? Math.max(dp[i][j][k2], dp[k2][1][k3]) : Math.min(dp[i][j][k2], dp[k2][0][k3]);
                        }
                    }
                    // }
                }
                Utils.debug(i, dp[i][0]);
                Utils.debug(i, dp[i][1]);
            }
            // {
            // int i = N;
            // for (int j = 0; j < 2; j++) {
            // for (int k = 0; k < i; k++) {
            // dp[i][j][k] = j == 0 ? dp[0][1][k] : dp[0][0][k];
            // }
            // dp[i][j][N] = j == 0 ? dp[0][1][N] : dp[0][0][N];
            // }
            // }

            System.out.println("" + dp[0][0][0]);
        }
    }

    private static int[][][] memo = new int[2002][2][2002];
    static {
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }
    }

    private static int dfs(int i, int j, int k, int[] p1, int[] p2) {
        if (memo[i][j][k] != -1) {
            return memo[i][j][k];
        }

        if (i == p1.length - 1) {
            int l = j == 0 ? Math.abs(p1[i] - p2[k]) : Math.abs(p2[i] - p1[k]);
            memo[i][j][k] = l;
            return l;
        }

        if (j == 0) {
            int max = 0;
            for (int l = i + 1; l < p1.length; l++) {
                max = Math.max(max, dfs(l, 1, i, p1, p2));
            }
            memo[i][j][k] = max;
            return max;
        } else {
            int max = (int) 1e9;
            for (int l = i + 1; l < p1.length; l++) {
                max = Math.min(max, dfs(l, 0, i, p1, p2));
            }
            memo[i][j][k] = max;
            return max;
        }

    }
}

final class Utils {
    private Utils() {
    }

    public static final void debug(Object... o) {
        System.err.println(toString(o));
    }

    public static final String toString(Object... o) {
        return Arrays.deepToString(o);
    }

}
