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
        ETrBBnsformBBtion solver = new ETrBBnsformBBtion();
        solver.solve(1, in, out);
        out.close();
    }

    static class ETrBBnsformBBtion {
        static final char A = 'A';
        static final String YES = "YES";
        static final String NO = "NO";

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            char[] t = in.next().toCharArray();

            int[] sA = new int[s.length + 1];
            for (int i = 0; i < s.length; i++) {
                sA[i + 1] = sA[i];
                if (s[i] == A) {
                    sA[i + 1]++;
                }
            }
            int[] tA = new int[t.length + 1];
            for (int i = 0; i < t.length; i++) {
                tA[i + 1] = tA[i];
                if (t[i] == A) {
                    tA[i + 1]++;
                }
            }

            int q = in.nextInt();
            for (int query = 0; query < q; query++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                int c = in.nextInt() - 1;
                int d = in.nextInt() - 1;

                int sScore = (sA[b + 1] - sA[a]) * 2 - (b + 1 - a);
                int tScore = (tA[d + 1] - tA[c]) * 2 - (d + 1 - c);

                if ((sScore - tScore) % 3 == 0) {
                    out.println(YES);
                } else {
                    out.println(NO);
                }
            }
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

