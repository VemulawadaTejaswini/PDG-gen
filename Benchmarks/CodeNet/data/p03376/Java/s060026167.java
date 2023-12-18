// package arc.arc096;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    static class Donut implements Comparable<Donut> {
        int count;
        long dough;
        long max;

        public Donut(int c, long d, long m) {
            count = c;
            dough = d;
            max = m;
        }

        @Override
        public int compareTo(Donut o) {
            long w0 = o.count * dough;
            long w1 = count * o.dough;
            if (w0 != w1) {
                return Long.compare(o.count * dough, count * o.dough);
            }
            return count - o.count;
        }
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        long X = in.nextInt();
        long D = in.nextInt();
        long[] gram = new long[n];
        int[] cn = new int[n];
        int[] par = new int[n];
        gram[0] = in.nextInt();
        for (int i = 1 ; i < n; i++) {
            gram[i] = in.nextInt();
            par[i] = in.nextInt()-1;
        }
        Arrays.fill(cn, 1);
        for (int i = n-1 ; i >= 1 ; i--) {
            cn[par[i]] += cn[i];
            gram[par[i]] += gram[i];
        }

        Donut[] don = new Donut[n];
        for (int i = 0; i < n ; i++) {
            don[i] = new Donut(cn[i], gram[i], D);
        }
        Arrays.sort(don);


        int CTR = 5100;
        long[][] dp = new long[n+1][CTR];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], X+100);
        }

        dp[n][0] = 0;
        for (int i = n ; i >= 1 ; i--) {
            Donut d = don[i-1];
            for (int c = 0 ; c < dp[0].length ; c++) {
                long base = dp[i][c];
                dp[i-1][c] = Math.min(dp[i-1][c], base);
                for (int w = 0 ; w <= Math.min(dp[0].length, d.max) ; w++) {
                    int tc = c + w * d.count;
                    if (tc < dp[0].length) {
                        dp[i-1][tc] = Math.min(dp[i-1][tc], base + d.dough * w);
                    } else {
                        break;
                    }
                }
            }
        }

        long best = 0;
        long totalCount = 0;
        long totalDough = 0;
        for (int i = 0; i < n ; i++) {
            long maxMake = Math.min(don[i].max, (X - totalDough) / don[i].dough);
            for (long l = maxMake ; l >= 0 ; l--) {
                long leftD = X - totalDough - l * don[i].dough;
                for (int c = 0 ; c < dp[0].length ; c++) {
                    if (dp[i+1][c] <= leftD) {
                        long oc = totalCount + l * don[i].count + c;
                        long ll = leftD - dp[i+1][c];
                        long take = ll / gram[0];
                        best = Math.max(best, oc + take * cn[0]);
                    }
                }
                if (l * don[i].count >= dp[0].length) {
                    break;
                }
            }
            totalDough += maxMake * don[i].dough;
            totalCount += maxMake * don[i].count;
        }
        out.println(best);
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