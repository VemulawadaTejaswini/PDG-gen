// package agc.agc027;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static long __startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        char[] s = in.nextToken().toCharArray();
        int[] ab = new int[n];
        for (int i = 0; i < s.length; i++) {
            ab[i] = s[i] == 'A' ? 0 : 1;
        }

        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n ; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m ; i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            if (a != b) {
                graph[a].add(b);
                graph[b].add(a);
            } else {
                graph[a].add(a);
            }
        }

        boolean isOK = false;
        int[] que = new int[32*n*3];
        int[][] dp = new int[2][n];
        for (int i = 0; i < n ; i++) {
            int cur = i+1;
            if (ab[i] == 0 && dp[0][i] == 0) {
                dp[0][i] = cur;
                int qh = 0;
                int qt = 0;
                que[qh++] = 0;
                que[qh++] = i;
                while (qt < qh) {
                    int par = que[qt++];
                    int now = que[qt++];
                    for (int to : graph[now]) {
                        if (ab[to] != ab[now]) {
                            if (par == 1) {
                                int tp = 0;
                                if (dp[tp][to] == 0) {
                                    dp[tp][to] = cur;
                                    que[qh++] = tp;
                                    que[qh++] = to;
                                } else {
                                    if (ab[now] == 1 && ab[to] == 0 && dp[0][to] == cur) {
                                        isOK = true;
                                    }
                                }
                            }
                        } else {
                            if (par == 0) {
                                int tp = par ^ 1;
                                if (dp[tp][to] == 0) {
                                    dp[tp][to] = 1;
                                    que[qh++] = tp;
                                    que[qh++] = to;
                                }
                            }
                        }
                    }
                }
            }
        }


        out.println(isOK ? "Yes" : "No");
        out.flush();
    }

    private static void printTime(String label) {
        debug(label, System.currentTimeMillis() - __startTime);
    }

    private static void debug(Object... o) {
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