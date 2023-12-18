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
        DPreparingBoxes solver = new DPreparingBoxes();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPreparingBoxes {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++)
                a[i] = in.nextInt();

            int[] answer = new int[n + 1];

            for (int i = n; i >= 1; i--) {
                int tot = 0;
                for (int j = 2 * i; j <= n; j += i) {
                    tot ^= answer[j];
                }
                tot ^= a[i];
                answer[i] = tot;
            }

            int count = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (a[i] > 0) {
                    sb.append(i + " ");
                    count++;
                }
            }

            if (count == 0) {
                out.println(count);
            } else {
                sb.deleteCharAt(sb.length() - 1);
                out.println(count);
                out.println(sb);
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

