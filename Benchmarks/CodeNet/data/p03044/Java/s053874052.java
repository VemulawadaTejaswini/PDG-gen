import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;

    public static int[] color;
    public static Edges[] e;
    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        color = new int[n];//1:black 2:white 0:undecided
        e = new Edges[n];
        for (int i = 0; i < n; i++) e[i] = new Edges();
        for (int i = 0; i < n - 1; i++) {
            int from = in.ni()-1, to = in.ni()-1, cost = in.ni();
            e[from].add(new Edge(to, cost));
            e[to].add(new Edge(from, cost));
        }
        color[0] = 1;
        bfs(0);
        for(int c: color) out.println(c-1);
    }
    public static void bfs(int to){
        for (int i = 0; i < e[to].size(); i++) {
            if(color[e[to].get(i).to]!=0) continue;
            if(e[to].get(i).even){
                color[e[to].get(i).to] = color[to];
            }else{
                color[e[to].get(i).to] = 3-color[to];
            }
            bfs(e[to].get(i).to);
        }
    }
    public static class Edges extends ArrayList<Edge>{}
    public static class Edge{
        int to; boolean even;
        public Edge(int to, int cost){
            this.to = to;
            this.even = cost%2==0;
        }
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