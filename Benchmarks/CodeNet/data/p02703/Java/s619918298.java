import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    public static HashMap<Long,  Pair> dp;
    public static long[][][] e;
    public static int n, m, s;
    public static Pair[] cur;
    public static String format;
    public static long[] min_dist;
    static void solve(InputReader in, PrintWriter out){
        n = in.ni();
        m = in.ni();
        s = in.ni();
        e = new long[n][n][2];
        dp = new HashMap<>();
        cur = new Pair[n];
        min_dist = new long[n];
        Arrays.fill(min_dist, INF);
        format = "%".concat(String.valueOf(n)).concat("s");
        for (int i = 0; i < m; i++) {
            int u = in.ni()-1, v = in.ni()-1;
            int a = in.ni(), b = in.ni();
            e[u][v][0] = a;
            e[u][v][1] = b;
            e[v][u][0] = a;
            e[v][u][1] = a;
        }
        for (int i = 0; i < n; i++) cur[i] = new Pair(in.ni(), in.ni());
        dfs((1<<(n-1)), 0);
        for (int i = 1; i < n; i++) out.println(min_dist[i]);
    }
    public static void dfs(long x, int from){
        if(x==(1<<n)-1) return;
        for (int i = 0; i < n; i++) {
            if(((x>>(n-i-1))&1)==0){
                if(e[from][i][1]>0){
                    if(!dp.containsKey(x|(1<<(n-i-1)))){
                        if(dp.get(x).coin<e[from][i][0]){
                            long min = INF;
                            long coin = 0;
                            for (int j = 0; j < n; j++) {
                                if(((x>>(n-j-1))&1)==1){
                                    if(min<=(e[from][i][0]-dp.get(x).coin+cur[j].coin-1)/cur[j].coin*cur[j].time){
                                        min = (e[from][i][0]-dp.get(x).coin+cur[j].coin-1)/cur[j].coin*cur[j].time;
                                        coin = Math.max(coin, dp.get(x).coin-e[from][i][0]+(e[from][i][0]-dp.get(x).coin+cur[j].coin-1)/cur[j].coin*cur[j].coin);
                                    }
                                }
                            }
                            dp.put(x|(1<<(n-i-1)), new Pair(coin, dp.get(x).time+min));
                        }else{
                            dp.put(x|(1<<(n-i-1)), new Pair(dp.get(x).coin, dp.get(x).time));
                        }
                    }else{
                        if(dp.get(x).coin<e[from][i][0]){
                            long min = INF;
                            long coin = 0;
                            for (int j = 0; j < n; j++) {
                                if(((x>>(n-j-1))&1)==1){
                                    if(min<=(e[from][i][0]-dp.get(x).coin+cur[j].coin-1)/cur[j].coin*cur[j].time){
                                        min = (e[from][i][0]-dp.get(x).coin+cur[j].coin-1)/cur[j].coin*cur[j].time;
                                        coin = Math.max(coin, dp.get(x).coin-e[from][i][0]+(e[from][i][0]-dp.get(x).coin+cur[j].coin-1)/cur[j].coin*cur[j].coin);
                                    }
                                }
                            }
                            if(dp.get(x|(1<<(n-i-1))).time>dp.get(x).time+min) dp.put(x|(1<<(n-i-1)), new Pair(coin, dp.get(x).time+min));
                        }else{
                            if(dp.get(x|(1<<(n-i-1))).time>dp.get(x).time) dp.put(x|(1<<(n-i-1)), new Pair(dp.get(x).coin, dp.get(x).time));
                        }
                    }
                    dfs(x|(1<<(n-i-1)), i);
                    min_dist[i] = Math.min(min_dist[i], dp.get(x|(1<<(n-i-1))).time);
                }
            }
        }
    }
    public static class Edges extends ArrayList<Edge>{}
    public static class Edge{
        int to, a, b;
        public Edge(int to, int a, int b){
            this.to = to;
            this.a = a;
            this.b = b;
        }
    }
    public static class Pair{
        long coin; long time;
        public Pair(long x, long y){
            this.coin = x;
            this.time = y;
        }
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