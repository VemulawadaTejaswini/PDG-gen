import java.io.*;
import java.util.*;

public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";

    int MOD = 1000000007;
    int INF = 10000000;

    void solve()
    {
        int n = ni();
        int[] t = new int[n];
        int[] v = new int[n];
        int TT = 0;
        for(int i = 0; i < n; i++){
            t[i] = 2*ni();
            TT += t[i];
        }
        int cur = 0;
        int[] lim = new int[TT+100];
        for(int i = 0; i < n; i++){
            v[i] = 2 * ni();
            for(int j = cur; j < cur+t[i]; j++){
                lim[j] = v[i];
                // out.println(lim[j]);
            }
            cur += t[i];
        }
        int[][] dp = new int[TT+100][201];
        for(int i = 0; i < TT+100; i++){
            for(int j = 0; j < 201; j++){
                dp[i][j] = -INF;
            }
        }
        dp[0][0] = 0;
        for(int i = 0; i < TT; i++){
            for(int j = 0; j <= lim[i]; j++){
                if(dp[i][j] >= 0){
                    dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j] + 2*j); 
                }
                if(j < lim[i]){
                    if(dp[i][j+1] >= 0){
                        dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j+1] + 2*j+1); 
                    }
                }
                if(j > 0){
                    if(dp[i][j-1] >= 0){
                        dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j-1] + 2*j-1); 
                    }
                }
                // out.println(j);
                // out.println(dp[i+1][j]);
            }
        }
        out.println((double)dp[TT][0]/8);
       

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
