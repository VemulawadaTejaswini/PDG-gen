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
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n - 1; ++i) {
                int x = in.nextInt();
                int y = in.nextInt();
                int v = in.nextInt();
                a[x] ^= v;
                a[y] ^= v;
            }
            int[] cnt = new int[16];
            for (int x : a) if (x > 0) ++cnt[x];
            int res = 0;
            for (int i = 0; i < cnt.length; ++i) {
                res += cnt[i] / 2;
                cnt[i] %= 2;
            }
            int[] dist = new int[1 << 16];
            Arrays.fill(dist, (int) 1e9);
            int[] q = new int[1 << 20];
            int qt = 0;
            int qh = 1;
            q[0] = 0;
            dist[0] = 0;
            while (qt < qh) {
                int src = q[qt++];
                for (int v = 1; v < 16; ++v) {
                    for (int x = 1; x < 16; ++x) {
                        for (int y = 1; y < 16; ++y) {
                            int nx = x ^ v;
                            int ny = y ^ v;
                            int cur = src;
                            int len = 1;
                            if (nx != 0) {
                                if ((cur & (1 << nx)) == 0) {
                                    ++len;
                                }
                                cur ^= (1 << nx);
                            }
                            if (ny != 0) {
                                if ((cur & (1 << ny)) == 0) {
                                    ++len;
                                }
                                cur ^= (1 << ny);
                            }
                            if ((cur & (1 << x)) != 0) {
                                ++len;
                            }
                            cur ^= (1 << x);
                            if ((cur & (1 << y)) != 0) {
                                ++len;
                            }
                            cur ^= (1 << y);
                            if (dist[src] + len < dist[cur]) {
                                dist[cur] = dist[src] + len;
                                q[qh++] = cur;
                            }
                        }
                    }
                }
            }
            int got = 0;
            for (int i = 1; i < 16; ++i) if (cnt[i] > 0) got |= 1 << i;
            out.println(dist[got] + res);
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

