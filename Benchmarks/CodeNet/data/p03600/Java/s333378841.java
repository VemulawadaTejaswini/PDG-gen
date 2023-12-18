import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        int[][] a = new int[n][n];
        int[][] dist = new int[n][n];
        boolean[][] via = new boolean[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                a[i][j] = in.ni();
                dist[i][j] = a[i][j];
                via[i][j] = false;
            }
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(k==i||k==j) continue;
                    if(dist[i][j]>=dist[i][k]+dist[k][j]){
                        dist[i][j] = dist[i][k]+dist[k][j];
                        via[i][j] = true;
                    }
                }
            }
        }
        boolean flag = true;
        out:for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j]!=dist[i][j]){
                    flag = false;
                    break out;
                }
            }
        }
        long sum = 0;
        if(flag){
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if(!via[i][j]) sum += dist[i][j];
                }
            }
        }else sum = -1;
        out.println(sum);
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