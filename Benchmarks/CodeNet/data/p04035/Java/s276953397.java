import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.LinkedList;
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
        KnotPuzzle solver = new KnotPuzzle();
        solver.solve(1, in, out);
        out.close();
    }

    static class KnotPuzzle {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int L = in.nextInt();
            long sum = 0;
            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
                sum = sum + A[i];
            }

            int left = 0, right = N - 1;

            List<Integer> ans = new LinkedList<>();

            while (left < right) {
                if (sum < L) {
                    out.println("Impossible");
                    return;
                }
                if (A[left] < A[right]) {
                    ans.add(left + 1);
                    sum -= A[left++];
                } else {
                    ans.add(right);
                    sum -= A[right--];
                }
            }
            out.println("Possible");
            for (int x : ans) {
                out.println(x);
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
