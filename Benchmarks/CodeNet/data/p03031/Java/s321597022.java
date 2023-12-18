
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

    final int N, M;
    int[] p;
    List<List<Integer>> list;

    AtCoder(FastScanner sc) {
        N = sc.nextInt();
        M = sc.nextInt();
        list = new ArrayList<>(M);
        for (int i = 0; i < M; i++) {
            list.add(new ArrayList<>());
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                int s = sc.nextInt() - 1;
                list.get(i).add(s);
            }
        }
        p = IntStream.range(0, M).map(i -> sc.nextInt()).toArray();
    }

    void solve(PrintWriter out) {
        int ans = 0;
        for (int i = 0; i < Math.pow(2, N); i++) {
            BitSet bs = BitSet.valueOf(new long[]{i});
            boolean[] switches = new boolean[N];
            for (int index = 0; index < N; index++) {
                if (bs.get(index)) switches[index] = true;
            }
            if (check(switches)) ans++;
        }
        out.println(ans);
    }

    boolean check(boolean[] switches) {
        for (int i = 0; i < M; i++) {
            int cnt = 0;
            for (int j = 0; j < list.get(i).size(); j++) {
                int index = list.get(i).get(j);
                if (switches[index]) cnt++;
            }
            if (cnt % 2 != p[i]) return false;
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
