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
    int n;
    double[][] line;
    double[][] line2;
    double[][] cross;

    void solve(){
        n = ni();
        line = new double[n][3];
        
        cross = new double[n][2];
        for(int i = 0; i < n; i++){
            line[i][0] = nl();
            line[i][1] = nl();
            line[i][2] = nl();
        }
        Arrays.sort(line, new Comparator<double[]>() {
            public int compare(double[] a, double[] b) {
                return Double.compare(-a[0]/a[1],-b[0]/b[1]);
            }
        });
        double left = -10000000000l;
        double right = 10000000000l;
        int half = (n*(n-1)/2)/2;
        for(int i = 0; i < 100; i++){
            double mid = (right+left)/2;
            if(f(mid)>half) left = mid;
            else right = mid;
            // out.println(f(mid)+" "+mid);
        }
        out.print(left+" ");

        line2 = new double[n][3];
        for(int i = 0; i < n; i++){
            line2[i][0] = line[i][1];
            line2[i][1] = line[i][0];
            line2[i][2] = line[i][2];
        }

        Arrays.sort(line2, new Comparator<double[]>() {
            public int compare(double[] a, double[] b) {
                return Double.compare(-a[0]/a[1],-b[0]/b[1]);
            }
        });

        left = -10000000000l;
        right = 10000000000l;
        for(int i = 0; i < 100; i++){
            double mid = (right+left)/2;
            if(f2(mid)>half) left = mid;
            else right = mid;
        }
        out.println(left);

    }

    int f(double mid){
        BIT bi = new BIT(n);
        for(int i = 0; i < n; i++){
            cross[i][0] = (-line[i][0]*mid+line[i][2])/line[i][1];
            cross[i][1] = i;
        }
        Arrays.sort(cross, new Comparator<double[]>() {
            public int compare(double[] a, double[] b) {
                if(a[0]==b[0]) return Double.compare(a[1], b[1]);
                return Double.compare(a[0], b[0]);
            }
        });
        int ret = 0;
        for(int i = 0; i < n; i++){
            int tmp = (int)cross[i][1];
            ret += bi.sum(tmp, n);
            bi.accumlate(tmp, 1);
        }


        return ret;
    }

    int f2(double mid){
        BIT bi = new BIT(n);
        for(int i = 0; i < n; i++){
            cross[i][0] = (-line2[i][0]*mid+line2[i][2])/line2[i][1];
            cross[i][1] = i;
        }
        Arrays.sort(cross, new Comparator<double[]>() {
            public int compare(double[] a, double[] b) {
                if(a[0]==b[0]) return Double.compare(a[1], b[1]);
                return Double.compare(a[0], b[0]);
            }
        });
        int ret = 0;
        for(int i = 0; i < n; i++){
            int tmp = (int)cross[i][1];
            ret += bi.sum(tmp, n);
            bi.accumlate(tmp, 1);
        }


        return ret;
    }

    class BIT {
    private int n;
    private long[] bit;
    public BIT(int n) {
        this.n = n;
        bit = new long[n+1];
    }

    public void accumlate(int index,long num) {
        index++;
        while(index<=n) {
            bit[index] += num;
            index+=index&-index;
        }
    }

    /* [begin , end) */
    public long sum(int begin,int end) {
        return sum(end) - sum(begin);
    }

    private long sum(int i) {
        long s = 0;
        while(i>0) {
            s+=bit[i];
            i-=i&-i;
        }
        return s;
    }

    public long get(int index) {
        return sum(index,index+1);
    }

    public void set(int index,long num) {
        accumlate(index,num-(sum(index)-sum(index-1)));
    }

    public String toString() {
        long[] value = new long[n];
        for(int i=0;i<n;i++) {
            value[i] = get(i);
        }
        return Arrays.toString(value);
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
