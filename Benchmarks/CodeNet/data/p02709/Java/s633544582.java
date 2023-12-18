import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] a = new long[n][2];
        for(int i = 0; i < n; i++) {
            a[i][0] = (long)(i + 1);
            a[i][1] = sc.nextLong();
        }
        Arrays.sort(a, (o1, o2) -> (int)(o2[1] - o1[1]));
        long[][] dp = new long[n + 1][n + 1];
        dp[1][0] = a[0][1] * (a[0][0] - 1);
        dp[0][1] = a[0][1] * (n - a[0][0]);
        for(int k = 2; k <= n; k++) {
            for(int i = 0; i <= k; i++) {
                // dp[i][k - i]の更新
                // k人目が(i - pi)のパターン
                if(i > 0) dp[i][k - i] = dp[i - 1][k - i] + (a[k - 1][1] * (a[k - 1][0] - i));

                // k人目が(pi - i)のパターン
                if(k > i) dp[i][k - i] = Math.max(dp[i][k - i], dp[i][k - i - 1] + (a[k - 1][1] * (n - k + i + 1 - a[k - 1][0])));
            }
        }
        long ans = 0;
        for(int i = 0; i <= n; i++) {
            ans = Math.max(ans, dp[i][n - i]);
        }
        System.out.println(ans);
    }
}