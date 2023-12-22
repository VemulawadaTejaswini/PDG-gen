
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

        final int N = sc.nextInt(), M = sc.nextInt(), Q = sc.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        List<Integer> A = new ArrayList<>();

        out.println(dfs(A, N, M, Q, a, b, c, d));

        out.flush();
    }

    static long score(List<Integer> A, int Q, int[] a, int[] b, int[] c, int[] d) {
        long sum = 0;
        for (int i = 0; i < Q; i++) {
            if (A.get(b[i] - 1) - A.get(a[i] - 1) == c[i]) {
                sum += d[i];
            }
        }
        return sum;
    }

    static long dfs(List<Integer> A, int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        if (A.size() == N) {
//            A.forEach(System.out::print);
//            System.out.println();
            return score(A, Q, a, b, c, d);
        }
        long res = 0;
        int prev_last = (A.isEmpty() ? 1 : A.get(A.size() - 1));
        for (int i = prev_last; i <= M; i++) {
            A.add(i);
            res = Math.max(res, dfs(A, N, M, Q, a, b, c, d));
            A.remove(A.size() - 1);
        }
        return res;
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
