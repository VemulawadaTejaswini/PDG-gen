import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author lewin
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        VSubtree solver = new VSubtree();
        solver.solve(1, in, out);
        out.close();
    }

    static class VSubtree {
        public static int M;
        public int n;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            n = in.nextInt();
            M = in.nextInt();
            VSubtree.Vertex[] vs = new VSubtree.Vertex[n];
            for (int i = 0; i < n; i++) vs[i] = new VSubtree.Vertex(i);
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1, b = in.nextInt() - 1;
                vs[a].addEdge(vs[b]);
                vs[b].addEdge(vs[a]);
            }
            vs[0].dfs(null);
            for (int i = 0; i < n; i++) {
                out.println((vs[i].prod_down * vs[i].get_prod_up()) % M);
            }
        }

        static class Vertex {
            public ArrayList<VSubtree.Vertex> adj;
            public int id;
            public long prod_before;
            public long prod_after;
            public long prod_down;
            public long prod_up;
            public VSubtree.Vertex prevChild;
            public VSubtree.Vertex nextChild;
            public VSubtree.Vertex par;

            public Vertex(int id) {
                this.id = id;
                adj = new ArrayList<>();
                prod_before = -1;
                prod_after = -1;
                prod_down = -1;
                prod_up = -1;
            }

            public void addEdge(VSubtree.Vertex other) {
                adj.add(other);
            }

            public void dfs(VSubtree.Vertex parent) {
                VSubtree.Vertex pv = null;
                par = parent;
                prod_down = 1;
                for (VSubtree.Vertex next : adj) {
                    if (parent != null && next.id == parent.id) continue;
                    next.dfs(this);
                    prod_down = prod_down * (1 + next.prod_down) % M;
                    if (pv != null) {
                        pv.nextChild = next;
                        next.prevChild = pv;
                    }
                    pv = next;
                }
            }

            public long get_prod_up() {
                if (prod_up != -1) return prod_up;

                prod_up = par == null ? 0 : par.get_prod_up();
                prod_up = prod_up * get_prod_before() % M;
                prod_up = prod_up * get_prod_after() % M;
                prod_up += 1;
                return prod_up;
            }

            public long get_prod_before() {
                if (prod_before != -1) return prod_before;
                return prod_before = prevChild == null ? 1 : (1 + prevChild.prod_down) * prevChild.get_prod_before() % M;
            }

            public long get_prod_after() {
                if (prod_after != -1) return prod_after;
                return prod_after = nextChild == null ? 1 : (1 + nextChild.prod_down) * nextChild.get_prod_after() % M;
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
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

        public void println(long i) {
            writer.println(i);
        }

    }
}

