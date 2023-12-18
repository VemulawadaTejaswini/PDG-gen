import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        for(int i = 0; i<n; i++)
            a[i] = sc.nextDouble();
        double[][] dp = new double[n+1][n+1];
        dp[0][0] = 1;
        for(int i = 1; i<=n; i++)
            dp[i][0] = dp[i-1][0]*(1-a[i-1]);
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n; j++) {
                dp[i][j] = dp[i-1][j]*(1-a[i-1]);
                dp[i][j]+=dp[i-1][j-1]*a[i-1];
            }
        }
        double ans = 0;
        for(int i = n; i>=0; i--) {
            if(i>n-i)
                ans+=dp[n][i];
        }
        System.out.println(ans);
    }
}