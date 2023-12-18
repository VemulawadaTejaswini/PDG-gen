import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.io.IOException;
import java.util.function.Function;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        BMinimumSum solver = new BMinimumSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class BMinimumSum {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            IntSegmentTree min = new IntSegmentTree(n, Math::min, Integer.MAX_VALUE);
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                min.update(i, a);
            }

            long answer = 0;
            for (int i = 0; i < n; i++) {
                final int currentIndex = i;
                final int currentValue = min.get(i);
                Function<Integer, Boolean> tooManyElementsToTheLeft = (elementCount) -> {
                    if (elementCount <= 0) {
                        return false;
                    }

                    if (currentIndex - elementCount < 0) {
                        return true;
                    }

                    return min.query(currentIndex - elementCount, currentIndex - 1) < currentValue;
                };

                int l = currentIndex - (BinarySearch.binarySearch(tooManyElementsToTheLeft) - 1);

                Function<Integer, Boolean> tooManyElementsToTheRight = (elementCount) -> {
                    if (elementCount <= 0) {
                        return false;
                    }

                    if (currentIndex + elementCount >= n) {
                        return true;
                    }

                    return min.query(currentIndex + 1, currentIndex + elementCount) < currentValue;
                };

                int r = currentIndex + (BinarySearch.binarySearch(tooManyElementsToTheRight) - 1);

                answer += currentValue * (nc2(r - l + 2) - nc2(currentIndex - 1 - l + 2) - nc2(r - (currentIndex + 1) + 2));
            }

            out.println(answer);
        }

        static long nc2(long n) {
            if (n < 2) return 0;
            return n * (n - 1) / 2;
        }

    }

    static class BinarySearch {
        public static int binarySearch(Function<Integer, Boolean> bigEnough) {
            int tooSmall = 0, tooBig;
            if (bigEnough.apply(tooSmall)) {
                return tooSmall;
            }

            for (tooBig = 1; !bigEnough.apply(tooBig); tooBig *= 2) ;

            if (!bigEnough.apply(tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                int center = (tooBig + tooSmall) / 2;
                if (!bigEnough.apply(center)) {
                    tooSmall = center;
                } else {
                    tooBig = center;
                }
            }

            return tooBig;
        }

    }

    static class IntSegmentTree {
        public int size;
        public int[] value;
        private final BiFunction<Integer, Integer, Integer> combiner;
        private final int identityElement;

        public IntSegmentTree(int size, BiFunction<Integer, Integer, Integer> combiner, int identityElement) {
            this.size = size;
            value = new int[2 * size];
            Arrays.fill(value, identityElement);
            this.combiner = combiner;
            this.identityElement = identityElement;
        }

        private int combine(int a, int b) {
            return combiner.apply(a, b);
        }

        public int get(int i) {
            return value[size + i];
        }

        public void update(int i, int v) {
            i += size;
            value[i] = v;
            while (i > 1) {
                i /= 2;
                value[i] = combine(value[2 * i], value[2 * i + 1]);
            }
        }

        public int query(int i, int j) {
            int res_left = identityElement, res_right = identityElement;
            for (i += size, j += size; i <= j; i /= 2, j /= 2) {
                if ((i & 1) == 1) res_left = combine(res_left, value[i++]);
                if ((j & 1) == 0) res_right = combine(value[j--], res_right);
            }
            return combine(res_left, res_right);
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

