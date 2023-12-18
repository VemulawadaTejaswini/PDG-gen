import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/10;
    public static final int inf = Integer.MAX_VALUE/10;
    public static HashMap<String, Integer> map;
    public static int k;
    public static Edge[] e;
    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        e = new Edge[n];
        for (int i = 0; i < n; i++) e[i] = new Edge();
        map = new HashMap<>();
        String[] input = new String[n-1];
        for (int i = 0; i < n-1; i++) {
            int a = in.ni()-1, b = in.ni()-1;
            e[a].add(b); e[b].add(a);
            input[i]= trans(a,b);
        }
        k = 0;
        for(Edge edge: e) k = Math.max(k, edge.size());
        bfs(-1, 0, -1);
        out.println(k);
        for(String s: input){
            out.println(map.get(s)+1);
        }
    }
    public static void bfs(int p, int c, int color){
        for(Integer edge: e[c]){
            if(edge != p){
                color = (color+1)%k;
                bfs(c, edge, color);
                map.put(trans(c,edge), color);
            }
        }
        return;
    }
    public static String trans(int a, int b){
        return Math.min(a,b)+" "+Math.max(a,b);
    }
    public static class Edge extends ArrayList<Integer>{}

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