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
 * @author rizhiy
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[] d = new int[n];
            d[0] = Math.abs(a[0]);
            for (int i = 1; i < n; i++) {
                d[i] = d[i - 1] + Math.abs(a[i] - a[i - 1]);
            }
            int[] dn = new int[n];
            dn[n - 1] = Math.abs(a[n - 1]);
            for (int i = n - 2; i >= 0; i--) {
                dn[i] = dn[i + 1] + Math.abs(a[i] - a[i + 1]);
            }
//        out.println();
            int[] d2 = new int[n];
            d2[0] = a[0];
            d2[1] = a[1];
            for (int i = 2; i < n; i++) {
                d2[i] = Math.abs(a[i - 2] - a[i]);
            }
            out.println(dn[1] + Math.abs(a[1]));
            for (int i = 1; i < n - 1; i++) {
                int answ = 0;
                answ += d[i - 1];
                answ += dn[i + 1];
//            answ += d[n - 1] - d[i + 1] + Math.abs(a[n - 1]);
                answ += d2[i + 1];
                out.println(answ);
            }
            out.println(d[n - 2] + Math.abs(a[n - 2]));

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

