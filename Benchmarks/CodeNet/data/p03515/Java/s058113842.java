import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.Comparator;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int[][] es = new int[n - 1][];
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                int c = in.nextInt();
                es[i] = new int[]{a, b, c};
            }
            Arrays.sort(es, Comparator.comparingInt(e -> -e[2]));
            UnionFind uf = new UnionFind(n);
            for (int[] e : es) {
                uf.union(e[0], e[1], e[2]);
            }
            for (int i = 0; i < n; i++) {
                out.println(uf.cost(i));
            }
        }

    }

    static class UnionFind {
        private int[] data;
        private int[] next;
        private int[] last;
        private long[] cost;
        private long[] cost2;

        public UnionFind(int size) {
            data = new int[size];
            next = new int[size];
            last = new int[size];
            cost = new long[size];
            cost2 = new long[size];
            clear();
        }

        public void clear() {
            Arrays.fill(data, -1);
            Arrays.fill(next, -1);
            Arrays.fill(cost, 0);
            for (int i = 0; i < last.length; i++) {
                last[i] = i;
            }
        }

        public int root(int x) {
            return data[x] < 0 ? x : (data[x] = root(data[x]));
        }

        public void union(int x, int y, long c) {
            if ((x = root(x)) != (y = root(y))) {
                if (data[y] < data[x]) {
                    final int t = x;
                    x = y;
                    y = t;
                }
                cost[y] += size(x) * c;
                cost[x] += size(y) * c;
                for (int i = y; i != -1; i = next[i]) {
                    cost2[i] += cost[y] - cost[x];
                }
                next[last[x]] = y;
                last[x] = last[y];
                data[x] += data[y];
                data[y] = x;
            }
        }

        public int size(int x) {
            return -data[root(x)];
        }

        public long cost(int x) {
            return cost[root(x)] + cost2[x];
        }

    }

    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

