import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.BitSet;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEvenRelation solver = new DEvenRelation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEvenRelation {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            DEvenRelation.Node[] nodes = new DEvenRelation.Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new DEvenRelation.Node();
            }

            for (int i = 0; i < n - 1; i++) {
                int u = in.nextInt(), v = in.nextInt(), w = in.nextInt();
                u--;
                v--;

                nodes[u].edges.add(new DEvenRelation.Edge(w, v));
                nodes[v].edges.add(new DEvenRelation.Edge(w, u));
            }

            int[] colors = new int[n];
            for (int i = 0; i < n; i++) {
                colors[i] = -1;
            }

            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(0);
            colors[0] = 0;

            BitSet visited = new BitSet();
            visited.set(0);

            while (!queue.isEmpty()) {
                int cur = queue.poll();

                for (DEvenRelation.Edge e : nodes[cur].edges) {
                    int next = e.to;
                    if (visited.get(next)) {
                        continue;
                    }
                    colors[next] = (colors[cur] + e.length) % 2;
                    visited.set(next);
                    queue.add(next);
                }
            }

            for (int c : colors) {
                out.println(c);
            }
        }

        private static class Node {
            List<DEvenRelation.Edge> edges = new LinkedList<DEvenRelation.Edge>();

            public Node() {
            }

        }

        private static class Edge {
            int length;
            int to;

            public Edge(int length, int to) {
                this.length = length;
                this.to = to;
            }

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

    }
}

