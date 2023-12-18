import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/4;
    public static final int inf = Integer.MAX_VALUE/4;

    static void solve(InputReader in, PrintWriter out){
        char[] s = in.ns().toCharArray();
        long[][] dp = new long[s.length+1][13];
        dp[0][0] = 1;
        for (int i = 0; i < s.length; i++) {
            if(s[i]=='?'){
                for (int j = 0; j < 13; j++) {
                    for (int k = 0; k <= 9; k++) {
                        dp[i+1][(10*j+k)%13] += dp[i][j];
                        dp[i+1][(10*j+k)%13] %= mod;
                    }
                }
            }else{
                for (int j = 0; j < 13; j++) {
                    dp[i+1][(j*10+(s[i]-'0'))%13] += dp[i][j];
                    dp[i+1][(j*10+(s[i]-'0'))%13] %= mod;
                }
            }
        }
        out.println(dp[s.length][5]);
    }

    public static void main(String[] args){
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
        out.close();
    }
    public static class InputReader{
        private BufferedReader br;
        private StringTokenizer st;
        public InputReader(InputStream is){
            br = new BufferedReader(new InputStreamReader(is));
            st = null;
        }
        public String ns(){
            if(st == null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (Exception e){
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }
        public int ni(){
            return Integer.parseInt(ns());
        }
        public long nl(){
            return Long.parseLong(ns());
        }
        public Double nd(){
            return Double.parseDouble(ns());
        }
        public int[] ni(int n){
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ni();
            }
            return a;
        }
        public long[] nl(int n){
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nl();
            }
            return a;
        }
        public double[] nd(int n){
            double[] a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = nd();
            }
            return a;
        }
    }
}