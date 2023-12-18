import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import java.util.AbstractCollection;
import java.util.Map;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EHopscotchAddict solver = new EHopscotchAddict();
        solver.solve(1, in, out);
        out.close();
    }

    static class EHopscotchAddict {
        public void solve(int testNumber, InputReader in, OutputWriter out) {

            int n = in.nextInt();
            int m = in.nextInt();

            List[] g = new List[n];

            in.readDirectedGraph(g, n, m, 1);

            int s = in.nextInt() - 1;
            int t = in.nextInt() - 1;

            PriorityQueue<ver> pq = new PriorityQueue<>((v1, v2) -> v1.dis - v2.dis);

            pq.add(new ver(s, 0, 0));

            Map<ver, Integer> dis = new HashMap<>();

            dis.put(new ver(s, 0, 0), 0);

            while (!pq.isEmpty()) {
                ver ver = pq.poll();

                int cm = ver.m;

                int nm = (cm + 1) % 3;

                int cd = dis.get(ver);

                if (cd < ver.dis) {
                    continue;
                }

                for (int i = 0; i < g[ver.v].size(); i++) {
                    int v = (Integer) g[ver.v].get(i);

                    ver nv = new ver(v, nm, cd + 1);

                    int pdis = Integer.MAX_VALUE;

                    if (dis.containsKey(nv)) {
                        pdis = dis.get(nv);
                    }

                    if (cd + 1 < pdis) {
                        pq.add(nv);
                        dis.put(nv, cd + 1);
                    }
                }
            }

            if (dis.containsKey(new ver(t, 0, -1))) {
                out.println(dis.get(new ver(t, 0, -1)) / 3);
            } else {
                out.println(-1);
            }
        }

        class ver {
            int v;
            int m;
            int dis;

            public ver(int v, int m, int dis) {
                this.v = v;
                this.m = m;
                this.dis = dis;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                ver ver = (ver) o;
                return v == ver.v &&
                        m == ver.m;
            }

            public int hashCode() {
                return Objects.hash(v, m);
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

        public void readDirectedGraph(List[] g, int numOfVertices, int numOfEdges, int offset) {
            for (int i = 0; i < numOfVertices; i++) {
                g[i] = new ArrayList();
            }

            for (int i = 0; i < numOfEdges; i++) {
                int u = nextInt() - offset;
                int v = nextInt() - offset;

                g[u].add(v);
            }
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

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
        }

    }
}

