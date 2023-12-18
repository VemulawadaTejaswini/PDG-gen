import java.util.*;
import java.io.*;

public class Main {

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

        public Integer nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public float nextFloat() {
            return Float.parseFloat(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        int q = 1;
        for (int i = 0; i < q; i++) {
            solver.solve(i + 1, in, out);
        }
        out.close();
    }

    static class Task {

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[][] towns = new long[n][2];
            for (int i = 0; i < n; i++) {
                towns[i][0] = in.nextLong();
                towns[i][1] = in.nextLong();
            }
            long fac = 1;
            for (int i = 2; i <= n; i++) {
                fac *= i;
            }
            double sum = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    sum += Math.sqrt(Math.pow(towns[i][0] - towns[j][0], 2) + Math.pow(towns[i][1] - towns[j][1], 2));
                }
            }
            out.println(2 * ((double) fac / n) * sum / fac);
        }
    }
}