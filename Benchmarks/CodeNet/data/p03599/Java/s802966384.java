import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

import java.util.HashSet;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        final int A = nextInt();
        final int B = nextInt();
        final int C = nextInt();
        final int D = nextInt();
        final int E = nextInt();
        final int F = nextInt();

        HashSet<Integer> sugar = new HashSet<Integer>();

        for (int i = 0; i <= F; i++) {
            for (int j = 0; j <= F; j++) {
                int s = C * i + D * j;
                if (s <= F) sugar.add(s);
            }
        }

        HashSet<Integer> water = new HashSet<Integer>();

        for (int i = 0; i <= F; i++) {
            for (int j = 0; j <= F; j++) {
                int w = 100 * (A * i + B * j);
                if (w <= F) water.add(w);
            }
        }

        int maxsw = -1;
        int maxs = -1;
        float conc = 0F;

        for (Integer s : sugar) {
            for (Integer w : water) {
                if (F < s + w) continue;

                float tmp = s.floatValue() / (s + w);

                if ((float)E / (E + 100) < tmp) continue;

                if (conc < tmp) {
                    maxsw = s + w;
                    maxs = s;
                    conc = tmp;
                }
            }
        }

        out.println(maxsw + " " + maxs);

        out.flush();
    }

    // FastScanner start
    static final InputStream in = System.in;
    static final byte[] buffer = new byte[1024];
    static int ptr = 0;
    static int buflen = 0;
    static boolean hasNextByte() {
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
    static int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    static boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    static String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    static long nextLong() {
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
            } else if(b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    static int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
    static double nextDouble() {
        return Double.parseDouble(next());
    }
    // FastScanner end
}
