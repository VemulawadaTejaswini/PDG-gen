import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int K = in.nextInt();
//        for (int k = 0; k <= 1000; k++) {
            out.println(find(K));
//        }
        }

        private int find(int K) {
            BigInteger num = BigInteger.valueOf(K);

            int ans = Integer.MAX_VALUE;
            BigInteger ansNum = num;
            for (int i = 1; i <= 100000; i++) {
                BigInteger mul = num.multiply(BigInteger.valueOf(i));
                int sum = sumDigits(mul);
                if (sum < ans) {
                    ans = sum;
                    ansNum = mul;
                }
            }

//        System.out.println("For K = " + K + " ans is: " + ansNum + " with sum: " + ans);
            return ans;
        }

        private int sumDigits(BigInteger num) {
            String s = num.toString();
            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                ans += (s.charAt(i) - '0');
            }
            return ans;
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

