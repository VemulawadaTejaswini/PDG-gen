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
        char[][] map = nm(n,m);
        int[] count = new int[26];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int v = map[i][j] - 'a';
                count[v]++;
            }
        }
        if(n%2==0&&m%2==0){
            for(int i = 0; i < 26; i++){
                if(count[i]%4!=0){
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
            return;
        }
        else if(n%2==0&&m%2==1){
            int d = 0;
            for(int i = 0; i < 26; i++){
                if(count[i]%2!=0){
                    out.println("No");
                    return;
                }
                if(count[i]%4==2){
                    d += 2;
                }
            }
            if(d<=n/2){
                out.println("Yes");
                return;
            }
            else{
                out.println("No");
                return;
            }
        }
        else if(n%2==1&&m%2==0){
            int d = 0;
            for(int i = 0; i < 26; i++){
                if(count[i]%2!=0){
                    out.println("No");
                    return;
                }
                if(count[i]%4==2){
                    d++;
                }
            }
            if(d<=m/2){
                out.println("Yes");
                return;
            }
            else{
                out.println("No");
                return;
            }
        }
        else{
            int s = 0;
            int d = 0;
            for(int i = 0; i < 26; i++){
                if(count[i]%4==1){
                    s++;
                }
                if(count[i]%4==2){
                    d++;
                }
                if(count[i]%4==3){
                    s++;
                    d++;
                }
            }
            if(s!=1){
                out.println("No");
                return;
            }
            if(d>n/2+m/2){
                out.println("No");
                return;
            }
            out.println("Yes");
            return;
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
