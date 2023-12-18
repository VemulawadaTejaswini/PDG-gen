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
        EAlmostEverywhereZero solver = new EAlmostEverywhereZero();
        solver.solve(1, in, out);
        out.close();
    }

    static class EAlmostEverywhereZero {
        int n;
        int[] digits;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            char[] input = in.next().toCharArray();
            n = input.length;
            digits = new int[n];
            for (int i = 0; i < n; i++) {
                digits[i] = input[i] - '0';
            }
            int k = in.nextInt();

            long answer = 0;

            long[][][] dp = new long[n + 1][k + 1][2]; // digits used, nonzero digits used, (0=equal and 1=unequal)
            dp[0][0][0] = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= k; j++) {
                    int e = 0; // equal
                    if (digits[i] == 0) {
                        dp[i + 1][j][e] += dp[i + 1][j][e];
//                    dp[i + 1][j][]
                    }

                    e = 1; // unequal
                }
            }

            answer = k == 1 ? f1(0) : k == 2 ? f2(0) : f3(0);

            out.println(answer);
        }

        private long f1(int i) {
            boolean equal = true;
            long answer = 0;
            for (int j = i; j < n; j++) {
                if (equal) {
                    answer += 1 * f0(j + 1);
                    answer += Math.max(digits[j] - 1, 0) * g0(j + 1);
                } else {
                    answer += 9 * g0(j + 1);
                }
                if (digits[j] > 0)
                    equal = false;
            }
            return answer;
        }

        private long f2(int i) {
            boolean equal = true;
            long answer = 0;
            for (int j = i; j < n; j++) {
                if (equal) {
                    answer += 1 * f1(j + 1);
                    answer += Math.max(digits[j] - 1, 0) * g1(j + 1);
                } else {
                    answer += 9 * g1(j + 1);
                }
                if (digits[j] > 0)
                    equal = false;
            }
            return answer;
        }

        private long f3(int i) {
            boolean equal = true;
            long answer = 0;
            for (int j = i; j < n; j++) {
                if (equal) {
                    answer += 1 * f2(j + 1);
                    answer += Math.max(digits[j] - 1, 0) * g2(j + 1);
                } else {
                    answer += 9 * g2(j + 1);
                }
                if (digits[j] > 0)
                    equal = false;
            }
            return answer;
        }

        private long f0(int unused) {
            return 1;
        }

        private long g0(int unused) {
            return 1;
        }

        private long g1(long i) {
            // using only digits[i:n]
            return (n - i) * 9;
        }

        private long g2(long i) {
            // using only digits[i:n]
            return (n - i) * (n - i - 1) / 2 * 9 * 9;
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

