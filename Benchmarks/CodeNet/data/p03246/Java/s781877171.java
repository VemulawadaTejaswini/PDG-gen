import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.InputMismatchException;
import java.io.IOException;
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
        PrintWriter out = new PrintWriter(outputStream);
        VVV solver = new VVV();
        solver.solve(1, in, out);
        out.close();
    }

    static class VVV {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.ni();
            int[] ar1 = new int[100001];
            int[] ar2 = new int[100001];
            for (int i = 0; i < n; ++i) {
                int curr = in.ni();
                if (i % 2 == 0) {
                    ar1[curr]++;
                } else {
                    ar2[curr]++;
                }
            }
            PriorityQueue<Pair> pq1 = new PriorityQueue<>();
            PriorityQueue<Pair> pq2 = new PriorityQueue<>();
            for (int i = 0; i <= 100000; ++i) pq1.add(new Pair(i, ar1[i]));
            for (int i = 0; i <= 100000; ++i) pq2.add(new Pair(i, ar2[i]));
            Pair one = pq1.poll();
            Pair sone = pq1.poll();
            Pair two = pq2.poll();
            Pair stwo = pq2.poll();
            if (one.a != two.a) {
                out.print(n - one.b - two.b);
            } else {
                out.print(Math.min(n - one.b - stwo.b, n - sone.b - two.b));
            }
        }

        public class Pair implements Comparable<Pair> {
            int a;
            int b;

            public Pair(int x, int y) {
                a = x;
                b = y;
            }

            public int compareTo(Pair o) {
                return Integer.compare(o.b, b);
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

        public int ni() {
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
}

