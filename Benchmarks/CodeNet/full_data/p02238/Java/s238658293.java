
import java.text.DecimalFormat;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        AOJ problem = new AOJ(sc);
        problem.solve(out);

        out.flush();
    }

}

class AOJ {

    final int N;
    int[] d, f;
    String[] color;
    boolean[][] M;
    int time;

    AOJ(FastScanner sc) {
        N = sc.nextInt();
        d = new int[N];
        f = new int[N];
        color = new String[N];
        for (int i = 0; i < N; i++) {
            color[i] = "WHITE";
        }
        M = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            int u = sc.nextInt() - 1;
            final int K = sc.nextInt();
            for (int j = 0; j < K; j++) {
                int v = sc.nextInt() - 1;
                M[u][v] = true;
            }
        }
        time = 0;
    }

    void solve(PrintWriter out) {
//        for (int i = 0; i < N; i++) {
//            String s = "";
//            for (int j = 0; j < N; j++) {
//                s += M[i][j];
//                s += " ";
//            }
//            out.println(s.trim());
//        }
        for (int i = 0; i < N; i++) {
            if (color[i].equals("WHITE")) dfs(i);
        }
        for (int i = 0; i < N; i++) {
            out.println((i + 1) + " " + d[i] + " " + f[i]);
        }
    }

    void dfs(int u) {
        color[u] = "GRAY";
        d[u] = ++time;
        for (int v = 0; v < N; v++) {
            if (M[u][v] && color[v].equals("WHITE")) dfs(v);
        }
        color[u] = "BLACK";
        f[u] = ++time;
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

