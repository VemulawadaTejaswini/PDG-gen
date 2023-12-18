import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

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
        int N, ans;

        int gcd(int a, int b) {
            if (a < b) {
                int tmp = a; a = b; b = tmp;
            }
            if (b == 0) {
                return a;
            } else {
                return gcd(b, a % b);
            }
        }

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();

            for (int i = 0; i < N; ++i) {
                int a = in.nextInt();
                if (i == 0) {
                    ans = a;
                } else {
                    ans = gcd(ans, a);
                }
            }

            out.println(ans);
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

        int nextInt() { return Integer.parseInt(next()); }

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) arr[i] = this.nextInt();
            return arr;
        }
    }
}
