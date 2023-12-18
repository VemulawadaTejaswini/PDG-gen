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
    int val = 0;

    void solve(){
        int n = ni();
        int[][] a = new int[n][n-1];
        int total = n*n;
        ArrayList<Integer>[] edge = new ArrayList[total];
        int[] order = new int[total];
        Arrays.fill(order,-1);
        for(int i = 0; i < total; i++){
            edge[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < n; i++){
            int prev = -1;
            for(int j = 0; j < n-1; j++){
                a[i][j] = ni()-1;
                int node =  Math.min(i,a[i][j])*n+Math.max(i,a[i][j]);
                if(order[node]==-1) order[node] = 0;
                // out.println(node);
                if(prev==-1){
                    prev = node;
                    continue;
                }
                edge[prev].add(node);
                order[node]++;
                // System.err.println(prev+" "+node);
                prev = node;
            }
        }
        int[] res = sortTopological(edge,order,n*n);
        if(res.length!=n*(n-1)/2){
            out.println(-1);
            return;
        }

        int[] dist = new int[n*n];
        int ans = 0;
        for(int i = res.length-1; i>=0; i--){
            for(int e : edge[res[i]]){
                dist[res[i]] = Math.max(dist[res[i]], dist[e]+1);
            }   
        }
        out.println(dist[res[0]]+1);
        
    }

    int[] sortTopological(ArrayList<Integer>[] outer, int[] order, int n){
        Deque<Integer> st = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            if(order[i]==0){
                st.add(i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()){
            int cur = st.pop();
            ans.add(cur);
            for(int i : outer[cur]){
                order[i]--;
                if(order[i]==0){
                    st.push(i);
                }
            }
        }
        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            res[i] = ans.get(i);
        }
        return res;
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
