import java.io.*;
import java.util.*;

public class Main {
    private ArrayList<ArrayList<Integer>> graph;
    public static void main(String[] args) throws Exception {
        new Main().solve();
    }

    private void solve() throws Exception{
        FastScanner scanner = new FastScanner(System.in);

        int V = scanner.nextInt();
        int E = scanner.nextInt();

        graph = new ArrayList<>(V);
        for(int i = 0; i < V; ++i){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            graph.get(u).add(v);
        }

        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; ++i){
            boolean[] recStack = new boolean[V];
            if(!visited[i] && isCyclicUtil(i, visited, recStack)){
                System.out.println("1");
                return;
            }
        }

        System.out.println("0");
    }

    private boolean isCyclicUtil(int u, boolean[] visited, boolean[] recStack){
        visited[u] = true;
        recStack[u] = true;

        for(int v : graph.get(u)){
            if(visited[v] && recStack[v]){
                return true;
            }
            else if(!visited[v] && isCyclicUtil(v, visited, recStack)){
                return true;
            }
        }
        recStack[u] = false;
        return false;
    }

    static class FastScanner {
        private InputStream in;
        private final byte[] buffer = new byte[1024];
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