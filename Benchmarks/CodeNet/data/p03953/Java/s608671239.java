import java.io.*;
import java.util.*;

/**
 * Created by fcdkbear on 15.10.16.
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        new Task().solve(in, out);
        out.close();
    }


    static class Task {

        public static final int ITERATIONS = 100;

        public void solve(InputReader in, PrintWriter out) {

            int n = in.nextInt();
            int[][] x = new int[ITERATIONS][n];
            for (int i = 0; i < n; ++i) {
                x[0][i] = in.nextInt();
            }
            int m = in.nextInt();
            long k = in.nextLong();
            int[] a = new int[m];
            for (int i = 0; i < m; ++i) {
                a[i] = in.nextInt();
                a[i]--;
            }
            for (int iteration = 1; iteration < ITERATIONS; ++iteration) {
                for (int i = 0; i < n; ++i) {
                    x[iteration][i] = x[iteration - 1][i];
                }
                for (int i = 0; i < m; ++i) {
                    int index = a[i];
                    x[iteration][index] = x[iteration][index - 1] + x[iteration][index + 1] - x[iteration][index];
                }
            }
            int index = (int)k % ITERATIONS;
            for (int i = 0; i < n; ++i) {
                out.println(x[index][i]);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}
