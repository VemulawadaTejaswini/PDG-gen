import java.io.*;
import java.util.*;

public class Main{
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int h = in.ni(), w = in.ni();
        char[][] map = new char[h][w];
        int[][] dist = new int[h][w];
        for (int i = 0; i < h; i++) {
            map[i] = in.ns().toCharArray();
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if(i == 0&&j == 0){
                    if(map[0][0]=='#') dist[0][0] = 1;
                }else if(i == 0){
                    dist[i][j] = dist[i][j-1];
                    if(map[i][j]=='#'&&map[i][j-1]=='.') dist[i][j]++;
                }else if(j == 0){
                    dist[i][j] = dist[i-1][j];
                    if(map[i][j]=='#'&&map[i-1][j]=='.') dist[i][j]++;
                }else{
                    int a = dist[i-1][j];
                    int b = dist[i][j-1];
                    if(map[i][j]=='#'&&map[i-1][j]=='.') a++;
                    if(map[i][j]=='#'&&map[i][j-1]=='.') b++;
                    dist[i][j] = Math.min(a,b);
                }
            }
        }
        out.println(dist[h-1][w-1]);
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