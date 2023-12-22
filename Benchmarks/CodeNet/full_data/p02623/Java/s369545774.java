import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Problem solver = new Problem();
        solver.solve(0, in, out);
        out.close();
    }

    static class Problem {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            int k = in.nextInt();
            int[] A = new int[n], B = new int[m];

            for (int i = 0; i < n; i++)
                A[i] = in.nextInt();
            for (int i = 0; i < m; i++)
                B[i] = in.nextInt();

            int[] a = new int[n + 1];
            for (int i = 0; i < n; i++)
                a[i + 1] = A[i] + a[i];

            int[] b = new int[m + 1];
            for (int i = 0; i < m; i++)
                b[i + 1] = B[i] + b[i];

            int j = m;
            long res = 0;
            for (int i = 0; i <= n; i++) {
                if (a[i] > k)
                    break;
                while(b[j] + a[i] > k)
                    j--;
                res = Math.max(res, i + j);
            }

            out.println(res);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

