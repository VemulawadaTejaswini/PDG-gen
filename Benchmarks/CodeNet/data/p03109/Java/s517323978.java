import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Closeable;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HBonsai
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSyntheticKadomatsu solver = new CSyntheticKadomatsu();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSyntheticKadomatsu {
        int N = 0;
        int A = 0;
        int B = 0;
        int C = 0;
        int[] l = new int[8];
        final int INF = 1 << 29;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            N = in.nextInt();
            A = in.nextInt();
            B = in.nextInt();
            C = in.nextInt();
            l = in.nextIntArray(N);
            int ans = dfs(0, 0, 0, 0);
            out.println(ans);
        }

        int dfs(int i, int a, int b, int c) {
            if (i == N) {
                if (a > 0 && b > 0 && c > 0) {
                    // 最初の1本に対して合成魔法のコストを払う必要はないのでここで引いておく(※)
                    return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30;
                    // 無に対して延長魔法は使えないのでa,b,cどれにも+l[i]しなかったパターンにはINFを入れる
                } else return INF;
            }
            int ret0 = dfs(i + 1, a, b, c);
            // ※ここでは最初の1本に対しても合成魔法のコストを払っている
            int ret1 = dfs(i + 1, a + l[i], b, c) + 10;
            int ret2 = dfs(i + 1, a, b + l[i], c) + 10;
            int ret3 = dfs(i + 1, a, b, c + l[i]) + 10;
            return Math.min(ret0, Math.min(ret1, Math.min(ret2, ret3)));
        }

    }

    static class FastScanner implements Closeable {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in) {
            this.in = in;
        }

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
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
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
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public int[] nextIntArray(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public void close() {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

