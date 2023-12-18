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
        CSkolemXORTree solver = new CSkolemXORTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSkolemXORTree {
        private static final String NO = "No";
        private static final String YES = "Yes";
        StringBuilder sb = new StringBuilder();

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            int nice = n;
            while ((nice + 1) % 4 != 0) {
                nice--;
            }

            if (nice < 0) {
                out.println(NO);
                return;
            }

            int[] xorPrefix = new int[nice + 1];
            for (int i = 1; i <= nice; i++) {
                xorPrefix[i] = xorPrefix[i - 1] ^ i;
            }
            ASSERT(xorPrefix[nice] == 0);

            if (Integer.bitCount(nice + 1) == 1) {
                out.println(NO);
                return;
            }

            for (int i = 1; i + 1 <= nice; i++) {
                connect(i, i + 1);
                connect(n + i, n + i + 1);
            }
            connect(nice, n + 1);

            for (int i = nice + 1; i <= n; i++) {
                connect(nice, n + i);
                connect(i, i ^ nice);
            }

            out.println(YES);
            out.println(sb.toString());
        }

        private void connect(int i, int j) {
            sb.append(String.format("%d %d%n", i, j));
        }

        private static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
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

