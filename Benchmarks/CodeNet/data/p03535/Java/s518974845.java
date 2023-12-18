import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;

public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
    int n;
    void solve()
    {
        int n = ni();
        int[] d = new int[n];
        int[] c = new int[13];
        for(int i = 0; i < n; i++){
            d[i] = ni();
            int a = Math.min(24-d[i],d[i]);
            c[a]++;
        }
        if(c[0]>=2 || c[12]>=2){
            out.println(0);
            return;
        }
        for(int i = 0; i <= 12; i++){
            if(c[i]>=3){
                out.println(0);
                return;
            }
        }
        int ans = 0;
        int max = 24;
        int res = 0;
        for(int i = 0; i < (1<<11); i++){
            int[] r = new int[25];
            r[0] = c[0];
            r[12] = c[12];
            for(int j = 0; j < 11; j++){
                if((i>>j)%2 == 1){
                    r[j+1] = c[j+1];
                }
                else{
                    r[24-j-1] = c[j+1];
                }
                if(c[j+1]>=2){
                    r[j+1] = 1;
                    r[24-j-1] = 1;
                }
            }
            int prev = 0;
            for(int k = 0; k <= 23; k++){
                if(r[k]>0){
                    res = k - prev;
                    if(res < max){
                        max = res;
                    }
                    prev = k;
                }
            }
            max = Math.min(max, 24-prev);
            if(max > ans){
                ans = max;
            }
            max = 24;
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

    static class ArrayUtils {
        public static void fill(double[][] array, double value) {
            for (double[] a : array) Arrays.fill(a, value);
        }
 
        public static void fill(double[][][] array, double value) {
            for (double[][] l : array) fill(l, value);
        } 
    }
}