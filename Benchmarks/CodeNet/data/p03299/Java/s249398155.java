import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        static final long MODULO = (int) 1e9 + 7;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; ++i) {
                h[i] = in.nextInt();
            }
            long[] res = doit(h);
            out.println(res[1]);
        }

        private long[] doit(int[] h) {
            int minh = Integer.MAX_VALUE;
            for (int x : h) minh = Math.min(minh, x);
            int start = 0;
            long wAlternate = 2;
            long wTotal = 1;
            for (int i = 0; i <= h.length; ++i) {
                if (i == h.length || h[i] == minh) {
                    if (i > start) {
                        int[] child = Arrays.copyOfRange(h, start, i);
                        for (int j = 0; j < child.length; ++j) child[j] -= minh;
                        long[] got = doit(child);
                        wAlternate = wAlternate * got[0] % MODULO;
                        wTotal = wTotal * (got[1] + got[0]) % MODULO;
                    }
                    start = i + 1;
                    if (i < h.length) wTotal = wTotal * 2 % MODULO;
                }
            }
            wTotal = (wTotal - wAlternate + MODULO) % MODULO;
            wAlternate = wAlternate * pow(2, minh - 1) % MODULO;
            wTotal = (wTotal + wAlternate) % MODULO;
            return new long[]{wAlternate, wTotal};
        }

        private long pow(long a, int k) {
            if (k == 0) return 1;
            if (k % 2 == 0) return pow(a * a % MODULO, k / 2);
            return a * pow(a, k - 1) % MODULO;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

