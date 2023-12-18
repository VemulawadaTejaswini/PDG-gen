import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        char[] s = in.ns().toCharArray();
        int count = 0;
        boolean[] use = new boolean[s.length];
        Arrays.fill(use, false);
        for (int i = 0; i < s.length-2; i++) {
            if(s[i]=='A'&&s[i+1]=='B'&&s[i+2]=='C'){
                count++;
                int l = i-1, r = i+3;
                while(l>=0){
                    if(use[l]) count++;
                    if(s[l]=='A'){
                        count++;
                    }else break;
                    l--;
                }
                while(r+1<s.length){
                    if(s[r]=='B'&&s[r+1]=='C'){
                        count++;
                    }else break;
                    r += 2;
                }
                use[r-1] = true;
            }
        }
        out.println(count);
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