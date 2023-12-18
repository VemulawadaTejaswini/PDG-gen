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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int P[] = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = in.nextInt() - 1;
            }

            int SUM[] = new int[N];

            int A[] = new int[N];
            int B[] = new int[N];

            int MIDDLE = 100000000;

            int Q[] = new int[N];

            for (int i = 0; i < N; i++) {
                Q[P[i]] = i;
            }

            A[0] = 1;
            B[0] = MIDDLE;

            SUM[Q[0]] = A[0] + B[0];

            for (int i = Q[0] - 1; i >= 0; i--) SUM[i] = SUM[i + 1] - 1;
            for (int i = Q[0] + 1; i < N; i++) SUM[i] = SUM[i - 1] + 1;

            for (int i = 1; i < N; i++) {
                if (SUM[Q[i]] < SUM[Q[i - 1]]) {
                    A[i] = A[i - 1] + 1;
                    B[i] = SUM[Q[i]] - A[i];
                } else {
                    B[i] = B[i - 1] - 1;
                    A[i] = SUM[Q[i]] - B[i];
                }
            }

            for (int i = 0; i < N; i++) {
                out.print(A[i] + " ");
            }
            out.println();
            for (int i = 0; i < N; i++) {
                out.print(B[i] + " ");
            }
            out.println();
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
