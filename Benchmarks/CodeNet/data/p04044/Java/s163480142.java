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
        int N;
        int L;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            N = in.nextInt();
            L = in.nextInt();
            String[] s = new String[N];
            boolean[] vis = new boolean[N];
            StringBuilder res = new StringBuilder();

            for (int i = 0; i < N; ++i) s[i] = in.next();
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    if (vis[j]) continue;
                    boolean found = true;
                    for (int k = 0; k < N; ++k) {
                        if (vis[k]) continue;
                        if (!isSmallerOrEqual(s[j], s[k])) {
                            found = false;
                            break;
                        }
                    }
                    if (!found) continue;
                    vis[j] = true;
                    res.append(s[j]);
                }
            }
            out.println(new String(res));
        }

        private boolean isSmallerOrEqual(String s1, String s2) {
            if (s1.equals(s2)) return true;
            for (int i = 0; i < L; ++i) {
                if (s1.charAt(i) < s2.charAt(i)) return true;
            }
            return false;
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

