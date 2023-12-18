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
        long[] dp = new long[w+1];
        for(int i=0;i<n;i++) {
            for(int j=w;j>=wt[i];j--) {
                dp[j] = Math.max(dp[j], dp[j-wt[i]]+val[i]);
            }
        }
        out.println(dp[w]);
        out.flush();
    }
}