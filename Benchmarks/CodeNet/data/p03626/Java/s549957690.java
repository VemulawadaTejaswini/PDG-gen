import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        char[] s = in.ns().toCharArray();
        long ans;
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        for (int i = 0; i < s.length; i++) {
            if(i==n-1) deq.add(1);
            else{
                if(s[i]==s[i+1]){
                    deq.add(2);
                    i++;
                }else{
                    deq.add(1);
                }
            }
        }
        boolean last1;
        if(deq.poll()==1){
            ans = 3;
            last1 = true;
        }else{
            ans = 6;
            last1 = false;
        }
        while(!deq.isEmpty()){
            int x = deq.poll();
            if(last1){
                ans *= 2;
                ans %= mod;
            }else{
                if(x==2){
                    ans *= 3;
                    ans %= mod;
                }
            }
            last1 = x==1;
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