
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    public static class Task {

        public void solve(int testNumber, InputReader in, PrintWriter out) throws IOException {
            long x = in.nextLong();
            long y = in.nextLong();

            if (x % y == 0) {
                out.println("-1");
                return;
            }

            out.println(x % y == 0 ? "-1" : x);

        }

    }
//  }  ----------------------------------------------------------------------------
    // MAIN - INPUT - OUTPUT 

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

        public Double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int[] nextIntArray(int arraySize) {
            int array[] = new int[arraySize];

            for (int i = 0; i < arraySize; i++) {
                array[i] = nextInt();
            }

            return array;
        }

        public char[][] nextMatrix(int row, int col) {

            char[][] m = new char[row][col];

            for (int i = 0; i < row; i++) {

                m[i] = next().toCharArray();
            }
            return m;
        }

    }
}
