import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
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
        FBracketSequencing solver = new FBracketSequencing();
        solver.solve(1, in, out);
        out.close();
    }

    static class FBracketSequencing {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt();
            ArrayList<pair<Integer, String>> can = new ArrayList<>(), afterPos = new ArrayList<>(), afterneg = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String st = s.next();
                int cur = 0, mn = Integer.MAX_VALUE;
                boolean neg = false;
                for (int j = 0; j < st.length(); j++) {
                    if (st.charAt(j) == '(') cur++;
                    else cur--;
                    if (cur < 0) neg = true;
                    mn = Math.min(mn, cur);
                }
                if (neg) {
                    if (cur >= 0) afterPos.add(new pair<>(mn, st));
                    else afterneg.add(new pair<>(mn, st));
                } else can.add(new pair<>(cur, st));

            }
            int cur = 0;
            for (pair<Integer, String> p : can) cur += p.x;
            afterPos.sort(Collections.reverseOrder());
            Collections.sort(afterneg);
            //w.println(cur);
            for (pair<Integer, String> afterPo : afterPos) {
                //w.println(afterPo.y);
                if (cur >= -afterPo.x) cur += tot(afterPo.y);
                else {
                    w.println("No");
                    return;
                }
            }
            for (pair<Integer, String> afterPo : afterneg) {
                //w.println(afterPo.y);
                if (cur >= -afterPo.x) cur += tot(afterPo.y);
                else {
                    w.println("No");
                    return;
                }
            }
            w.println(cur == 0 ? "Yes" : "No");
        }

        int tot(String st) {
            int cur = 0;
            for (int j = 0; j < st.length(); j++) {
                if (st.charAt(j) == '(') cur++;
                else cur--;
            }
            return cur;
        }

    }

    static class pair<U extends Comparable<U>, V extends Comparable<V>> implements Comparable<pair<U, V>> {
        public U x;
        public V y;

        public pair(U x, V y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(pair<U, V> other) {
            int i = x.compareTo(other.x);
            if (i != 0) return i;
            return y.compareTo(other.y);
        }

        public String toString() {
            return x.toString() + " " + y.toString();
        }

        public boolean equals(Object obj) {
            if (this.getClass() != obj.getClass()) return false;
            pair<U, V> other = (pair<U, V>) obj;
            return x.equals(other.x) && y.equals(other.y);
        }

        public int hashCode() {
            return 31 * x.hashCode() + y.hashCode();
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

        public String next() {

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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

