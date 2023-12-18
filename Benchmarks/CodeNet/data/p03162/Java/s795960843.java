import java.util.*;

public class Main {
    static int n;
    static int k;
    static int[][] a;
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n+1][3];
        dp = new int[n+1][3];
        for (int i=0; i<n; i++) {
            for (int j=0; j<3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<3; j++) {
                for (int k=0; k<3; k++) {
                    if (j==k) continue;
                    //dp[i][j]は前回分 + a[i][k]　の最大値を今回分(dp[i+1][k])に格納する。
                    dp[i+1][k] = Math.max(dp[i+1][k], dp[i][j] + a[i][k]);
                }
            }
        }
        int ans = 0;
        for (int i=0; i<3; i++) {
            ans = Math.max(ans, dp[n][i]);
        }
        System.out.println(ans);
    }
}