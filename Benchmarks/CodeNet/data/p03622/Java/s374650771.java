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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        static final long MODULO = 998244353;
        static int[] invs;
        static int[] facts;
        static int[] invfacts;

        static {
            int k = (int) 1e6;
            invs = new int[k + 2];
            invs[1] = 1;
            for (int i = 2; i <= k + 1; ++i) {
                invs[i] = (int) ((MODULO - (MODULO / i) * (long) invs[(int) (MODULO % i)] % MODULO) % MODULO);
            }
            facts = new int[k + 2];
            invfacts = new int[k + 2];
            facts[0] = 1;
            invfacts[0] = 1;
            for (int i = 1; i <= k + 1; ++i) {
                facts[i] = (int) (facts[i - 1] * (long) i % MODULO);
                invfacts[i] = (int) (invfacts[i - 1] * (long) invs[i] % MODULO);
            }
        }

        long c(int n, int k) {
            if (k < 0 || k > n) return 0;
            return facts[n] * (long) invfacts[k] % MODULO * (long) invfacts[n - k] % MODULO;
        }

        long invc(int n, int k) {
            if (k < 0 || k > n) throw new RuntimeException();
            return invfacts[n] * (long) facts[k] % MODULO * (long) facts[n - k] % MODULO;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long res = 0;
            int A = in.nextInt();
            int B = in.nextInt();
            for (int s = 1; s <= A + B; ++s) {
                long mult = invs[s] * invc(A + B, s) % MODULO;
                long cur1 = 0;
                if (A == B) {
                    long noMiddle = c(2 * A - 2, s - 1);
                    long withMiddle = c(2 * A - 2, s - 2);
                    if ((s - 1) % 2 == 0) {
                        long noMiddleEqual = c(A - 1, (s - 1) / 2) * c(A - 1, (s - 1) / 2) % MODULO;
                        cur1 = (cur1 + (noMiddle + noMiddleEqual) * invs[2]) % MODULO;
                        cur1 = (cur1 + withMiddle * invs[2]) % MODULO;
                    } else {
                        long noMiddleOneMore = c(A - 1, (s - 1) / 2 + 1) * c(A - 1, (s - 1) / 2) % MODULO;
                        cur1 = (cur1 + (noMiddle + noMiddleOneMore + noMiddleOneMore) % MODULO * invs[2]) % MODULO;
                        long withMiddleOneMore = c(A - 1, (s - 1) / 2) * c(A - 1, (s - 1) / 2) % MODULO;
                        cur1 = (cur1 + (withMiddle + withMiddleOneMore) * invs[2]) % MODULO;
                    }
                } else {
                    for (int b = 0; b <= B && b <= s - (s + 1) / 2; ++b) {
                        int a = s - b;
                        if (a >= 0 && a <= A) {
                            cur1 = (cur1 + c(A - 1, a - 1) % MODULO * c(B, b) % MODULO) % MODULO;
                        }
                    }
                }
                cur1 = cur1 * A % MODULO;
                long cur2 = 0;
                if (A == B) {
                    long noMiddle = c(2 * A - 2, s - 1);
                    long withMiddle = c(2 * A - 2, s - 2);
                    if ((s - 1) % 2 == 0) {
                        long noMiddleEqual = c(A - 1, (s - 1) / 2) * c(A - 1, (s - 1) / 2) % MODULO;
                        cur2 = (cur2 + (noMiddle + noMiddleEqual) * invs[2]) % MODULO;
                        cur2 = (cur2 + withMiddle * invs[2]) % MODULO;
                    } else {
                        cur2 = (cur2 + noMiddle * invs[2]) % MODULO;
                        long withMiddleOneMore = c(A - 1, (s - 1) / 2) * c(A - 1, (s - 1) / 2) % MODULO;
                        cur2 = (cur2 + (withMiddle - withMiddleOneMore + MODULO) * invs[2]) % MODULO;
                    }
                } else {
                    for (int a = 0; a <= A && a < (s + 1) / 2; ++a) {
                        int b = s - a;
                        if (b >= 0 && b <= B) {
                            cur2 = (cur2 + c(A, a) % MODULO * c(B - 1, b - 1) % MODULO) % MODULO;
                        }
                    }
                }
                cur2 = cur2 * B % MODULO;
                long cur = cur1 + cur2;
                res = (res + cur * mult) % MODULO;
            }
            out.println(res);
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

