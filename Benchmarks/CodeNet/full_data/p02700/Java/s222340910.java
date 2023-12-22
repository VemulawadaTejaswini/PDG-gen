//package beginner164.b;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int tHealth = in.nextInt();
            int tStrength = in.nextInt();
            int aHealth = in.nextInt();
            int aStrength = in.nextInt();

            // T, A, T, A, T, A...

            double turnsNeededForT = Math.ceil((double)aHealth / tStrength);
            double turnsNeededForA = Math.ceil((double)tHealth / aStrength);

            if (turnsNeededForT <= turnsNeededForA) {
                out.println("Yes");
            } else {
                out.println("No");
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

    }
}