import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int h = in.ni(), w = in.ni();
        char[][] map = new char[h][w];
        for (int i = 0; i < h; i++) map[i] = in.ns().toCharArray();
        UnionFind uf = new UnionFind(h*w);
        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                for (int k = 0; k < 4; k++) {
                    int x = i+dx[k], y = j+dy[k];
                    if(x>=0&&x<h&&y>=0&&y<w){
                        if(map[i][j]!=map[x][y]) uf.unite(i*w+j, x*w+y);
                    }
                }
            }
        }
        long[][] count = new long[h*w][2];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if(map[i][j]=='.'){
                    count[uf.find(i*w+j)][0]++;
                }else{
                    count[uf.find(i*w+j)][1]++;
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans += count[i*w+j][0]*count[i*w+j][1];
            }
        }
        out.println(ans);
    }
    public static class UnionFind {
        int[] par; int[] rank; int[] size;
        private int count;
        public UnionFind(int n) {
            this.par = new int[n];
            this.rank = new int[n];
            this.size = new int[n];
            this.count = n;
            for(int i = 0; i < n; i++) {
                par[i] = i; rank[i] = 0; size[i] = 1;
            }
        }
        int find(int x) {//xの属する集合の根を探す
            if(par[x] == x) return x;
            else return par[x] = find(par[x]);
        }
        void unite(int x, int y) {//x,yの集合を合併
            x = find(x);
            y = find(y);
            if(x == y) return ;
            if(rank[x] < rank[y]) {
                par[x] = y;
                size[y] += size[x];
            }else {
                par[y] = x;
                size[x] += size[y];
                if(rank[x] == rank[y]) {
                    rank[x]++;
                }
            }
            count--;
        }
        boolean same(int x, int y) {//x,yが同じ集合に属するか
            return find(x) == find(y);
        }
        int amount(int x) {//xの属する集合の要素数
            return size[find(x)];
        }
        int count() {//集合の数
            return count;
        }
    }

    public static void main(String[] args){
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
        out.close();
    }
    public static class InputReader{
        private BufferedReader br;
        private StringTokenizer st;
        public InputReader(InputStream is){
            br = new BufferedReader(new InputStreamReader(is));
            st = null;
        }
        public String ns(){
            if(st == null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (Exception e){
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }
        public int ni(){
            return Integer.parseInt(ns());
        }
        public long nl(){
            return Long.parseLong(ns());
        }
        public double nd(){
            return Double.parseDouble(ns());
        }
        public char nc(){
            return ns().toCharArray()[0];
        }
        public int[] ni(int n){
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ni();
            }
            return a;
        }
        public long[] nl(int n){
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nl();
            }
            return a;
        }
        public double[] nd(int n){
            double[] a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = nd();
            }
            return a;
        }
    }
}