import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/4;
    public static final int inf = Integer.MAX_VALUE/4;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(), m = in.ni();
        Edge[] e = new Edge[n];
        for (int i = 0; i < n; i++) e[i] = new Edge();
        for (int i = 0; i < m; i++) {
            int from = in.ni()-1, to = in.ni()-1;
            e[from].add(to);
        }
        int s = in.ni()-1, t = in.ni()-1;
        long[][] ans = new long[3][n];
        for (int i = 0; i < 3; i++) Arrays.fill(ans[i],-1);
        ans[0][s] = 0;
        ArrayDeque<Pair> deq = new ArrayDeque<>();
        deq.addFirst(new Pair(s,0));
        while(!deq.isEmpty()){
            Pair p = deq.pollLast();
            for(Integer to: e[p.point]){
                if(ans[(p.num+1)%3][to]==-1){
                    ans[(p.num+1)%3][to] = ans[p.num][p.point]+1;
                    deq.addFirst(new Pair(to,(p.num+1)%3));
                }
            }
        }
        out.println(ans[0][t]!=-1?ans[0][t]/3:-1);
    }
    public static class Edge extends ArrayList<Integer>{}
    public static class Pair{
        int point, num;
        public Pair(int x, int y){
            point = x;
            num = y;
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