import java.io.*;
import java.util.*;


public class Main {


    private void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        List<Integer> A = new ArrayList<>();
        A.add(x);
        for (int i = 0; i < n; i++) {
            A.add(in.nextInt());
        }
        List<Integer> B = new ArrayList<>();
        B.add(y);
        for (int i = 0; i < m; i++) {
            B.add(in.nextInt());
        }

        Collections.sort(A);
        Collections.sort(B);
        out.println(B.get(0) <= A.get(A.size() - 1) ? "War" : "No War");

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
