import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Main {
    FastScanner in;
    PrintWriter out;
    int MOD = (int)1e9+7;
    long ceil(long a, long b){return (a + b - 1) / b;}
    long gcd(long a, long b){return b == 0 ? a : gcd(b, a % b);}
    long lcm(long a, long b){return a / gcd(a, b) * b;}
    
    void solve() {
        int N = in.nextInt(), M = N-1;
        int t = in.nextInt()-1, a = in.nextInt()-1;
        ArrayList<ArrayList<Integer>> T = new ArrayList<>();
        for(int i = 0; i < N; i++) T.add(new ArrayList<>());
        for(int i = 0; i < M; i++){
            int A = in.nextInt()-1;
            int B = in.nextInt()-1;
            T.get(A).add(B);
            T.get(B).add(A);
        }
        long INF = Long.MAX_VALUE / 2;
        long[] distT = graphBFS(T, t), distA = graphBFS(T, a);
        LowestCommonAncestor lca = new LowestCommonAncestor(T, t);
        
        long max = -1;
        for(int i = 0; i < N; i++){
            if(T.get(i).size() != 1) continue;
            int v = lca.getLCA(a, i);
            if(distA[v] - distT[v] < 1) continue;
            
            long sum = distA[i] - 1;
            max = Math.max(max, sum);
            //out.println(i + " " + sum);
        }
        out.println(max);
    }
    
    long[] graphBFS(ArrayList<ArrayList<Integer>> g, int s){
        int N = g.size();
        long[] dist = new long[N+1];
        Arrays.fill(dist, Long.MAX_VALUE / 2);
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        queue.addLast(s);
        dist[s] = 0;
        
        while(!queue.isEmpty()){
            int v = queue.removeFirst();
            for(int next : g.get(v)){
                if(dist[next] > dist[v] + 1){
                    dist[next] = dist[v] + 1;
                    queue.addLast(next);
                }
            }
        }
        return dist;
    }
    
    class LowestCommonAncestor {
        int[] vs, depth, id;
        ArrayList<ArrayList<Integer>> T;
        SparseTableIndex sti;
        
        //Euler-Tour Technique
        public LowestCommonAncestor(ArrayList<ArrayList<Integer>> T, int root){
            vs = new int[T.size()*2-1];
            depth = new int[T.size()*2-1];
            id = new int[T.size()];
            this.T = T;
            dfsStack(root);
            sti = new SparseTableIndex(depth);
        }
        
        void dfsStack(int root){
            ArrayDeque<int[]> stack = new ArrayDeque<>();
            int k = 0;
            stack.addLast(new int[]{0, root, -1, 0});
            while(!stack.isEmpty()){
                int[] node = stack.removeLast();
                int v = node[1], p = node[2], d = node[3];
                if(node[0] == 0){
                    id[v] = k;
                    vs[k] = v;
                    depth[k] = d;
                    k++;
                    for(int to : T.get(v)) {
                        if (to == p) continue;
                        stack.addLast(new int[]{1, v, p, d});
                        stack.addLast(new int[]{0, to, v, d+1});
                    }
                }else{
                    vs[k] = v;
                    depth[k] = d;
                    k++;
                }
            }
        }
        
        public int getLCA(int u, int v){
            int L = Math.min(id[u], id[v]), R = Math.max(id[u], id[v]);
            return vs[sti.get(L, R+1)];
        }
        
        class SparseTableIndex {
            int[][] table;
            int[] height;
            int[] v;
            
            public SparseTableIndex(int[] v){
                init(v);
            }
            
            void init(int[] v){
                this.v = Arrays.copyOf(v, v.length);
                int n = v.length, h = 0;
                while((1<<h) <= n) h++;
                table = new int[h][1<<h];
                height = new int[n+1];
                for(int i = 2; i <= n; i++) height[i] = height[i>>1]+1;
                for(int i = 0; i < n; i++) table[0][i] = i;
                for(int i = 1; i < h; i++) {
                    for (int j = 0; j < n; j++) {
                        int x = table[i - 1][j], y = table[i - 1][Math.min(j + (1 << (i - 1)), n - 1)];
                        table[i][j] = v[x] <= v[y] ? x : y;
                    }
                }
            }
            
            public int get(int a, int b){
                int l = height[b-a];
                int x = table[l][a], y = table[l][b-(1<<l)];
                return v[x] <= v[y] ? x : y;
            }
        }
    }
    
    public static void main(String[] args) {
        new Main().m();
    }
    
    private void m() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        /*
        try {
            String path = "output.txt";
            out = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))));
        }catch (IOException e){
            e.printStackTrace();
        }
        */
        solve();
        out.flush();
        in.close();
        out.close();
    }
    
    static class FastScanner {
        private Reader input;
        
        public FastScanner() {this(System.in);}
        public FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}
        public void close() {
            try {
                this.input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        public int nextInt() {return (int) nextLong();}
        
        public long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }
        
        public double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }
        
        public char nextChar() {
            try {
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }
        
        public String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
        
        public String nextLine() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (b != -1 && b != '\n') {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
        
        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }
        
        public int[] nextIntArrayDec(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt() - 1;
            }
            return res;
        }
        
        public int[] nextIntArray1Index(int n) {
            int[] res = new int[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextInt();
            }
            return res;
        }
        
        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }
        
        public long[] nextLongArrayDec(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }
        
        public long[] nextLongArray1Index(int n) {
            long[] res = new long[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextLong();
            }
            return res;
        }
        
        public double[] nextDoubleArray(int n) {
            double[] res = new double[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextDouble();
            }
            return res;
        }
    }
}