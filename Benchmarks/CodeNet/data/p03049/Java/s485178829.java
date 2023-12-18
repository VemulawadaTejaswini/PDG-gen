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
 * @author Jeel Vaishnav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CABSubstrings solver = new CABSubstrings();
        solver.solve(1, in, out);
        out.close();
    }

    static class CABSubstrings {
        public void solve(int testNumber, InputReader sc, PrintWriter out) {
            int n = sc.nextInt();

            int freq[] = new int[3];
            int ans = 0;
            for (int i = 0; i < n; ++i) {
                char[] s = sc.next().toCharArray();
                if (s[0] == 'B' && s[s.length - 1] == 'A')
                    freq[0]++;
                else if (s[0] == 'B')
                    freq[1]++;
                else if (s[s.length - 1] == 'A')
                    freq[2]++;

                for (int j = 0; j < s.length - 1; ++j) {
                    if (s[j] == 'A' && s[j + 1] == 'B')
                        ans++;
                }
            }

            if (freq[0] == 0) {
                ans += Math.min(freq[1], freq[2]);
            } else {
                ans += freq[0] - 1;
                if (freq[2] > 0) {
                    ans++;
                    freq[2]--;
                }
                if (freq[1] > 0) {
                    ans++;
                    freq[1]--;
                }

                ans += Math.min(freq[1], freq[2]);
            }

            out.print(ans);
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
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
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
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

