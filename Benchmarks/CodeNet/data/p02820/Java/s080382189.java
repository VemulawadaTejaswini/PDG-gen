import java.text.DecimalFormat;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;
import java.util.List;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        AtCoder problem = new AtCoder(sc);
        problem.solve(out);

        out.flush();
    }

}

class AtCoder {

    /* 変数宣言 */
    int N, K, R, S, P;
    String T;

    AtCoder(FastScanner sc) {
        N = sc.nextInt();
        K = sc.nextInt();
        R = sc.nextInt();
        S = sc.nextInt();
        P = sc.nextInt();
        T = sc.next();
    }

    void solve(PrintWriter out) {
        char[] machine = T.toCharArray();
        char[] takahashi = new char[N];
        long point = 0;
        char curr_T;
        char old_T='d';

        for (int i = 0; i < machine.length; i++) {
            if (i - K >= 0) {
                old_T = takahashi[i - K];
            }

            if (machine[i] == 'r') {
                curr_T = 'p';
            } else if (machine[i] == 's') {
                curr_T = 'r';
            } else {
                curr_T = 's';
            }
            if (old_T == curr_T) {
                takahashi[i] = 'd';
                continue;
            } else {
                if (machine[i] == 'r') {
                    point += P;
                    takahashi[i] = curr_T;
                } else if (machine[i] == 's') {
                    point += R;
                    takahashi[i] = curr_T;
                } else {
                    point += S;
                    takahashi[i] = curr_T;
                }
            }
        }
        out.println(point);
    }

    boolean isPrimeNum(int num) {
        for (int i = 2; i < num; i++) {
            if (i != num && num % i == 0) {
                return false;
            }
        }
        return true;
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