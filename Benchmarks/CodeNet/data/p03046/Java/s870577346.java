import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int m = in.ni(), k = in.ni();
        if(k < Math.round(Math.pow(2,m))){
            if(m==0) out.println("0 0");
            else if(m==1){
                if(k==0)out.println("1 0 1 0");
                else out.println(-1);
            }else{
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 1<<m; i++) {
                    if(i != k) sb.append(i+" ");
                }
                out.print(new String(sb)+k+" ");
                sb = new StringBuilder();
                for (int i = (1<<m)-1; i >= 0; i--) {
                    if(i != k) sb.append(i+" ");
                }
                out.print(new String(sb)+k+" ");
            }
        }else{
            out.println(-1);
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