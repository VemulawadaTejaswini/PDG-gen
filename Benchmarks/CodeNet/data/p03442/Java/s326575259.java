// package agc.apc001;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] xor = new int[n];
        for (int i = 0; i < n-1 ; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int a = in.nextInt();
            xor[x] ^= a;
            xor[y] ^= a;
        }
        int[] px = new int[16];
        for (int i = 0; i < n ; i++) {
            px[xor[i]]++;
        }

        int cost = 0;
        int left = 0;
        for (int i = 1 ; i < px.length; i++) {
            cost += px[i] / 2;
            if (px[i] % 2 == 1) {
                left ^= 1<<(i-1);
            }
        }

        int[] dp = new int[1<<15];
        Arrays.fill(dp, 127);
        dp[left] = 0;

        Queue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        q.add(new int[]{0, left});
        while (q.size() >= 1) {
            int[] qt = q.poll();
            int now = qt[1];
            int time = qt[0];
            if (dp[now] < time) {
                continue;
            }

            for (int i = 0; i < 15; i++) {
                if ((now & (1<<i)) == 0) {
                    continue;
                }
                for (int j = i+1 ; j < 15; j++) {
                    if ((now & (1<<j)) == 0) {
                        continue;
                    }
                    for (int k = 1 ; k <= 15; k++) {
                        int tc = time+1;
                        int nw = now ^ (1<<i) ^ (1<<j);
                        int ti = ((i+1) ^ k);
                        int tj = ((j+1) ^ k);
                        if (ti >= 1) {
                            nw ^= (1<<(ti-1));
                            if ((nw & (1<<(ti-1))) == 0) {
                                tc++;
                            }
                        }
                        if (tj >= 1) {
                            nw ^= (1<<(tj-1));
                            if ((nw & (1<<(tj-1))) == 0) {
                                tc++;
                            }
                        }
                        if (dp[nw] > tc) {
                            dp[nw] = tc;
                            q.add(new int[]{tc, nw});
                        }
                    }
                }
            }
        }
        out.println(cost + dp[0]);
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