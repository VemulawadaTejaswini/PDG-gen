import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
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
        FRangeSetQuery solver = new FRangeSetQuery();
        solver.solve(1, in, out);
        out.close();
    }

    static class FRangeSetQuery {
        public void solve(int testNumber, InputReader in, OutputWriter out) {

            int n = in.readInt(), nq = in.readInt();
            int[] seq = in.readIntArray(n);
            int[] lastSeen = new int[n + 10];

            Query[] queries = new Query[nq];
            List<Query>[] queriesAt = new List[n];
            for (int i = 0; i < queriesAt.length; ++i) queriesAt[i] = new ArrayList<>();

            Arrays.fill(lastSeen, n);

            for (int i = 0; i < nq; ++i) {
                int x = in.readInt() - 1, y = in.readInt() - 1;
                Query query = new Query(x, y);
                queries[i] = query;
                queriesAt[x].add(query);
            }

            FenwickIntTree bit = new FenwickIntTree(n + 10);

            for (int i = n - 1; i >= 0; --i) {
                bit.add(lastSeen[seq[i]], -1);
                bit.add(i, 1);
                lastSeen[seq[i]] = i;
                for (Query q : queriesAt[i]) {
                    q.ans = bit.sum(q.right);
                }
            }
            for (Query q : queries) {
                out.printLine(q.ans);
            }
        }

        class Query {
            int left;
            int right;
            int ans;

            public Query(int x, int y) {
                left = x;
                right = y;
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

        public void printLine(int i) {
            writer.println(i);
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

        public int[] readIntArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = readInt();
            }
            return array;
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

    static class FenwickIntTree {
        int[] bit;

        public FenwickIntTree(int size) {
            bit = new int[size];
        }

        public FenwickIntTree(int[] seq) {
            this(seq.length);
            for (int i = 0; i < seq.length; ++i) add(i, seq[i]);
        }

        public int sum(int idx) {
            int ret = 0;
            for (; idx >= 0; idx = (idx & (idx + 1)) - 1) ret += bit[idx];
            return ret;
        }

        public void add(int idx, int delta) {
            for (; idx < bit.length; idx = idx | (idx + 1)) bit[idx] += delta;
        }

    }
}

