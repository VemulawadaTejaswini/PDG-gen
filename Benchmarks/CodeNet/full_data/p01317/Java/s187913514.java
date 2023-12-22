import java.util.*;
import java.io.*;

public class Main {
    private static IO io = new IO();
    private static int dl[][] = new int[201][201];  // ???i,j??????????????????????????¢
    private static int ds[][] = new int[201][201];  // ???i,j??????????????????????????¢
    private static int dp[][] = new int[1001][201];  // i????????????????????????????????????j???????????´??????????°??????????
    private static int rs[] = new int[1001]; // i??????????????????
    private static int INF = 114514;
    public static void main(String[] args) {
        while (true) {

            int n = io.nextInt();
            int m = io.nextInt();
            if (n==0 && m==0) break;

            // ?????????
            for (int i=1; i<=n; i++) {
                Arrays.fill(dl[i], INF);
                Arrays.fill(ds[i], INF);
                Arrays.fill(dp[i], INF);
                dl[i][i] = ds[i][i] = 0;
            }

            // ??\???
            for (int i = 0; i < m; i++) {
                int x = io.nextInt();
                int y = io.nextInt();
                int t = io.nextInt();
                char s = io.nextChar();
                if (s=='L') {
                    dl[x][y] = dl[y][x] = Math.min(dl[x][y], t);
                } else {
                    ds[x][y] = ds[y][x] = Math.min(ds[x][y], t);
                }
            }
            int r = io.nextInt();
            for (int i = 1; i <= r; i++) rs[i] = io.nextInt();
            dp[1][rs[1]] = 0;

            // ???????????£????????????????????§??????????????????/????????????????????¢????????????????±???????
            for (int k = 1; k <= n; k++) {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        dl[i][j] = Math.min(dl[i][j], dl[i][k]+dl[k][j]);
                        ds[i][j] = Math.min(ds[i][j], ds[i][k]+ds[k][j]);
                    }
                }
            }

            // dp?????§??????????¨????
            for (int i = 1; i < r; i++) {
                int pos = rs[i+1];
                int pre = rs[i];
                for (int j = 1; j <= n; j++) {
                    for (int k = 1; k <= n; k++) {
                        if (j==k) dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j] + dl[pre][pos]);
                        else dp[i+1][j] = Math.min(dp[i+1][j], dp[i][k] + dl[pre][k] + ds[k][j] + dl[j][pos]);
                    }
                }
            }

            int ans = INF;
            for (int i = 1; i <= n; i++) ans = Math.min(ans, dp[r][i]);
            System.out.println(ans);

        }
    }

    static class IO extends PrintWriter {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        IO() {
            this(System.in);
        }

        IO(InputStream source) {
            super(System.out);
            this.in = source;
        }

        boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        boolean isNewLine(int c) {
            return c == '\n' || c == '\r';
        }

        void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        void skipNewLine() {
            while (hasNextByte() && isNewLine(buffer[ptr])) ptr++;
        }

        boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        boolean hasNextLine() {
            skipNewLine();
            return hasNextByte();
        }

        String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        char[] nextCharArray(int len) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            char[] s = new char[len];
            int i = 0;
            int b = readByte();
            while (isPrintableChar(b)) {
                if (i == len) {
                    throw new InputMismatchException();
                }
                s[i++] = (char) b;
                b = readByte();
            }
            return s;
        }

        String nextLine() {
            if (!hasNextLine()) {
                throw new NoSuchElementException();
            }
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (!isNewLine(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        long nextLong() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
                throw new NumberFormatException();
            }
            return (int) nl;
        }

        char nextChar() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (char) readByte();
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        int[] arrayInt(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long[] arrayLong(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }

        double[] arrayDouble(int n) {
            double[] a = new double[n];
            for (int i = 0; i < n; i++) a[i] = nextDouble();
            return a;
        }

        void arrayInt(int[]... a) {
            for (int i = 0; i < a[0].length; i++) for (int j = 0; j < a.length; j++) a[j][i] = nextInt();
        }

        int[][] matrixInt(int n, int m) {
            int[][] a = new int[n][];
            for (int i = 0; i < n; i++) a[i] = arrayInt(m);
            return a;
        }

        char[][] charMap(int n, int m) {
            char[][] a = new char[n][];
            for (int i = 0; i < n; i++) a[i] = nextCharArray(m);
            return a;
        }

        public void close() {
            super.close();
            try {
                in.close();
            } catch (IOException e) {
            }
        }
    }
}