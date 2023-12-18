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
        double[][] board = new double[n][2];
        for(int i = 0; i < n; i++){
            board[i][0] = ni();
            board[i][1] = ni();
        }
        if(n==2){
            double dist = Math.sqrt(Math.pow(board[0][0]-board[1][0],2) + Math.pow(board[0][1]-board[1][1],2));
            out.println(dist/2);
            return;
        }
        double ans = inf;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++) {
                for(int k = j+1; k < n; k++){
                    double ix = board[i][0];
                    double iy = board[i][1];
                    double jx = board[j][0];
                    double jy = board[j][1];
                    double kx = board[k][0];
                    double ky = board[k][1];
                    double a = Math.sqrt(Math.pow(jx-kx,2) + Math.pow(jy-ky,2));
                    double b = Math.sqrt(Math.pow(ix-jx,2) + Math.pow(iy-jy,2));
                    double c = Math.sqrt(Math.pow(ix-kx,2) + Math.pow(iy-ky,2));
                    double bxc = (jx-ix)*(ky-iy) - (jy-iy)*(kx-ix);
                    double sina = Math.abs(bxc / (b*c));
                    double cxa = (jx-kx)*(iy-ky) - (jy-ky)*(ix-kx);
                    double sinc = Math.abs(cxa / (c*a));
                    double axb = (ix-jx)*(ky-jy) - (iy-jy)*(kx-jx);
                    double sinb = Math.abs(axb / (a*b));
                    double cosa = Math.sqrt(1-sina*sina);
                    double cosb = Math.sqrt(1-sinb*sinb);
                    double cosc = Math.sqrt(1-sinc*sinc);
                    double[] center = new double[2];
                    center[0] = (a*cosa*ix + b*cosb*jx + c*cosc*kx)/(a*cosa+b*cosb+c*cosc);
                    center[1] = (a*cosa*iy + b*cosb*jy + c*cosc*ky)/(a*cosa+b*cosb+c*cosc);
                    double dist = 0;
                    for(int d = 0; d < n; d++){
                        double tmp = Math.sqrt(Math.pow(center[0]-board[d][0],2)+Math.pow(center[1]-board[d][1],2));
                        dist = Math.max(tmp,dist);
                    }
                    // out.println(dist+" "+center[0]+" "+center[1]+" "+cosa+" "+cosb+" "+cosc+" "+sinc);
                    ans = Math.min(ans,dist);
                }
            }
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
