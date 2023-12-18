import java.io.*;
import java.util.*;

public class Main {


    private void solve(InputReader in, PrintWriter out) {
        String s = in.next();
        int count = 0;
        int count2 = 0;
        char[] arr = s.toCharArray();
        if (arr[0] == 'A') {
            for (int i = 2; i < arr.length - 1; i++) {
                if (arr[i] == 'C') {
                    count++;
                }
            }
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] >= 65 && arr[i] <= 90) {
                    count2++;
                }
            }
            if (count == 1 && count2 == 1) {
                out.println("AC");
            } else {
                out.println("WA");
            }
        } else {
            out.println("WA");
        }
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
