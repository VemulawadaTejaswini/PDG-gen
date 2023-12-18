

import java.io.*;
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
            int n = in.nextInt();
            int[] towns = new int[n+1];
            int[] heroes = new int[n];
            for (int i = 0; i < n+1; i++) {
                towns[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                heroes[i] = in.nextInt();
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (towns[i] < heroes[i]){
                    heroes[i] -= towns[i];
                    count+= towns[i];
                    towns[i] = 0;
                }else {
                    towns[i] = towns[i] - heroes[i];
                    count += heroes[i];
                    heroes[i] = 0;
                }
                if (towns[i+1] < heroes[i]){
                    heroes[i] -= towns[i+1];
                    count += towns[i+1];
                    towns[i+1] = 0;
                }else {
                    towns[i+1] = towns[i+1] - heroes[i];
                    count += heroes[i];
                    heroes[i] = 0;
                }
            }
            out.println(count);
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
