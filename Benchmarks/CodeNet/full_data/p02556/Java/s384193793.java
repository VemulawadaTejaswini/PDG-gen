import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pradyumn Agrawal (coderbond007)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EDistMax solver = new EDistMax();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDistMax {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            in.nextIntArrays(x, y);
            int[] vals = new int[n];
            for (int i = 0; i < n; ++i) {
                vals[i] = x[i] + y[i];
            }
            ArrayUtils.orderBy(vals, x, y);
            int max1 = vals[n - 1] - vals[0];
            int max2 = Integer.MIN_VALUE;
            for (int i = 0; i < n; ) {
                int j = i + 1;
                while (j < n && vals[i] == vals[j]) ++j;
                if (j - 1 > i) {
                    max2 = Math.max(max2, Math.abs(x[j - 1] - x[i]) + Math.abs(y[j - 1] - y[i]));
                }
                i = j;
            }
            out.println(Math.max(max1, max2));
        }

    }

    static class FastScanner {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public FastScanner(InputStream inputStream) {
            reader = new BufferedReader(new InputStreamReader(inputStream), 32768);
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

        public void nextIntArrays(int[]... arrays) {
            for (int i = 0; i < arrays[0].length; i++) {
                for (int j = 0; j < arrays.length; j++) {
                    arrays[j][i] = nextInt();
                }
            }
        }

    }

    static class ArrayUtils {
        public static void orderBy(int[] base, int[]... arrays) {
            Integer[] order = orderBase(base);
            order(order, base);
            for (int[] array : arrays) {
                order(order, array);
            }
        }

        public static void order(Integer[] order, int[] array) {
            int[] tempInt = new int[order.length];
            for (int i = 0; i < order.length; i++) {
                tempInt[i] = array[order[i]];
            }
            System.arraycopy(tempInt, 0, array, 0, array.length);
        }

        public static Integer[] orderBase(int[] base) {
            int size = base.length;
            Integer[] ind = new Integer[size];
            for (int i = 0; i < size; ++i) ind[i] = i;
            Arrays.sort(ind, new Comparator<Integer>() {

                public int compare(Integer o1, Integer o2) {
                    if (base[o1] != base[o2])
                        return base[o1] - base[o2];
                    return o1 - o2;
                }
            });
            return ind;
        }

    }
}

