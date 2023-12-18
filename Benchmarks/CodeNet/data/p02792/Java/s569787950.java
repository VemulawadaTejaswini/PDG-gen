import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Map;
import java.util.Map.Entry;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        DHandstand2 solver = new DHandstand2();
        solver.solve(1, in, out);
        out.close();
    }

    static class DHandstand2 {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt();
            HashMap<p, Integer> hm = new HashMap<>();
            long res = 0;
            for (int i = 1; i <= n; i++) {
                String str = i + "";
                hm.put(new p(str.charAt(0), str.charAt(str.length() - 1)), hm.getOrDefault(new p(str.charAt(0),
                        str.charAt(str.length() - 1)), 0) + 1);
            }
//        w.printLine(hm);
            HashSet<p> hs = new HashSet<>();
            for (Map.Entry<p, Integer> entry : hm.entrySet()) {
                p pop = entry.getKey();
                int cnt = entry.getValue();
                if (hs.contains(pop)) {
                    continue;
                }
//            hs.add(pop);

                if (pop.e == pop.s) {
                    res += cnt * cnt;
                } else {
                    res += hm.getOrDefault(new p(pop.e, pop.s), 0) * (long) cnt * 2;
                    hs.add(new p(pop.e, pop.s));
                }

            }

            w.printLine(res);
        }

    }

    static class p {
        int s;
        int e;

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            p p = (p) o;
            return s == p.s &&
                    e == p.e;
        }

        public String toString() {
            return "p{" +
                    "s=" + (char) s +
                    ", e=" + (char) e +
                    '}';
        }

        public int hashCode() {
            return Objects.hash(s, e);
        }

        public p(int s, int e) {
            this.s = s;
            this.e = e;
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

        public void printLine(long i) {
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
}

