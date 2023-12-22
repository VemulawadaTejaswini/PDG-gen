import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FUnfairNim solver = new FUnfairNim();
        solver.solve(1, in, out);
        out.close();
    }

    static class FUnfairNim {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = in.readLongArray(n);

            long xor = 0;
            for (long x : a)
                xor ^= x;

            //System.out.println("xor = " + xor);
            //System.out.println("xor ^ a[0] ^ a[1] = " + (xor ^ a[0] ^ a[1]));

            long x = a[0], y = a[1];
            long rest = xor ^ x ^ y;
            long these = x ^ y;
            long target = rest ^ these;

            //System.out.println("these = " + these);
            //System.out.println("rest = " + rest);
            //System.out.println(Long.toBinaryString(target));
            long answer = 0;
            for (int b = 60; b >= 0; b--) {
                long bit = 1L << b;

                if ((target & bit) == 0) {
                    continue;
                }

                long cx = Long.MAX_VALUE, cy = Long.MAX_VALUE;
                if ((x & bit) > 0) {
                    cx = (x & (bit - 1)) + 1;
                }
                if ((y & bit) == 0) {
                    cy = bit - y & (bit - 1);
                }

                //System.out.println("cx = " + cx + "\t cy = " + cy);

                long diff = Math.min(cx, cy);
                if (diff == Long.MAX_VALUE) {
                    out.println(-1);
                    return;
                }
                answer += diff;
                x -= diff;
                y += diff;
                if (x <= 0) {
                    out.println(-1);
                    return;
                }

                // refresh
                these = x ^ y;
                target = rest ^ these;

                //System.out.println("x = " + x + "\t y = " + y);
                //System.out.println("these = " + these);
                //System.out.println("rest = " + rest);
                //System.out.println(Long.toBinaryString(target));
                Util.ASSERT(Long.highestOneBit(target) < bit);
            }

            out.println(answer);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] readLongArray(int n) {
            long[] x = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextLong();
            }
            return x;
        }

    }

    static class Util {
        public static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
        }

        private Util() {
        }

    }
}

