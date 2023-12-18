import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGreenBin solver = new CGreenBin();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGreenBin {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt();
            TreeMap<int[], Integer> h = new TreeMap<>(new Comparator<int[]>() {

                public int compare(int[] o1, int[] o2) {
                    for (int i = 0; i < 26; i++) {
                        if (o1[i] < o2[i]) return 1;
                        if (o1[i] > o2[i]) return -1;
                    }
                    return 0;
                }
            });
            while (n-- > 0) {
                int[] f = new int[26];
                for (int i = 0; i < 10; i++) f[s.nextChar() - 'a']++;
                if (!h.containsKey(f)) h.put(f, 1);
                else h.replace(f, h.get(f) + 1);
            }
            long ans = 0;
            for (HashMap.Entry<int[], Integer> e : h.entrySet()) {
                long x = e.getValue();
                ans += (x * (x - 1)) >> 1;
            }
            w.println(ans);
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

        public char nextChar() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            return (char) c;
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

