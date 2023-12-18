import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
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
            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            Stack<Integer> idx = new Stack<>();
            int left[] = new int[N];
            for (int i = 0; i < N; i++) {
                while (!idx.isEmpty() && A[idx.peek()] > A[i]) {
                    idx.pop();
                }

                int last = idx.isEmpty() ? -1 : idx.peek();
                left[i] = i - last;
                idx.push(i);
            }

            int right[] = new int[N];
            idx.clear();

            for (int i = N - 1; i >= 0; i--) {
                while (!idx.isEmpty() && A[idx.peek()] > A[i]) {
                    idx.pop();
                }

                int last = idx.isEmpty() ? N : idx.peek();
                right[i] = last - i;
                idx.push(i);
            }

            long ans = 0L;
            for (int i = 0; i < N; i++) {
                ans += (long) left[i] * right[i] * A[i];
            }
            out.println(ans);
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
