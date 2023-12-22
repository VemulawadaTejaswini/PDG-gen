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
        DIHateFactorization solver = new DIHateFactorization();
        solver.solve(1, in, out);
        out.close();
    }

    static class DIHateFactorization {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int x = in.nextInt();
            long ans = x - 1;
            int y = 5;
            int k = 0;
            for (int c = 0; c < x; c++) {
                if (power(c, y) == ans) {
                    k = c;
                    break;
                }
            }
            out.println(k + " " + "-1");
        }

        public static int power(int x, int y) {
            int temp;
            if (y == 0)
                return 1;
            temp = power(x, y / 2);

            if (y % 2 == 0)
                return temp * temp;
            else {
                if (y > 0)
                    return x * temp * temp;
                else
                    return (temp * temp) / x;
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

