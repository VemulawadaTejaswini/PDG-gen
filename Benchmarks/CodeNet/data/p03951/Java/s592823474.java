import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
        
        boolean d = false;
        
        int n = in.nextInt();
        
        long x[] = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = d ? (new Random().nextInt(100)) : in.nextInt();
        }
        
        long orig[] = Arrays.copyOf(x, n);
        
        int m = in.nextInt();
        long k = in.nextLong();
        
        int y[] = new int[m];
        for (int i = 0; i < m; i++) {
            y[i] = d ? (new Random().nextInt(n - 2) + 1) : (in.nextInt() - 1);
        }
        
        boolean p = false;
        
        for (int i = 0; i < k; i++) {
            for (int z : y) {
                x[z] = x[z - 1] + x[z + 1] - x[z];
            }
            boolean f = true;
            for (int j = 0; j < n && f; j++) {
                f &= (x[j] == orig[j]);
            }
            if (f) {
                k %= (i + 1);
                p = true;
                break;
            }
        }
        
        for (int i = 0; i < k && p; i++) {
            for (int z : y) {
                x[z] = x[z - 1] + x[z + 1] - x[z];
            }
        }
        
        /*for (int i = 0; i < n; i++) {
            if (x[i] != orig[i]) {
                System.out.println(Arrays.toString(x));
                System.out.println(Arrays.toString(orig));
                System.out.println(m + " " + k);
                System.out.println(Arrays.toString(y));
                break;
            }
        }*/
        
        for (long z : x)
            w.println(z);
        
        w.close();
    }

    static class InputReader {

        private final InputStream stream;
        private final byte[] buf = new byte[8192];
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
            while (isSpaceChar(c)) {
                c = snext();
            }
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
            while (isSpaceChar(c)) {
                c = snext();
            }
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
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public String readString() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public String nextLine() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}