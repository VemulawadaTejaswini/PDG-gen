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
            int[] res = new int[26];
            Arrays.fill(res, 0);
            int n = in.nextInt();
            for (int i = 0; i < n; ++i) {
                char[] arr = in.next().toCharArray();
                int[] amount = new int[26];
                Arrays.fill(amount, 0);
                for (char x : arr) amount[x - 'a']++;
                for (int k = 0; k < 26; ++k) {
                    res[k] = i == 0 ? Math.max(res[k], amount[k]) : Math.min(res[k], amount[k]);
                }
            }
            StringBuilder sb = new StringBuilder();
            char cur = 'a';
            for (int x : res) {
                for (int i = 0; i < x; ++i) sb.append(cur);
                ++cur;
            }
            out.println(new String(sb));
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

