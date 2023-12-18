import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractCollection;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Nikita Mikhailov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EActiveInfants solver = new EActiveInfants();
        solver.solve(1, in, out);
        out.close();
    }

    static class EActiveInfants {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.readInt();
            int[] vals = in.readInts(n);
            long[][] dp = new long[n + 1][n + 1];
            boolean[][] used = new boolean[n + 1][n + 1];

            int[] sortedIds = IntStream.range(0, n).boxed().sorted((a, b) -> {
                if (vals[a] == vals[b]) {
                    return a - b;
                }
                return Integer.compare(vals[b], vals[a]);
            }).mapToInt(Integer::intValue).toArray();


            LinkedList<IntPair> queue = new LinkedList<>();
            queue.add(new IntPair(0, 0));

            long res = 0;
            while (!queue.isEmpty()) {
                int from = queue.getFirst().x();
                int to = queue.getFirst().y();


                queue.pollFirst();
                if (used[from][to]) {
                    continue;
                }
                used[from][to] = true;


                long cur = dp[from][to];

                if (from + to >= n) {
                    res = Math.max(res, cur);
                    continue;
                }

                int pos = sortedIds[from + to];
                int item = vals[pos];

                if (dp[from + 1][to] < cur + item * Math.abs(from - pos)) {
                    dp[from + 1][to] = Math.max(dp[from + 1][to], cur + item * Math.abs(from - pos));
                    queue.add(new IntPair(from + 1, to));
                    used[from + 1][to] = false;
                }


                if (dp[from][to + 1] < cur + item * Math.abs((n - 1 - to) - pos)) {
                    dp[from][to + 1] = Math.max(dp[from][to + 1], cur + item * Math.abs((n - 1 - to) - pos));
                    queue.add(new IntPair(from, to + 1));

                    used[from][to + 1] = false;
                }

            }


            out.println(res);
        }

    }

    static class IntPair extends Pair<Integer, Integer> {
        public IntPair(Integer integer, Integer integer2) {
            super(integer, integer2);
        }

        public IntPair(Pair<? extends Integer, ? extends Integer> entry) {
            super(entry);
        }

        public Integer x() {
            return getFirst();
        }

        public Integer y() {
            return getSecond();
        }

    }

    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K k, V v) {
            key = k;
            value = v;
        }

        public Pair(Pair<? extends K, ? extends V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public K getFirst() {
            return key;
        }

        public V getSecond() {
            return value;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Pair)) {
                return false;
            } else {
                Pair<?, ?> oP = (Pair<?, ?>) o;
                return (key == null ?
                        oP.key == null :
                        key.equals(oP.key)) &&
                        (value == null ?
                                oP.value == null :
                                value.equals(oP.value));
            }
        }

        public int hashCode() {
            int result = key == null ? 0 : key.hashCode();

            final int h = value == null ? 0 : value.hashCode();
            result = 37 * result + h ^ (h >>> 16);

            return result;
        }

        public String toString() {
            return "[" + getKey() + ", " + getValue() + "]";
        }

    }

    static class FastScanner {
        private StringTokenizer st;
        private BufferedReader in;

        public FastScanner(final InputStream in) {
            this.in = new BufferedReader(new InputStreamReader(in));
        }

        public String readToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int readInt() {
            return Integer.parseInt(readToken());
        }

        public int[] readInts(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = readInt();
            }
            return res;
        }

    }
}

