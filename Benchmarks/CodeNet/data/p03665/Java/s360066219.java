import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HossamDoma
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {

            int n = in.nextInt();
            int is_odd = in.nextInt();

            int[] a = new int[n];

            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();

            for (int i = 0; i < n; ++i) {
                int x = in.nextInt();
                a[i] = x;

                if (x % 2 == 0)
                    even.add(x);
                else
                    odd.add(x);
            }


            long ans = 0;

            if (is_odd == 1) {
                for (int i = 1; i <= odd.size(); i += 2)
                    ans += ncr(odd.size(), i);

                if (even.size() > 0)
                    ans += ans * ((1L << even.size()) - 1);
            } else {
                long tmp = (1L << even.size());
                ans = tmp;

                for (int i = 2; i <= odd.size(); i += 2)
                    ans += tmp * ncr(odd.size(), i);

            }

            out.println(ans);


        }

        private long ncr(int n, int r) {

            if (n < r)
                return 0;
            if (r == 0)
                return 1;
            if (r == 1)
                return n;

            BigInteger top = BigInteger.ONE;

            for (int i = n; i > (n - r); --i)
                top = top.multiply(BigInteger.valueOf(i));

//        long bottom = 1L;

            for (int i = 2; i <= r; ++i)
                top = top.divide(BigInteger.valueOf(i));

            return top.longValue();
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

