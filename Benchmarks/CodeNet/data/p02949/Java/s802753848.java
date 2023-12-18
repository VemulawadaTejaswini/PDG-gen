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
    void printlnYN(boolean b){out.println((b ? "Yes" : "No"));}

    void solve() throws Exception{
        int N = in.nextInt(), M = in.nextInt(), P = in.nextInt();
        ArrayList<ArrayList<Edge>> G = new ArrayList<>();
        for(int i = 0; i < N; i++) G.add(new ArrayList<>());
        for(int i = 0; i < M; i++){
            int A = in.nextInt()-1, B = in.nextInt()-1;
            long C = in.nextLong();
            G.get(A).add(new Edge(A, B, -(C-P)));
        }

        long[] dist = bellmanFord(G, 0, Long.MAX_VALUE, Long.MIN_VALUE);
        if(dist[N-1] == Long.MIN_VALUE) out.println("-1");
        else out.println(-dist[N-1]);
    }

    long[] bellmanFord(ArrayList<ArrayList<Edge>> G, int start, long INF, long MINF){
        long[] dist = new long[G.size()];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        for(int num = 0; num < G.size()-1; num++){
            for(int i = 0; i < G.size(); i++){
                if(dist[i] == INF) continue;
                for(Edge e : G.get(i)){
                    if(dist[e.to] > dist[i] + e.cost){
                        dist[e.to] = dist[i] + e.cost;
                    }
                }
            }
        }

        boolean[] isLoop = new boolean[G.size()];
        boolean existLoop = false;

        //負閉路検出
        //startから負閉路を経由して到達できる頂点は、コストを-infとする
        for(int num = 0; num < G.size(); num++){
            for(int i = 0; i < G.size(); i++){
                if(dist[i] == INF) continue;
                for(Edge e : G.get(i)){
                    if(dist[e.to] > dist[i] + e.cost){
                        dist[e.to] = dist[i] + e.cost;
                        isLoop[e.to] = true;
                        existLoop = true;
                    }
                    if(isLoop[i]){
                        isLoop[e.to] = true;
                        existLoop = true;
                    }
                }
            }
        }

        for(int i = 0; i < G.size(); i++) if(isLoop[i]) dist[i] = MINF;
        return dist;
    }

    class Edge implements Comparable<Edge>{
        int from;
        int to;
        long cost;
        public Edge(int f, int t, long c){
            from = f;to = t;cost = c;
        }
        @Override
        public int compareTo(Edge o) {
            return Long.compare(this.cost, o.cost);
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
