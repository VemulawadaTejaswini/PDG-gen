import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.UncheckedIOException;
import java.util.Vector;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        ENegativeDoubling solver = new ENegativeDoubling();
        solver.solve(1, in, out);
        out.close();
    }

    static class ENegativeDoubling {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            long[] a = in.longs(n);
            long[] dpr = new long[n + 1];
            long[] dpl = new long[n + 1];
            Stack<Integer> capr = new Stack<>();
            for (int i = n - 2; i >= 0; i--) {
                long v = a[i + 1];
                long ans = 0;
                while (a[i] > v) {
                    v *= 4;
                    if (capr.isEmpty()) {
                        ans += n - i - 1;
                    } else {
                        ans += capr.pop() - i;
                    }
                }
                long w = a[i];
                while (w * 4 <= v) {
                    w *= 4;
                    capr.push(i);
                }
                dpr[i] = dpr[i + 1] + ans;
            }


            Stack<Integer> capl = new Stack<>();
            for (int i = 1; i < n; i++) {
                long v = a[i - 1];
                long ans = 0;
                while (a[i] > v) {
                    v *= 4;
                    if (capr.isEmpty()) {
                        ans += i;
                    } else {
                        ans += i - capl.pop();
                    }
                }
                long w = a[i];
                while (w * 4 <= v) {
                    w *= 4;
                    capl.push(i);
                }
                dpl[i + 1] = dpl[i] + ans;
            }

            long ans = Long.MAX_VALUE;
            for (int i = 0; i <= n; i++) {
                ans = Math.min(ans, dpl[i] * 2 + i + dpr[i] * 2);
            }
            out.println(ans);
            //out.println(Arrays.toString(dpr));
            //out.println(Arrays.toString(dpl));
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

        public long longs() {
            return Long.parseLong(string());
        }

        public long[] longs(int length) {
            return IntStream.range(0, length).mapToLong(x -> longs()).toArray();
        }

    }
}

