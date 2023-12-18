import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.Set;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.io.IOException;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
        DUniquePath solver = new DUniquePath();
        solver.solve(1, in, out);
        out.close();
    }

    static class DUniquePath {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int m = in.readInt();
            int q = in.readInt();

            Set<Integer> set = new TreeSet<>();
            UnionFind uf = new UnionFind(n);
            for (int i = 0; i < q; i++) {
                int a = in.readInt();
                int b = in.readInt();
                int c = in.readInt();
                if (c == 1) {
                    set.add(a);
                    set.add(b);
                } else {
                    if (!uf.union(a, b)) {
                        out.printLine("No");
                        return;
                    }
                }
            }

            long k = uf.getGroups().size();

            if (m == n - 1) {
                out.printLine(set.size() == 0 ? "Yes" : "No");
                return;
            }

            Set<Integer> root = new TreeSet<>();
            for (int x : set) {
                root.add(uf.root(x));
            }
            if (root.size() < set.size()) {
                out.printLine("No");
                return;
            }

            if (n <= m && m <= n + k * (k - 3) / 2) {
                out.printLine("Yes");
            } else {
                out.printLine("No");
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

    static class UnionFind {
        protected int[] parent;

        public UnionFind(int size) {
            parent = new int[size];
            Arrays.fill(parent, -1);
        }

        public boolean union(int x, int y) {
            x = root(x);
            y = root(y);
            if (x != y) {
                if (parent[y] < parent[x]) {
                    int tmp = y;
                    y = x;
                    x = tmp;
                }
                parent[x] += parent[y];
                parent[y] = x;
                return true;
            }
            return false;
        }

        public int root(int x) {
            return parent[x] < 0 ? x : (parent[x] = root(parent[x]));
        }

        public List<Set<Integer>> getGroups() {
            int n = parent.length;
            List<Set<Integer>> groups = new ArrayList<>();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int r = root(i);
                if (!map.containsKey(r)) {
                    map.put(r, groups.size());
                    groups.add(new HashSet<>());
                }
                groups.get(map.get(r)).add(i);
            }
            return groups;
        }

        public String toString() {
            return getGroups().toString();
        }

    }
}

