import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    // a^n mod
    public static long modPow(long a, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) != 0)
                res = res * a % mod;
            a = a * a % mod;
            n >>= 1;
        }
        return res;
    }

    // a^{-1} mod
    public static long modInv(long a, long mod) {
        return modPow(a, mod - 2, mod);
    }

    public static boolean isPrime(long n) {
        if (n == 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        if (n == 9 || n == 15)
            return false;
        if (n <= 17)
            return true;
        long s = 0;
        long temp = n - 1;
        while (temp % 2 == 0) {
            s++;
            temp /= 2;
        }
        ArrayList<Long> a = new ArrayList<Long>();
        long t = (n - 1) / (long) Math.pow(2, s);
        if (n < 4759123141l) {
            long[] b = { 2, 7, 61 };
            for (long i : b)
                a.add(i);
        } else {
            long[] c = { 2, 3, 5, 7, 11, 13, 17 };
            for (long i : c)
                a.add(i);
        }
        for (long i : a) {
            boolean flag1 = false;
            boolean flag2 = true;
            long remain1 = 1;
            for (long k = 0; k < t; k++) {
                remain1 = (remain1 * i) % n;
            }
            if (remain1 != 1)
                flag1 = true;
            for (long j = 0; j < s; j++) {
                long remain2 = 1;
                long r = (long) Math.pow(2, j) * t;
                for (long k = 0; k < r; k++) {
                    remain2 = (remain2 * i) % n;
                }
                if (remain2 == n - 1) {
                    flag2 = false;
                    break;
                }
            }
            if (flag1 && flag2)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = fs.nextInt();
        }
        long mod = 1000000007;
        int d = 1000001 + 1;
        int lcm_li[] = new int[d];
        Set<Integer> lcm_ex = new HashSet<Integer>();
        int li[] = new int[d];

        for (int i = 0; i < n; i++) {
            
            int t = a[i];
            int tmp[] = new int[t + 1];
            Set<Integer> tmp_ex = new HashSet<>();

            if (isPrime(t)) {
                tmp[t] += 1;
                tmp_ex.add(t);
            } else {

                double root_n = Math.pow(t, 0.5) + 1;

                for (int j = 2; j < root_n; j++) {
                    while (t % j == 0) {
                        tmp[j] += 1;
                        t = t / j;
                        tmp_ex.add(j);
                    }
                }
            }


            for (int j : tmp_ex) {
                if (lcm_li[j] < tmp[j]) {
                    lcm_li[j] = tmp[j];
                    lcm_ex.add(j);
                }
            }
           

        }

        long lcm = 1;
        for (int i : lcm_ex) {

            for (int j = 0; j < lcm_li[i]; j++) {
                lcm = lcm * i % mod;
            }

        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans = (ans + (lcm * modInv(a[i], mod)) % mod) % mod;
        }

        System.out.println(ans);
    }
}

class FastScanner {
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
