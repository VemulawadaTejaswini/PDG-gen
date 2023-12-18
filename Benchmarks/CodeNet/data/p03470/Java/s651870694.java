import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        TaskB solver = new TaskB();
        solver.solve(in, out);

        out.close();
    }

    static class TaskB {
        public void solve(InputReader in, PrintWriter out) {
            int cases = in.nextInt();
            solveIt(cases, in, out);
        }

        private void solveIt(int cases, InputReader in, PrintWriter out) {
            int[] layers = new int[cases];
            for (int i = 0; i < cases; i++) {
                layers[i] = in.nextInt();
            }

            out.println(Arrays.stream(layers).distinct().count());
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public String[] input;
        public int current;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            input = null;
            current = 0;
        }

        public String next() {
            while (input == null || current == input.length) {
                try {
                    current = 0;
                    input = reader.readLine().split("\\s");
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }

            return input[current++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}