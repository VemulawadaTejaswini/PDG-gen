import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        long[] w = new long[N + 1];
        int[] v = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            w[i] = sc.nextLong();
            v[i] = sc.nextInt();
        }
        long[][] dp = new long[N + 1][100001];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[0][0] = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= 100000; j++) {
                if (j >= v[i]) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - v[i]] + w[i]);
                }
                dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
            }
        }
        long ans = 0;
        for (int i = 0; i <= 100000; i++) {
            if (dp[N][i] <= W) {
                ans = i;
            }
        }
        System.out.println(ans);
    }

}
