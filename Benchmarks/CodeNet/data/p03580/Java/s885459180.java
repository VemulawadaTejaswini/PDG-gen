// package other2017.codefestival2017.qualb;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        char[] s = in.nextToken().toCharArray();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = s[i] - '0';
        }


        List<int[]> part = new ArrayList<>();

        boolean[] isw = new boolean[n];

        for (int i = 1; i+1 < n ; i++) {
            if (w[i-1] == 1 && w[i] == 0 && w[i+1] == 1) {
                isw[i] = true;
                int left = 0;
                int head = i-1;
                while (head >= 0 && w[head] == 1) {
                    left++;
                    head--;
                }
                int tail = i+1;
                int right = 0;
                while (tail < n && w[tail] == 1) {
                    right++;
                    tail++;
                }
                part.add(new int[]{i, left, right, 0, 0});
            }
        }

        for (int[] wi : part) {
            int wl = wi[0] - w[1] - 1;
            if (wl >= 0 && isw[wl]) {
                wi[3] = 1;
            }
            wl = wi[0] + w[2] + 1;
            if (wl < n && isw[wl]) {
                wi[4] = 1;
            }
        }

        int dn = part.size();
        int[][] dp = new int[dn+1][2];
        for (int i = 0; i <= dn; i++) {
            Arrays.fill(dp[i], -1);
        }
        dp[0][0] = 0;


        for (int i = 0; i < dn ; i++) {
            int[] wi = part.get(i);
            for (int noleft = 0; noleft <= 1; noleft++) {
                int base = dp[i][noleft];
                if (base == -1) {
                    continue;
                }

                dp[i+1][0] = Math.max(dp[i+1][0], base);

                // left
                if (noleft == 0) {
                    for (int al = wi[1] -1 ; al <= wi[1] ; al++) {
                        if (al == 0) {
                            continue;
                        }
                        if (al == wi[1] && noleft == 1 && wi[3] == 1) {
                            continue;
                        }
                        int tl = 0;
                        if ((al == wi[1] || wi[1] == 1) && wi[4] == 1) {
                            tl = 1;
                        }
                        dp[i+1][tl] = Math.max(dp[i+1][tl], base + al);
                    }

                    // right
                    for (int al = wi[2]-1 ; al <= wi[2] ; al++) {
                        if (al == 0) {
                            continue;
                        }
                        int tl = 0;
                        if ((al == wi[2] || wi[2] == 1) && wi[4] == 1) {
                            tl = 1;
                        }
                        dp[i+1][tl] = Math.max(dp[i+1][tl], base + al);
                    }
                }
            }
        }

        out.println(Math.max(dp[dn][0], dp[dn][1]));
        out.flush();
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