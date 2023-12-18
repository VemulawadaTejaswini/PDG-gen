import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static long N;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int length = sc.nextInt();
        if (sc.nextInt() > 0) {
            System.out.println(-1);
            return;
        }
        BigInteger ans = BigInteger.ZERO;
        int prev = 0;
        int toAdd = 0;
        for (int i = 1; i < length; i++) {
            int n = sc.nextInt();
            if (n == 0) {
            } else if (n - prev > 1) {
                System.out.println(-1);
                return;
            } else if (n - prev == 1) {
                toAdd++;
            } else if (n - prev <= 0) {
                ans = ans.add(factorial(n));
            }
            prev = n;
        }
        ans = ans.add(BigInteger.valueOf(toAdd));
        System.out.println(ans);
    }

    static BigInteger factorial(int n) {
        if (n < 2) {
            return BigInteger.ONE;
        }
        BigInteger p = BigInteger.ONE, r = BigInteger.ONE;
        N = 1;
        int log2n = 31 - Integer.numberOfLeadingZeros(n);
        int h = 0, shift = 0, high = 1;
        while (h != n) {
            shift += h;
            h = n >>> log2n--;
            int len = high;
            high = (h & 1) == 1 ? h : h - 1;
            len = (high - len) >> 1;
            if (len > 0) {
                r = r.multiply((p = p.multiply(bp(len))));
            }
        }
        return r.shiftLeft(shift);
    }

    static BigInteger bp(int n) {
        int m = n >> 1;
        if (m == 0) {
            return BigInteger.valueOf(N += 2);
        } else if (n == 2) {
            return BigInteger.valueOf(N += 2).multiply(BigInteger.valueOf(N += 2));
        }
        return bp(n - m).multiply(bp(m));
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            }else{
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
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
        String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        long nextLong() {
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
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }else if(b == -1 || !isPrintableChar(b)){
                    return minus ? -n : n;
                }else{
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
        int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
    }

}
