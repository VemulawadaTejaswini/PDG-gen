import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        FastScanner scanner = new FastScanner();
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] yakusu = new int[1000001];

        long gcd = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            int x = a[i];

            if (gcd == 0) {
                gcd = a[i];
            } else {
                gcd = gcd(a[i], gcd);
            }

            for (int j = 2; j <= Math.sqrt(x); j++) {
                if (x % j == 0) { // 最小の因数を求める
                    yakusu[j]++;
                    while (x % j == 0) {
                        x /= j; // 最小の因数で割った数を代入する
                    }
                }
            }

            if (x > 1) {
                yakusu[x]++;
            }
        }

        boolean isPairWise = true;

        parent : for (int i = 0; i < n; i++) {
            int x = a[i];

            for (int j = 2; j <= Math.sqrt(x); j++) {
                if (x % j == 0) { // 最小の因数を求める
                    while (x % j == 0) {
                        x /= j; // 最小の因数で割った数を代入する
                    }
                    if (yakusu[j] > 1) {
                        isPairWise = false;
                        break parent;
                    }
                }
            }

            if (x > 1) {
                if (yakusu[x] > 1) {
                    isPairWise = false;
                    break;
                }
            }
        }
        if (isPairWise) {
            System.out.println("pairwise coprime");
        } else if (gcd == 1) {
            System.out.println("setwise coprime");
        } else {
            System.out.println("not coprime");
        }
    }

    private static long gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
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
    }
}