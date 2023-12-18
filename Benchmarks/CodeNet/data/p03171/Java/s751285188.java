import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    public static boolean[][] use1, use2;
    public static long[][] dp1, dp2;
    public static int[] a;
    public static int n;
    static void solve(InputReader in, PrintWriter out){
        n = in.ni();
        a = in.ni(n);
        dp1 = new long[n][n];
        dp2 = new long[n][n];
        use1 = new boolean[n][n];
        use2 = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(use1[i], false);
            Arrays.fill(use2[i], false);
        }
        for (int i = 0; i < n; i++) {
            dp1[i][i] = a[i];
            dp2[i][i] = -a[i];
            use1[i][i] = true;
            use2[i][i] = true;
        }
        out.println(dfs(0, n-1, true));
    }
    public static long dfs(int i, int j, boolean first){
        if(first){
            if(!use1[i][j]){
                long val1 = a[i]+dfs(i+1,j, false);
                long val2 = a[j]+dfs(i,j-1, false);
                dp1[i][j] = Math.max(val1, val2);
                use1[i][j] = true;
            }
            return dp1[i][j];
        }else{
            if(!use2[i][j]){
                long val1 = dfs(i+1,j, true)-a[i];
                long val2 = dfs(i,j-1, true)-a[j];
                dp2[i][j] = Math.min(val1, val2);
                use2[i][j] = true;
            }
            return dp2[i][j];
        }
    }

    public static void main(String[] args) throws Exception{
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
        public long nl(){
            return Long.parseLong(ns());
        }
        public int ni(){
            return Integer.parseInt(ns());
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