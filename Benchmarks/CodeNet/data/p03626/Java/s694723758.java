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

        //.code
        public void solve(InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String first = in.next();
            String second = in.next();

            int prev = 1;
            long ans = 6;
            int start = 2;
            if (first.charAt(0) == second.charAt(0)) {
                prev = 0;
                ans = 3;
                start = 1;
            }

            for (int i = start; i < n; ++i) {
                if (first.charAt(i) == second.charAt(i)) {
                    if (prev == 0) {
                        ans = (ans * 2) % MOD;
                    }
                    prev = 0;
                } else {
                    ans = (prev == 0) ? ans * 2 % MOD : ans * 3 % MOD;
                    prev = 1;
                    ++i;
                }
            }

            out.println(ans);

        }//end

    }

}