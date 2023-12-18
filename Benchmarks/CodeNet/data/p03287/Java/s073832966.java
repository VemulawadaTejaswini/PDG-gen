import java.io.*;
import java.util.*;

public class Main {



    private void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        long[] arr = new long[n];
        long[] arr2 = new long[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }
        int count = 0;
        for (int j = 0; j < n; j++) {
            for (int i = j + 1; i < n + 1; i++) {
                arr2[i] = arr2[i] + arr2[i - 1] + arr[i - 1];
                if(arr2[i] % m == 0){
                    count++;
                }
            }
            arr2 = new long[n + 1];
        }
        out.println(count);
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
