
import java.text.DecimalFormat;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

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

    final int N;
    int[] a;
    List<List<Integer>> x, y;
    int honest_cnt;

    AtCoder(FastScanner sc) {
        N = sc.nextInt();
        a = new int[N];
        x = new ArrayList<>(N);
        y = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            x.add(new ArrayList<>(a[i]));
            y.add(new ArrayList<>(a[i]));
            for (int j = 0; j < a[i]; j++) {
                x.get(i).add(sc.nextInt() - 1);
                y.get(i).add(sc.nextInt());
            }
        }
    }

    void solve(PrintWriter out) {
        int ans = 0;
        for (int i = 0; i < Math.pow(2, N); i++) {
            BitSet bs = BitSet.valueOf(new long[]{i});
            honest_cnt = 0;
            int[] honest = new int[N];
            for (int index = 0; index < N; index++) {
                if (bs.get(index)) honest[index] = 1;
            }
            if (check(honest)) ans = Math.max(honest_cnt, ans);
        }
        out.println(ans);
    }

    boolean check(int[] honest) {
        for (int i = 0; i < N; i++) {
            if (honest[i] == 1) {
                honest_cnt++;
                for (int j = 0; j < a[i]; j++) {
                    int p = x.get(i).get(j);
                    int t = y.get(i).get(j);
                    if (honest[p] != t) return false;
                }
            }
        }
        return true;
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
