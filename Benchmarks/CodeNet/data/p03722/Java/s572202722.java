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
        DScoreAttack solver = new DScoreAttack();
        solver.solve(1, in, out);
        out.close();
    }

    static class DScoreAttack {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int m = in.readInt();

            CustomBellmanFord bf = new CustomBellmanFord(n);
            for (int i = 0; i < m; i++) {
                int a = in.readInt() - 1;
                int b = in.readInt() - 1;
                long c = -in.readLong();
                bf.addDirectedEdge(a, b, c);
            }

            long[] getDist = bf.getDist(0);
            out.printLine(bf.reachedFromLoop[n - 1] ? "inf" : -getDist[n - 1]);
        }

        class CustomBellmanFord extends BellmanFord {
            boolean[] reachedFromLoop;

            public CustomBellmanFord(int n) {
                super(n);
                reachedFromLoop = new boolean[n];
            }

            public long[] getDist(int s) {
                long[] dist = new long[n];
                Arrays.fill(dist, INF);

                dist[s] = 0;
                for (int i = 0; i < 2 * n; i++) {
                    boolean update = false;
                    for (Edge edge : edges) {
                        if (dist[edge.from] != INF && dist[edge.from] + edge.cost < dist[edge.to]) {
                            dist[edge.to] = dist[edge.from] + edge.cost;

                            if (i >= n - 1) {
                                reachedFromLoop[edge.to] = true;
                            }
                            update = true;
                        }
                    }
                    if (!update) break;
                }

                return dist;
            }

        }

    }

    static class BellmanFord {
        protected int n;
        protected ArrayList<Edge> edges = new ArrayList<>();
        protected final long INF = Long.MAX_VALUE / 3;

        public BellmanFord(int n) {
            this.n = n;
        }

        public void addDirectedEdge(int from, int to, long cost) {
            edges.add(new Edge(from, to, cost));
        }

        public class Edge {
            public int from;
            public int to;
            public long cost;

            Edge(int from, int to, long cost) {
                this.from = from;
                this.to = to;
                this.cost = cost;
            }

        }

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

        public int readInt() {
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

        public long readLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
}

