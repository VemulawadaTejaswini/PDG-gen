/**
 * Created by Aminul on 8/15/2020.
 */

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Thread(null ,new Runnable(){
            public void run(){
                try{solveIt();} catch(Exception e){e.printStackTrace(); System.exit(1);}
            }
        },"Main",1<<28).start();
    }
    
    public static void solveIt() throws Exception {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n = in.nextInt();
        m = in.nextInt();
        int k = in.nextInt();
        arr = new int[n][m];
        for (int i = 0; i < k; i++) {
            int x = in.nextInt() - 1, y = in.nextInt() - 1;
            arr[x][y] = in.nextInt();
        }
        dp = new long[4][n][m];
        for (int i = 0; i < 4; i++) {
            for (long a[] : dp[i]) Arrays.fill(a, -1);
        }
        pw.println(solve(0, 0, 3));
        pw.close();
    }

    static int n, m;
    static long dp[][][];
    static int arr[][];

    static long solve(int r, int c, int k) {
        if (r >= n || c >= m) return 0;
        if (dp[k][r][c] != -1) return dp[k][r][c];
        long res = solve(r + 1, c, k);
        long down = solve(r, c + 1, k);
        res = max(res, down);
        if (k > 0 && arr[r][c] > 0) {
            long right = arr[r][c] + solve(r + 1, c, k - 1);
            res = max(res, right);
            res = max(res, arr[r][c] + down);
        }
        return dp[k][r][c] = res;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    static class FastReader {
        InputStream is;
        private byte[] inbuf = new byte[1024];
        private int lenbuf = 0, ptrbuf = 0;

        public FastReader(InputStream is) {
            this.is = is;
        }

        public int readByte() {
            if (lenbuf == -1) throw new InputMismatchException();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = is.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        public boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public int skip() {
            int b;
            while ((b = readByte()) != -1 && isSpaceChar(b)) ;
            return b;
        }

        public String next() {
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while (!(isSpaceChar(b))) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }


        public String nextLine() {
            int c = skip();
            StringBuilder sb = new StringBuilder();
            while (!isEndOfLine(c)) {
                sb.appendCodePoint(c);
                c = readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public long nextLong() {
            long num = 0;
            int b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public char[] next(int n) {
            char[] buf = new char[n];
            int b = skip(), p = 0;
            while (p < n && !(isSpaceChar(b))) {
                buf[p++] = (char) b;
                b = readByte();
            }
            return n == p ? buf : Arrays.copyOf(buf, p);
        }

        public char readChar() {
            return (char) skip();
        }
    }
}