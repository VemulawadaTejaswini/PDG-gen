

import java.text.DecimalFormat;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        ABC165c pro = new ABC165c(sc);
        out.println(pro.solve());

        out.flush();
    }

}

class ABC165c {

    private final int N;
    private final int M;
    private final int Q;
    private int[] a;
    private int[] b;
    private int[] c;
    private int[] d;

    ABC165c(FastScanner sc) {
        N = sc.nextInt();
        M = sc.nextInt();
        Q = sc.nextInt();
        a = new int[Q];
        b = new int[Q];
        c = new int[Q];
        d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
    }

    long solve() {
        List<Integer> A = new ArrayList<>();
        return dfs(A);
    }

    private long dfs(List<Integer> A) {
        if (A.size() == N) {
            return score(A);
        }
        long max = Long.MIN_VALUE;
        int prev_last = (A.isEmpty() ? 1 : A.get(A.size() - 1));
        for (int i = prev_last; i <= M; i++) {
            A.add(i);
            long score = dfs(A);
            max = Math.max(max, score);
            A.remove(A.size() - 1);
        }
        return max;
    }

    private long score(List<Integer> A) {
        long sum = 0;
        for (int i = 0; i < Q; i++) {
            if (A.get(b[i] - 1) - A.get(a[i] - 1) == c[i]) {
                sum += d[i];
            }
        }
        return sum;
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
