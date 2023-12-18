import java.io.*;
import java.util.*;
import java.util.List;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) throws IOException {
        int l = scanner.nextInt();
        int r = Integer.toBinaryString(l).length() - 1;
        System.out.println(r + 1);
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            edges.add(new Edge(i + 1, i + 2, 0));
            edges.add(new Edge(i + 1, i + 2, 1 << i));
        }
        for (int i = r; i > 0; i--) {
            int j = l - (1 << i - 1);
            if (j >= 1 << r) {
                edges.add(new Edge(i, r + 1, j));
                l = j;
            }
        }
        System.out.println(edges.size());
        for (Edge edge : edges) {
            System.out.println(edge);
        }
    }

    static class Edge {
        int to;
        int from;
        int cost;

        Edge(int to, int from, int cost) {
            this.to = to;
            this.from = from;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return String.format("%s, %s, %s", to, from, cost);
        }
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}