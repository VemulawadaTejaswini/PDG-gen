
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        ABC064c pro = new ABC064c(sc);
        pro.solve(out);

        out.flush();
    }

}

class ABC064c {

    private final int N;
    private int[] a;

    ABC064c(FastScanner sc) {
        N = sc.nextInt();
        a = IntStream.range(0, N).map(i -> sc.nextInt()).toArray();
    }

    void solve(PrintWriter out) {
        Set<String> set = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] < 400) {
                set.add("gray");
            } else if (a[i] < 800) {
                set.add("brown");
            } else if (a[i] < 1200) {
                set.add("green");
            } else if (a[i] < 1600) {
                set.add("cyan");
            } else if (a[i] < 2000) {
                set.add("blue");
            } else if (a[i] < 2400) {
                set.add("yellow");
            } else if (a[i] < 2800) {
                set.add("orange");
            } else if (a[i] < 3200) {
                set.add("red");
            } else {
                cnt++;
            }
        }
        int min = set.isEmpty() ? 1 : set.size();
        int max = set.size() + cnt >= 8 ? 8 : set.size() + cnt;
        out.println(min + " " + max);
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
