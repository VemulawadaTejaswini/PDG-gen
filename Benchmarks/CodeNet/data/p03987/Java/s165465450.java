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
        IntMinSegmentTree min;
        int n;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();

            min = new IntMinSegmentTree(n);
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                min.value[n + i] = a;
            }

            min.rebuild();

            long answer = 0;
            int currentValue;
            for (int i = 0; i < n; i++) {
                currentValue = min.get(i);

                int l = i - (binarySearchLeft(i, currentValue) - 1);

                int r = i + (binarySearchRight(i, currentValue) - 1);

                answer += currentValue * (nc2(r - l + 2) - nc2(i - 1 - l + 2) - nc2(r - (i + 1) + 2));
            }

            out.println(answer);
        }

        public int binarySearchLeft(int currentIndex, int currentValue) {
            int tooSmall = 0, tooBig;
            if (tooManyOnLeft(currentIndex, currentValue, tooSmall)) {
                return tooSmall;
            }

            for (tooBig = 1; !tooManyOnLeft(currentIndex, currentValue, tooBig); tooBig *= 2) ;

            if (!tooManyOnLeft(currentIndex, currentValue, tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                int center = (tooBig + tooSmall) / 2;
                if (!tooManyOnLeft(currentIndex, currentValue, center)) {
                    tooSmall = center;
                } else {
                    tooBig = center;
                }
            }

            return tooBig;
        }

        public int binarySearchRight(int currentIndex, int currentValue) {
            int tooSmall = 0, tooBig;
            if (tooManyOnRight(currentIndex, currentValue, tooSmall)) {
                return tooSmall;
            }

            for (tooBig = 1; !tooManyOnRight(currentIndex, currentValue, tooBig); tooBig *= 2) ;

            if (!tooManyOnRight(currentIndex, currentValue, tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                int center = (tooBig + tooSmall) / 2;
                if (!tooManyOnRight(currentIndex, currentValue, center)) {
                    tooSmall = center;
                } else {
                    tooBig = center;
                }
            }

            return tooBig;
        }

        private boolean tooManyOnLeft(int currentIndex, int currentValue, int elementCount) {
            if (elementCount <= 0) {
                return false;
            }

            if (currentIndex - elementCount < 0) {
                return true;
            }

            return min.query(currentIndex - elementCount, currentIndex - 1) < currentValue;
        }

        private boolean tooManyOnRight(int currentIndex, int currentValue, int elementCount) {
            if (elementCount <= 0) {
                return false;
            }

            if (currentIndex + elementCount >= n) {
                return true;
            }

            return min.query(currentIndex + 1, currentIndex + elementCount) < currentValue;
        }

        static long nc2(long n) {
            if (n < 2) return 0;
            return n * (n - 1) / 2;
        }

    }

    static class IntMinSegmentTree {
        public int size;
        public int[] value;

        public IntMinSegmentTree(int size) {
            this.size = size;
            value = new int[2 * size];
            Arrays.fill(value, Integer.MAX_VALUE);
        }

        private int combine(int a, int b) {
            return Math.min(a, b);
        }

        public void rebuild() {
            for (int i = size - 1; i > 0; i--) {
                value[i] = combine(value[2 * i], value[2 * i + 1]);
            }
        }

        public int get(int i) {
            return value[size + i];
        }

        public int query(int i, int j) {
            int res_left = Integer.MAX_VALUE, res_right = Integer.MAX_VALUE;
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

