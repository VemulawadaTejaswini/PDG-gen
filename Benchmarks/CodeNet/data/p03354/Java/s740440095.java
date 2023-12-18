import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DEquals solver = new DEquals();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEquals {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints(), m = in.ints();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[in.ints() - 1] = i;
            }
            UnionFind uf = new UnionFind(n);
            for (int i = 0; i < m; i++) {
                uf.union(in.ints() - 1, in.ints() - 1);
            }

            int ans = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (uf.find(i) == uf.find(p[i])) {
                    ans++;
                }
            }
            out.println(ans);
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }

    static final class UnionFind {
        private final int[] groups;

        public UnionFind(int size) {
            groups = IntStream.range(0, size).toArray();
        }

        public int find(int i) {
            int ans = groups[i];
            while (ans != groups[ans]) {
                ans = groups[ans];
            }
            return groups[i] = ans;
        }

        public int union(int a, int b) {
            return groups[find(b)] = find(a);
        }

    }
}

