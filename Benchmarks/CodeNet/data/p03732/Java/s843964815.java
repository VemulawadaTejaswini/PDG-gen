import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long W = sc.nextLong();
        long[] w = new long[N];
        long[] v = new long[N];

        for (int i = 0; i < N; i++) {
            w[i] = sc.nextLong();
            v[i] = sc.nextLong();
        }

        long[][] dp = new long[w.length + 1][(int) W + 1];
        long ret = 0;
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j <= W; j++) {
                if (w[i] <= j) {
                    dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - (int) w[i]] + v[i]);
                    ret = Math.max(ret, dp[i + 1][j]);
                } else {
                    dp[i + 1][j] = dp[i][j];
                }
            }
        }
        System.out.println(ret);
    }
}