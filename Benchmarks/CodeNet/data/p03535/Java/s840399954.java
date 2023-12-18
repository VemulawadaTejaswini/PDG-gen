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
        n = ni();
        int[] d  = new int[n+1];
        d[0] = 0;
        for(int i = 0; i < n; i++){
            d[i+1] = ni();
        }
        n++;
        boolean[] seen = new boolean[25];
        int min = 0;
        int ans = 0;
        for(int i = 0; i <= 24; i++){
            int[][] e = new int[n][2];
            e[0][0] = i;
            e[0][1] = i;
            for(int j = 0; j < n-1; j++){
                e[j+1][0] = (d[j+1]+i)%24;
                e[j+1][1] = (-d[j+1]+i+24)%24;
            }
            int left = 1;
            int right = 24;
            while(left+1<right){
                int res = (left+right)/2;
                if(f(e,res,0,seen)) left = res;
                else{
                    right = res;
                }
            }
            if(left>min){
                // if(left==5){
                //     out.println(i);
                // }
                if(left == 1){
                    if(f(e,left,0,seen)){
                        min = left;
                    }
                }
                else min = left;
            }
        }

        ans = min;
        out.println(ans);
    }

    boolean f(int[][] d, int sub, int k, boolean[] seen){
        if(k==n){
            return true;
        }
        boolean res = false;
        for(int i = 0; i < 2; i++){
            boolean[] seenc  = new boolean[25];
            for(int j = 0; j <= 24; j++) seenc[j] = seen[j];
            seenc[d[k][i]] = true;
            if(d[k][i]==0) seenc[24] = true;
            if(d[k][i]==24) seenc[0] = true;
            for(int j = 0; j <= 24; j++){
                if(d[k][i]-sub < j && j < d[k][i]+sub) seenc[j] = true;
                if(d[k][i]-sub < 0 && j > d[k][i]-sub+24) seenc[j] = true;
                if(d[k][i]+sub > 24 && j < d[k][i]+sub-24) seenc[j] = true;
            }
            // for(int g = 0; g <= 24; g++){
            //     if(seenc[g]) out.print(g);
            // }
            // out.println();
            // out.println(d[k][i]);
            // if(!seen[d[k][i]])out.println("ok");
            // else out.println("ng");
            if(!seen[d[k][i]]){
                if(d[k][i]==0){
                    if(!seen[24])res |= f(d, sub, k+1, seenc);
                } 
                else if(d[k][i]==24){
                    if(!seen[0])res |= f(d, sub, k+1, seenc);
                } 
                else res |= f(d, sub, k+1, seenc);
            }
        }  
        return res;
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