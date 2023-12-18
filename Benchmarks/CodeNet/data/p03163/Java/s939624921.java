import java.util.*;

public class Main {
    static long n;
    static long[][] a;
    static long[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int w = sc.nextInt();
        a = new long[n+1][2];
        dp = new long[n+1][2];

        for (int i=0; i<n; i++) {
            for (int j=0; j<2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<n; i++) {
           for (int j=0; j<n; j++) {
               if (dp[i][0] + a[j][0] > w) continue;
               if (dp[i+1][1] < dp[i][1] + a[j][1]) {
                   dp[i+1][1] = dp[i][1] + a[j][1];
                   dp[i+1][0] = dp[i][0] + a[j][0];
                   a[j][1] = 0;//選択は一度だけ
               }
           }
        }
        long ans = 0;
        for (int i=0; i<n+1; i++) {
            ans = Math.max(ans, dp[i][1]);
        }
        System.out.println(ans);
    }
}