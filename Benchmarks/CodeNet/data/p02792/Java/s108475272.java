import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
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
        DHandstand2 solver = new DHandstand2();
        solver.solve(1, in, out);
        out.close();
    }

    static class DHandstand2 {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            HashMap<DHandstand2.pair, ArrayList<Integer>> map = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                String str = i + "";
                DHandstand2.pair p = new DHandstand2.pair(str.charAt(0) - '0', str.charAt(str.length() - 1) - '0');
                ArrayList<Integer> list = map.getOrDefault(p, new ArrayList<>());
                list.add(i);
                map.put(p, list);
            }

            Iterator<DHandstand2.pair> iter = map.keySet().iterator();
            long ans = 0;
            while (iter.hasNext()) {
                DHandstand2.pair p = iter.next();
                int f = p.first;
                int se = p.second;

                if (f == se) {
                    int size = map.get(p).size();
                    ans += (long) ((long) size * (long) size);
                } else {
                    if (map.containsKey(new DHandstand2.pair(se, f))) {
                        long size1 = map.get(p).size();
                        long size2 = map.get(new DHandstand2.pair(se, f)).size();
                        ans += (size1 * size2);
                    }
                }
            }

            out.println(ans);

//        out.println(map);
        }

        private static class pair {
            int first;
            int second;

            public pair(int first, int second) {
                this.first = first;
                this.second = second;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof DHandstand2.pair)) return false;
                DHandstand2.pair pair = (DHandstand2.pair) o;
                return first == pair.first &&
                        second == pair.second;
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append(first);
                sb.append(" ").append(second);
                return sb.toString();
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

