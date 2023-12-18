import java.io.*;
import java.util.*;

public class Main {
    private static class Solver {
        private void solve(InputReader inp, PrintWriter out) {
            int n = inp.nextInt();
            int[] max1 = inp.nextArrayInt(1 << n);
            int[] max2 = Misc.ArrayFilled(1 << n, 0);
            for (int i = 0; i < n; ++i) {
                for (int mask = 0; mask < 1 << n; ++mask) {
                    if ((mask >> i & 1) == 0) {
                        continue;
                    }
                    int pmask = mask - (1 << i);
                    if (max1[mask] < max1[pmask]) {
                        max2[mask] = Math.max(max1[mask], max2[pmask]);
                        max1[mask] = max1[pmask];
                    } else if (max2[mask] < max1[pmask]) {
                        max2[mask] = max1[pmask];
                    }
                }
            }

            int ans = 0;
            for (int mask = 1; mask < 1 << n; ++mask) {
                ans = Math.max(ans, max1[mask] + max2[mask]);
                out.println(ans);
            }
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
//        if (!"true".equals(System.getProperty("ONLINE_JUDGE"))) {
//            System.setIn(new FileInputStream(new File("input.txt")));
//        }
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader inp = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(inp, out);
        out.close();
    }
}