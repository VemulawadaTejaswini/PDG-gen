
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

    int N;
    int[] A;

    AtCoder(FastScanner sc) {
        N = sc.nextInt();
        A = IntStream.range(0, N).map(i -> sc.nextInt()).toArray();
    }

    void solve(PrintWriter out) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int k = A[i];
            int v = map.getOrDefault(k, 0);
            map.put(k, ++v);
        }
        long[] memo = new long[N + 1];
        Arrays.fill(memo, -1);
        for (int i = 0; i < N; i++) {
            int a = A[i];
            if (memo[a] != -1) {
                out.println(memo[a]);
                continue;
            }
            long ans = 0;
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                int k = e.getKey();
                int v = e.getValue();
                if (k == a) v--;
                ans += nCk(v, 2);
            }
            memo[a] = ans;
            out.println(ans);
        }
    }

    long nCk(long n, long k) {
        if (n < k) return 0;
        if (n == k) return 1;
        long x = 1;
        for (long i = 0; i < k; i++) {
            x = x * (n - i) / (i + 1);
        }
        return x;
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
