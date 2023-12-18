import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    // static int mod = 1_000_000_007;
    int mod = 998244353;
    // long inf = Long.MAX_VALUE/2;
    int inf = Integer.MAX_VALUE/2;

    void solve(){
        int n = ni();
        int[][] lr = new int[n][2];
        for(int i = 0; i < n; i++){
            lr[i][0] = ni();
            lr[i][1] = ni();
        }
        Arrays.sort(lr, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if(a[0] != b[0])return (a[0] - b[0]);
				return a[1] - b[1];
			}
		});
        int l = 0;
        int r = inf;
        long[] ansl = new long[n];
        long[] ansr = new long[n];
        for(int i = 0; i < n; i++){
            l = Math.max(l, lr[i][0]);
            r = Math.min(r, lr[i][1]);
            ansl[i] = Math.max(r-l+1, 0);
        }
        l = 0;
        r = inf;
        for(int i = n-1; i >= 0; i--){
            l = Math.max(l, lr[i][0]);
            r = Math.min(r, lr[i][1]);
            ansr[i] = Math.max(r-l+1, 0);
        }
        long ans = 0;
        for(int i = 0; i < n-1; i++){
            ans = Math.max(ans, ansl[i]+ansr[i+1]);
            // System.err.println(ansl[i]+" "+ansr[i]);
        }
        
        int[] sl = new int[n];
        int[] sr = new int[n];
        for(int i = 0; i < n; i++){
            sl[i] = lr[i][0];
            sr[i] = lr[i][1];
        }   
        Arrays.sort(sl);
        Arrays.sort(sr);
        for(int i = 0; i < n; i++){
            int val = lr[i][1] - lr[i][0] + 1;
            l = sl[n-1];
            r = sr[0];
            if(sl[n-1]==lr[i][0]) l = sl[n-2];
            if(sr[0]==lr[i][1]) r = sr[1];
            val += Math.max(0, r-l+1);
            ans = Math.max(ans, val);
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
