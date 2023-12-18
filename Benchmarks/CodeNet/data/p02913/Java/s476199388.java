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
        char[] s = ns().toCharArray();
        RollingHash rol = new RollingHash(s);
        int ans = 0;
        int l = 0;
        int r = n+1;
        while(r-l>1){
            int mid = (r+l)/2;
            if(find(rol,n,mid,s)) l = mid;
            else r = mid;
        }
        out.println(l);
    }

    boolean find(RollingHash rol, int n, int length, char[] s){
        HashMap<Long,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int l = i;
            int r = i + length;
            if(r>n) continue;
            long[] k = rol.query(l,r);
            long key = k[0]*2000000000l + k[1];
            if(map.containsKey(key)&&map.get(key)+length<=l){
                return true;
            }
            else if(map.containsKey(key)){
                continue;
            }
            else{
                map.put(key,l);
            }
        }
        return false;
    }

    class RollingHash {
        int n;
        long[][] h;
        long[][] p;
        int base = 9973;
        int[] mod = {998244353, 1_000_000_007};
        
        RollingHash(char[] s){
            this.n = s.length;
            h = new long[n+1][2];
            p = new long[n+1][2];
            p[0][0] = 1;
            p[0][1] = 1;
            for(int i = 1; i <= n; i++){
                for(int j = 0; j < 2; j++){
                    h[i][j] = (h[i-1][j]*base + s[i-1])%mod[j];
                    p[i][j] = p[i-1][j]*base%mod[j];
                }
            }
        }

        long[] query(int l, int r){
            long[] ret = new long[2];
            for(int i = 0; i < 2; i++){
                ret[i] = ((h[r][i]-h[l][i]*p[r-l][i])%mod[i]+mod[i])%mod[i]; 
            }
            return ret;
        }

        boolean match(int l1, int r1, int l2, int r2){
            long[] a = query(l1,r1);
            long[] b = query(l2,r2);
            boolean ret = true;
            for(int i = 0; i < 2; i++){
                ret &= (a[i]==b[i]);
            }
            return ret;
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
