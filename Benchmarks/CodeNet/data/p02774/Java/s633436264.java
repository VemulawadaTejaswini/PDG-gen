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
        int n = ni();
        long k = nl();
        long[] a = new long[n];
        for(int i =0; i < n; i++){
            a[i] = nl();
        }
        Arrays.sort(a);
        long left = -2000000000000000001l;
        long right = 2000000000000000001l;
        while(right-left>1){
            long mid = (right+left)/2;
            if(f(mid,a)>=k){
                right = mid;
            }
            else {
                left = mid;
            }
            // out.println(mid+" "+f(mid,a));
        }
        // out.println(left+" "+right);
        // f(0,a);
        // f(6,a);
        out.println(right);
        // f(6,a);
        // f(right,a);
    }

    long f(long mid, long[] a){
        int n = a.length;
        long res = 0;
        for(int i = 0;  i < n; i++){
            if(a[i]==0){
                if(mid>=0){
                    res += n-1;
                }
                else{
                    res += 0;
                }
                continue;
            }
            long M = Math.max(mid,-mid);
            long A = Math.max(a[i],-a[i]);
            if(a[i]>0){
                long target = mid/a[i];
                if((double)mid/a[i]<0) target = -((M+A-1)/A);
                int val = upperBound(a, target+1);
                if(val>=i){
                    val-=1;
                }
                val++;
                res += val;
            }
            else{
                long target = (M+A-1)/A;
                if((double)mid*a[i]<0) target = mid/a[i];
                int val = lowerBound(a, target-1);
                int num = n - val;
                if(val<=i){
                    num-=1;
                }
                res += num;
            }
        }
        return res/2;
    }

    // 配列a内のvより小さいの最大のindex
public static int upperBound(long[] a, long v){ return upperBound(a, 0, a.length, v); }
    public static int upperBound(long[] a, int l, int r, long v)
    {
        if(l > r || l < 0 || r > a.length)throw new IllegalArgumentException();
        int low = l-1, high = r;
        while(high-low > 1){
            int h = high+low>>>1;
            if(a[h] >= v){
                high = h;
            }else{
                low = h;
            }
        }
        return low;
    }

// 配列a内のvより大きいの最小のindex
public static int lowerBound(long[] a, long v){ return lowerBound(a, 0, a.length, v); }
    public static int lowerBound(long[] a, int l, int r, long v)
    {
        if(l > r || l < 0 || r > a.length)throw new IllegalArgumentException();
        int low = l-1, high = r;
        while(high-low > 1){
            int h = high+low>>>1;
            if(a[h] <= v){
                low = h;
            }else{
                high = h;
            }
        }
        return high;
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
