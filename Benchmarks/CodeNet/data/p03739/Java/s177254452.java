
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    static class FastScanner {
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
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
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
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; ++i) {
            a[i] = fs.nextLong();
        }
//        a[0] = fs.nextLong();
//        a[1] = fs.nextLong();
//        long ans = 0L;
//        long sum = 0L;
//        if (a[0] == 0 && a[1] > a[0]) {
//            sum = -1L;
//            ans += 1;
//        } else if (a[0] == 0 && a[1] < a[0]) {
//            sum = 1L;
//            ans += 1;
//        } else {
//            sum = a[0];
//        }
//        if (check(sum, sum + a[1])) {
//            sum += a[1];
//        } else {
//            if (sum > 0) {
//                ans += (sum + a[1] + 1L);
//                sum = -1L;
//            } else {
//                ans += (1L - sum - a[1]);
//                sum = 1L;
//            }
//        }
//        for (int i = 2; i < n; ++i) {
//            a[i] = fs.nextLong();
//            if (check(sum, sum + a[i])) {
//                sum += a[i];
//            } else {
//                if (sum > 0) {
//                    ans += (sum + a[i] + 1L);
//                    sum = -1L;
//                } else {
//                    ans += (1L - sum - a[i]);
//                    sum = 1L;
//                }
//            }
//        }
        long ans = Math.min(helper(n, a, true), helper(n, a, false));
        System.out.println(ans);
    }

    private static long helper(int n, long[] a, boolean positive) {
        long sum = 0L;
        long ans = 0L;
        for (int i = 0; i < n; ++i) {
            if (positive) {
                if (sum + a[i] <= 0) {
                    ans += (1L - sum - a[i]);
                    sum = 1L;
                }  else {
                    sum += a[i];
                }
            } else {
                if (sum + a[i] >= 0) {
                    ans += (sum + a[i] + 1L);
                    sum = -1L;
                } else {
                    sum += a[i];
                }
            }
            positive = !positive;
        }
        return ans;
    }

    private static boolean check(long prev, long sum) {
        if (prev > 0 && sum < 0) {
            return true;
        } else if (prev < 0 && sum > 0) {
            return true;
        }
        return false;
    }
}
