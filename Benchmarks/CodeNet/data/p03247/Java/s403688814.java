import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    static int mod = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    void solve(){
        int n = ni();
        long[] x = new long[n];
        long[] y = new long[n];
        long[] u = new long[n];
        long[] v = new long[n];
        for(int i = 0; i < n; i++){
            x[i] = nl();
            y[i] = nl();
            u[i] = x[i] + y[i];
            v[i] = x[i] - y[i];
        }
        long mod = (x[0]+y[0]+(1l<<40))%2;
        for(int i = 0; i < n; i++){
            if((x[i]+y[i]+(1l<<40))%2!=mod){
                out.println(-1);
                return;
            }
        }
        int m = 31;
        long[] d = new long[m];
        for(int i = 0; i < m; i++){
            d[i] = (1l<<i);
        }

        if(mod%2==1){
            out.println(m);
            for(int i = 0; i < m; i++){
                out.print(d[i]+" ");
            }
            out.println();
        }

        if(mod%2==0){
            out.println(m+1);        
            for(int i = 0; i < m; i++){
                out.print(d[i]+" ");
            }
            out.print(1);
            out.println();
        }

        for(int i = 0; i < n; i++){
            if(mod%2==0){
                u[i]--;
                v[i]--;
            }
            long res1 = (u[i]+(1l<<31)-1)/2;
            long res2 = (v[i]+(1l<<31)-1)/2;
            boolean[] s = new boolean[m];
            boolean[] t = new boolean[m];
            for(int j = 0; j < m; j++){
                if((res1>>j)%2==1){
                    s[j] = true;
                }
                if((res2>>j)%2==1){
                    t[j] = true;
                }
                if(s[j]&&t[j]) out.print('R');
                else if(s[j]) out.print('U');
                else if(t[j]) out.print('D');
                else out.print('L');
            }
            if(mod%2==0){
                out.print('R');
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
