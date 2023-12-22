import java.io.*;
import java.util.StringTokenizer;

class Main {
    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() { // reads in the next string
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
        } // reads in the next int

        public long nextLong() {
            return Long.parseLong(next());
        } // reads in the next long

        public double nextDouble() {
            return Double.parseDouble(next());
        } // reads in the next double
    }

    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
        int number_of_rolls = r.nextInt();
        int play1 = 0, play2 = 0, checker = 0, repeated = 0;
        while (checker < number_of_rolls) {
            play1 = r.nextInt();
            play2 = r.nextInt();
            checker++;
            if (play1 == play2) {
                repeated += 1;
            }
        }
        if (repeated < 0) {
            pw.println("Yes");
        } else {
            pw.println("No");
        }

        pw.close(); // flushes the output once printing is done
    }
}
