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
 *
 * @author Tarek
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DFlatSubsequence solver = new DFlatSubsequence();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFlatSubsequence {
        final static int N = (int) 6e5 + 7;
        int[] tree = new int[4 * N];
        int[] a = new int[N];

        void update(int pos, int v, int l, int r, int node) {
            if (l == r) {
                tree[node] = v;
                return;
            }
            int m = (l + r) / 2;
            if (pos <= m) update(pos, v, l, m, 2 * node);
            else update(pos, v, m + 1, r, 2 * node + 1);
            tree[node] = Math.max(tree[2 * node], tree[2 * node + 1]);
        }

        int query(int ql, int qr, int l, int r, int node) {
            if (ql <= l && qr >= r) return tree[node];
            int m = (l + r) / 2;
            int ans = 0;
            if (ql <= m) ans = Math.max(ans, query(ql, qr, l, m, 2 * node));
            if (qr > m) ans = Math.max(ans, query(ql, qr, m + 1, r, 2 * node + 1));
            return ans;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                int res = query(Math.max(a[i] - k, 0), a[i] + k, 0, N, 1) + 1;
                ans = Math.max(ans, res);
                update(a[i], res, 0, N, 1);
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

