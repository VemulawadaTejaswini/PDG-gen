import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        int[] a = in.ni(n);
        if(n%2==0){
            long max = 0, sum =0;
            for (int i = 0; i < n; i+=2) {
                sum += a[i];
            }
            max = sum;
            sum = 0;
            for (int i = 1; i < n; i+=2) {
                sum += a[i];
            }
            max = Math.max(max, sum);
            out.println(max);
        }else{
            long[] lm = new long[n], lc = new long[n], rm = new long[n], rc = new long[n];
            for (int i = 0; i < n; i++) {
                if(i%2==0){
                    if(i>0) lm[i] = lm[i-1];
                    lm[i] += a[i];
                    if(i>0)lc[i] = lc[i-1];
                }else{
                    lc[i] = lc[i-1];
                    lm[i] = lm[i-1];
                    lc[i] += a[i];
                }
            }
            for (int i = n-1; i >= 0; i--) {
                if(i%2==0){
                    if(i<n-1)rm[i] = rm[i+1];
                    rm[i] += a[i];
                    if(i<n-1)rc[i] = rc[i+1];
                }else{
                    rm[i] = rm[i+1];
                    rc[i] = rc[i+1];
                    rc[i] += a[i];
                }
            }
            long max = 0;
            for (int i = 0; i < n; i++) {
                if(i%2==1){
                    max = Math.max(max,lm[i]+rc[i+1]);
                    if(i+2<n)max = Math.max(max,lm[i]+rm[i+2]);
                }else{
                    if(i<n-1) max = Math.max(max,lc[i]+rm[i+1]);
                    else max = Math.max(max,lc[i]);
                }
            }
            out.println(max);
        }
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