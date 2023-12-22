import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.BitSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EBomber solver = new EBomber();
        solver.solve(1, in, out);
        out.close();
    }

    static class EBomber {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt();
            int n = Math.max(h, w);
            int m = in.nextInt();

            int[][] coords = new int[2][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < 2; j++) {
                    coords[j][i] = in.nextInt() - 1;
                }
            }

            int[][] counts = new int[2][n];
            for (int i = 0; i < 2; i++) {
                int[] c = coords[i];
                for (int x : c) {
                    counts[i][x]++;
                }
            }

            int[] max = new int[2];
            for (int i = 0; i < 2; i++) {
                max[i] = Util.max(counts[i]);
            }
            BitSet[] candidates = new BitSet[2];
            for (int i = 0; i < 2; i++) {
                candidates[i] = new BitSet();
                for (int j = 0; j < n; j++) {
                    if (counts[i][j] == max[i])
                        candidates[i].set(j);
                }
            }

            long total = 0;
            for (int j = 0; j < m; j++) {
                if (candidates[0].get(coords[0][j]) || candidates[1].get(coords[1][j]))
                    total++;
            }
            total -= candidates[0].cardinality() * max[0] + candidates[1].cardinality() * max[1];
            total += (long) candidates[0].cardinality() * candidates[1].cardinality();

            int answer = max[0] + max[1];
            if (total == 0)
                answer--;

            out.println(answer);
        }

    }

    static class InputReader {
        public final BufferedReader reader;
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

    static class Util {
        public static int max(int... x) {
            int max = Integer.MIN_VALUE;
            for (int i : x) {
                max = Math.max(i, max);
            }
            return max;
        }

        private Util() {
        }

    }
}

