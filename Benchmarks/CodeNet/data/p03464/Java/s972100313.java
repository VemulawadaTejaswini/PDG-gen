import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
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
        IceRinkGame solver = new IceRinkGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class IceRinkGame {
        long maxN;
        long minN;
        int[] A;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int K = in.nextInt();
            A = new int[K];
            for (int i = 0; i < K; i++) {
                A[i] = in.nextInt();
            }
            minN = Long.MAX_VALUE;
            maxN = Long.MIN_VALUE;

            find(K - 1, A[K - 1]);

            if (minN == Long.MAX_VALUE) {
                out.println(-1);
            } else {
                out.println(minN + " " + maxN);
            }
        }

        private void find(int idx, long N) {
            if (idx == 0) {
                maxN = Math.max(maxN, N + A[idx] - 1);
                minN = Math.min(minN, N);
            } else {
                long start = ((N + A[idx - 1] - 1) / A[idx - 1]) * A[idx - 1];
                long end = N + A[idx];
                for (long nn = start; nn < end; nn += A[idx - 1]) {
                    find(idx - 1, nn);
                }
            }
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

