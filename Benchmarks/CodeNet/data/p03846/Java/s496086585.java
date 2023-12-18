import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        int[] a = in.ni(n);
        long ans = 0;
        boolean flag = true;
        if(n%2==0){
            int[] num = new int[n/2];
            for (int i = 0; i < n; i++) {
                if(a[i]%2==1){
                    num[a[i]/2]++;
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                for (int i = 0; i < n / 2; i++) {
                    if(num[i]!=2){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) ans = pow(2, n/2);
        }else{
            int[] num = new int[(n+1)/2];
            for (int i = 0; i < n; i++) {
                if(a[i]%2==0){
                    num[a[i]/2]++;
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                for (int i = 1; i < (n+1) / 2; i++) {
                    if(num[i]!=2){
                        flag = false;
                        break;
                    }
                }
                if(num[0]!=1) flag = false;
            }
            if(flag) ans = pow(2, (n-1)/2);
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