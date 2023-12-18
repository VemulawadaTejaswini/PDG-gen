import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class Main {
    static int N;
    static long MAX_A;

    static long[] a;
    static long[] s;

    static long[] BIT;

    // v[x] += w
    // 次に更新すべき区間は
    // 番号に区間の長さを足すと求まる
    static void bitAdd(long x) {
        // BIT は普通は負のインデックスに値を格納できない
        // オフセットを付ける
        // 1-indexed n + 1
        // 0-indexed n
        long idx = x + N + 1;

        // Integer.lowestOneBit(idx)
        for (; idx < N * 2 + 2; idx += idx & -idx) BIT[(int) idx]++;
    }

    // v[1] + … + v[x]
    // 次に足すべき区間は
    // 番号から区間の長さを引くと求まる
    static long bitQuery(long x) {
        // BIT は普通は負のインデックスに値を格納できない
        // オフセットを付ける
        // 1-indexed n + 1
        // 0-indexed n
        long idx = x + N + 1;
        long ret = 0;

        // Integer.lowestOneBit(idx)
        for (; 0 < idx; idx -= idx & -idx) ret += BIT[(int) idx];

        return ret;
    }

    static long f(long mid) {
        long ret = 0;
        long prev = 0;

        // 初期化
        Arrays.fill(s, 0);

        for (int i = 0; i < N; i++) {
            if (mid <= a[i]) prev++;
            else prev--;

            s[i] = prev;
        }

        // 初期化
        Arrays.fill(BIT, 0);

        bitAdd(0);

        for (int i = 0; i < N; i++) {
            ret += bitQuery(s[i]);

            // ここで足すのはタイミング遅い気がするが
            // 他の点の始点となるのでこれで良い
            // ここに点があったことを記録する
            bitAdd(s[i]);
        }

        return ret;
    }

    // Bisection Method
    // [left, right]
    // to narrow the range
    static long bisectionMethod() {
        // パターン数
        // 半数以上
        // 割る2 割る2 ceil
        long p = (long)Math.ceil(((double) N * (N + 1) / 2) / 2);

        long l = 0;
        long r = MAX_A + 1;
        long ret = 0;

        while (l <= r) {
            long mid = (l + r) / 2;
            long num = f(mid);

            // 半数以上 判定
            if (p <= num) {
                ret = mid;
                l = mid + 1;
            } else
                r = mid - 1;
        }

        return ret;
    }

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        N = nextInt();

        a = new long[N];
        s = new long[N];
        BIT = new long[N * 2 + 2];

        for (int i = 0; i < N; i++) {
            a[i] = nextInt();
            MAX_A = Math.max(MAX_A, a[i]);
        }

        out.println(bisectionMethod());

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
