import java.io.*;
import java.util.*;

public class Main {

    private void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        if (n % 4 == 0) {
            out.println("Yes");
            return;
        }
        if (n % 7 == 0) {
            out.println("Yes");
            return;
        }
        int a = n;
        while (n > 0) {
            n -= 7;
            if (n > 0 && n % 4 == 0) {
                out.println("Yes");
                return;
            }
        }
        while (a > 0) {
            a -= 4;
            if (a > 0 && a % 7 == 0) {
                out.println("Yes");
                return;
            }
        }
        out.println("No");
    }


    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        try (
                InputReader in = new InputReader(System.in);
                PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }


    static class InputReader implements AutoCloseable {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        @Override
        public void close() {

        }
    }


}
