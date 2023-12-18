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
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BBiteEating solver = new BBiteEating();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBiteEating {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int l = in.nextInt();
            long min = Integer.MAX_VALUE;
            boolean pos = true;
            long ans = 0;
            for (int i = 1; i <= n; i++) {
                ans += l + i - 1;
                if (Math.abs(l + i - 1) < min) {
                    min = Math.abs(l + i - 1);
                    if (l + i - 1 > 0) pos = true;
                    else pos = false;
                }
            }
            out.println(ans - (pos ? min : -1 * min));
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

