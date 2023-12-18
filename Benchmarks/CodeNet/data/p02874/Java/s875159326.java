import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
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
        BTwoContests solver = new BTwoContests();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTwoContests {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            Pair<Integer, Integer>[] problems = new Pair[n];
            for (int i = 0; i < n; i++) {
                problems[i] = Pair.of(in.nextInt(), in.nextInt() + 1);
            }

            Arrays.sort(problems, Comparator.comparingInt((Pair<Integer, Integer> p) -> p.first).thenComparingInt(p -> -p.second));
            IntMinSparseTable min = new IntMinSparseTable(n);
            for (int i = 0; i < n; i++) {
                min.update_LAZY(i, problems[i].second);
            }
            min.rebuild();

            long answer = 0;
            for (int i = 1; i < n; i++) {
                long candidate = min.query(0, i) - problems[i - 1].first;
                candidate += min.query(i, n) - problems[n - 1].first;

                //System.out.println(i + " " + candidate + " " + (min.query(0, i) - problems[i - 1].first) + " " + (min.query(i, n) - problems[n - 1].first));
                answer = Math.max(answer, candidate);
            }

            // Just have 1 good contest and give up on the other.
            for (int i = 0; i < n; i++) {
                answer = Math.max(answer, problems[i].second - problems[i].first + 1);
            }

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

    }

    static class Pair<F, S> {
        public final F first;
        public final S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

        public static <F, S> Pair<F, S> of(F first, S second) {
            return new Pair<>(first, second);
        }

        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
        }

        public int hashCode() {
            return Objects.hash(first, second);
        }

        public String toString() {
            return "(" + first + ", " + second + ')';
        }

    }

    static class Util {
        public static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
        }

    }

    static class IntMinSparseTable {
        public int size;
        public int[] table;
        private int maxLength;

        public IntMinSparseTable(int[] array) {
            this.size = array.length;

            maxLength = 1 + Integer.numberOfTrailingZeros(Integer.highestOneBit(Math.max(size - 1, 1)));
            table = new int[maxLength * size];
            System.arraycopy(array, 0, table, 0, size);

            rebuild();
        }

        public IntMinSparseTable(int size) {
            this.size = size;

            maxLength = 1 + Integer.numberOfTrailingZeros(Integer.highestOneBit(Math.max(size - 1, 1)));
            table = new int[maxLength * size];
        }

        public void rebuild() {
            for (int l = 0; l + 1 < maxLength; l++) {
                for (int i = 0; i < size; i++) {
                    table[index(l + 1, i)] = table[index(l, i)];
                    if (i + (1 << l) < size) {
                        table[index(l + 1, i)] = Math.min(table[index(l + 1, i)], table[index(l, i + (1 << l))]);
                    }
                }
            }
        }

        public void update_LAZY(int i, int v) {
            table[i] = v;
        }

        private int index(int length, int start) {
            return length * size + start;
        }

        public int query(int i, int j) {
            Util.ASSERT(0 <= i && i < j && j <= size);
            int length = j - i - 1;
            int l = length == 0 ? 0 : Integer.numberOfTrailingZeros(Integer.highestOneBit(length));
            int left = table[index(l, i)];
            int right = table[index(l, j - (1 << l))];
            return Math.min(left, right);
        }

    }
}

