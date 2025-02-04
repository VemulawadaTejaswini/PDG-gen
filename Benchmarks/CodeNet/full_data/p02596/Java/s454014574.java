import java.io.*;
import java.util.*;

public class Main {
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        long k = in.nl();
        long ans = 0;
        if(k%2==0){
            ans = -1;
        }else{
            long x = 0;
            long d = 1;
            for (int i = 1; i <= k; i++) {
                x += (d * 7) % k;
                x %= k;
                d *= 10;
                d %= k;
                if (x == 0) {
                    ans = i;
                    break;
                }
            }
        }
        out.println(ans!=0?ans:1/0);
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