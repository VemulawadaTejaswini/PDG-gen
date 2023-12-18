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
    long inf = Long.MAX_VALUE/2;

    void solve(){
        int n = ni();
        int m = ni();
        int[] a = new int[m];
        for(int i = 0; i < m; i++){
            a[i] = ni();
        }
        Arrays.sort(a);
        int[] count = new int[]{6,2,5,5,4,5,6,3,7,6};
        int[] dp = new int[10001];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for(int i = 0; i < m; i++){
            dp[count[a[i]]] = 1;
        }
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < m; j++){
                if(i-count[a[j]]<0) continue;
                if(dp[i-count[a[j]]]==-1) continue;
                dp[i] = Math.max(dp[i], dp[i-count[a[j]]]+1);
            }
        }
        int res = n;
        while(true){
            for(int i = m-1; i >= 0; i--){
                if(res-count[a[i]]<0) continue;
                if(dp[res]==dp[res-count[a[i]]]+1){
                    res -= count[a[i]];
                    out.print(a[i]);
                    break;
                }
                // out.println(res);
            }
            if(res==0) break;
        }
        out.println();

    }


    public static int upperBound(long[] a, long v){ return upperBound(a, 0, a.length, v); }
    public static int upperBound(long[] a, int l, int r, long v)
    {
        if(l > r || l < 0 || r > a.length)throw new IllegalArgumentException();
        int low = l-1, high = r;
        while(high-low > 1){
            int h = high+low>>>1;
            if(a[h] > v){
                high = h;
            }else{
                low = h;
            }
        }
        return low;
    }

    public static int lowerBound(long[] a, long v){ return lowerBound(a, 0, a.length, v); }
    public static int lowerBound(long[] a, int l, int r, long v)
    {
        if(l > r || l < 0 || r > a.length)throw new IllegalArgumentException();
        int low = l-1, high = r;
        while(high-low > 1){
            int h = high+low>>>1;
            if(a[h] < v){
                low = h;
            }else{
                high = h;
            }
        }
        return high;
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
