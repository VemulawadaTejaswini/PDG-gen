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
        void solve(InputReader in, PrintWriter out) {
            // write your code here
            int p[];
            int maxPrice = 0;
            int N = in.nextInt();
            p = new int[N];
            for (int i = 0; i < N; i++) {
                p[i] = in.nextInt();
                maxPrice = Math.max(p[i], maxPrice);
            }

            int sum = 0;
            boolean discounted = false;
            for (int i = 0; i < N; i++) {
                if (p[i] == maxPrice && !discounted) {
                    sum += p[i] / 2;
                    discounted = true;
                } else {
                    sum += p[i];
                }
            }

            out.println(sum);
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
    }
}