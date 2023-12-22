import java.io.*;
import java.util.*;

public class Main implements Runnable{
    private ArrayList<ArrayList<Integer>> graph;
    private int clock;
    public static void main(String[] args) throws Exception {
        new Thread(null, new Main(), "bridge", 16 * 1024 * 1024).start();
    }

    @Override
    public void run() {
        try {
            solve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void solve() throws Exception{
        FastScanner scanner = new FastScanner(System.in);

        int V = scanner.nextInt();
        int E = scanner.nextInt();

        graph = new ArrayList<>(V);

        for(int i = 0; i < V; ++i){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        clock = 0;

        boolean[] visited = new boolean[V];
        int[] parent = new int[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        boolean[] result = new boolean[V];

        if(V > 0){
            parent[0] = -1;
            dfs(0, visited, parent, disc, low, result);
        }

        PrintWriter printWriter = new PrintWriter(System.out);
        for(int i = 0; i < V; ++i){
            if(result[i]){
                printWriter.println(i);
            }
        }
        printWriter.flush();
    }

    private void dfs(int u, boolean[] visited, int[] parent, int[] disc, int[] low, boolean[] result){
        visited[u] = true;
        disc[u] = low[u] = ++clock;

        int children = 0;
        for(int v : graph.get(u)){
            if(!visited[v]){
                ++children;
                parent[v] = u;
                dfs(v, visited, parent, disc, low, result);

                low[u] = Math.min(low[u], low[v]);

                if(parent[u] == -1 && children > 1){
                    result[u] = true;
                }

                if(parent[u] != -1 && low[v] >= disc[u]){
                    result[u] = true;
                }
            }
            else if(v != parent[u]){
                low[u] = Math.min(low[u], disc[v]);
            }
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