import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static long dp[][];
    static String s;
    static int m;
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        long ans=0;
        s=sc.next();
        n=s.length();
        dp=new long[n][2020];
        for (long x[]:dp)Arrays.fill(x,-1);
        for (int i=0;i<n;i++){
            ans+=dp(i,2019);
        }
        System.out.println(ans);
    }
    static long dp(int i,int mod){
        if (i==n){
            if (mod==0)return 1;
            return 0;
        }
        if (dp[i][mod]!=-1)return dp[i][mod];
        if (mod==0)dp[i][mod]=1+dp(i+1,s.charAt(i)-'0');
        else {
            dp[i][mod]=dp(i+1,(mod*10+s.charAt(i)-'0')%2019);
        }
        return dp[i][mod];
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}