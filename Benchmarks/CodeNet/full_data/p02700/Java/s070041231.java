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
        BBattle solver = new BBattle();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBattle {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int[] hp = new int[2];
            int[] str = new int[2];

            for (int i = 0; i < 2; i++) {
                hp[i] = in.nextInt();
                str[i] = in.nextInt();
            }

            int i = 0;
            int j = 1;
            while (true) {
                j = 1 - i;

                hp[j] -= str[i];
                if (hp[j] <= 0) {
                    if (i == 0) {
                        out.println("Yes");
                    } else {
                        out.println("No");
                    }
                    return;
                }

                i++;
                i %= 2;
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

