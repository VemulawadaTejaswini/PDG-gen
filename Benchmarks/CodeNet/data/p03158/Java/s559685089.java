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

    int black = 0;
    int white = 0;
    ArrayList<int[]>[] edge;
    boolean[] seen;
    void solve(){
        int n = ni();
        int q = ni();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = ni();
        }
        Arrays.sort(a);
        int[] p = new int[n];
        int tmp = 0;
        int uidx = n/2;
        int lidx = (n%2==0 ? 1 : 0);
        int upper = 0;
        int lower = 0;
        for(int i = (n+1)/2; i >= 1; i--){
            p[i] = tmp;
            upper = a[uidx];
            lower = a[lidx];
            tmp = (lower+upper)/2+1;
            uidx++;
            lidx+=2;
            // out.println(p[i]);
        }
        p[0] = 10000000;
        long[] sum = new long[2*n];
        sum[n-1] = a[n-1];
        for(int i = n-3; i >= 0; i--){
            sum[i] += sum[i+2] + a[i];
        }
        long[] sum2 = new long[2*n];
        sum2[n-1] = a[n-1];
        for(int i = n-2; i >= 0; i--){
            sum2[i] += sum2[i+1] + a[i];
        }
        for(int i = 0; i < q; i++){
            int x = ni();
            int left = 0;
            int right = (n+1)/2;
            long ans = 0;
            while(right-left>1){
                int mid = (right+left)/2;
                if(p[mid] > x) left = mid;
                else right = mid;
                // out.println(mid);
            }
            // out.println(p[1]);
            // out.println(left);
            left++;
            ans += sum2[n-1-left+1] + sum[n%2==0 ? 1 : 0] - sum[n-1-2*left+2];
            out.println(ans);
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
