import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int na = sc.nextInt();
        int nb = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[na];
        int[] b = new int[nb];
        int[][] c = new int[m][3];
        int amin = 1000000, bmin = 1000000;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            amin = Math.min(amin, a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
            bmin = Math.min(bmin, b[i]);
        }

        int ans = amin + bmin;
        for (int i = 0; i < m; i++) {
            c[i][0] = sc.nextInt();
            c[i][1] = sc.nextInt();
            c[i][2] = sc.nextInt();
            int tt = a[c[i][0] - 1] + b[c[i][1] - 1] - c[i][2];
            ans = Math.min(ans, tt);
        }

        System.out.println(ans);



    }

    private static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
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

        private int readByte() {
            if (hasNextByte())
                return buffer[ptr++];
            else
                return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr]))
                ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
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

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
                throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

}
