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
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DXORWorld solver = new DXORWorld();
        solver.solve(1, in, out);
        out.close();
    }

    static class DXORWorld {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long a = in.nextLong(), b = in.nextLong();

            long answer = compute(b);
            if (a != 0) {
                answer ^= compute(a - 1);
            }

            out.println(answer);
        }

        static long compute(long x) {
            long answer = 0;
            if (x % 4 == 1 || x % 4 == 2) {
                answer += 1;
            }
            for (long bit = 2; bit <= x; bit *= 2) {
                long cur = x % (2 * bit);
                if (cur >= bit && cur % 2 == 0) {
                    answer += bit;
                }
            }
            return answer;
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

    }
}

