import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
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

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            int[] prefix = new int[n + 1];
            prefix[0] = 0;
            for (int i = 0; i < n; i++) {
                prefix[i + 1] = NumberTheory.gcd(prefix[i], a[i]);
            }

            int[] suffix = new int[n + 1];
            suffix[n] = 0;
            for (int i = n - 1; i >= 0; i--) {
                suffix[i] = NumberTheory.gcd(suffix[i + 1], a[i]);
            }

            int answer = 0;
            for (int i = 0; i < n; i++) {
                answer = Math.max(answer, NumberTheory.gcd(prefix[i], suffix[i + 1]));
            }

            out.println(answer);
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

    static class NumberTheory {
        public static int gcd(int a, int b) {
            int c;
            while (a != 0) {
                c = a;
                a = b % a;
                b = c;
            }
            return b;
        }

    }
}

