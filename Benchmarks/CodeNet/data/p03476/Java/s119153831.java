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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            final int N = (int) 1e5 + 10;
            boolean[] primes = new boolean[N];
            Arrays.fill(primes, true);
            primes[0] = primes[1] = false;
            for (int i = 2; i < primes.length; ++i) {
                if (!primes[i]) continue;
                for (int j = i + i; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }
            int[] oddNums = new int[N];
            for (int i = 1; i < oddNums.length; i += 2) {
                int cur = i == 1 ? 0 : oddNums[i - 2];
                if (primes[i] && primes[(i + 1) / 2]) {
                    ++cur;
                }
                oddNums[i] = cur;
            }
            int q = in.nextInt();
            for (int qq = 0; qq < q; ++qq) {
                int l = in.nextInt();
                int r = in.nextInt();
                int rr = oddNums[r];
                int ll = l == 1 ? 0 : oddNums[l - 2];
                out.println(rr - ll);
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

