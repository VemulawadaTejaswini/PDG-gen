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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();

            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            long ans = 0;
            long sum = A[0];
            long xor = A[0];
            long prevLeft = -1;
            long prevRight = -1;

            for (int left = 0, right = 0; left < N && right < N; ) {
                while (sum != xor) {
                    sum -= A[left];
                    xor ^= A[left];
                    left++;
                }

                while (right + 1 < N && (sum + A[right + 1]) == (xor ^ A[right + 1])) {
                    sum += A[right + 1];
                    xor ^= A[right + 1];
                    right++;
                }

                long len = right - left + 1;

                long poprz = 0;

                if (prevRight != -1 && left <= prevRight) {
                    long plen = prevRight - left + 1;
                    poprz = plen * (plen + 1) / 2;
                }

                ans += len * (len + 1) / 2 - poprz;

                prevLeft = left;
                prevRight = right;

                if (++right < N) {
                    sum += A[right];
                    xor ^= A[right];
                }
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

