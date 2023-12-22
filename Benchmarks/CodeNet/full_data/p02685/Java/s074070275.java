import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = 998244353L;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(), m = in.ni();
        int k = in.ni();
        long ans = 0;
        long[] m_i = new long[n];
        m_i[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            m_i[i] = m_i[i+1]*(m-1);
            m_i[i] %= mod;
        }
        Combination comb = new Combination(n-1);
        for (int i = 0; i <= k; i++) {
            long sum = m;
            sum *= m_i[i];
            sum %= mod;
            sum *= comb.comb(n-1, i);
            sum %= mod;
            ans += sum;
            ans %= mod;
        }
        out.println(ans);
    }
    public static class Combination{
        long[] fact;
        public Combination(int n){
            fact = new long[n+1];
            fact[0] = 1;
            for (int i = 1; i <= n; i++) {
                fact[i] = fact[i-1]*i;
                fact[i] %= mod;
            }
        }
        public long comb(int i, int j){
            if(i>=j) return (((fact[i]*pow(fact[j],mod-2))%mod)*pow(fact[i-j],mod-2))%mod;
            else return 0;
        }
        private long pow(long x, long n){
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