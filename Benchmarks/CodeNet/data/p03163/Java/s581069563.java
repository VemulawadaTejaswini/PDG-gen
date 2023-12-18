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
        long[][] dp = new long[N+1][W+1];
        for (int i = 1; i < N+1; i++) {
            for (int j = 0; j < W+1; j++) {
                dp[i][j] = dp[i-1][j]; //case1: Do not use i-th item
                int diff = j - w[i-1];
                if (diff >= 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][diff] + v[i-1]);
                }
            }
        }
        long ans = dp[N][W];
        System.out.println(ans);
    }
}