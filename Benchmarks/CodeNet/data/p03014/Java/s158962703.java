import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int h = in.ni(), w = in.ni();
        char[][] map = new char[h][w];
        for (int i = 0; i < h; i++) {
            map[i] = in.ns().toCharArray();
        }
        int[][][] light = new int[h][w][4];
        for (int i = 0; i < h; i++) {
            for (int j = 1; j < w; j++) {
                if(map[i][j]=='#'||map[i][j-1]=='#'){
                    light[i][j][0] = 0;
                }else{
                    light[i][j][0] = light[i][j-1][0]+1;
                }
                if(map[i][w-j-1]=='#'||map[i][w-j]=='#'){
                    light[i][w-j-1][1] = 0;
                }else{
                    light[i][w-j-1][1] = light[i][w-j][1]+1;
                }
            }
        }
        for (int i = 0; i < w; i++) {
            for (int j = 1; j < h; j++) {
                if(map[j][i]=='#'||map[j-1][i]=='#'){
                    light[j][i][2] = 0;
                }else{
                    light[j][i][2] = light[j-1][i][2]+1;
                }
                if(map[h-j-1][i]=='#'||map[h-j][i]=='#'){
                    light[h-j-1][i][3] = 0;
                }else{
                    light[h-j-1][i][3] = light[h-j][i][3]+1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if(map[i][j]=='.'){
                    max = Math.max(max, light[i][j][0]+light[i][j][1]+light[i][j][2]+light[i][j][3]+1);
                }
            }
        }
        out.println(max);
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