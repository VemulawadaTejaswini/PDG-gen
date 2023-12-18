import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        int[] dpa = new int[n], dpb = new int[n], dpc = new int[n];
        Arrays.fill(dpa, inf);
        Arrays.fill(dpb, inf);
        Arrays.fill(dpc, inf);
        int[] a = new int[n], b = new int[n], c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.ni();
            b[i] = in.ni();
            c[i] = in.ni();
        }
        dpa[0] = a[0];
        dpb[0] = b[0];
        dpc[0] = c[0];
        for (int i = 1; i < n; i++) {
            dpa[i] = Math.max(dpb[i-1],dpc[i-1])+a[i];
            dpb[i] = Math.max(dpa[i-1],dpc[i-1])+b[i];
            dpc[i] = Math.max(dpa[i-1],dpb[i-1])+c[i];
        }
        out.println(Math.max(dpa[n-1], Math.max(dpb[n-1], dpc[n-1])));
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