import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final int inf = Integer.MAX_VALUE/10;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni(), m = in.ni();
        UnionFindTree uf;
        int[][] edge = new int[m][2];
        for(int i = 0; i < m; i++) {
            edge[i][0] = in.ni()-1;
            edge[i][1] = in.ni()-1;
        }
        int count = 0;
        for(int i = 0; i < m; i++) {
            uf = new UnionFindTree(n);
            for(int j = 0; j < m; j++) {
               if(j != i) uf.unite(edge[j][0], edge[j][1]);
            }
            if(uf.count > 1) count++;
        }
        out.println(count);
    }
    public static class UnionFindTree {

        int par[]; int rank[]; int size[]; int count;

        public UnionFindTree(int n) {
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
    public static void main(String[] args) throws Exception{
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
        public long nl(){
            return Long.parseLong(ns());
        }
        public int ni(){
            return Integer.parseInt(ns());
        }
        public Double nd(){
            return Double.parseDouble(ns());
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