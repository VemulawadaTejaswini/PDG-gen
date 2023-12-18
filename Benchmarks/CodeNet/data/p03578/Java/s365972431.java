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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            Integer[] D = new Integer[N];
            for (int i = 0; i < N; i++) {
                D[i] = in.nextInt();
            }
            int M = in.nextInt();
            Integer[] T = new Integer[M];
            for (int i = 0; i < M; i++) {
                T[i] = in.nextInt();
            }

            Arrays.sort(D);
            Arrays.sort(T);
            int di = 0;
            for (int i = 0; i < M; i++) {
                while (di < N && D[di] < T[i]) di++;
                if (di == N || D[di] > T[i]) {
                    out.println("NO");
                    return;
                }

                di++;
            }
            out.println("YES");
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

