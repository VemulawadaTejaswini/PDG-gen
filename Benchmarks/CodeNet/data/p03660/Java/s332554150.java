import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;
    //abc067 d
    public static Edge[] e;
    public static int[][] dist;
    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        e = new Edge[n];
        for (int i = 0; i < n; i++) e[i] = new Edge();
        for (int i = 0; i < n - 1; i++) {
            int from = in.ni()-1, to = in.ni()-1;
            e[from].add(to);
            e[to].add(from);
        }
        dist = new int[n][2];
        dfs(0,-1, 0);
        dfs(n-1,-1, 1);

        int fen = 0, snu = 0;
        for (int i = 0; i < n; i++) {
            if(dist[i][0]<=dist[i][1]) fen++;
            else snu++;
        }

        out.println((fen>snu)?"Fennec":"Snuke");
    }
    public static void dfs(int now, int from, int player){//0->fennec
        for(Integer to: e[now]){
            if(to!=from){
                dist[to][player] = dist[now][player]+1;
                dfs(to, now, player);
            }
        }
    }
    public static class Edge extends ArrayList<Integer>{}

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