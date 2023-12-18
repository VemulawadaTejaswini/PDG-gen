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
        int[] ret = findloop(e, n);
        int ans = 0;
        for(int i = 0; i < n+1; i++){
            if(ret[i]!=-1) ans++;
        }
        int[] v;
        while(true){
            // for(int i = 0; i < n; i++){
            //     System.err.print(ret[i]+" ");
            // }
            // System.err.println();
            v = shrink_loop(ret,n);
            int size = 0;
            for(int i = 0; i < n+1; i++){
                if(v[i]!=-1) size++;
            }
            if(ans==size) break;
            ans = size;
            ret = v;
        }
        out.println(ans-1);
        for(int i = 0; i < ans-1; i++){
            out.println(v[i]+1);
        }
    }

    int[] shrink_loop(int[] s, int n){
        boolean[] e = new boolean[n];
        for(int i = 0; i < n; i++){
            if(s[i]!=-1) e[s[i]] = true;
        }
        int cur = s[0];
        int idx = 0;
        int[] ret = new int[n+1];
        Arrays.fill(ret, -1);
        while(true){
            if(idx!=0&&s[idx]==s[0]) break;
            idx++;
            boolean flag = false;
            for(int i : edge[cur]){
                // System.err.println(cur+" "+i);
                if(!e[i]) continue;
                if(s[idx]!=i){
                    for(int j = 0; j < n+1; j++){
                        if(s[j]==i){
                            if(j<idx){
                                int id = 0;
                                for(int k = j; k < idx; k++){
                                    ret[id++] = s[k];
                                }
                                ret[id] = ret[0];
                            }
                            else{
                                int id = 0;
                                for(int k = 0; k < n+1; k++){
                                    if(k>=idx&&k<j) continue;
                                    ret[id++] = s[k];
                                }
                            }
                        }
                    }
                    flag = true;
                }
                cur = i;
            }
            if(flag) break;
        }
        if(ret[0]==-1) return s;
        return ret;
    }

    int[] findloop(boolean[] e, int n){
        int[] p = new int[2*n];
        Arrays.fill(p, -1);
        int idx = 0;
        int cur = -1;
        for(int i = 0; i < n; i++){
            if(e[i]){
                cur = i;
            }
        }
        boolean[] seen = new boolean[n];
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            seen[cur] = true;
            p[idx++] = cur;
            for(int i : edge[cur]){
                if(!e[i]) continue;
                if(seen[i]){
                    int id = -1;
                    for(int j = 0; j < n; j++){
                        if(id==-1 && p[j]!=i) continue;
                        if(id==-1) id = p[j];
                        if(p[j]!=-1) list.add(p[j]);
                    }
                    break;
                }
                cur = i;
            }
            if(list.size()>0) break;
        }
        int[] ret = new int[n+1];
        Arrays.fill(ret, -1);
        idx = 0;
        for(int i : list){
            // System.err.println(i);
            ret[idx++] = i;
        }
        ret[idx] = list.get(0);
        return ret;
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
