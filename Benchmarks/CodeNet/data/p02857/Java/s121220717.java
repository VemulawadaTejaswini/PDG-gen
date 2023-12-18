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
    // int inf = Integer.MAX_VALUE/2;
    int n;
    void solve(){
        n = ni();
        int left = -1;
        int right = n;
        int base = query(0);
        while(right-left>2){
            int mid = (left+right)/2;
            if (query(mid)==base){
                left = mid;
            }
            else{
                right = mid;
            }
        }
        int[] ans = new int[2*n];
        Arrays.fill(ans, -1);
        for(int i = 0; i <= left; i++){
            ans[i] = query2(i, right);
        }
        for(int i = right+n; i < 2*n; i++){
            ans[i] = query2(i, right);
        }
        ArrayList<Integer> list = new ArrayList<>();
        int ridx = 0;
        int bidx = 0;
        for(int i = 0; i < 2*n; i++){
            if(ans[i]==0){
                if(ridx>=n/2) continue;
                list.add(i);
                ridx++;
            }
            else if(ans[i]==1){
                if(bidx>=n/2) continue;
                list.add(i);
                bidx++;
            }
        }
        for(int i = 0; i < 2*n; i++){
            if(ans[i]!=-1) continue;
            ans[i] = query3(i, list);
        }
        System.out.print("! ");
        for(int i = 0; i < 2*n; i++){
            System.out.print(ans[i]==0 ? "R" : "B");
        }
        System.out.println();
    }

    int query(int s){
        System.out.print("? ");
        for(int i = s; i < s+n; i++){
            System.out.print((i+1)+" ");
        }
        System.out.println();
        String ret = ns();
        if (ret.equals("Red")) return 0;
        else return 1;
    }

    int query2(int v, int s){
        System.out.print("? "+(v+1)+" ");
        for(int i = s; i < s+n-1; i++){
            System.out.print((i+1)+" ");
        }
        System.out.println();
        String ret = ns();
        if (ret.equals("Red")) return 0;
        else return 1;
    }

    int query3(int v, ArrayList<Integer> list){
        System.out.print("? "+(v+1)+" ");
        for(int i : list){
            System.out.print((i+1)+" ");
        }
        System.out.println();
        String ret = ns();
        if (ret.equals("Red")) return 0;
        else return 1;
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
