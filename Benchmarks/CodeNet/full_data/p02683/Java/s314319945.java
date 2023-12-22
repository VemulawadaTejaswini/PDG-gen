import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(), m = in.ni();
        int x = in.ni();
        String format = "%".concat(String.valueOf(n)).concat("s");
        int[][] a = new int[n][m];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = in.ni();
            a[i] = in.ni(m);
        }
        int min = inf;
        for (int i = 0; i < (1 << n); i++) {
            char[] s = String.format(format, Integer.toString(i,2)).replace(' ', '0').toCharArray();
            int sum = 0;
            int[] rikai = new int[m];
            for (int j = 0; j < n; j++) {
                if(s[j]=='1'){
                    for (int k = 0; k < m; k++) {
                        rikai[k] += a[j][k];
                    }
                    sum += c[j];
                }
                boolean flag = true;
                for (int k = 0; k < m; k++) {
                    flag &= rikai[k]>=x;
                }
                if(flag) min = Math.min(min, sum);
            }
        }
        out.println(min==inf?-1:min);
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