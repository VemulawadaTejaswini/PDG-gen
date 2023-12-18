import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final InputStream inputStream = System.in;
        final OutputStream outputStream = System.out;
        final InputReader in = new InputReader(inputStream);
        final PrintWriter out = new PrintWriter(outputStream);
        final Solution solver = new Solution(in, out);
        solver.solve();
        out.close();
    }

    static class Solution {
        private static final int MAX_N = 100;
        private static final int MAX_T = 200;
        private static final int INF = 1145141919;
        private static final int MULTIPLIER = 2;
        private final InputReader in;
        private final PrintWriter out;

        private int N;
        private List<Integer> timePoints;
        private List<Integer> vLimits;
        private final int[] vLimitAtEachTimePoint = new int[MAX_N * MAX_T * 2 + 1];


        Solution(final InputReader in, final PrintWriter out) {
            this.in = in;
            this.out = out;
        }

        void inputAndTransform() {
            N = in.nextInt();
            timePoints = IntStream.range(0, N)
                    .map(i -> MULTIPLIER * in.nextInt())
                    .boxed().collect(Collectors.toList());
            // Convert to a running total array
            for (int i = 1; i < timePoints.size(); i++) {
                timePoints.set(i, timePoints.get(i - 1) + timePoints.get(i));
            }

            vLimits = IntStream.range(0, N)
                    .map(i -> MULTIPLIER * in.nextInt())
                    .boxed().collect(Collectors.toList());
            vLimits.add(0); // the velocity must be 0 at the last time point.
        }

        void buildVLimitAtEachTimePoint() {
            Arrays.fill(vLimitAtEachTimePoint, INF);
            // manage linear function constraints
            for (int i = 0; i <= N; i++) {
                vLimitAtEachTimePoint[i > 0 ? timePoints.get(i - 1) : 0] = vLimits.get(i);
            }
            for (int i = vLimitAtEachTimePoint.length - 2; i >= 0; i--) {
                vLimitAtEachTimePoint[i] = Math.min(vLimitAtEachTimePoint[i], vLimitAtEachTimePoint[i + 1] + 1);
            }
            // manage horizontal line constraints
            for (int i = 0; i < N; i++) {
                for (int tp = (i > 0 ? timePoints.get(i - 1) : 0); tp <= timePoints.get(i); tp++) {
                    vLimitAtEachTimePoint[tp] = Math.min(vLimitAtEachTimePoint[tp], vLimits.get(i));
                }
            }
        }

        void solve() {
            inputAndTransform();
            buildVLimitAtEachTimePoint();

            int currentVelocity = 0;
            int totalDistance = 0;
            for (int i = 0; vLimitAtEachTimePoint[i] != 0; i++) {
                final int nextVelocity = Math.min(vLimitAtEachTimePoint[i + 1], currentVelocity + 1);
                totalDistance += currentVelocity + (nextVelocity - currentVelocity) / 2;
                currentVelocity = nextVelocity;
            }

            out.println((double) totalDistance / (MULTIPLIER * MULTIPLIER));
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(final InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (final IOException e) {
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
