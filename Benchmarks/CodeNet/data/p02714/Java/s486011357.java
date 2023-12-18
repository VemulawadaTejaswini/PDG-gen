import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        char[] s = in.ns().toCharArray();
        int[][] back = new int[n][3];
        back[n-1][0] = 0;
        back[n-1][1] = 0;
        back[n-1][2] = 0;
        long ans = 0;
        for (int i = n-2; i >= 0; i--) {
            back[i][0] = back[i+1][0];
            back[i][1] = back[i+1][1];
            back[i][2] = back[i+1][2];
            if(s[i+1]=='R') back[i][0]++;
            else if(s[i+1]=='G') back[i][1]++;
            else if(s[i+1]=='B') back[i][2]++;
        }
        for (int i = 0; i < n; i++) {
            if(s[i]=='R'){
                for (int j = i; j < n; j++) {
                    if(s[j]=='G'){
                        ans += back[j][2];
                        if(2*j-i<n&&s[2*j-i]=='B') ans--;
                    }else if(s[j]=='B'){
                        ans += back[j][1];
                        if(2*j-i<n&&s[2*j-i]=='G') ans--;
                    }
                }
            }else if(s[i]=='G'){
                for (int j = i; j < n; j++) {
                    if(s[j]=='R'){
                        ans += back[j][2];
                        if(2*j-i<n&&s[2*j-i]=='B') ans--;
                    }else if(s[j]=='B'){
                        ans += back[j][0];
                        if(2*j-i<n&&s[2*j-i]=='R') ans--;
                    }
                }
            }else if(s[i]=='B'){
                for (int j = i; j < n; j++) {
                    if(s[j]=='G'){
                        ans += back[j][0];
                        if(2*j-i<n&&s[2*j-i]=='R') ans--;
                    }else if(s[j]=='R'){
                        ans += back[j][1];
                        if(2*j-i<n&&s[2*j-i]=='G') ans--;
                    }
                }
            }
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