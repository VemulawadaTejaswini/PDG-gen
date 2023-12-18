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
        ESecondSum solver = new ESecondSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESecondSum {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] p = in.readIntArray(n);

            long answer = solve(n, p);
            out.println(answer);
        }

        private static long solve(int n, int[] p) {
            int[] pinv = new int[n];
            for (int i = 0; i < n; i++) {
                pinv[p[i] - 1] = i;
            }

            IntMinSegmentTree min = new IntMinSegmentTree(n);
            IntMaxSegmentTree max = new IntMaxSegmentTree(n);

            long answer = 0;
            for (int xminus1 = n - 1; xminus1 >= 0; xminus1--) {
                int x = xminus1 + 1;
                int i = pinv[xminus1];

                min.update(i, i);
                max.update(i, i);

                int firstBiggerOnLeft = max.query(0, i);
                if (firstBiggerOnLeft < 0)
                    firstBiggerOnLeft = -1;
                int secondBiggerOnLeft = firstBiggerOnLeft < 0 ? -1 : max.query(0, firstBiggerOnLeft);
                if (secondBiggerOnLeft < 0)
                    secondBiggerOnLeft = -1;

                int firstBiggerOnRight = min.query(i + 1, n);
                if (firstBiggerOnRight >= n)
                    firstBiggerOnRight = n;
                int secondBiggerOnRight = firstBiggerOnRight >= n ? n : min.query(firstBiggerOnRight + 1, n);
                if (secondBiggerOnRight >= n)
                    secondBiggerOnRight = n;

                long a1 = firstBiggerOnRight >= n ? 0 : ((long) (i - firstBiggerOnLeft)) * (secondBiggerOnRight - firstBiggerOnRight);
                long a2 = firstBiggerOnLeft < 0 ? 0 : ((long) (firstBiggerOnLeft - secondBiggerOnLeft)) * (firstBiggerOnRight - i);
                answer += ((long) x) * (a1 + a2);
            }

            return answer;
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

        public int[] readIntArray(int n) {
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextInt();
            }
            return x;
        }

    }

    static class IntMinSegmentTree {
        public int size;
        public int[] value;
        protected final int identityElement;

        public IntMinSegmentTree(int size) {
            this.size = size;
            value = new int[2 * size];
            this.identityElement = Integer.MAX_VALUE;
            Arrays.fill(value, identityElement);
        }

        public void update(int i, int v) {
            i += size;
            value[i] = v;
            while (i > 1) {
                i /= 2;
                value[i] = Math.min(value[2 * i], value[2 * i + 1]);
            }
        }

        public int query(int i, int j) {
            int res_left = identityElement, res_right = identityElement;
            for (i += size, j += size; i < j; i /= 2, j /= 2) {
                if ((i & 1) == 1) {
                    res_left = Math.min(res_left, value[i++]);
                }
                if ((j & 1) == 1) {
                    res_right = Math.min(value[--j], res_right);
                }
            }
            return Math.min(res_left, res_right);
        }

    }

    static class IntMaxSegmentTree {
        public int size;
        public int[] value;
        protected final int identityElement;

        public IntMaxSegmentTree(int size) {
            this.size = size;
            value = new int[2 * size];
            this.identityElement = Integer.MIN_VALUE;
            Arrays.fill(value, identityElement);
        }

        public void update(int i, int v) {
            i += size;
            value[i] = v;
            while (i > 1) {
                i /= 2;
                value[i] = Math.max(value[2 * i], value[2 * i + 1]);
            }
        }

        public int query(int i, int j) {
            int res_left = identityElement, res_right = identityElement;
            for (i += size, j += size; i < j; i /= 2, j /= 2) {
                if ((i & 1) == 1) {
                    res_left = Math.max(res_left, value[i++]);
                }
                if ((j & 1) == 1) {
                    res_right = Math.max(value[--j], res_right);
                }
            }
            return Math.max(res_left, res_right);
        }

    }
}

