

import java.text.DecimalFormat;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        ABC167 problem = new ABC167(sc);
        problem.solve(out);

        out.flush();
    }

}

class ABC167 {

    private final int N, M, X;
//    private final String S, T;
    private int[] c;
    private int[][] a;

    ABC167(FastScanner sc) {
        N = sc.nextInt();
        M = sc.nextInt();
        X = sc.nextInt();
        c = new int[N];
        a = new int[N][M];
        for (int i = 0; i < N; i++) {
            c[i] = sc.nextInt();
            for (int j = 0; j < M; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    void solve(PrintWriter out) {
        long[] arg = new long[M];
        long min_pri = Long.MAX_VALUE;
        for (int i = 0; i < (1 << N); i++) {
            long price = 0;
            long min_arg = Long.MAX_VALUE;
            for (int j = 0; j < M; j++) {
                arg[j] = 0;
            }
            for (int j = 0; j < N; j++) {
                if ((1 & i >> j) == 1) {
                    price += c[j];
                    for (int k = 0; k < M; k++) {
                        arg[k] += a[j][k];
                    }
                }
            }
            for (int k = 0; k < M; k++) {
                min_arg = Math.min(min_arg, arg[k]);
            }
            if (X <= min_arg) {
                min_pri = Math.min(min_pri, price);
            }
//            out.println("p:" + price + " " + Arrays.toString(arg));
        }
        out.println(min_pri == Long.MAX_VALUE ? -1 : min_pri);
    }

}

// https://qiita.com/p_shiki37/items/a0f6aac33bf60f5f65e4
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
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
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

    public long nextLong() {
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

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
