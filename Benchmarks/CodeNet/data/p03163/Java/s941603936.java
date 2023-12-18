import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N + 1];
        long[] v = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextLong();
        }
        long[][] dp = new long[N + 1][W + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= W; j++) {
                if (j < w[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
                }
            }
        }
        System.out.println(dp[N][W]);
    }

}
