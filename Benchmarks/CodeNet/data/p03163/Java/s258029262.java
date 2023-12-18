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
        for(int i=0;i<=n;i++) Arrays.fill(dp[i], -1);
        long ans = find(n, w);
        out.println(ans);
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