import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Main {
    FastScanner in;
    PrintWriter out;
    final static int MOD = (int)1e9+7;
    final static long INF = Long.MAX_VALUE / 2;
    
    void solve(){
        int N = in.nextInt(), M = in.nextInt(), S = in.nextInt();
        int sumA = 0;
        int[] U = new int[M], V = new int[M], A = new int[M], B = new int[M];
        for(int i = 0; i < M; i++){
            U[i] = in.nextInt() - 1;
            V[i] = in.nextInt() - 1;
            A[i] = in.nextInt();
            B[i] = in.nextInt();
            sumA += A[i];
        }
        int[] C = new int[N], D = new int[N];
        for(int i = 0; i < N; i++){
            C[i] = in.nextInt();
            D[i] = in.nextInt();
        }
        
        ArrayList<ArrayList<Edge>> g = new ArrayList<>();
        for(int i = 0; i < N * (sumA + 1); i++) g.add(new ArrayList<>());
        for(int i = 0; i < N; i++){
            for(int j = 0; j <= sumA; j++){
                if(j + C[i] <= sumA){
                    g.get(i + N * j).add(new Edge(i + N * j, i + N * (j + C[i]), D[i]));
                }
            }
        }
        for(int i = 0; i < M; i++){
            for(int j = 0; j <= sumA; j++){
                if(j - A[i] >= 0){
                    g.get(U[i] + N * j).add(new Edge(U[i] + N * j, V[i] + N * (j - A[i]), B[i]));
                    g.get(V[i] + N * j).add(new Edge(V[i] + N * j, U[i] + N * (j - A[i]), B[i]));
                }
            }
        }
        
        long[] dist = dijkstra(g, N * Math.min(sumA, S));
        for(int i = 1; i < N; i++){
            long min = Long.MAX_VALUE / 2;
            for(int j = 0; j <= sumA; j++){
                min = Math.min(min, dist[i + N * j]);
            }
            out.println(min);
        }
    }
    
    long[] dijkstra(ArrayList<ArrayList<Edge>> g, int start){
        long INF = Long.MAX_VALUE / 2;
        long[] dist = new long[g.size()];
        Arrays.fill(dist, INF);
        dist[start] = 0;
        PriorityQueue<Node> priorityQueue = new PriorityQueue<Node>();
        priorityQueue.add(new Node(start, 0));
        
        while(!priorityQueue.isEmpty()){
            Node node = priorityQueue.poll();
            if(dist[node.index] < node.cost) continue;
            for(Edge e : g.get(node.index)){
                if(dist[e.to] > dist[node.index] + e.cost){
                    dist[e.to] = dist[node.index] + e.cost;
                    priorityQueue.add(new Node(e.to, dist[e.to]));
                }
            }
        }
        
        return dist;
    }
    
    class Node implements Comparable<Node>{
        int index;
        long cost;
        public Node(int i, long c){
            index = i; cost = c;
        }
        @Override
        public int compareTo(Node o) {
            return Long.compare(this.cost, o.cost);
        }
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
    
    public static void main(String[] args) {
        new Main().m();
    }
    
    private void m() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        /*
        try {
            String path = "input.txt";
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