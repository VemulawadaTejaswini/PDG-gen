import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;
    //diverta2019c
    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        int a = 0, b = 0, c = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            char[] s = in.ns().toCharArray();
            if(s[0]=='B'&&s[s.length-1]=='A') c++;
            else if(s[0]=='B') b++;
            else if(s[s.length-1]=='A') a++;
            for (int j = 1; j < s.length; j++) {
                if(s[j]=='B'&&s[j-1]=='A') ans++;
            }
        }
        if(c>0){
            ans += c-1;
            if(a>0||b>0){
                ans += 1;
                ans += Math.min(a, b);
            }
        }else{
            ans += Math.min(a,b);
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