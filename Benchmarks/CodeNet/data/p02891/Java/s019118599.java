import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
        AConnectionAndDisconnection solver = new AConnectionAndDisconnection();
        solver.solve(1, in, out);
        out.close();
    }

    static class AConnectionAndDisconnection {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String s = in.readString();
            long k = in.readLong();

            int n = s.length();

            boolean flg = true;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != s.charAt(0)) flg = false;
            }

            if (flg) {
                out.printLine(n * k / 2);
                return;
            }

            List<Integer> list = new ArrayList<>();
            char c = s.charAt(0);
            int cnt = 1;
            for (int i = 1; i < n; i++) {
                if (c == s.charAt(i)) {
                    cnt++;
                } else {
                    list.add(cnt);
                    cnt = 1;
                    c = s.charAt(i);
                }
            }
            list.add(cnt);

            int m = list.size();

            long ans = 0;
            for (int i = 1; i < m - 1; i++) {
                ans += list.get(i) / 2 * k;
            }
            if (s.charAt(0) == s.charAt(n - 1)) {
                ans += list.get(0) / 2;
                ans += (list.get(0) + list.get(m - 1)) / 2 * (k - 1);
                ans += list.get(m - 1) / 2;
            } else {
                ans += list.get(0) / 2 * k;
                ans += list.get(m - 1) / 2 * k;
            }
            out.printLine(ans);
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

        public long readLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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
}

