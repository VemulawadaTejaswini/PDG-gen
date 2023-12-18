import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DEvenRelation solver = new DEvenRelation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEvenRelation {
        private int[] color;
        private boolean[] vis;
        Graph graph;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            graph = new Graph();
            int n = in.nextInt();

            for (int i = 1; i <= n + 1; i++) {
                List<Node> item = new ArrayList<>();
                graph.a.add(item);
            }

            for (int i = 0; i < n - 1; i++) {
                int u, v, w;
                u = in.nextInt();
                v = in.nextInt();
                w = in.nextInt();

                graph.a.get(u).add(new Node(v, w));
                graph.a.get(v).add(new Node(u, w));
            }

            color = new int[n + 1];
            vis = new boolean[n + 1];

            Arrays.fill(color, -1);
            Arrays.fill(vis, false);

            color[1] = 0;
            dfs(1);

            for (int i = 1; i <= n; i++) {
                out.println(color[i]);
            }
        }

        private void dfs(int i) {
            vis[i] = true;

            for (Node node : graph.a.get(i)) {
                if (vis[node.node] == false) {
                    color[node.node] = (color[i] + node.cost) % 2;
                    dfs(node.node);
                }
            }
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
        }

    }

    static class Graph {
        public List<List<Node>> a = new ArrayList<>();

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class Node implements Comparable<Node> {
        public int node;
        public int cost;

        public Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        public int compareTo(Node node1) {
            if (cost < node1.cost) return -1;
            if (cost > node1.cost) return 1;
            return 0;
        }

    }
}

