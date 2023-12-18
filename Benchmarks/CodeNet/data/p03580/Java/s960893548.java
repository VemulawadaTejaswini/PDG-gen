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
        for (int i = 1 ; i < n ; i += 2) {
            w[i] ^= 1;
        }

//        int max = 0;
//        List<int[]> ranges = new ArrayList<>();
//        for (int i = 0; i < n ; ) {
//            int j = i;
//            while (j < n && w[i] == w[j]) {
//                j++;
//            }
//            ranges.add(new int[]{w[i], i, j});
//            i = j;
//        }

        int best = 0;
        best = Math.max(best, dfs(w.clone(), 1));
        best = Math.max(best, dfs(w.clone(), 0));

        out.println(best);
        out.flush();
    }

    private static int dfs(int[] s, int which) {
        int head = which == 1 ? 0 : 1;
        int cnt = 0;

//        debug(s);

        boolean tk = false;
        int op = which ^ 1;
        for (int i = head ; i + 3 <= s.length ; i++) {
            if (i >= 3 && op == s[i] && s[i-1] + s[i-2] + s[i-3] == which * 3 && (i-3) % 2 == op) {
                s[i-1] = s[i-2] = s[i-3] = op;
                cnt++;
                tk = true;
            }
            if (i+4 <= s.length && op == s[i] && s[i+1] + s[i+2] + s[i+3] == which * 3 && (i +1) % 2 == op) {
                s[i+1] = s[i+2] = s[i+3] = op;
                cnt++;
                tk = true;
            }
        }

        for (int i = head ; i + 3 <= s.length; i += 2) {
            if (s[i] + s[i+1] + s[i+2] == which * 3) {
                s[i] = s[i+1] = s[i+2] = op;
                cnt++;
                tk = true;
            }
        }

        if (!tk) {
            return cnt;
        }
        return cnt + dfs(s, which ^ 1);
    }

//
//    private static int dfs(int which, List<int[]> ranges) {
//        if (ranges.size() == 0) {
//            return 0;
//        }
//        int head = ranges.get(0)[0] == which ? 1 : 0;
//
//        int rn = ranges.size();
//        for (int i = head ; i < rn ; i += 2) {
//            int head =
//
//            int left = 0;
//            if (i >= 1) {
//
//            }
//
//        }
//
//        List<int[]> toranges = new ArrayList<>();
//
//
//
//
//
//
//
//    }
//
//    static void doit()


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