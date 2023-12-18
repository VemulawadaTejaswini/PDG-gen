import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        FXORMatching solver = new FXORMatching();
        solver.solve(1, in, out);
        out.close();
    }

    static class FXORMatching {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int m = in.nextInt(), k = in.nextInt();

            int n = 1 << m;

            int[] answer = new int[2 * n];

            HashSet<Integer> subset = new HashSet<>();

            int acc = 0;
            for (int i = 1; i < n; i <<= 1) {
                if ((i & k) > 0) {
                    acc ^= i;
                    subset.add(i);
                }
            }

            if (acc != k || (n == 2 && k != 0)) {
                out.println(-1);
                return;
            }

            int index = 0;
            for (int i = 0; i < n; i++) {
                if (subset.contains(i)) {
                    answer[index] = i;
                    index++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (!subset.contains(i)) {
                    answer[index] = i;
                    index++;
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (subset.contains(i)) {
                    answer[index] = i;
                    index++;
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (!subset.contains(i)) {
                    answer[index] = i;
                    index++;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int x : answer) {
                sb.append(x + " ");
            }
            sb.deleteCharAt(sb.length() - 1);

            out.println(sb);
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

