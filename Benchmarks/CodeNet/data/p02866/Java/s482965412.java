import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = 998244353L;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;
    //programmingOU B
    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        long[] d = in.nl(n);
        long[] dist = new long[n];
        long ans = 0;
        if(d[0]==0){
            ans = 1;
            dist[0]++;
            boolean flag = true;
            for (int i = 1; i < n; i++) {
                if(d[i] > 0) dist[(int)d[i]]++;
                else flag = false;
            }
            if(flag){
                for (int i = 0; i < n-1; i++) if (dist[i] == 0 && dist[i + 1] > 0) flag = false;
            }
            if(flag){
                for (int i = 0; i < n-1; i++) {
                    ans *= pow(dist[i], dist[i+1]);
                    ans %= mod;
                }
            }else ans = 0;
        }
        out.println(ans);
    }
    public static long pow(long x, long n){
        long res = 1;
        while(n > 0){
            if ((n & 1) == 1) {
                res *= x;
                res %= mod;
            }
            x *= x;
            x %= mod;
            n >>= 1;
        }
        return res;
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