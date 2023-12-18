import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;
    //disco2020yosen c
    static void solve(InputReader in, PrintWriter out){
        int h = in.ni(), w = in.ni(), k = in.ni();
        char[][] map = new char[h][w];
        for (int i = 0; i < h; i++) {
            map[i] = in.ns().toCharArray();
        }
        ArrayList<Integer>[] list = new ArrayList[h];
        for (int i = 0; i < h; i++) {
            list[i] = new ArrayList<>();
            for (int j = 0; j < w; j++) if (map[i][j] == '#') list[i].add(j);
        }
        int[][] ans = new int[h][w];
        int count = 1;
        for (int i = 0; i < h; i++) {
            if(list[i].size()==0) continue;
            ans[i][0] = count;
            for(Integer x: list[i]){
                ans[i][x] = count;
                count++;
            }
            for (int j = 1; j < w; j++) if (ans[i][j] == 0) ans[i][j] = ans[i][j - 1];
        }
        for (int i = 0; i < w; i++) {
            for (int j = 1; j < h; j++) {
                if(ans[j][i]==0) ans[j][i] = ans[j-1][i];
            }
        }
        int first = 0;
        for (int i = 0; i < h; i++) {
            if(list[i].size()>0){
                first = i;
                break;
            }
        }
        for (int i = 0; i < w; i++) {
            for (int j = first-1; j >= 0; j--) {
                ans[j][i] = ans[j+1][i];
            }
        }
        print2d(ans);
    }
    public static void print2d(int[][] a){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if(i!=0) sb.append("\n");
            for (int j = 0; j < a[0].length; j++) {
                if(j!=0)sb.append(' ');
                sb.append(a[i][j]);
            }
        }
        System.out.println(sb.toString());
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