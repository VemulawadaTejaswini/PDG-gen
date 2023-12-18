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

    void solve(){
        int h = ni();
        int w = ni();
        int a = ni();
        int b = ni();
        // if(a*h!=b*w){
        //     out.println("No");
        //     return;
        // }
        if(a==0&&w==1){
            for(int i = 0; i < h; i++){
                if(i<b) out.println(0);
                else out.println(1);
            }
            return;
        }
        int[][] board = new int[h][w];
        int[] next = new int[w];
        for(int i = 0; i < a; i++){
            next[i] = 1;
        }
        int c = 0;
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(next[j]==1){
                    board[i][j] = 1;
                    c++;
                }
                else board[i][j] = 0;
            }
            next = new int[w];
            for(int j = c; j < c+a; j++){
                int d = j%w;
                next[d] = 1;
            }   
        }
        for(int i = 0; i < h; i++){
            int zero = 0;
            int one = 0;
            for(int j = 0; j < w; j++){
                if(board[i][j]==0) zero++;
                else one++;
            }
            if(Math.min(zero,one)!=a){
                out.println("No");
                return;
            }
        }
        for(int j = 0; j < w; j++){
            int zero = 0;
            int one = 0;
            for(int i = 0; i < h; i++){
                if(board[i][j]==0) zero++;
                else one++;
            }
            if(Math.min(zero,one)!=b){
                out.println("No");
                return;
            }
        }
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
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
