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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            Integer[] A = new Integer[N];
            Integer[] B = new Integer[N];
            Integer[] C = new Integer[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                C[i] = in.nextInt();
            }

            Arrays.sort(A);
            Arrays.sort(B);
            Arrays.sort(C);

            long[] ways = new long[N];


            for (int i = 0, j = 0; i < N && j < N; ) {
                if (A[i] < B[j]) {
                    ways[j]++;
                    i++;
                } else {
                    j++;
                }
            }

            for (int i = 1; i < N; i++) {
                ways[i] += ways[i - 1];
            }


            long[] ways2 = new long[N];

            for (int i = 0, j = 0; i < N && j < N; ) {
                if (B[i] < C[j]) {
                    ways2[j] += ways[i];
                    i++;
                } else {
                    j++;
                }
            }
            for (int i = 1; i < N; i++) {
                ways2[i] += ways2[i - 1];
            }
            for (int i = 1; i < N; i++) {
                ways2[i] += ways2[i - 1];
            }

            out.println(ways2[N - 1]);
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

