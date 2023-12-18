import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.HashMap;
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
        CSnukeTheWizard solver = new CSnukeTheWizard();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSnukeTheWizard {
        public void solve(int testNumber, InputReader sc, OutputWriter out) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            String s = sc.nextString();
            HashMap<Character, List<Integer>> map = new HashMap<>();
            int f = 1;
            for (char c : s.toCharArray()) {
                List<Integer> li = new ArrayList<>();
                if (map.containsKey(c))
                    li = map.get(c);
                li.add(f);
                map.put(c, li);
                f++;
            }
            int ar[] = new int[s.length() + 2];
            for (int i = 1; i <= s.length(); i++)
                ar[i] = 1;
            while (q-- > 0) {
                char c1 = sc.nextCharacter();
                char c2 = sc.nextCharacter();
                if (!map.containsKey(c1))
                    continue;
                List<Integer> li = map.get(c1);
                if (c2 == 'L') {
                    for (int i = 0; i < li.size(); i++) {
                        int a = li.get(i);
                        ar[a - 1] += ar[a];
                        ar[a] = 0;
                    }
                } else {
                    for (int i = li.size() - 1; i >= 0; i--) {
                        int a = li.get(i);
                        ar[a + 1] += ar[a];
                        ar[a] = 0;
                    }
                }
            }
            int ans = 0;
            for (int i = 1; i <= s.length(); i++) {
                ans += ar[i];
            }
            out.println(ans);
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

        public int nextInt() {
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

        public String nextString() {
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

        public char nextCharacter() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            return (char) c;
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

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
        }

    }
}

