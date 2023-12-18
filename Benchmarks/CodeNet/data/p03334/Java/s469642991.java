// package agc.agc025;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public interface IJPredicator {
        boolean shouldSkip(int i, int j);
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int d1 = in.nextInt();
        int d2 = in.nextInt();

        List<List<int[]>> candidateAns = new ArrayList<>();
        candidateAns.add(solve(n, d1, d2, (i, j) -> false));
        candidateAns.add(solve(n, d1, d2, (i, j) -> i % 2 == j % 2));
        candidateAns.add(solve(n, d1, d2, (i, j) -> i % 2 == 1));
        candidateAns.add(solve(n, d1, d2, (i, j) -> i % 2 == 0 || j % 2 == 0));

        for (List<int[]> ans : candidateAns) {
            if (ans.size() == n * n) {
                for (int[] a : ans) {
                    out.println(String.format("%d %d", a[0], a[1]));
                }
                break;
            }
        }
        out.flush();
    }

    // o/o: i % 2 == j % 2
    // e/e: i += 2

    private static List<int[]> solve(int n, int d1, int d2, IJPredicator pred) {
        List<int[]> selected = new ArrayList<>();
        sch: for (int i = 0; i < 2*n ; i++) {
            for (int j = 0; j < 2*n ; j++) {
                if (pred.shouldSkip(i, j)) {
                    continue;
                }
                if (canPlace(selected, i, j, d1, d2)) {
                    selected.add(new int[]{i, j});
                    if (selected.size() == n*n) {
                        break sch;
                    }
                }
            }
        }
        return selected;
    }

    private static boolean canPlace(List<int[]> selected, int y, int x, int d1, int d2) {
        for (int[] s : selected) {
            int dy = Math.abs(s[0]-y);
            int dx = Math.abs(s[1]-x);
            int d = dy*dy+dx*dx;
            if (d == d1 || d == d2) {
                return false;
            }
        }
        return true;
    }

    public static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
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
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}