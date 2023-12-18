// package other2017.codefestival2017.quala;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int h = in.nextInt();
        int w = in.nextInt();

        int req4 = (h / 2) * (w / 2);
        int req2 = (h % 2 * (w / 2)) + (w % 2 * (h / 2));
        int req1 = (h % 2 == 1) && (w % 2 == 1) ? 1 : 0;

        if (req4 * 4 + req2 * 2 + req1 != h * w) {
            debug(req4, req2, req1);
            throw new RuntimeException("ohoh");
        }

        int[] cnt = new int[26];
        for (int i = 0; i < h ; i++) {
            char[] c = in.nextToken().toCharArray();
            for (char ci : c) {
                cnt[ci-'a']++;
            }
        }

        int four = 0;
        int two = 0;
        int one = 0;
        for (int i = 0; i < 26 ; i++) {
            int p4 = cnt[i] / 4;
            int l = cnt[i] - p4 * 4;
            four += p4;
            int p2 = l / 2;
            two += p2;
            l -= p2 * 2;
            one += l;
        }
        if (four * 4 + two * 2 + one != h * w) {
            debug(four,two,one);
            throw new RuntimeException("ohoh2");
        }

        out.println(canMake(req4, req2, req1, four, two, one) ? "Yes" : "No");
        out.flush();
    }

    private static boolean canMake(int req4, int req2, int req1, int four, int two, int one) {
        if (four < req4) {
            return false;
        }
        four -= req4;
        if (four >= 1) {
            two += four * 2;
        }
        if (two < req2) {
            return false;
        }
        return req1 == one;
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