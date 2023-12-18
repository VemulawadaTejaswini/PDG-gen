import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    // static int mod = 1_000_000_007;
    int mod = 998244353;
    long inf = Long.MAX_VALUE/2;
    // int inf = Integer.MAX_VALUE/2;

    ArrayList<Integer>[] edge;
    ArrayList<Integer>[] redge;
    double[] dp;
    int[] outer;
    void solve(){
        int n = ni();
        int m = ni();
        edge = new ArrayList[n];
        redge = new ArrayList[n];
        for(int i = 0; i < n; i++){
            edge[i] = new ArrayList<>();
            redge[i] = new ArrayList<>();
        }
        outer = new int[n];
        for(int i = 0; i < m; i++){
            int s = ni()-1;
            int t = ni()-1;
            edge[s].add(t);
            redge[t].add(s);
            outer[s]++;
        }
        dp = new double[n];
        f(outer.clone(), n);
        double ans = dp[0];
        for(int i = 0; i < n-1; i++){
            double ma = 0;
            int idx = -1;
            for(int j : edge[i]){
                if(dp[j]>ma){
                    ma = dp[j];
                    idx = j;
                }
            }
            double ret = g(outer.clone(), n, i, idx);
            ans = Math.min(ans, ret);
        }
        out.println(ans);
    }

    void f(int[] outer, int n){
        Deque<Integer> st = new ArrayDeque<>();
        st.push(n-1);
        Arrays.fill(dp, inf);
        dp[n-1] = 0;
        while(!st.isEmpty()){
            int cur = st.pop();
            double sum = 0;
            for(int i : edge[cur]){
                sum += dp[i];
            }
            if(cur!=n-1) dp[cur] = sum / edge[cur].size() + 1;
            for(int i : redge[cur]){
                outer[i]--;
                if(outer[i]==0){
                    st.add(i);
                }
            }
        }
    }

    double g(int[] outer, int n, int s, int t){
        Deque<Integer> st = new ArrayDeque<>();
        st.push(n-1);
        dp = new double[n];
        Arrays.fill(dp, inf);
        dp[n-1] = 0;
        while(!st.isEmpty()){
            int cur = st.pop();
            double sum = 0;
            for(int i : edge[cur]){
                if(cur==s&&i==t){
                    if(edge[cur].size()!=1) continue;
                }
                sum += dp[i];
            }
            int l = edge[cur].size();
            if(cur==s) l = Math.max(1, edge[cur].size()-1);
            if(cur!=n-1) dp[cur] = sum / l + 1;
            for(int i : redge[cur]){
                outer[i]--;
                if(outer[i]==0){
                    st.add(i);
                }
            }
        }
        return dp[0];
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
