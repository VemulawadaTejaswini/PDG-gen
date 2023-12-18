import java.io.*;
import java.util.*;
@SuppressWarnings("unused")
public class Main{
    static long val[];
    static int wt[];
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s[] = br.readLine().trim().split(" ");
        int n = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);
        val = new long[n];
        wt = new int[n];
        for(int i=0;i<n;i++) {
            String st[] = br.readLine().trim().split(" ");
            wt[i] = Integer.parseInt(st[0]);
            val[i] = Integer.parseInt(st[1]);
        }
        dp = new long[n+1][(int)w+1];
        for(int i=0;i<=n;i++) {
            for(int j=0;j<=w;j++) {
                if(i==0 || j==0) dp[i][j]=0;
                else if(wt[i-1] > j) dp[i][j] = dp[i-1][j];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-wt[i-1]]+val[i-1]);
            }
        }
        out.println(dp[n][w]);
        out.flush();
    }
    static long dp[][];
    
    public static long find(int n, int w) {
        if(dp[n][w]!=-1) return dp[n][w];
        if(n==0 || w==0) return dp[n][w] = 0;
        if(wt[n-1] > w) return dp[n][w] = find(n-1, w);
        return dp[n][w] = Math.max( find(n-1, w), val[n-1] + find(n-1, w-wt[n-1]));
    }
}