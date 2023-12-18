import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ESimpleStringQueries solver = new ESimpleStringQueries();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESimpleStringQueries {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            char[] str = s.nextString().toCharArray();
            int queries = s.nextInt();
            HashMap<Character, TreeSet<Integer>> map = new HashMap<>();

            for (char ch = 'a'; ch <= 'z'; ch++) {
                map.put(ch, new TreeSet<>());
            }

            for (int i = 0; i < n; i++) {
                TreeSet<Integer> set = map.get(str[i]);
                set.add(i);
                map.put(str[i], set);
            }

            for (int i = 0; i < queries; i++) {
                int a = s.nextInt();
                if (a == 2) {
                    int b = s.nextInt() - 1;
                    int c = s.nextInt() - 1;
                    int ans = 0;
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        TreeSet<Integer> set = map.get(ch);
                        Integer k = set.ceiling(b);
                        if (k != null && k <= c) {
                            ans++;
                        }
                    }
                    out.println(ans);
                } else {
                    int b = s.nextInt() - 1;
                    char ch = s.nextCharacter();
                    char replace = str[b];
                    TreeSet<Integer> set = map.get(replace);
                    set.remove(b);
                    map.put(replace, set);
                    str[b] = ch;
                    set = map.get(ch);
                    set.add(b);
                    map.put(ch, set);
                }
            }
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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
}

