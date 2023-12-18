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
 * @author Tarek
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BPopularVote solver = new BPopularVote();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPopularVote {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int a[] = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                sum += a[i];
            }
            if (sum % 4 == 0) {
                long k = sum / (4 * m);
                int c = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] >= k) c++;
                }
                if (c >= m) out.println("Yes");
                else out.println("No");
            } else {
                long k = sum / (4 * m);
                k += 1;
                int c = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] >= k) c++;
                }
                if (c >= m) out.println("Yes");
                else out.println("No");
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

