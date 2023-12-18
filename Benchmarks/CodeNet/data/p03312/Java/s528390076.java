import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    int mod = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    void solve(){
        int n = ni();
        long[] a = new long[n];
        long[] cum = new long[n+1];
        for(int i = 0; i < n; i++){
            a[i] = nl();
            cum[i+1] = cum[i] + a[i];
        }
        long ans = Long.MAX_VALUE;
        for(int i = 1; i < n-2; i++){
            long[] res1 = calc(0,i,cum);
            long[] res2 = calc(i+1,n-1,cum);
            long[] tmp = new long[4];
            tmp[0] = res1[1];
            tmp[1] = res1[2];
            tmp[2] = res2[1];
            tmp[3] = res2[2];
            Arrays.sort(tmp);
            ans = Math.min(ans, tmp[3]-tmp[0]);
        }
        out.println(ans);
    }

    long[] calc(int l, int r, long[] cum){
        int left = l;
        int right = r;
        long sum = cum[r+1] - cum[l];
        while(right-left>2){
            int l2 = (left+left+right)/3;
            int r2 = (left+right+right)/3;
            long suml = cum[l2+1]-cum[l];
            long sumr = cum[r2+1]-cum[l];
            long difl = Math.abs((sum-suml) - suml);
            long difr = Math.abs((sum-sumr) - sumr);
            if(difl<difr) right = r2;
            else left = l2;
        }
        int ans = -1;
        long max = Long.MAX_VALUE;
        long ansl = 0;
        long ansr = 0;
        for(int i = left; i <= right; i++){
            long suml = cum[i+1]-cum[l];
            long difl = Math.abs((sum-suml) - suml);
            if(difl<max){
                max = difl;
                ans = i;
                ansl = suml;
                ansr = sum-suml;
            }
        }
        return new long[]{ans, ansl, ansr};
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
