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
 *
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CPrison solver = new CPrison();
        solver.solve(1, in, out);
        out.close();
    }

    static class CPrison {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            endpt[] a = new endpt[m * 2];
            for (int i = 0; i < m; ++i) {
                a[2 * i] = new endpt(in.nextInt(), 0);
                a[2 * i + 1] = new endpt(in.nextInt(), 1);
            }
            Arrays.sort(a, (b, c) -> {
                return b.v == c.v ? b.isend - c.isend : b.v - c.v;
            });

            int ans = 0, cur = 0;
            for (int i = 0; i < 2 * m; ++i) {
                if (a[i].isend == 0) {
                    ++cur;
                } else {
                    if (cur == m) {
                        ans += a[i].v - a[i - 1].v + 1;
                    }
                    --cur;
                }
            }
            out.println(ans);
        }

        class endpt {
            int v;
            int isend;

            endpt(int v1, int isbegin1) {
                v = v1;
                isend = isbegin1;
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

