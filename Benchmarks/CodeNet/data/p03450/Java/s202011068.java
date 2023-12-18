import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.function.BiFunction;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BinaryOperator;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPeopleOnALine solver = new DPeopleOnALine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPeopleOnALine {
        private static final String YES = "Yes";
        private static final String NO = "No";

        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            WeightedUnionFind<Long> uf = new WeightedUnionFind<>(n, Long.class, (x, y) -> x + y, (x, y) -> x - y, 0L);
            int m = in.ints();
            for (int i = 0; i < m; i++) {
                int l = in.ints() - 1, r = in.ints() - 1, d = in.ints();
                if (!uf.union(l, r, (long) d)) {
                    out.println(NO);
                    return;
                }
            }
            out.println(YES);
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static <T> T[] newInstance(Class<T> clazz, int length) {
            return (T[]) Array.newInstance(clazz, length);
        }

    }

    static class WeightedUnionFind<T> {
        private final int[] groups;
        private final int[] rank;
        private final T[] weight;
        private final BinaryOperator<T> addition;
        private final BinaryOperator<T> subtraction;
        private final T zero;

        public WeightedUnionFind(int n, Class<T> clazz, BinaryOperator<T> addition, BinaryOperator<T> subtraction, T zero) {
            groups = IntStream.range(0, n).toArray();
            rank = new int[n];
            this.weight = ArrayUtil.newInstance(clazz, n);
            this.addition = addition;
            this.subtraction = subtraction;
            Arrays.fill(weight, zero);
            this.zero = zero;
        }

        public int find(int i) {
            int parent = groups[i];
            if (parent == i) {
                return i;
            } else {
                int root = find(parent);
                weight[i] = addition.apply(weight[i], weight[parent]);
                return groups[i] = root;
            }
        }

        public T getWeight(int i) {
            find(i);
            return weight[i];
        }

        public T getDistance(int x, int y) {
            return subtraction.apply(getWeight(y), getWeight(x));
        }

        public boolean union(int x, int y, T w) {
            w = addition.apply(w, getWeight(x));
            w = subtraction.apply(w, getWeight(y));
            x = find(x);
            y = find(y);
            if (x == y) {
                return getDistance(x, y).equals(w);
            } else if (rank[x] < rank[y]) {
                groups[x] = y;
                weight[x] = subtraction.apply(zero, w);
            } else if (rank[x] == rank[y]) {
                rank[x]++;
                groups[y] = x;
                weight[y] = w;
            } else {
                groups[y] = x;
                weight[y] = w;
            }
            return true;
        }

    }
}

