import java.util.Scanner;

/**
 * Deque
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            long[][] dp = new long[N][N];

            for (int i = 0; i < N; i++) {
                if (N % 2 == 1) {
                    dp[i][i] = A[i];
                } else {
                    dp[i][i] = -A[i];
                }
            }

            for (int k = 1; k < N; k++) {
                for (int i = 0; i < N; i++) {
                    if (i + k >= N) {
                        break;
                    }

                    if ((N - k) % 2 == 1) {
                        dp[i][i + k] = Math.max(dp[i][i + k - 1] + A[i + k], dp[i + 1][i + k] + A[i]);
                    } else {
                        dp[i][i + k] = Math.min(dp[i][i + k - 1] - A[i + k], dp[i + 1][i + k] - A[i]);
                    }
                }
            }

            System.out.println(dp[0][N - 1]);
        }
    }

}
