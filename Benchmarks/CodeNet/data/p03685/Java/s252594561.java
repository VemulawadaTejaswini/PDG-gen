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
import java.util.Collections;
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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public static int r;
        public static int c;
        public static int n;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            r = in.nextInt();
            c = in.nextInt();
            n = in.nextInt();
            ArrayList<TaskE.Point> p = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt();
                TaskE.Point p1 = new TaskE.Point(x1, y1, i), p2 = new TaskE.Point(x2, y2, i);
                if (p1.side() != -1 && p2.side() != -1) {
                    p.add(p1);
                    p.add(p2);
                }
            }
            Collections.sort(p);

            int[] partner = new int[n];
            Arrays.fill(partner, -1);
            for (int i = p.size() - 1; i >= 0; i--) {
                if (partner[p.get(i).idx] == -1) {
                    partner[p.get(i).idx] = i;
                }
            }
            BIT bb = new BIT(n + n);

            for (int i = 0; i < p.size(); i++) {
                int k = partner[p.get(i).idx];
                if (k != -1) {
                    if (bb.query(k) != bb.query(i)) {
                        out.println("NO");
                        return;
                    }
                    bb.update(k, 1);
                }
            }
            out.println("YES");
        }

        static class Point implements Comparable<TaskE.Point> {
            public int x;
            public int y;
            public int idx;

            public Point(int x, int y, int idx) {
                this.x = x;
                this.y = y;
                this.idx = idx;
            }

            public int side() {
                if (x == 0) return 0;
                if (y == c) return 1;
                if (x == r) return 2;
                if (y == 0) return 3;
                return -1;
            }

            public int compareTo(TaskE.Point other) {
                int s1 = this.side(), s2 = other.side();
                if (s1 != s2) return s1 - s2;
                if (s1 <= 1) return x + y - other.x - other.y;
                else return other.x + other.y - x - y;
            }

        }

    }

    static class BIT {
        private long[] tree;
        private int N;

        public BIT(int N) {
            this.N = N;
            this.tree = new long[N + 3];
        }

        public long query(int K) {
            K += 2;
            long sum = 0;
            for (int i = K; i > 0; i -= (i & -i))
                sum += tree[i];
            return sum;
        }

        public void update(int K, long val) {
            K += 2;
            for (int i = K; i < tree.length; i += (i & -i))
                tree[i] += val;
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }
}

