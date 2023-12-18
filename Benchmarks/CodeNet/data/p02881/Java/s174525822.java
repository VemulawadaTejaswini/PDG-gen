

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
//        int t = in.nextInt();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) throws IOException {
            long n = in.nextLong();
            int i = 1;
            int j = 1;
            int[][] dp = new int[(int) n][(int) n];
            for (int[] ints : dp) {
                Arrays.fill(ints, -1);
            }
            out.println(ans(n, i, j, 0, dp));
        }

        private int ans(long n, int i, int j, int count, int[][] dp) {
            if (i * j == n){
                return count;
            }
            if(i * j > n){
                return Integer.MAX_VALUE;
            }
            if (dp[i][j] != -1){
                return dp[i][j];
            }
            dp[i][j] = Math.min(ans(n, i+1, j, count+1, dp), ans(n, i, j+1, count+1, dp));
            return dp[i][j];
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public String nextLine() throws IOException {
            return reader.readLine().trim();
        }
    }
}
