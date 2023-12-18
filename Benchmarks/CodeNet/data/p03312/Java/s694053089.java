import java.io.*;
import java.util.*;

public class Main {
    private static class Solver {
        int binarySearch(int x, int y, long[] s) {
            int l = x, r = y, f = x - 1;
            while (l <= r) {
                int mid = (l + r) >> 1;
                if (s[mid] - s[x - 1] <= s[y] - s[mid]) {
                    f = mid;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            if (f == x - 1) {
                return x;
            }
            if (f == y) {
                return y - 1;
            }
            long dif1 = Math.abs(s[f] - s[x - 1] - s[y] + s[f]);
            long dif2 = Math.abs(s[f + 1] - s[x - 1] - s[y] + s[f + 1]);
            return (dif1 <= dif2) ? f : (f + 1);
        }
        private void solve(InputReader inp, PrintWriter out) {
            int n = inp.nextInt();
            int[] a = inp.nextArrayInt(n);

            long[] s = new long[n + 1];
            s[0] = 0;
            for (int i = 1; i <= n; ++i) {
                s[i] = s[i - 1] + a[i - 1];
            }

            long ans = (long) 1e18;
            for (int i = 2; i <= n - 2; ++i) {
                int p1 = binarySearch(1, i, s);
                int p2 = binarySearch(i + 1, n, s);
                long[] sum = {
                    s[p1],
                    s[i] - s[p1],
                    s[p2] - s[i],
                    s[n] - s[p2]
                };
                Arrays.sort(sum);
                ans = Math.min(ans, sum[3] - sum[0]);
            }
            out.println(ans);
        }
    }

    private static class Misc {
        static int[] ArrayFilled(int size, int value) {
            int[] a = new int[size];
            for (int i = 0; i < size; ++i) {
                a[i] = value;
            }
            return a;
        }
        static int[] UnitArray(int size) {
            int[] a = new int[size];
            for (int i = 0; i < size; ++i) {
                a[i] = i;
            }
            return a;
        }
        static long ArraySum(int[] a) {
            long ans = 0;
            for (int x: a) {
                ans += x;
            }
            return ans;
        }
        static int ArrayMin(int[] a) {
            int ans = a[0];
            for (int x: a) {
                ans = Math.min(ans, x);
            }
            return ans;
        }
        static int ArrayMax(int[] a) {
            int ans = a[0];
            for (int x: a) {
                ans = Math.max(ans, x);
            }
            return ans;
        }
    }
    private static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        private InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        private String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }
        private long nextLong() {
            return Long.parseLong(next());
        }
        private int[] nextArrayInt(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = nextInt();
            }
            return a;
        }
    }
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader inp = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(inp, out);
        out.close();
    }
}