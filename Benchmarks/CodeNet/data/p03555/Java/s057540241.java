import java.io.*;
import java.util.*;

public class Main {

    private static class InputReader {
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
                } catch (IOException exp) {
                    throw new RuntimeException(exp);
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
    }

    public static void main(String[] args) {    //throws FileNotFoundException {
        InputStream inputStream = System.in;    //new FileInputStream("input.txt");
        OutputStream outputStream = System.out; //new FileOutputStream("output.txt");
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task newTask = new Task();
        newTask.solve(in, out);

        out.close();
    }

    private static class Task {
        //.constant
        private final int INF = Integer.MAX_VALUE;
        private final int MOD = (int)1e9 + 7;

        //.data
        private int sumDig(long x) {
            int res = 0;
            while (x > 0) {
                res += x % 10;
                x /= 10;
            }
            return res;
        }

        //.code
        public void solve(InputReader in, PrintWriter out) {
            long n = in.nextInt();

            int ans = INF;
            int cur = 0;
            for (int i = 1; i < 10000000; ++i) {
                cur = sumDig(n * i);
                ans = Math.min(ans, cur);
            }

            out.println(ans);

        }//end

    }

}