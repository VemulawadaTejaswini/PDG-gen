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
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = nl();
        }
        long[] p = new long[n];
        long[] q = new long[n];
        for(int i = 0; i < n-1; i++){
            long tmp = a[i];
            long tmp2 = a[i+1];
            long res = 0;
            while(tmp>tmp2){
                tmp2 *= 4;
                res += 2;
            }
            p[i+1] = res;
        }
        for(int i = n-1; i >= 1; i--){
            long tmp = a[i]*(-2);
            long tmp2 = a[i-1]*(-2);
            long res = 1;
            while(tmp<tmp2){
                tmp2 *= 4;
                res += 2;
            }
            q[i-1] = res;
        }
        long[] hp = new long[n];
        long[] hq = new long[n];
        long[] sp = new long[n];
        long[] sq = new long[n];
        for(int i = 1; i < n; i++){
            hp[i] = hp[i-1] + p[i];
        }
        hq[n-1] = 1;
        for(int i = n-2; i >= 0; i--){
            hq[i] = hq[i+1] + q[i];
        }
        for(int i = 1; i < n; i++){
            sp[i] = sp[i-1] + hp[i];
        }
        for(int i = n-2; i >= 0; i--){
            sq[i] = sq[i+1] + hq[i];
        }

        long ans = inf;
        for(int i = 0; i < n; i++){
            long res1 = i==0 ? -1 : sq[0]-sq[i-1]-hq[i-1]*(i-1);
            long res2 = sp[n-1]-sp[i]-hp[i]*(n-1-i);
            ans = Math.min(ans, res1+res2+1);
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
