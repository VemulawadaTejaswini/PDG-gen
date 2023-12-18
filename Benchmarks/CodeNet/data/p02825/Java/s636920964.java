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

    int n,v,p;
    long m;
    long[] a;
    void solve(){
        int n = ni();
        
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        if(n%3==0){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(i%3==0 && j==i) board[i][j] = 'a';
                    if(i%3==0 && j==i+1) board[i][j] = 'a';
                    if(i%3==1 && j==i+1) board[i][j] = 'a';
                    if(i%3==2 && j==i) board[i][j] = 'a';
                }
            }
        }
        else if(n>5 && (n-2)%6==0){
            int val = 0;
            for(int j = 1; j < n-1; j+=2){
                board[0][j] = (char)('b'+val);
                board[0][j+1] = (char)('b'+val);
                val++;
                val %= 5;
            }
            for(int j = 1; j < n-1; j+=2){
                board[n-1][j] = (char)('b'+val);
                board[n-1][j+1] = (char)('b'+val);
                val++;
                val %= 5;
            }
            for(int i = 1; i < n-1; i+=2){
                board[i][0] = (char)('b'+val);
                board[i+1][0] = (char)('b'+val);
                val++;
                val %= 5;
            }
            for(int i = 1; i < n-1; i+=2){
                board[i][n-1] = (char)('b'+val);
                board[i+1][n-1] = (char)('b'+val);
                val++;
                val %= 5;
            }
            
            for(int i = 0; i < n-2; i++){
                for(int j = 0; j < n-2; j++){
                    if(i%3==0 && j==i) board[i+1][j+1] = 'a';
                    if(i%3==0 && j==i+1) board[i+1][j+1] = 'a';
                    if(i%3==1 && j==i+1) board[i+1][j+1] = 'a';
                    if(i%3==2 && j==i) board[i+1][j+1] = 'a';
                }
            }
        }
        else{
            out.println(-1);
            return;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                out.print(board[i][j]);
            }
            out.println();
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
