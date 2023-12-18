import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/4;
    public static final int inf = Integer.MAX_VALUE/4;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        int[][] dp = new int[13][n+1];
        int[] item = new int[]{1, 6, 36, 216, 1296, 7776, 46656, 9, 81, 729, 6561, 59049};
        for (int i = 0; i < 13; i++) {
            Arrays.fill(dp[i], inf);
            dp[i][0] = 0;
        }
        for (int i = 1; i < 13; i++) {
            for (int j = 0; j < n+1; j++) {
                if(j>=item[i-1]){
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-item[i-1]]+1);
                }else dp[i][j] = dp[i-1][j];
            }
        }
        out.println(dp[12][n]);
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