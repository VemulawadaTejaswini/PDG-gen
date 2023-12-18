import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
            TaskC.Num[] X = new TaskC.Num[N];
            for (int i = 0; i < N; i++) {
                X[i] = new TaskC.Num(i, in.nextInt());
            }

            Arrays.sort(X, (n1, n2) -> n1.val - n2.val);

            int[] ANS = new int[N];

            for (int i = 0; i < N; i++) {
                ANS[X[i].idx] = (i < N / 2 ? X[N / 2].val : X[(N - 1) / 2].val);
            }

            out.println(Arrays.stream(ANS).mapToObj(Objects::toString).collect(Collectors.joining("\n")));
        }

        static class Num {
            int idx;
            int val;

            public Num(int idx, int val) {

                this.idx = idx;
                this.val = val;
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

