import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;

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
            {
                int n = in.nextInt();
                int m = in.nextInt();
                int[] arr = new int[n];
                int[] ind = new int[n + 1];
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                    ind[arr[i]] = i+1;
                }
                boolean[] flip = new boolean[n+1];
                for (int i = 0; i < m; i++) {
                    int x = in.nextInt();
                    int y = in.nextInt();
                    flip[x] = true;
                    flip[y] = true;
                }
                int ans = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] != i + 1) {
                        if (flip[i+1] && flip[ind[i + 1]]) {
                            int t1 = arr[i];
                            int t2 = ind[i];
                            arr[i] = i + 1;
                            arr[ind[i + 1]-1] = t1;
                            ind[i+1] = i+1;
                            ind[t1] = t2;
                            ans++;
                        }
                    }
                    else ans++;
                }
                out.println(ans);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
