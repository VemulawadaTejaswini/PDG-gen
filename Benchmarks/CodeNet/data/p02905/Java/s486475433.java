import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author cunbidun
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        CLCMs solver = new CLCMs();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLCMs {
        private static final int MOD = 998244353;
        private InputReader in;
        private OutputWriter out;
        private MOD mod = new MOD(MOD);

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            this.in = in;
            this.out = out;
            int n = in.nextInt();
            int[] a = in.nextIntArray(n, 1);
            int[] w = new int[1000010];
            int[] inv = MathAlgorithm.getInvsArray(1000000, MOD);
            ArrayList<Integer>[] d = new ArrayList[1000010];
            ArrayList<Integer>[] num = new ArrayList[1000010];

            for (int i = 1; i <= 1000000; i++) {
                d[i] = new ArrayList<>();
                num[i] = new ArrayList<>();
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= (int) Math.sqrt(a[i]); j++)
                    if (a[i] % j == 0) {
                        num[j].add(a[i]);
                        if (a[i] / j != j) num[a[i] / j].add(a[i]);
                    }
            }

            for (int i = 1; i <= 1000; i++)
                for (int j = i * i; j <= 1000000; j += i) {
                    d[j].add(i);
                }
            w[1] = 1;
            for (int i = 2; i <= 1000000; i++) {
                int sum = 0;
                for (int j : d[i]) {
                    sum = mod.addMod(sum, w[j]);
                    if (i / j != j) {
                        sum = mod.addMod(sum, w[i / j]);
                    }
                }
                w[i] = mod.subMod(inv[i], sum);
            }
            int ans = 0;
            for (int i = 1; i <= 1000000; i++)
                if (num[i].size() != 0) ans = mod.addMod(ans, mod.mulMod(w[i], cal(num[i])));
            out.println(ans);
        }

        private int cal(ArrayList<Integer> v) {
            int res = 0;
            int[] sum = new int[v.size() + 1];

            for (int i = 1; i <= v.size(); i++)
                sum[i] = mod.addMod(sum[i - 1], v.get(i - 1));
            for (int i = 1; i <= v.size(); i++)
                res = mod.addMod(res, mod.mulMod(v.get(i - 1), mod.subMod(sum[v.size()], sum[i])));
            return res;
        }

    }

    static class MathAlgorithm {
        public static int[] getInvsArray(int n, int MOD) {
            int[] inv = new int[n + 1];
            inv[1] = 1;
            for (int i = 2; i < inv.length; i++) {
                inv[i] = Op.mulMod((MOD - MOD / i), inv[MOD % i], MOD);
            }
            return inv;
        }

    }

    static class MOD {
        private int MOD;

        public MOD(int MOD) {
            this.MOD = MOD;
        }

        public int addMod(int x, int y) {
            return ((x + y) >= MOD ? x + y - MOD : x + y);
        }

        public int subMod(int x, int y) {
            return ((x - y) < 0 ? x - y + MOD : x - y);
        }

        public int mulMod(int x, int y) {
            return (int) (((long) x * y) % MOD);
        }

    }

    static class InputReader extends InputStream {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int length, int stIndex) {
            int[] arr = new int[length + stIndex];
            for (int i = stIndex; i < stIndex + length; i++)
                arr[i] = nextInt();
            return arr;
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }

    static class Op {
        public static int mulMod(int x, int y, int MOD) {
            return (int) (((long) x * y) % MOD);
        }

    }

    static class OutputWriter {
        private final PrintWriter out;

        public OutputWriter(OutputStream outputStream) {
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.out = new PrintWriter(writer);
        }

        public void close() {
            out.close();
        }

        public void println(int i) {
            out.println(i);
        }

    }
}

