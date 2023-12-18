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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        NiceShopping solver = new NiceShopping();
        solver.solve(1, in, out);
        out.close();
    }

    static class NiceShopping {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            int M = in.nextInt();
            int[] r = new int[A];
            int[] m = new int[B];
            int minR = Integer.MAX_VALUE;
            int minB = Integer.MAX_VALUE;
            for (int i = 0; i < A; i++) {
                r[i] = in.nextInt();
                minR = Math.min(minR, r[i]);
            }
            for (int i = 0; i < B; i++) {
                m[i] = in.nextInt();
                minB = Math.min(minB, m[i]);
            }
            int min = minR + minB;
            for (int i = 0; i < M; i++) {
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                int c = in.nextInt();
                min = Math.min(r[x] + m[y] - c, min);
            }
            out.println(min);
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

