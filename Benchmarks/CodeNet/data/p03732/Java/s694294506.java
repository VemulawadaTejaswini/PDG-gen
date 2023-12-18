import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];

        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        int[][] dp = new int[w.length + 1][W + 1];
        long ret = 0;
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j <= W; j++) {
                if (w[i] <= j) {
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - w[i]] + v[i]);
                    ret = Math.max(ret, dp[i + 1][j]);
                } else {
                    dp[i + 1][j] = dp[i][j];
                }
            }
        }
        System.out.println(ret);
    }
}
