import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
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
        BPowersOfTwo solver = new BPowersOfTwo();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPowersOfTwo {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            long[] a = in.longs(n);
            boolean[] u = new boolean[n + 1];
            Arrays.sort(a);
            long ans = 0;
            outer:
            for (int i = 0; i < n - 1; i++) {
                if (u[i]) {
                    continue;
                }
                for (int j = 30; j >= 0; j--) {
                    long t = (1L << j) - a[i];
                    if (t <= 0) {
                        break;
                    }
                    int min = lower_bound(a, t, i + 1);
                    if (min == n) {
                        continue;
                    }
                    while (min < n && (u[min]) && a[min] == t) {
                        min++;
                    }
                    if (min == n || a[min] != t) {
                        continue;
                    }
                    ans++;
                    u[i] = true;
                    u[min] = true;
                    continue outer;
                }
            }
            out.println(ans);
        }

        private static int lower_bound(long[] a, long t, int min) {
            int max = a.length;
            while (min < max) {
                int mid = (min + max) / 2;
                if (t <= a[mid]) {
                    max = mid;
                } else {
                    min = mid + 1;
                }
            }
            return min;
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

