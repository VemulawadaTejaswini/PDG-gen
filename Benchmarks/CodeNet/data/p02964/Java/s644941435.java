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

    ArrayList<int[]>[] edge;
    boolean[] seen;
    long[] d;
    int loop;
    long loopdist;
    int ans;
    int n;
    long k;

    void solve(){
        n = ni();
        k = nl();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = ni();
        }
        edge = new ArrayList[n];
        for(int i = 0; i < n; i++){
            edge[i] = new ArrayList<>();
        }
        int[] prev = new int[200001];
        Arrays.fill(prev, -1);
        seen = new boolean[200001];
        for(int i = 0; i < 2*n; i++){
            if(prev[a[i%n]]!=-1&&!seen[prev[a[i%n]]]){
                int s = prev[a[i%n]];
                int t = (i+1)%n;
                int dist = i+1-s;
                // System.err.println(s+" "+t+" "+dist);
                edge[s].add(new int[]{t, dist});
                seen[s] = true;
                prev[a[i%n]] = i%n;
            }
            else{
                prev[a[i%n]] = i%n;
            }
        }
        seen = new boolean[200001];
        d = new long[n];
        dfs(0,0);
        // System.err.println(loop+" "+loopdist);
        dfs2(0,0,true);
        if(ans==0 && k!=1){
            return;
        }
        Deque<Integer> st = new ArrayDeque<>();
        seen = new boolean[200001];
        for(int i = ans; i < n; i++){
            if(!seen[a[i]]){
                st.push(a[i]);
                seen[a[i]] = true;
                continue;
            }
            seen[a[i]] = false;
            while(true){
                int tmp = st.pop();
                seen[tmp] = false;
                if(tmp==a[i]) break;
            }
        }
        while(!st.isEmpty()){
            int tmp = st.pollLast();
            out.print(tmp+" ");
        }
    }

    void dfs(int cur, long dist){
        if(seen[cur]){
            // System.err.println(dist+" "+d[cur]);
            loopdist = dist - d[cur];
            loop = cur;
            return;
        }
        d[cur] = dist;
        seen[cur] = true;
        for(int[] e : edge[cur]){
            dfs(e[0], e[1]+dist);
        }
        return;
    }

    void dfs2(int cur, long dist, boolean flag){
        // System.err.println(cur+" "+dist);
        for(int[] e: edge[cur]){
            long next = e[1]+dist;
            if(next > n*k){
                ans = cur;
                return;
            }
            if(e[0]==loop&&flag){
                long a = (n*k-dist)/loopdist;
                long tmp = dist + a*loopdist;
                dfs2(cur, tmp, false);
                return;
            }
            dfs2(e[0], e[1]+dist, flag);
        }
        return;
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
