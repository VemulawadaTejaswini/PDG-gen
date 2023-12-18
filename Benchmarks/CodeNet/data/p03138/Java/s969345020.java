import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    static int mod = 1_000_000_007;
    long inf = Long.MAX_VALUE/2;

    void solve(){
       int n = ni();
       long k = nl();
       long[] a = new long[n];
       for(int i = 0; i < n; i++){
        a[i] = nl();
       }
       int p = 0;
       long tmp = k;
       boolean full = true;
       int[] q = new int[50];
       while(k>0){
        if(k%2==0) full = false;
        q[p] = (int)(k%2);
        k/=2;
        p++;
       }
       long ans = 0;
       long[][] gain = new long[50][2];
       for(int i = 0; i < 50; i++){
        long c1 = 0;
        long c2 = 0;
        for(int j = 0; j < n; j++){
            if((a[j]>>i)%2==0) c1++;
            else c2++;
        }
        gain[i][0] = c1*(1l<<i);
        gain[i][1] = c2*(1l<<i);
       }

       long[][] dp = new long[50][2];
       dp[49][0] = 0;
       dp[49][1] = 0;
       for(int i = 48; i >= 0; i--){
        if(q[i]==0&&dp[i+1][0]>0) dp[i][0] = dp[i+1][0] + Math.max(gain[i][0], gain[i][1]);
        if(q[i]==1){
            dp[i][0] = Math.max(dp[i][0], dp[i+1][0] + Math.max(gain[i][0], gain[i][1]));
            dp[i][0] = Math.max(dp[i][0], dp[i+1][1] + gain[i][0]);
        }
        if(q[i]==0) dp[i][1] = dp[i+1][1] + gain[i][1];
        if(q[i]==1) dp[i][1] = Math.max(dp[i][1], dp[i+1][1] + gain[i][0]);
        // out.println(dp[i][0] + " " + dp[i][1]);
       }

       for(int i = 0; i < 50; i++){
        ans = Math.max(ans, dp[i][0]);
        ans = Math.max(ans, dp[i][1]);
       }
       out.println(ans);
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
