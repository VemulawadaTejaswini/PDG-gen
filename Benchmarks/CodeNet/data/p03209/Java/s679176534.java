import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        long layers[], patties[];
        void solve(InputReader in, PrintWriter out) {
            // write your code here
            int N = in.nextInt();
            long X = in.nextLong();
            layers = new long[N + 1];
            patties = new long[N + 1];

            layers[0] = 1;
            patties[0] = 1;
            for (int i = 1; i < N; i++) {
                layers[i] = 2 * layers[i - 1] + 3;
                patties[i] = 2 * patties[i - 1] + 1;
            }

            out.println(f(N, X));
        }

        long f(int n, long x) {
            if (n == 0) {
                return x == 1 ? 1 : 0;
            } else if (x < layers[n - 1] + 1) {
                return f(n - 1, x - 1);
            } else if (x == layers[n - 1] + 1) {
                return f(n - 1, x - 1) + 1;
            } else if (x == 2 * layers[n - 1] + 3) {
                return 2 * patties[n - 1] + 1;
            } else {
                return patties[n - 1] + 1 + f(n - 1, x - layers[n - 1] - 2);
            }
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return  Long.parseLong(next());
        }
    }
}