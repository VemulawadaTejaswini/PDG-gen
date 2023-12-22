import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.AbstractCollection;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mufaddal Naya
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FBracketSequencing solver = new FBracketSequencing();
        solver.solve(1, in, out);
        out.close();
    }

    static class FBracketSequencing {
        Pair<Integer, Integer>[] t;
        final int maxn = (int) (1e6 + 10);

        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt();
            PriorityQueue<Integer>[] pq = new PriorityQueue[maxn];
            t = new Pair[4 * maxn];
            for (int i = 0; i < maxn; i++) {
                pq[i] = new PriorityQueue<>(Collections.reverseOrder());
            }
            for (int i = 0; i < 4 * maxn; i++) {
                t[i] = new Pair<>(Integer.MIN_VALUE, -1);
            }

            for (int i = 0; i < n; i++) {
                int e = 0;
                int cur = 0;
                char ss[] = c.readString().toCharArray();
                for (char ch : ss) {
                    if (ch == ')') {
                        if (cur == 0) {
                            e++;
                        } else {
                            cur--;
                        }
                    } else {
                        cur++;
                    }
                }
                pq[e].add(cur);
//            System.out.println(i+" "+e+" "+cur);
            }

            for (int i = 0; i < maxn; i++) {
                if (!pq[i].isEmpty()) {
                    int xx = pq[i].poll();
                    up_(1, 0, maxn - 1, i, xx - i);
                }
            }

            int tot_pos = 0;
            for (int i = 0; i < n; i++) {
                Pair<Integer, Integer> pp = qu_(1, 0, maxn - 1, 0, tot_pos);
//            w.printLine(pp);
                if (pp.first == Integer.MIN_VALUE) {
                    w.printLine("No");
                    return;
                }
                tot_pos += pp.first;
                int val = Integer.MIN_VALUE;
                if (!pq[pp.second].isEmpty()) {
                    val = pq[pp.second].poll() - pp.second;
                }
                up_(1, 0, maxn - 1, pp.second, val);
//            w.printLine(tot_pos);
            }

            if (tot_pos == 0) {
                w.printLine("Yes");
            } else {
                w.printLine("No");
            }

        }

        private Pair<Integer, Integer> qu_(int v, int vl, int vr, int l, int r) {
            if (vl > r || vr < l) {
                return new Pair<>(Integer.MIN_VALUE, -1);
            }
            if (vl >= l && vr <= r) {
                return t[v];
            }
            int mid = vl + vr >> 1;
            return merge_(qu_(v << 1, vl, mid, l, r), qu_((v << 1) + 1, mid + 1, vr, l, r));
        }

        private void up_(int v, int vl, int vr, int pos, int val) {
//        System.out.println(v+" "+vl+" "+vr+" "+pos+" "+val);
            if (vl == vr) {
                t[v] = new Pair<>(val, pos);
            } else {
                int mid = vl + vr >> 1;
                if (mid < pos) {
                    up_((v << 1) + 1, mid + 1, vr, pos, val);
                } else {
                    up_(v << 1, vl, mid, pos, val);
                }
                t[v] = merge_(t[v << 1], t[(v << 1) + 1]);
            }
        }

        private Pair<Integer, Integer> merge_(Pair<Integer, Integer> v1, Pair<Integer, Integer> v2) {
            if (v1.first > v2.first) {
                return new Pair<>(v1.first, v1.second);
            }
            return new Pair<>(v2.first, v2.second);
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

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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

    static class Pair<U extends Comparable<U>, V extends Comparable<V>> implements Comparable<Pair<U, V>> {
        public U first;
        public V second;

        public Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }

        public int hashCode() {
            return (first == null ? 0 : first.hashCode() * 31) + (second == null ? 0 : second.hashCode());
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Pair<U, V> p = (Pair<U, V>) o;
            return (first == null ? p.first == null : first.equals(p.first)) &&
                    (second == null ? p.second == null : second.equals(p.second));
        }

        public int compareTo(Pair<U, V> b) {
            int cmpU = first.compareTo(b.first);
            return cmpU != 0 ? cmpU : second.compareTo(b.second);
        }

        public String toString() {
            return String.format("(%s, %s)", first.toString(), second.toString());
        }

    }
}

