// package arc.arc089;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    static final int MOD = 1000000007;

    static int[][][][][] dp;

    static final int WHITE = 0;
    static final int RED = 1;
    static final int BLUE = 2;
    static final int FIRST_RED = 3;

    static void addTo(int idx, int last, int rb, int r, int cmpl, int add) {
        dp[idx][last][rb][r][cmpl] += add;
        if (dp[idx][last][rb][r][cmpl] >= MOD) {
            dp[idx][last][rb][r][cmpl] -= MOD;
        }
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int k = in.nextInt();
        char[] s = in.nextToken().toCharArray();


        dp = new int[71][4][40][40][70];
        dp[0][0][0][0][0] = 1;

        for (int i = 0 ; i < n ; i++) {
            for (int last = 0; last < 4 ; last++) {
                for (int rb = 0; rb < 40; rb++) {
                    for (int r = 0; r < 40 ; r++) {
                        for (int cmpl = 0; cmpl < 70 ; cmpl++) {
                            int base = dp[i][last][rb][r][cmpl];
                            if (base == 0) {
                                continue;
                            }
                            addTo(i+1, WHITE, rb, r, cmpl, base);

                            if (last == WHITE) {
                                addTo(i+1, FIRST_RED, rb, r+1, cmpl, base);
                                addTo(i+1, BLUE, rb+1, r, cmpl+1, base);
                            } else if (last == RED) {
                                // same
                                addTo(i+1, RED, rb, r, cmpl, base);
                                addTo(i+1, BLUE, rb, r, cmpl+1, base);
                            } else if (last == BLUE) {
                                // same
                                addTo(i+1, BLUE, rb, r, cmpl, base);
                                addTo(i+1, RED, rb, r, cmpl, base);
                            } else if (last == FIRST_RED) {
                                // same
                                addTo(i+1, FIRST_RED, rb, r, cmpl, base);
                                addTo(i+1, BLUE, rb+1, r-1, cmpl+1, base);
                            } else {
                                throw new RuntimeException("invalid color");
                            }
                        }
                    }
                }
            }
        }


        long ans = 0;
        for (int rb = 0 ; rb < 40 ; rb++) {
            for (int r = 0 ; r < 40 ; r++) {
                for (int cmpl = 0; cmpl < 70 ; cmpl++) {
                    if (canDoit(rb, r, cmpl, s)) {
                        for (int l = 0; l < 4 ; l++) {
                            ans += dp[n][l][rb][r][cmpl];
                        }
                        ans %= MOD;
                    }
                }
            }
        }
        out.println(ans);
        out.flush();
    }

    private static boolean canDoit(int rb, int r, int cmpl, char[] s) {
        int redcount = 0;
        int bluecount = 0;
        int rrc = 0;
        int free = 0;
        int n = s.length;
        for (int i = 0; i < n ; i++) {
            if (s[i] == 'r') {
                if (redcount < rb) {
                    redcount++;
                } else if (rrc < r) {
                    rrc++;
                } else {
                    free++;
                }
            } else {
                if (bluecount == redcount) {
                    if (redcount >= 1) {
                        free++;
                    }
                    continue;
                }
                if (bluecount < redcount && bluecount < rb) {
                    bluecount++;
                } else {
                    free++;
                }
            }
        }
        return redcount == rb && bluecount == rb && rrc == r && free >= (cmpl - rb);
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