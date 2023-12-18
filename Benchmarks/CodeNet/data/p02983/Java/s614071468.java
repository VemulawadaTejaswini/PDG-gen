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
        CRemainderMinimization2019 solver = new CRemainderMinimization2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class CRemainderMinimization2019 {
        static final int M = 2019;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long l = in.nextLong(), r = in.nextLong();

            r = Math.min(r, l + 2100);

            long answer = Integer.MAX_VALUE;
            for (long i = l; i <= r; i++) {
                for (long j = i + 1; j <= r; j++) {
                    long c = ((i % M) * (j % M)) % M;
                    answer = Math.min(answer, c);
                }
            }

            out.println(answer);
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

