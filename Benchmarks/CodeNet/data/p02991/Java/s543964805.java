import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    static int mod = 1_000_000_007;
    // int mod = 998244353;
    // long inf = Long.MAX_VALUE/2;
    int inf = Integer.MAX_VALUE/2;

    ArrayList<Integer>[] edge;
    ArrayList<Integer>[] redge;
    ArrayList<Integer>[] tedge;
    long[][] dist;
    boolean[] in_node;
    boolean[] seen;
    Dijkstra dijkstra1;
    void solve(){
        int n = ni();
        int m = ni();
        dijkstra1 = new Dijkstra(n);
        edge = new ArrayList[n];
        redge = new ArrayList[n];
        tedge = new ArrayList[n];
        for(int i = 0; i < n; i++){
            edge[i] = new ArrayList<>();
            redge[i] = new ArrayList<>();
            tedge[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++){
            int s = ni()-1;
            int t = ni()-1;
            edge[s].add(t);
            redge[t].add(s);
        }
        int s = ni()-1;
        int t = ni()-1;
        dist = new long[n][3];
        in_node = new boolean[n];
        seen = new boolean[n];
        for(int i = 0; i < n; i++){
            Arrays.fill(dist[i],-1);
        }
        rev_dfs(t);
        int[] prev_list = new int[3];
        Arrays.fill(prev_list,-1);
        System.err.println();
        bfs(s,prev_list,-1);  
        long[] dist1 = dijkstra1.getDist(s);
        if(dist1[t]<Long.MAX_VALUE / 3){
            out.println(dist1[t]);
        }
        else{
            out.println(-1);
        }
    }

    void rev_dfs(int cur){
        in_node[cur] = true;
        for(int e : redge[cur]){
            if(in_node[e]) continue;
            rev_dfs(e);
        }
    }

    void bfs(int cur, int[] prev_list, int count){
        if(count==0) return;
        if(seen[cur]&&count==-1){
            count = 3;
        }
        if(prev_list[2]!=-1){
            dijkstra1.addDirectedEdge(prev_list[2], cur, 1);
            // System.err.println(prev_list[2]+" "+cur);
        }
        if(count!=-1) count--;
        for(int i = 1; i >= 0; i--){
            prev_list[i+1] = prev_list[i];
        }
        prev_list[0] = cur;
        seen[cur] = true;
        int[] np = new int[3];
        // System.err.println(cur);
        for(int i = 0; i < 3; i++){
            np[i] = prev_list[i];
            // System.err.print(np[i]+" ");
        }
        // System.err.println();
        for(int e : edge[cur]){
            bfs(e, np, count);
        }
    }

    static class Dijkstra {
        int n;
        ArrayList<Pair>[] G;
        long INF = Long.MAX_VALUE / 3;

        public Dijkstra(int n) {
            this.n = n;
            G = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                G[i] = new ArrayList<>();
            }
        }

        public void addDirectedEdge(int from, int to, int cost) {
            G[from].add(new Pair(to, cost));
        }

        public long[] getDist(int s) {
            PriorityQueue<Pair> Q = new PriorityQueue<>();
            Q.add(new Pair(s, 0));
            long[] dist = new long[n];
            Arrays.fill(dist, INF);
            boolean[] used = new boolean[n];
            while (!Q.isEmpty()) {
                Pair p = Q.poll();
                if (used[p.x]) continue;
                used[p.x] = true;
                dist[p.x] = p.y;

                for (Pair edge : G[p.x]) {
                    Q.add(new Pair(edge.x, p.y + edge.y));
                }
            }
            return dist;
        }

        class Pair implements Comparable<Pair> {
            int x;
            long y;

            Pair(int x, long y) {
                this.x = x;
                this.y = y;
            }

            public int compareTo(Pair p) {
                return Long.compare(y, p.y);
            }

        }

    }

    void run() throws Exception
    {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
        solve();
        out.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }
    
    public static void main(String[] args) throws Exception { new Main().run(); }
    
    private byte[] inbuf = new byte[1024];
    private int lenbuf = 0, ptrbuf = 0;
    
    private int readByte()
    {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }
    
    private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
    private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
    
    private double nd() { return Double.parseDouble(ns()); }
    private char nc() { return (char)skip(); }
    
    private String ns()
    {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b) && b != ' ')){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    
    private char[] ns(int n)
    {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }
    
    private char[][] nm(int n, int m)
    {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }
    
    private int[] na(int n)
    {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }
    
    private int ni()
    {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        
        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    private long nl()
    {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        
        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    private static void tr(Object... o) { System.out.println(Arrays.deepToString(o)); }
 
}
