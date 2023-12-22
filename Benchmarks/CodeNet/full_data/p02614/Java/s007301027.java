import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
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
        CHAndV solver = new CHAndV();
        solver.solve(1, in, out);
        out.close();
    }

    static class CHAndV {
        ArrayList<ArrayList<Integer>> psr;
        ArrayList<ArrayList<Integer>> psc;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int ntc = 1;
//        ntc = in.nextInt();
            while ((ntc--) > 0) {
                int n = in.nextInt();
                int m = in.nextInt();
                int k = in.nextInt();
                boolean[][] omat = new boolean[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        omat[i][j] = in.nextCharacter() == '#';
                    }
                }
                int ans = 0;
                psr = new ArrayList<>();
                psc = new ArrayList<>();
                ArrayList<Integer> sub = new ArrayList<>();
                getPowerSet(psr, sub, n - 1);
                sub = new ArrayList<>();
                getPowerSet(psc, sub, m - 1);
//            debug(psr);
//            debug(psc);
                for (ArrayList<Integer> subr : psr) {
                    for (ArrayList<Integer> subc : psc) {
                        boolean[][] mat = new boolean[n][m];
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < m; j++) {
                                mat[i][j] = omat[i][j];
                            }
                        }
                        for (int r : subr) {
                            for (int j = 0; j < m; j++) {
                                mat[r][j] = false;
                            }
                        }
                        for (int c : subc) {
                            for (int j = 0; j < n; j++) {
                                mat[j][c] = false;
                            }
                        }
                        int count = 0;
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < m; j++) {
                                if (mat[i][j]) {
                                    count++;
                                }
                            }
                        }
                        if (count == k) {
                            ans++;
                        }
                    }
                }
                out.println(ans);
            }
        }

        public void getPowerSet(ArrayList<ArrayList<Integer>> ps, ArrayList<Integer> sub, int n) {
            if (n <= -1) {
                ps.add(new ArrayList<>(sub));
                return;
            }
            getPowerSet(ps, sub, n - 1);
            sub.add(n);
            getPowerSet(ps, sub, n - 1);
            sub.remove(sub.size() - 1);
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

        public void println(long i) {
            writer.println(i);
        }

    }
}

