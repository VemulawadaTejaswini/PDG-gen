import java.util.*;
import java.io.*;

public class Main {
    private static IO io = new IO();
    private static int p[] = new int[100001];   // p[i]: parent of i-th node
    private static boolean mark[] = new boolean[100001];
    public static void main(String[] args) {

        p[1] = 1;
        while (true) {

            Arrays.fill(mark, false);
            int n = io.nextInt();
            int q = io.nextInt();
            if (n==0 && q==0) break;
            for (int i=2; i<=n; i++) p[i] = io.nextInt();
            long ans = 0;
            for (int i=0; i<q; i++) {
                char ope = io.nextChar();
                int v = io.nextInt();
                if (ope=='M') {
                    mark[v] = true;
                    //System.out.println(v[i] + "?????????????????????");
                } else {
                    ans += find(v);
                }
            }
            System.out.println(ans);
            //System.out.println("ope: " + Arrays.toString(ope));
            //System.out.println("v: " + Arrays.toString(v));

        }

    }

    static int find(int x) {
        if (p[x] == x || mark[x]) return x;
        //System.out.println(x + "????????????????????????????????§" + p[x] + "?????????");
        return find(p[x]);
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