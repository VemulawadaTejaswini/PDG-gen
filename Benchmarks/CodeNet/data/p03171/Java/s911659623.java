import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Objects;

public class Main {

    static Map<Pair, Long> dp;

    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);

        int N = ir.nextInt();
        int[] a = ir.nextIntArray(N);

        dp = new HashMap<>();

        System.out.println(computeWinner(a, new Pair(0, N-1, 0)));
    }

    private static long computeWinner(int[] a, Pair pair) {
        if(pair.x == pair.y) {
            return pair.chance == 0 ? a[pair.x] : -a[pair.x];
        }

        if(dp.containsKey(pair)) {
            return dp.get(pair);
        }

        long result = 0;
        if(pair.chance == 0) {
            result = Math.max(a[pair.x] + computeWinner(a, new Pair(pair.x+1, pair.y, 1)),
                            a[pair.y] + computeWinner(a, new Pair(pair.x, pair.y-1, 1)));
        } else {
            result = Math.min(-a[pair.x] + computeWinner(a, new Pair(pair.x+1, pair.y, 0)),
                              -a[pair.y] + computeWinner(a, new Pair(pair.x, pair.y-1, 0)));
        }

        dp.put(pair, result);

        return result;
    }

    static class Pair {
        int x;
        int y;
        int chance;

        Pair(int a, int b, int c) {
            x = a;
            y = b;
            chance = c;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return x == pair.x &&
                    y == pair.y &&
                    chance == pair.chance;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y, chance);
        }
    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar, snumChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int snext() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public String readString() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isSpaceChar(c));
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