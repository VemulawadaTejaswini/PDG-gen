import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solve();
    }

    private void solve() throws Exception{
        FastScanner scanner = new FastScanner(System.in);

        int V = scanner.nextInt();
        int E = scanner.nextInt();
        int src = scanner.nextInt();

        Edge[] edges = new Edge[E];
        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();

            edges[i] = new Edge(u, v, w);
        }

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        boolean isUpdated = false;
        for(int i = 1; i < V; ++i){
            isUpdated = false;
            for(int j = 0; j < E; ++j){
                Edge edge = edges[j];
                if(dist[edge.u] != Integer.MAX_VALUE && dist[edge.v] > dist[edge.u] + edge.weight){
                    dist[edge.v] = dist[edge.u] + edge.weight;
                    isUpdated = true;
                }
            }

            if(!isUpdated){
                break;
            }
        }

        if(isUpdated){
            for(int j = 0; j < E; ++j){
                Edge edge = edges[j];
                if(dist[edge.u] != Integer.MAX_VALUE && dist[edge.v] > dist[edge.u] + edge.weight){
                    System.out.println("NEGATIVE CYCLE");
                    return;
                }
            }
        }

        PrintWriter printWriter = new PrintWriter(System.out);
        for(int i = 0; i < V; ++i){
            if(dist[i] == Integer.MAX_VALUE){
                printWriter.println("INF");
            }
            else{
                printWriter.println(dist[i]);
            }
        }

        printWriter.flush();
    }

    static class Edge{
        int u;
        int v;
        int weight;

        public Edge(int u, int v, int weight){
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }

    static class FastScanner {
        private InputStream in;
        private final byte[] buffer = new byte[1024 * 8];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in){
            this.in = in;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        public boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}