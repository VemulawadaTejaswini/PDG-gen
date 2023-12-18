import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author dyominov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGCDOnBlackboard solver = new CGCDOnBlackboard();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGCDOnBlackboard {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int res = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int min = Integer.MAX_VALUE;
            int val = 0;
            int val2 = 0;
            int res2 = Integer.MAX_VALUE;
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list1.add(arr[i]);
                list2.add(arr[i]);
            }

            for (int i = 1; i < n; i++) {
                int gcd = GCD(arr[0], arr[i]);
                if (gcd < min) {
                    val = arr[0];
                    val2 = arr[i];
                    min = gcd;
                }
            }
            list1.remove(Integer.valueOf(val));
            list2.remove(Integer.valueOf(val2));
            for (Integer value : list2) {
                int gcd = GCD(value, val);
                res = Math.min(res, gcd);
            }
            for (Integer integer : list1) {
                int gcd = GCD(integer, val2);
                res2 = Math.min(res2, gcd);

            }
            out.println(Math.max(res, res2));
        }

        private int GCD(int a, int b) {
            return b == 0 ? a : GCD(b, a % b);
        }

    }

    static class InputReader implements AutoCloseable {
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

        public void close() {
        }

    }
}

