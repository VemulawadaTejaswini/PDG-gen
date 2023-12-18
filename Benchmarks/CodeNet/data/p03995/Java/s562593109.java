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

    int r, c, n;
    Board[] bor;
    ArrayList<long[]>[] edge;
    long[] val;
    boolean[] seen;

    void solve(){
        r = ni();
        c = ni();
        n = ni();

        bor = new Board[n];
        for(int i = 0; i < n; i++){
            int x = ni()-1;
            int y = ni()-1;
            long v = nl();
            bor[i] = new Board(x, y, v);
        }

        edge = new ArrayList[r+c];
        for(int i = 0; i < r+c; i++){
            edge[i] = new ArrayList<long[]>();
        }

        for(int i = 0; i < n; i++){
            int x = bor[i].x;
            int y = bor[i].y + r;
            long v = bor[i].v;
            edge[x].add(new long[]{y, v});
            edge[y].add(new long[]{x, v});
        }

        val = new long[r+c];
        Arrays.fill(val, inf);

        for(int i = 0; i < r+c; i++){
            if(val[i]!=inf) continue;
            boolean flag = func(-1, i, 0);
            if(!flag){
                out.println("No");
                return;
            }
        }
        seen = new boolean[r+c];
        for(int i = 0; i < r+c; i++){
            if(seen[i]) continue;
            long[] ret = calc_min(-1, i);
            if(ret[0]+ret[1]<0){
                out.println("No");
                return;
            }
        }
        out.println("Yes");

    }

    long[] calc_min(int p, int c){
        seen[c] = true;
        long[] ret = new long[2];
        if(c<r) ret[0] = val[c];
        else ret[1] = val[c];

        for(long[] e : edge[c]){
            if(e[0]==p) continue;
            if(seen[(int)e[0]]) continue;
            seen[(int)e[0]] = true;
            long[] res = calc_min(c, (int)e[0]);
            ret[0] = Math.min(ret[0], res[0]);
            ret[1] = Math.min(ret[1], res[1]);
        }
        return ret;
    }

    boolean func(int p, int c, long v){
        boolean ret = true;
        if(val[c]!=inf){
            if(val[c]!=v) return false;
            else return true;
        }
        val[c] = v;
        for(long[] e : edge[c]){
            if(e[0]==p) continue;
            ret &= func(c, (int)e[0], e[1]-v);
        }
        return ret;
    }

    class Board{
        int x;
        int y;
        long v;
        Board(int x, int y, long v){
            this.x = x;
            this.y = y;
            this.v = v;
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
