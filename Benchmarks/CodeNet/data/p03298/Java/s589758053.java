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

    void solve(){
        int n = ni();
        char[] c = ns().toCharArray();
        HashMap<Long, Long> map1 = new HashMap<>();
        HashMap<Long, Long> map2 = new HashMap<>();
        long s = 13;
        for(int i = 0; i < (1<<n); i++){
            long tmp1 = 0;
            long tmp2 = 0;
            int p1 = 0;
            int p2 = 0;
            for(int j = 0; j < n; j++){
                if((i>>j)%2==1){
                    tmp1 += (c[j]-'a'+1)*Math.pow(s,p1);
                    tmp1 %= mod;
                    p1++;
                }
                else{
                    tmp2 += (c[j]-'a'+1)*Math.pow(s,p2);
                    tmp2 %= mod;
                    p2++;
                }
            }
            long val = tmp1*10000000 + tmp2;
            map1.put(val, map1.getOrDefault(val,0l)+1);
        }

        for(int i = 0; i < (1<<n); i++){
            long tmp1 = 0;
            long tmp2 = 0;
            int p1 = 0;
            int p2 = 0;
            for(int j = 0; j < n; j++){
                if((i>>j)%2==1){
                    tmp1 += (c[2*n-1-j]-'a'+1)*Math.pow(s,p1);
                    tmp1 %= mod;
                    p1++;
                }
                else{
                    tmp2 += (c[2*n-1-j]-'a'+1)*Math.pow(s,p2);
                    tmp2 %= mod;
                    p2++;
                }
            }
            long val = tmp1*10000000 + tmp2;
            map2.put(val, map2.getOrDefault(val,0l)+1);
        }
        long ans = 0;
        for(long t : map1.keySet()){
            ans += map1.get(t) * map2.getOrDefault(t, 0l);
            // out.println(t);
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
