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
        CExceptionHandling solver = new CExceptionHandling();
        solver.solve(1, in, out);
        out.close();
    }

    static class CExceptionHandling {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();

            int max = Integer.MIN_VALUE;
            int count = 0;
            for (int x : a) {
                if (x > max) {
                    max = x;
                    count = 1;
                } else if (x == max) {
                    count++;
                }
            }

            int second = Integer.MIN_VALUE;
            if (count > 1) {
                second = max;
            } else {
                for (int x : a) {
                    if (x == max)
                        continue;
                    second = Math.max(second, x);
                }
            }

            for (int x : a) {
                if (x != max)
                    out.println(max);
                else
                    out.println(second);
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

