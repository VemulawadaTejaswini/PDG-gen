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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DShortestPathOnALine solver = new DShortestPathOnALine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DShortestPathOnALine {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            DShortestPathOnALine.T[] ts = new DShortestPathOnALine.T[m];
            for (int i = 0; i < m; i++) {
                int l = in.nextInt() - 1;
                int r = in.nextInt() - 1;
                int c = in.nextInt();

                ts[i] = new DShortestPathOnALine.T(l, r, c);
            }

            Arrays.sort(ts, Comparator.comparingInt((DShortestPathOnALine.T t) -> t.l).thenComparingInt(t -> -t.r));

            LongSegmentTree min = new LongSegmentTree(n, Math::min, Long.MAX_VALUE);
            min.update(0, 0);
            for (DShortestPathOnALine.T t : ts) {
                long current = min.query(t.l, n);
                if (current == Long.MAX_VALUE)
                    continue;
                min.update(t.r, Math.min(min.get(t.r), current + t.c));
            }

            long answer = min.get(n - 1);
            if (answer == Long.MAX_VALUE)
                answer = -1;

            out.println(answer);
        }

        static class T {
            final int l;
            final int r;
            final int c;

            T(int l, int r, int c) {
                this.l = l;
                this.r = r;
                this.c = c;
            }

        }

    }

    static class LongSegmentTree {
        public int size;
        public long[] value;
        protected final LongSegmentTree.Combiner combiner;
        protected final long identityElement;

        public LongSegmentTree(int size, LongSegmentTree.Combiner combiner, long identityElement) {
            this.size = size;
            value = new long[2 * size];
            Arrays.fill(value, identityElement);
            this.combiner = combiner;
            this.identityElement = identityElement;
        }

        protected long combine(long a, long b) {
            return combiner.combine(a, b);
        }

        public long get(int i) {
            return value[size + i];
        }

        public void update(int i, long v) {
            i += size;
            value[i] = v;
            while (i > 1) {
                i /= 2;
                value[i] = combine(value[2 * i], value[2 * i + 1]);
            }
        }

        public long query(int i, int j) {
            long res_left = identityElement, res_right = identityElement;
            for (i += size, j += size; i < j; i /= 2, j /= 2) {
                if ((i & 1) == 1)
                    res_left = combine(res_left, value[i++]);
                if ((j & 1) == 1)
                    res_right = combine(value[--j], res_right);
            }
            return combine(res_left, res_right);
        }

        public interface Combiner {
            long combine(long a, long b);

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

