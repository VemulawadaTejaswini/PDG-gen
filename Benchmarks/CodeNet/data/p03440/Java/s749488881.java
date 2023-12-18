import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    long mod = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    void solve(){
        int n = ni();
        int m = ni();
        long[][] a = new long[n][2];
        long[] b = new long[n];
        for(int i = 0; i < n ;i++){
            b[i] = nl();
            a[i][0] = b[i];
            a[i][1] = i;
        }
        Arrays.sort(a, new Comparator<long[]>() {
            public int compare(long[] c, long[] d) {
                return Long.compare(c[0],d[0]);
            }
        });
        UnionFind uf = new UnionFind(n);
        for(int i = 0; i < m; i++){
            int from = ni();
            int to = ni();
            uf.union(from, to);
        }
        int comp = 0;
        boolean[] seen = new boolean[n];
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i = 0; i < n; i++){
            int tmp = uf.find(i);
            if(!seen[tmp]){
                comp++;
                seen[tmp] = true;
                map.put(tmp, map.size());
            }
        }
        ArrayList<Integer>[] arr = new ArrayList[comp];
        for(int i = 0; i < comp; i++){
            arr[i] = new ArrayList<>();
        }
        for(int i = 0; i < n; i++){
            int tmp = uf.find(i);
            arr[map.get(tmp)].add(i);
        }
        // for(ArrayList<Integer> i : arr){
        //     for(int j : i){
        //         out.print(j+" ");
        //     }
        //     out.println();
        // }
        long node = (comp-1)*2;
        long sum = 0;
        if(node==0){
            out.println(sum);
            return;
        }
        boolean[] used = new boolean[n];
        for(ArrayList<Integer> i : arr){
            long min = inf;
            int tmp = -1;
            for(int j : i){
                if(b[j]<min){
                    tmp = j;
                    min= b[j];
                }
            }
            used[tmp] = true;
            sum += min;
            node--;
            if(node==0){
                out.println(sum);
                return;
            }
        }
        for(int i = 0; i < n; i++){
            long res = a[i][0];
            int tmp = (int)a[i][1];
            if(used[tmp]) continue;
            sum += res;
            used[tmp] = true;
            node--;
            if(node==0){
                out.println(sum);
                return;
            }
        }
        // out.println(node);
        out.println("Impossible");
    }

public static class UnionFind{  
        int parent[];
        int rank[];
        
        public UnionFind(int n){
            parent = new int[n];
            rank   = new int[n];
            
            for(int i = 0;i < n;i++){
                parent[i] = i;
                rank[i]   = 0;
            }        
        }
        
        boolean same(int x,int y){
            return find(x) == find(y);
        }
        
        public int find(int x){
            if(parent[x] == x){
               return x;
            }else{
               return parent[x] = find(parent[x]);   
            }        
        }
          
        public void union(int x,int y){
            x = find(x);
            y = find(y);
            
            if(x != y){
                if(rank[x] > rank[y]){
                   parent[y] = x; 
                }else{
                   parent[x] = y;
                   if(rank[x] == rank[y]){
                       rank[y]++;
                   }
                }            
            }
            
            return;
        }
        
        public int count(int n){
            int ret = 0;
            for(int i = 0;i < n;i++){
                if(i == find(i)){
                    ret++;
                }
            }
            return ret;
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