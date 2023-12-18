import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    long MOD = 1_000_000_007;
    int inf = Integer.MAX_VALUE;

    void solve(){
        int n = ni();
        int k = ni();
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = nl();
        }
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            if(a[i]>=k) continue;
            else b[i] = (int)a[i];
        }
        // long[][] dp = new long[n+1][10*k];
        // dp[0][0] = 1;
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j <= 2*k; j++){
        //         dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j]);
        //         dp[i+1][j+b[i]] = Math.max(dp[i+1][j+b[i]], dp[i][j]);
        //     }
        // }
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(b[i]==0){
                long sum = 0;
                for(int j = 0; j < n; j++) sum += b[i];
                if(sum>0) ans++;
            }
            else{
                long[] dp = new long[2*k+1];
                long[] newdp = new long[2*k+1];
                dp[0] = 1;
                for(int m = 0; m < n; m++){
                    for(int j = 0; j <= k; j++){
                        newdp[j] = Math.max(dp[j], dp[j]);
                        if(m!=i) newdp[j+b[m]] = Math.max(dp[j+b[m]], dp[j]);
                    }
                    dp = newdp;
                }
                int res = 0;
                for(int j = 0; j < k; j++){
                    if(dp[j]==1){
                        res = j;
                    }
                }
                // out.println(res);
                if(res+b[i]<k) ans++; 
            }
        }
        out.println(ans);
        // for(int i = 0; i <= 2*k; i++){
        //     if(dp[n][i]==1) out.println(i);
        // }

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