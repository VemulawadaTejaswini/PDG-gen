import java.util.*;
import java.io.*;
class Main {
    static long MOD = (long)(1e9+7);
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        long[][] dp = new long[n][n];
        dp[0][0] = 1;
        for(int i = 1; i<n; i++) {
            long[] prefPrev = new long[n];
            prefPrev[0] = dp[i-1][0];
            for(int j = 1; j<n; j++) 
                prefPrev[j] = (prefPrev[j-1]+dp[i-1][j])%MOD;
            for(int j = 0; j<=i; j++) {
                int l = -1;
                int r = -1;
                if(s.charAt(i-1)=='<') {
                    l = 0;
                    r = j-1;
                }
                else {
                    l = j;
                    r = i;
                }
                if(l==-1 || r==-1) continue;
                long ans = prefPrev[r];
                if(l-1>=0)
                    ans = ((ans-prefPrev[l-1])%MOD+MOD)%MOD;
                dp[i][j] = ans;
            }
        }
        long ans = 0;
        for(int i = 0; i<n; i++)
            ans = (ans + dp[n-1][i])%MOD;
        System.out.println(ans);
    }
}