import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    long MOD = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    void solve(){
        int n = ni();
        int k = ni();
        long res[][][] = new long[k+1][k+1][2];
        long res3[][][] = new long[k+1][k+1][2];
        for(int i = 0; i < n; i++){
            int x = ni();
            int y = ni();
            char c = ns().toCharArray()[0];
            int x1 = x/k;
            int x2 = y/k;
            int r = (x1+x2)%2;
            if(c=='W'){
                if(r==0)res[x%k][y%k][0]++;
                else res[x%k][y%k][1]++;
            }
            if(c=='B'){
                if(r==0) res[x%k][y%k][1]++;
                else res[x%k][y%k][0]++;
            }
        }
        long[][] ldw = new long[k][k];
        long[][] ldb = new long[k][k];
        for(int i = 0; i < k; i++){
            for(int j = 0; j < k; j++){
                if(j>0) ldw[i][j] += ldw[i][j-1];
                if(i>0) ldw[i][j] += ldw[i-1][j];
                if(j>0&&i>0) ldw[i][j] -= ldw[i-1][j-1];
                if(j>0) ldb[i][j] += ldb[i][j-1];
                if(i>0) ldb[i][j] += ldb[i-1][j];
                if(j>0&&i>0) ldb[i][j] -= ldb[i-1][j-1];
                ldw[i][j] += res[i][j][0];
                ldb[i][j] += res[i][j][1];
            }
        }

        long ans = 0;
        for(int i = 0; i < k; i++){
            for(int j = 0; j < k; j++){
                long res1 = 0;
                long res2 = 0;
                res1 += ldw[i][j];
                res1 += ldw[k-1][k-1] - ldw[i][k-1] - ldw[k-1][j] + ldw[i][j];
                res1 += ldb[k-1][j] - ldb[i][j];
                res1 += ldb[i][k-1] - ldb[i][j];
                ans = Math.max(ans, res1);
                res2 += ldb[i][j];
                res2 += ldb[k-1][k-1] - ldb[i][k-1] - ldb[k-1][j] + ldb[i][j];
                res2 += ldw[k-1][j] - ldw[i][j];
                res2 += ldw[i][k-1] - ldw[i][j];
                ans = Math.max(ans, res2);
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