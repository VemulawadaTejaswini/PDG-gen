import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            if (n == 1) {
                if (a[0] == k) out.println("POSSIBLE");
                else out.println("IMPOSSIBLE");
                return;
            }
            Arrays.sort(a);
            int gcd = -1;
            int max = 0;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, a[i]);
                if (a[i] == k) {
                    out.println("POSSIBLE");
                    return;
                }
                if (i > 0) {
                    int temp = gcd(a[i], a[i - 1]);
                    if (gcd == -1) gcd = temp;
                    else gcd = gcd(temp, gcd);
                }

            }
            if (k % gcd == 0 && k <= max) out.println("POSSIBLE");
            else out.println("IMPOSSIBLE");
        }

        public int gcd(int a, int b) {
            if (b == 0) return a;
            return gcd(b, a % b);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
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

