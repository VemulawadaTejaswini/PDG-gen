import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
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
        FForkInTheRoad solver = new FForkInTheRoad();
        solver.solve(1, in, out);
        out.close();
    }

    static class FForkInTheRoad {
        int n;
        List<Integer>[] adj;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            int m = in.nextInt();

            adj = new List[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }

            for (int i = 0; i < m; i++) {
                int s = in.nextInt() - 1;
                int t = in.nextInt() - 1;
                adj[s].add(t);
            }

            double[] exp = recalc(Pair.of(-1, -1));

            double answer = Double.POSITIVE_INFINITY;
            for (int i = 0; i < n - 1; i++) {
                int removeJ = -1;
                double worstPath = 0;
                for (int j : adj[i]) {
                    if (exp[j] > worstPath) {
                        worstPath = exp[j];
                        removeJ = j;
                    }
                }

                double[] better = recalc(Pair.of(i, removeJ));

                answer = Math.min(answer, better[0]);
            }

            out.println(answer);
        }

        private double[] recalc(Pair<Integer, Integer> removed) {
            double[] exp = new double[n];
            exp[n - 1] = 0;
            for (int i = n - 2; i >= 0; i--) {
                int count = 0;

                for (int j : adj[i]) {
                    if (i == removed.first && j == removed.second)
                        continue;
                    exp[i] += exp[j];
                    count++;
                }

                if (count == 0) {
                    exp[i] = Double.POSITIVE_INFINITY;
                    continue;
                }

                exp[i] /= count;
                exp[i] += 1;
            }
            return exp;
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
}

