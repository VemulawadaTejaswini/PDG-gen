import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        long[] t = in.nl(n), a = in.nl(n);
        long[][] range_t = new long[n][2];
        range_t[0][1] = t[0]; range_t[0][0] = t[0];
        for (int i = 1; i < n; i++) {
            if(t[i]>t[i-1]){
                range_t[i][0] = t[i];
                range_t[i][1] = t[i];
            }else{
                range_t[i][0] = 1;
                range_t[i][1] = range_t[i-1][1];
            }
        }
        long[][] range_a = new long[n][2];
        range_a[n-1][1] = a[n-1]; range_a[n-1][0] = a[n-1];
        for (int i = n-2; i >= 0; i--) {
            if(a[i]>a[i+1]){
                range_a[i][0] = a[i];
                range_a[i][1] = a[i];
            }else{
                range_a[i][0] = 1;
                range_a[i][1] = range_a[i+1][1];
            }
        }
        long ans = 1;
        for (int i = 0; i < n; i++) {
            long range = Math.max(Math.min(range_a[i][1], range_t[i][1])-Math.max(range_a[i][0], range_t[i][0])+1, 0);
            ans *= range;
            ans %= mod;
        }
        out.println(ans);
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
        public double nd(){
            return Double.parseDouble(ns());
        }
        public char nc(){
            return ns().toCharArray()[0];
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