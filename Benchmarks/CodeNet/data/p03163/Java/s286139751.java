import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static long[][] dp; // heap

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int W = scanner.nextInt();

        int[] w = new int[N];
        long[] v = new long[N];
        for (int i = 0; i < N; i++) {
            w[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
        }

        dp = new long[N + 1][W + 1];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (w[i] > j) {
                    dp[i + 1][j] = dp[i][j];
                } else {
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - w[i]] + v[i]);
                }
            }
        }

        System.out.println(dp[N][W]);
    }
}
