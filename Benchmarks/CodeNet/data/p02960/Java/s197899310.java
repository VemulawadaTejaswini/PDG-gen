import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDigitsParade solver = new DDigitsParade();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDigitsParade {
        static final NumberTheory.Mod107 m = new NumberTheory.Mod107();
        static final int T = 13;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            char[] input = in.next().toCharArray();
            int n = input.length;
            int[] s = new int[n];
            for (int i = 0; i < n; i++) {
                s[n - 1 - i] = input[i] == '?' ? -1 : input[i] - '0';
            }

            long[] dp = new long[T];
            dp[0] = 1;

            for (int i = 0, tens = 1; i < n; i++, tens = (tens * 10) % T) {
                long[] newDp = new long[T];
                if (s[i] >= 0) {
                    for (int val = 0; val < T; val++) {
                        newDp[(val + s[i] * tens) % T] = dp[val];
                    }
                } else {
                    for (int val = 0; val < T; val++) {
                        for (int q = 0; q < 10; q++) {
                            int newVal = (val + q * tens) % T;
                            newDp[newVal] = m.add(newDp[newVal], dp[val]);
                        }
                    }
                }
                dp = newDp;
            }

            long answer = dp[5];
            out.println(answer);
        }

    }

    static class NumberTheory {
        public abstract static class Modulus<M extends NumberTheory.Modulus<M>> {
            ArrayList<Long> factorial = new ArrayList<>();
            ArrayList<Long> invFactorial = new ArrayList<>();

            public abstract long modulus();

            public Modulus() {
                super();
                factorial.add(1L);
                invFactorial.add(1L);
            }

            public long normalize(long x) {
                x %= modulus();
                if (x < 0)
                    x += modulus();
                return x;
            }

            public long add(long a, long b) {
                return normalize(a + b);
            }

        }

        public static class Mod107 extends NumberTheory.Modulus<NumberTheory.Mod107> {
            public long modulus() {
                return 1_000_000_007L;
            }

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

    }
}

