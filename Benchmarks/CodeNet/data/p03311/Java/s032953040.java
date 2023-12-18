import java.io.*;
import java.util.*;
 
public class Main {
    private static class Solver {
        private void solve(InputReader inp, PrintWriter out) {
            int n = inp.nextInt();
            int[] a = inp.nextArrayInt(n);
 
            Integer[] b = new Integer[n];
            for (int i = 0; i < n; ++i) {
                b[i] = a[i] - (i + 1);
            }
            Arrays.sort(b);
 
            int median = b[n / 2];
            long ans = 0;
            for (int i = 0; i < n; ++i) {
                ans += Math.abs(b[i] - median);
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