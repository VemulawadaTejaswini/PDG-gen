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
        int[] a = new int[n];
        int[] b = new int[n];
        int min = 0;
        int max = 0;
        int mi = 0;
        int ma = 0;
        for(int i = 0; i < n; i++){
            a[i] = ni();
            b[i] = a[i];
            if(a[i]<=min){
                min = a[i];
                mi = i;
            }
            if(a[i]>=max){
                max = a[i];
                ma = i;
            }
        }
        int res  = 0;
        if(Math.abs(max)>=Math.abs(min)){
            for(int i = 0; i < n; i++){
                b[i] += max;
                res ++;
            }
            for(int i = 0; i < n-1; i++){
                if(b[i]>b[i+1]){
                    b[i+1] += b[i];
                    res++;
                }
            }
            // for(int i = 0; i < n; i++){
            //     out.println(b[i]);
            // }
            // out.println(res);
            out.println(2*n-1);
            for(int i = 0; i < n; i++){
                out.println((ma+1)+ " " + (i+1));
            }
            for(int i = 0; i < n-1; i++){
                out.println((i+1)+" "+(i+2));
                // if(a[i]>a[i+1]){
                //     out.println((i+1)+" "+(i+2));
                // }
            }
        }
        else{
            for(int i = 0; i < n; i++){
                b[i] += min;
                res++;
            }
            for(int i = n-1; i > 0; i--){
                if(b[i]<b[i-1]){
                    b[i-1] += b[i];
                    res++;
                }
            }
            // for(int i = 0; i < n; i++){
            //     out.println(a[i]);
            // }
            // out.println(res);
            out.println(2*n-1);
            for(int i = 0; i < n; i++){
                out.println((mi+1)+" "+(i+1));
            }
            for(int i = n-1; i > 0; i--){
                out.println((i+1)+" "+(i));
                // if(a[i]<a[i-1]){
                //     out.println((i+1)+" "+(i));
                // }
            }
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