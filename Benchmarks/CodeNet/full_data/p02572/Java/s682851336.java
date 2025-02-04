import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

import javax.swing.plaf.metal.MetalBorders.InternalFrameBorder;

import java.util.*;

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

public class Main {
    static int MOD = 1000000007;

    public static class Mas {
        int x;
        int y;
        int step;

        Mas(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    static long pow(long l, long i) {
        if (i == 0)
            return 1;
        else {
            if (i % 2 == 0) {
                long val = pow(l, i / 2);
                return val * val % 2019;
            } else {
                return pow(l, i - 1) * l % 2019;
            }
        }
    }

    private static final int[] vX = { 1, 0, 0, -1 };
    private static final int[] vY = { 0, 1, -1, 0 };

    static class Edge {
        int idx;
        int node;

        public Edge(int n, int i) {
            this.idx = i;
            this.node = n;
        }
    }

    static int stocks = 0;

    static long maxProfit(int k, int[] prices) {
        int n = prices.length - 1;
        if (n <= 1)
            return 0;
        long maxPro = 1000;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (prices[i + 1] < prices[i]) {
                maxPro += (maxPro / prices[idx]) * (prices[i] - prices[idx]);
                idx = i + 1;

                // System.out.println("sotck"+stocks);
            }
            // System.out.println("money "+maxPro+"stock "+stocks+"price"+prices[i]);
            // System.out.println(maxPro);

        }
        return Math.max(maxPro, 1000);
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = fs.nextLong();
        }
        long[] wa = new long[n + 1];
        wa[0] = 0;
        for (int i = 0; i < n; i++) {
            wa[i + 1] = wa[i] + a[i];
        }
        // for (int i = 0; i < 2 * 10000; i++) {
        //     a[i] = i+1;
        // }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long sum = wa[n] - wa[i + 1];
            ans = (ans%MOD+a[i]*sum) % MOD;
        }
        System.out.println(ans);
    }
}
