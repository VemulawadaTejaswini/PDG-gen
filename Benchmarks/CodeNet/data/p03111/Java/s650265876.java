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
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSyntheticKadomatsu solver = new CSyntheticKadomatsu();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSyntheticKadomatsu {
        private int c;
        private int N;
        private int a;
        private int b;
        private int[] arr;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            N = in.nextInt();
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            arr = new int[N];
            for (int i = 0; i < N; ++i) arr[i] = in.nextInt();

            out.println(sol(0, 0, 0, 0));
        }

        private int sol(int n, int x, int y, int z) {
            if (N == n) {
                if (x == 0 || y == 0 || z == 0) return 0x3f3f3f3f;
                return Math.abs(x - a) + Math.abs(y - b) + Math.abs(z - c);
            }

            int v1 = sol(n + 1, x + arr[n], y, z) + (x == 0 ? 0 : 10),
                    v2 = sol(n + 1, x, y + arr[n], z) + (y == 0 ? 0 : 10),
                    v3 = sol(n + 1, x, y, z + arr[n]) + (z == 0 ? 0 : 10),
                    v4 = sol(n + 1, x, y, z);
            return Math.min(v1, Math.min(v2, Math.min(v3, v4)));
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

