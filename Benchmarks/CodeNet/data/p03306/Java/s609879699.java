import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    int mod = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    void solve(){
       int n = ni();
       int m = ni();
       ArrayList<int[]>[] edge = new ArrayList[n];
       for(int i = 0; i < n; i++){
            edge[i] = new ArrayList<int[]>();
       }
       for(int i = 0; i < m; i++){
            int from = ni()-1;
            int to = ni()-1;
            int s = ni();
            edge[from].add(new int[]{to, s});
            edge[to].add(new int[]{from, s});
       }
       Deque<int[]> q = new ArrayDeque<int[]>();
       q.push(new int[]{0,0,1,-1});
       long zeromin = Long.MAX_VALUE;
       long onemin = Long.MAX_VALUE;
       long[] memo = new long[n];
       long zerobias = 0;
       long onebias = 0;
       int[] type = new int[n];
       memo[0] = 1;
       boolean flag = false;
       while(!q.isEmpty()){
            int[] res = q.poll();
            // out.println(res[0]+" "+res[1]+" "+res[2]+" "+res[3]);
            type[res[0]] = res[1];
            if(res[1]==0) zeromin = Math.min(zeromin, res[2]);
            else onemin = Math.min(onemin, res[2]);

            for(int[] c : edge[res[0]]){
                if(c[0]==res[3]) continue;
                long cost = c[1]-res[2];
                boolean tmpflag = false;
                if(cost<=0){
                    tmpflag = true;
                    long plus = 1-cost;
                    if(res[1]==0){
                        zeromin+=plus;
                        onemin-=plus;
                        zerobias += plus;
                        onebias -= plus;
                    }
                    else{
                        zeromin-=plus;
                        onemin+=plus;
                        zerobias -= plus;
                        onebias += plus;
                    }
                    if(zeromin<=0||onemin<=0){
                        out.println(0);
                        return;
                    }
                    cost = 1;
                }
                if(memo[c[0]]>0){
                    flag = true;
                    long tmp = memo[c[0]];
                    if(type[c[0]]==0) tmp += zerobias;
                    else tmp += onebias;
                    if(tmp!=cost){
                        if(type[c[0]]!=type[res[0]]){
                            out.println(0);
                            return;
                        }
                        else{
                            long dif = cost-memo[c[0]];
                            if(dif%2!=0){
                                out.println(0);
                                return;
                            }
                            long plus = dif/2;
                            cost += plus;
                            if(res[1]==0){
                                zeromin+=plus;
                                onemin-=plus;
                                zerobias += plus;
                                onebias -= plus;
                            }
                            else{
                                zeromin-=plus;
                                onemin+=plus;
                                zerobias -= plus;
                                onebias += plus;
                            }
                            if(zeromin<=0||onemin<=0){
                                out.println(0);
                                return;
                            }
                        }
                        out.println(0);
                        return;
                    }
                    else continue;
                }
                q.push(new int[]{c[0], 1-res[1], (int)cost, res[0]});
                memo[c[0]] = cost;
            }
       }
       if(flag){
        out.println(1);
        return;
       }
       out.println(Math.max(onemin, zeromin));

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
