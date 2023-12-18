import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Gabriel Carrillo
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DKnapsack1 solver = new DKnapsack1();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnapsack1 {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt(), cap = in.nextInt();
            int[] w = new int[n];
            int[] c = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = in.nextInt();
                c[i] = in.nextInt();
            }

            out.println(dfs(n - 1, cap, w, c, new HashMap<>()));
        }

        long dfs(int i, int cap, int[] w, int[] c, Map<String, Long> dp) {
            if (i < 0) return 0;
            if (cap == 0) return 0;
            String state = i + " " + cap;
            if (dp.get(state) == null) {
                long ans = 0;
                if (cap - w[i] >= 0)
                    ans = dfs(i - 1, cap - w[i], w, c, dp) + c[i];
                ans = Math.max(ans, dfs(i - 1, cap, w, c, dp));
                dp.put(state, ans);
            }

            return dp.get(state);

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public InputReader(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

