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
        AKenKenRace solver = new AKenKenRace();
        solver.solve(1, in, out);
        out.close();
    }

    static class AKenKenRace {
        static final String YES = "Yes";
        static final String NO = "No";
        static final char ROCK = '#';

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            int a = in.nextInt() - 1, b = in.nextInt() - 1, c = in.nextInt() - 1, d = in.nextInt() - 1;

            char[] s = in.next().toCharArray();

            for (int i = a; i + 1 < c; i++) {
                if (s[i] == ROCK && s[i + 1] == ROCK) {
                    out.println(NO);
                    return;
                }
            }
            for (int i = b; i + 1 < d; i++) {
                if (s[i] == ROCK && s[i + 1] == ROCK) {
                    out.println(NO);
                    return;
                }
            }

            if (c < d) {
                out.println(YES);
                return;
            }

            for (int i = b; i <= d; i++) {
                if (i - 1 >= 0 && i + 1 < n && s[i - 1] != ROCK && s[i] != ROCK && s[i + 1] != ROCK) {
                    out.println(YES);
                    return;
                }
            }

            out.println(NO);
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

