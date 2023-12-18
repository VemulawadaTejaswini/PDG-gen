import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    // static int mod = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    void solve(){ 
        int n = ni();
        int[][] res = new int[n][2];
        int p = 0;
        for(int i = 0; i < n; i++){
            res[i][0] = ni();
            res[i][1] = ni();
        }
        for(int i = 0; i < n; i++){
            int tmp = res[i][0]+res[i][1];
            if(i>0){
                if((tmp%2)!=(p%2)){
                    out.println(-1);
                    return;
                }
            }
            p = tmp;
            if(Math.abs(res[i][0])>10||Math.abs(res[i][1])>10){
                out.println(-1);
                return;
            }
        }
        int m = 40;
        if(p%2==1) m = 39;
        out.println(m);
        for(int i = 0; i < m; i++){
            out.print(1+" ");
        }
        out.println();
        for(int i = 0; i < n; i++){
            int x = res[i][0];
            int y = res[i][1];
            int c = 0;
            if(x<0){
                for(int j = 0; j < -x; j++){
                    out.print("L");
                    c++;
                }
            }
            if(x>0){
                for(int j = 0; j < x; j++){
                    out.print("R");
                    c++;
                }
            }
            if(y<0){
                for(int j = 0; j < -y; j++){
                    out.print("D");
                    c++;
                }
            }
            if(y>0){
                for(int j = 0; j < y; j++){
                    out.print("U");
                    c++;
                }
            }
            int nokori = m-c;
            for(int j = 0; j < nokori; j++){
                if(j%2==0) out.print("L");
                else out.print("R");
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
