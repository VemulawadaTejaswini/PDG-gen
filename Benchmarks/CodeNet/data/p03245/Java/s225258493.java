import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        final int N = nextInt();

        int[] X = new int[N];
        int[] Y = new int[N];

        int max = -1;

        boolean flg = true;
        boolean even = true;

        for (int i = 0; i < N; i++) {
            X[i] = nextInt();
            Y[i] = nextInt();

            int tmp = Math.abs(X[i]) + Math.abs(Y[i]);

            max = Math.max(max, tmp);

            if (0 < i) {
                if (even != (tmp % 2 == 0)) {
                    flg = false;
                    break;
                }
            } else
                even = tmp % 2 == 0;
        }

        if (flg) {
            int len = 0;

            if (even) max--;

            // even は not even で len 算出
            for (int i = max; 0 < i; i /= 2) len++;

            // even は not even より 1 大きい
            if (even) len++;

            int[] arm = new int[len];

            int tmp = 1;

            for (int i = len - 1; 0 <= i; i--) {
                // even 1 1 2 4 8 …
                // not even 1 2 4 8 …
                tmp = i == len - 1 || (i == len - 2 && even) ? tmp : 2 * tmp;

                arm[i] = tmp;
            }

            out.println(len);

            String str = " ";

            for (int i = 0; i < len; i++)
                out.print(i == 0 ? arm[i] : str + arm[i]);

            out.println();

            for (int i = 0; i < N; i++) {
                int x = X[i];
                int y = Y[i];

                for (int j = 0; j < len; j++) {
                    if (Math.abs(x) < Math.abs(y)) {
                        if (y < 0) {
                            out.print("D");
                            y += arm[j];
                        } else {
                            out.print("U");
                            y -= arm[j];
                        }
                    } else {
                        if (x < 0) {
                            out.print("L");
                            x += arm[j];
                        } else {
                            out.print("R");
                            x -= arm[j];
                        }
                    }
                }
                out.println();
            }
        } else
            out.println(-1);

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
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    static boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    static String next() {
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

    static long nextLong() {
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
