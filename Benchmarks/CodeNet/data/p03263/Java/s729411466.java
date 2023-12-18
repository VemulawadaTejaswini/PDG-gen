import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;
    //abc109 d
    static void solve(InputReader in, PrintWriter out){
        int h = in.ni(), w = in.ni();
        int[][] a = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = in.ni();
            }
        }
        StringBuilder sb = new StringBuilder();
        long ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w-1; j++) {
                if(a[i][j]%2==1){
                    a[i][j] -= 1;
                    a[i][j+1] += 1;
                    sb.append((i+1)+" "+(j+1)+" "+(i+1)+" "+(j+2));
                    sb.append("\n");
                    ans++;
                }
            }
        }
        for (int i = 0; i < h-1; i++) {
            if(a[i][w-1]%2==1){
                a[i][w-1] -= 1;
                a[i+1][w-1] += 1;
                sb.append((i+1)+" "+w+" "+(i+2)+" "+w);
                sb.append("\n");
                ans++;
            }
        }
        out.println(ans);
        out.println(sb.toString());
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