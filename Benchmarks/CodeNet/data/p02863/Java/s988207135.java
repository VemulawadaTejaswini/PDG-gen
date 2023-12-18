import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        long[][] dp = new long[n+1][t];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < t; j++) {
                dp[i][j] = dp[i-1][j];
                if(0 <= j - a[i]) dp[i][j] = Math.max(dp[i][j], dp[i-1][j-a[i]] + b[i]);
            }
        }
        long ans = dp[n][t-1];
        boolean[] used = new boolean[n+1];
        int idx = t-1;
        for (int i = n; i > 0; i--) {
            if(dp[i][idx] != dp[i-1][idx]){
                used[i] = true;
                idx -= a[i];
            }
        }
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if(used[i]) continue;
            max = Math.max(max, b[i]);
        }
        System.out.println(ans+max);
        sc.close();

    }

}
