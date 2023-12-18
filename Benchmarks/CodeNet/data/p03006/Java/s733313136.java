import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Main {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    void printlnYN(boolean b){out.println((b ? "YES" : "NO"));}

    //System.out.println();はつかわない！！
    void solve() throws Exception{
        int N = in.nextInt();
        int[] x = new int[N], y = new int[N];
        HashMap<Long, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            x[i] = in.nextInt();
            y[i] = in.nextInt();
            map.put(x[i] + (long)1e10 * y[i], i);
        }

        if(N == 1){
            out.println("1");
            return;
        }

        long min = Long.MAX_VALUE;
        for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < N; j++){
                int dx = x[i] - x[j], dy = y[i] - y[j];
                UnionFind uf = new UnionFind(N);
                for(int k = 0; k < N; k++){
                    if(map.containsKey((x[k] + dx) + (long)1e10 * (y[k] + dy))) uf.union(k, map.get((x[k] + dx) + (long)1e10 * (y[k] + dy)));
                    if(map.containsKey((x[k] - dx) + (long)1e10 * (y[k] - dy))) uf.union(k, map.get((x[k] - dx) + (long)1e10 * (y[k] - dy)));
                }
                min = Math.min(min, uf.group);
            }
        }
        out.println(min);
    }

    class UnionFind{
        int[] par;
        int[] rank;
        int[] size;
        int group;

        UnionFind(int n){
            par = new int[n];
            rank = new int[n];
            size = new int[n];
            group = n;
            for(int i = 0; i < n; i++){
                par[i] = i;
                rank[i] = 0;
                size[i] = 1;
            }
        }

        //経路圧縮しながらrootを求める
        int find(int x){
            if(par[x] == x){
                return x;
            }else{
                int f = find(par[x]);
                return par[x] = f;
            }
        }

        //ランクの小さいほうにつなげる
        boolean union(int x, int y){
            x = find(x);
            y = find(y);
            if(x == y) return false;

            if(rank[x] < rank[y]){
                int tmp = x; x = y; y = tmp;
            }

            //y(のroot)をx(のroot)の下にくっつける
            //yのほうが重くなる(ポテンシャルが高くなる)
            if(rank[x] == rank[y]) rank[x]++;
            group--;
            par[y] = x;
            size[x] += size[y];

            return true;
        }

        boolean isSame(int x, int y){
            return find(x) == find(y);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().m();
    }

    void m() throws Exception {
        solve();
        out.flush();
    }

    class FastScanner {
        Reader input;

        FastScanner() {this(System.in);}
        FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}

        int nextInt() {return (int) nextLong();}

        long nextLong() {
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

        double nextDouble() {
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

        char nextChar() {
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

        String nextStr() {
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
/* end Main */