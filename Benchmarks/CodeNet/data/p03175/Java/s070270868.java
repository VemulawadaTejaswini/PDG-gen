import java.io.*;
import java.util.*;

public class Main {

    static long mod = (long) (1e9 + 7);

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        Vertex[] vs = new Vertex[n + 1];
        for (int i = 1; i <= n; i++) {
            vs[i] = new Vertex(i);
        }
        for (int i = 0; i < n - 1; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            vs[x].adj.add(vs[y]);
            vs[y].adj.add(vs[x]);
        }
        Set<Vertex> visited = new HashSet<>();
        dfs(vs[1], visited);
        out.println((vs[1].black + vs[1].white) % mod);
        out.close();
    }

    private static void dfs(Vertex v, Set<Vertex> visited) {
        visited.add(v);
        for (Vertex n : v.adj) {
            if (!visited.contains(n)) {
                dfs(n, visited);
                v.black = (v.black * n.white) % mod;
                v.white = (v.white * (n.white + n.black) % mod) % mod;
            }
        }
    }

    static class Vertex {
        int i;
        long black = 1;
        long white = 1;

        public Vertex(int i) {
            this.i = i;
        }

        List<Vertex> adj = new ArrayList<>();

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vertex vertex = (Vertex) o;
            return i == vertex.i;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i);
        }
    }


    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }
}