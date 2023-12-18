import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int T = sc.nextInt();

            int[] A = new int[N + 1];
            int[] B = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                A[i] = sc.nextInt();
                B[i] = sc.nextInt();
            }

            long[][][] dp = new long[2][N + 1][T + 1];
            for (int i = 1; i <= N; i++) {
                for (int j = 0; j <= T; j++) {
                    if (j < A[i]) {
                        dp[0][i][j] = dp[0][i - 1][j];
                    } else {
                        dp[0][i][j] = Math.max(dp[0][i - 1][j], dp[0][i - 1][j - A[i]] + B[i]);
                    }

                    if (j < 1) {
                        dp[1][i][j] = dp[1][i - 1][j];
                    } else if (j >= 1 && j < A[i]) {
                        dp[1][i][j] = Math.max(dp[1][i - 1][j], dp[0][i - 1][j - 1] + B[i]);
                    } else {
                        dp[1][i][j] = Math.max(Math.max(dp[1][i - 1][j], dp[1][i - 1][j - A[i]] + B[i]),
                                dp[0][i - 1][j - 1] + B[i]);
                    }
                }
            }

            long ans = dp[1][N][T];

            System.out.println(ans);
        }
    }

}
