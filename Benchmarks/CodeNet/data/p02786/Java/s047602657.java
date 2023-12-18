import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Problem solver = new Problem();
        solver.solve(0, in, out);
        out.close();
    }

    static class Problem {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long H = in.nextLong();
            HashMap<Long, Long> memo = new HashMap<>();
            long res = countAttacks(H, 0, memo);
            out.println(res);
        }

        public long countAttacks(long H, long res, HashMap<Long, Long> memo) {
            if(H == 1)
                return res + 1;

            if(memo.containsKey(H))
                return memo.get(H);

            long res1 = countAttacks(H/2, res, memo);
            memo.put(H/2, res1);
            long res2 = countAttacks(H/2, res, memo);
            return res1 + res2 + 1;
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

        public long nextLong() { return Long.parseLong(next()); }

    }
}

