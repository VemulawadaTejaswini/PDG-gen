import java.io.*;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    long mod = 1000000000+7;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        // use i-indexed here
        int n = sc.nextInt(), m = sc.nextInt();
        int[] s = new int[n+1], t = new int[m+1];
        for(int i=1;i<=n;i++) s[i] = sc.nextInt();
        for(int i=1;i<=m;i++) t[i] = sc.nextInt();
        long[][] dp = new long[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                dp[i][j] = (dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1]+mod)%mod;
                if(s[i]==t[j]){
                    dp[i][j] += 1+dp[i-1][j-1];
                    dp[i][j] %= mod;
                }
            }
        }
        return dp[n][m]+1;
    }
}

