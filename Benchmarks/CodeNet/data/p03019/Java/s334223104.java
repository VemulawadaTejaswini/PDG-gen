import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.function.Function;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

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
        CTests solver = new CTests();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTests {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long x = in.nextInt();

            CTests.Test[] tests = new CTests.Test[n];
            for (int i = 0; i < n; i++) {
                tests[i] = new CTests.Test(in.nextInt(), in.nextInt(), in.nextInt());
            }

            long startingScore = 0;
            for (CTests.Test t : tests) {
                startingScore += -t.l * t.b;
            }

            final long finalStartingScore = startingScore;

            Function<CTests.Test, Long> gainX = t -> (t.u * (x - t.b) - (-t.l * t.b));
            Arrays.sort(tests, Comparator.comparingLong(t -> -gainX.apply(t)));

            long[] prefixGains = new long[n + 1];
            for (int i = 0; i < n; i++) {
                prefixGains[i + 1] = prefixGains[i] + gainX.apply(tests[i]);
            }

            Function<Long, Boolean> canWin = studyHours -> {

                final long partialHours = studyHours % x;
                int fullTests = (int) (studyHours / x);

                if (fullTests >= n) {
                    return true;
                }

                Function<CTests.Test, Long> gainPartial = t -> Math.max((t.u * (partialHours - t.b) - (-t.l * t.b)), t.l * partialHours);

                long bestScore = Long.MIN_VALUE;
                for (int i = 0; i < n; i++) {
                    CTests.Test t = tests[i];
                    long score = finalStartingScore;

                    score += gainPartial.apply(t);

                    if (i < fullTests) {
                        score += prefixGains[fullTests + 1];
                        score -= gainX.apply(t);
                    } else {
                        score += prefixGains[fullTests];
                    }

                    bestScore = Math.max(bestScore, score);
                }

                return bestScore >= 0;
            };

            long answer = BinarySearch.binarySearch(canWin, n * x);

            out.println(answer);
        }

        static class Test {
            final long b;
            final long l;
            final long u;

            Test(long b, long l, long u) {
                this.b = b;
                this.l = l;
                this.u = u;
            }

            public String toString() {
                return String.format("%d %d %d", b, l, u);
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class BinarySearch {
        public static long binarySearch(Function<Long, Boolean> bigEnough, long passingValue) {
            long tooSmall = 0, tooBig = passingValue;
            if (bigEnough.apply(tooSmall)) {
                return tooSmall;
            }

            if (!bigEnough.apply(tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                long center = (tooBig + tooSmall) / 2;
                if (!bigEnough.apply(center)) {
                    tooSmall = center;
                } else {
                    tooBig = center;
                }
            }

            return tooBig;
        }

    }
}

