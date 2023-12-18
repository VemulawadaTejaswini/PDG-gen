import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

@SuppressWarnings("unchecked")
public class Main {
    static final int MAX_N = 300001;

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();

        final int N = fs.nextInt();
        final String S = fs.next();

        // 東を向いている人の累積和
        int[] E = new int[N];

        if (S.charAt(0) == 'E') E[0] = 1;

        for (int i = 1; i < N; i++) {
            E[i] = E[i - 1];
            if (S.charAt(i) == 'E') E[i]++;
        }

        int min = MAX_N;

        for (int i = 0; i < N; i++) {
            int tmp = E[N - 1] - E[i];

            if (0 < i) tmp += i - E[i - 1];

            min = Math.min(min, tmp);
        }

        System.out.println(min);
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
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
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
        while(true) {
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
