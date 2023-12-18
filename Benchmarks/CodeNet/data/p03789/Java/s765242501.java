import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String n = in.next();
            long left = 0;
            long right = 1;
            while (!enough(n, right)) right *= 2;
            while (right - left > 1) {
                long middle = (left + right) / 2;
                if (enough(n, middle)) {
                    right = middle;
                } else {
                    left = middle;
                }
            }
            out.println(right);
        }

        private boolean enough(String n, long limit) {
            limit *= 9;
            long carry = 0;
            for (int i = n.length() - 1; i >= 0; --i) {
                long cur = n.charAt(i) - '0';
                cur -= carry;
                carry = 0;
                if (cur > limit) return false;
                long sub = (limit - cur) % 10;
                limit -= sub;
                carry += (limit - cur) / 10;
                if (limit < 1) return false;
            }
            return true;
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

    }
}

