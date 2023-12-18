import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.Random;
import java.util.function.IntPredicate;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.BufferedReader;
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
        ENoNeed solver = new ENoNeed();
        solver.solve(1, in, out);
        out.close();
    }

    static class ENoNeed {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = in.readIntArray(n);
            Util.safeSort(a);

            BigInteger mask = BigInteger.ONE.shiftLeft(k).subtract(BigInteger.ONE);

            IntPredicate f = (int j) -> {
                if (j >= n)
                    return true;
                if (a[j] >= k)
                    return true;

                BigInteger result = BigInteger.ONE;
                for (int i = 0; i < n; i++) {
                    if (i == j)
                        continue;
                    if (a[i] >= k)
                        continue;
                    result = result.or(result.shiftLeft(a[i])).and(mask);
                }
                result = result.shiftRight(k - a[j]);
                if (result.compareTo(BigInteger.ZERO) > 0)
                    return true;
                return false;
            };

            int answer = BinarySearch.binarySearch(f, n);

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

        public int[] readIntArray(int n) {
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextInt();
            }
            return x;
        }

    }

    static class Util {
        public static void safeSort(int[] x) {
            shuffle(x);
            Arrays.sort(x);
        }

        public static void shuffle(int[] x) {
            Random r = new Random();

            for (int i = 0; i <= x.length - 2; i++) {
                int j = i + r.nextInt(x.length - i);
                swap(x, i, j);
            }
        }

        public static void swap(int[] x, int i, int j) {
            int t = x[i];
            x[i] = x[j];
            x[j] = t;
        }

        private Util() {
        }

    }

    static class BinarySearch {
        public static int binarySearch(IntPredicate bigEnough, int passingValue) {
            int tooSmall = 0, tooBig = passingValue;
            if (bigEnough.test(tooSmall)) {
                return tooSmall;
            }

            if (!bigEnough.test(tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                int center = tooSmall + (tooBig - tooSmall) / 2;
                if (!bigEnough.test(center)) {
                    tooSmall = center;
                } else {
                    tooBig = center;
                }
            }

            return tooBig;
        }

    }
}

