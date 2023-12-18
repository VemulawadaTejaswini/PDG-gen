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

    ArrayList<Integer>[] edge;
    ArrayList<Integer>[] redge;
    int[] inner;
    int[] outer;
    void solve(){
        int n = ni();
        int m = ni();
        edge = new ArrayList[n];
        redge = new ArrayList[n];
        outer = new int[n];
        inner = new int[n];
        for(int i = 0; i < n; i++){
            edge[i] = new ArrayList<Integer>();
            redge[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < m; i++){
            int s = ni()-1;
            int t = ni()-1;
            edge[s].add(t);
            redge[t].add(s);
            outer[s]++;
            inner[t]++;
        }
        boolean[] e = new boolean[n];
        boolean[] seen = new boolean[n];
        Arrays.fill(e,true);
        while(true){
            boolean flag = false;
            for(int i = 0; i < n; i++){
                if(seen[i]) continue;
                if(outer[i]==0||inner[i]==0){
                    e[i] = false;
                    seen[i] = true;
                    for(int j : edge[i]){
                        inner[j]--;
                    }
                    for(int j : redge[i]){
                        outer[j]--;
                    }
                    flag = true;
                    break;
                }
            }
            if(!flag) break;
        }
        int val = 0;
        int cur = -1;
        for(int i = 0; i < n; i++){
            if(e[i]){
                val++;
            }
        }
        if(val==0){
            out.println(-1);
            return;
        }
        int next = -1;
        boolean[] f = new boolean[n];
        for(int j = 0; j < n; j++){
            if(e[j]) cur = j;
        }
        inner = new int[n];
        int g = cur;
        while(true){
            f[cur] = true;
            // out.println(cur);
            int del = -1;
            boolean loop = false;
            for(int j : edge[cur]){
                if(!e[j]) continue;
                if(j==g) loop = true;
                if(inner[j]>0){
                    del = j;
                }
                next = j;
                inner[j]++;
            }
            if(del!=-1){
                e[g] = false;
            }
            // out.println(cur+" "+next);
            if(del==-1&&loop) break;
            cur = next;
            if(del!=-1){
                cur = del;
                g = del;
                inner = new int[n];
                f = new boolean[n];
                continue;
            }
        }
        e = f;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(e[i]) ans++;
        }
        out.println(ans);
        for(int i = 0; i< n; i++){
            if(e[i]) out.println(i+1);
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
