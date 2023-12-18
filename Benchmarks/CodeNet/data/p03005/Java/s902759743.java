import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author cunbidun
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BPickingUp solver = new BPickingUp();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPickingUp {
        private static final int INF = (int) 2e9 + 7;
        private InputReader in;
        private PrintWriter out;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.in = in;
            this.out = out;
            int n = in.nextInt();
            PairII[] a = new PairII[n + 1];
            int ans = INF;
            for (int i = 1; i <= n; i++)
                a[i] = new PairII(in.nextInt(), in.nextInt());
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++)
                    if (i != j) {
                        int p = a[i].first - a[j].first;
                        int q = a[i].second - a[j].second;
                        if (p == 0 && q == 0) continue;
                        UnionFind dsu = new UnionFind(n);
                        for (int k = 1; k <= n; k++) {
                            for (int l = 1; l <= n; l++) {
                                if (l != k) {
                                    if (p == 0) {
                                        if ((a[l].second - a[k].second) % q == 0) dsu.mergeSet(l, k);
                                    } else {
                                        if (q == 0) {
                                            if ((a[l].first - a[k].first) % p == 0) dsu.mergeSet(l, k);
                                        } else if ((a[l].first - a[k].first) % p == 0 && (a[l].second - a[k].second) % q == 0) {
                                            if ((a[l].first - a[k].first) / p == (a[l].second - a[k].second) / q) {
                                                dsu.mergeSet(l, k);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        ans = MaxMin.Min(ans, dsu.getDsuSize());
                    }
            }
            out.println(ans);
        }

    }

    static class UnionFind {
        private int[] p;
        private int[] rank;
        private int[] size;
        private int dsuSize;

        public UnionFind(int N) {
            dsuSize = N;
            p = new int[N + 1];
            rank = new int[N + 1];
            size = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                p[i] = i;
                size[i] = 1;
            }
        }

        public int findSet(int x) {
            return (p[x] == x) ? x : (p[x] = findSet(p[x]));
        }

        public boolean isSameSet(int x, int y) {
            return findSet(x) == findSet(y);
        }

        public void mergeSet(int x, int y) {
            if (!isSameSet(x, y)) {
                dsuSize--;
                x = findSet(x);
                y = findSet(y);
                if (rank[x] > rank[y]) {
                    size[x] += size[y];
                    p[y] = x;
                } else {
                    p[x] = y;
                    size[y] += size[x];
                    if (rank[x] == rank[y]) rank[y]++;
                }
            }
        }

        public int getDsuSize() {
            return dsuSize;
        }

    }

    static class InputReader extends InputStream {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

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
            while (isSpaceChar(c))
                c = read();
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

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }

    static class MaxMin {
        public static <T extends Comparable<T>> T Min(T x, T y) {
            T min = x;
            if (y.compareTo(min) < 0) min = y;
            return min;
        }

    }

    static class PairII implements Comparable<PairII> {
        public int first;
        public int second;

        public PairII(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            PairII pair = (PairII) o;

            return first == pair.first && second == pair.second;
        }

        public String toString() {
            return "(" + first + "," + second + ")";
        }

        public int compareTo(PairII o) {
            int value = Integer.compare(first, o.first);
            if (value != 0) {
                return value;
            }
            return Integer.compare(second, o.second);
        }

    }
}

