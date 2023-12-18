import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    int mod = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    void solve(){
        int n = ni();
        int m = ni();
        boolean[][] exist = new boolean[n][n];
        for(int i = 0; i < m; i++){
            int f = ni()-1;
            int t = ni()-1;
            exist[f][t] = true;
            exist[t][f] = true;
        }
        ArrayList<Integer>[] edge = new ArrayList[n];
        for(int i = 0; i < n; i++){
            edge[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i==j||exist[i][j]) continue;
                edge[i].add(j);
            }
        }
        Queue<int[]> q = new ArrayDeque<>();
        boolean[] seen = new boolean[n];
        int[] c = new int[n];
        Arrays.fill(c,-1);
        for(int i = 0; i < n; i++){
            if(!edge[i].isEmpty()){
                q.add(new int[]{i,0});
                seen[i] = true;
                break;
            }
        }
        while(!q.isEmpty()){
            int[] r = q.poll();
            c[r[0]] = r[1];
            for(int i : edge[r[0]]){
                if(seen[i]){
                    if(c[i]==r[1]){
                        out.println(-1);
                        return;
                    }
                    continue;
                }
                q.add(new int[]{i,1-r[1]});
                seen[i] = true;
            }
        }
        for(int i = 0; i < n; i++){
            if(!edge[i].isEmpty()&&!seen[i]){
                out.println(-1);
                return;
            }
        }
        int b = 0;
        int w = 0;
        int e = 0;
        for(int i = 0; i < n; i++){
            if(c[i]==0) b++;
            else if(c[i]==1) w++;
            else e++;
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i <= e; i++){
            int b1 = b+i;
            int w1 = w+e-i;
            int total = b1*(b1-1)/2 + w1*(w1-1)/2;
            ans = Math.min(total,ans);
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
