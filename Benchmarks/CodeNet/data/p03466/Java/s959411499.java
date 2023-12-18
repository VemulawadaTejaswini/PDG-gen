import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author amotoma3
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int q = in.nextInt();
            int[] a = new int[q];
            int[] b = new int[q];
            int[] c = new int[q];
            int[] d = new int[q];
            for (int i = 0; i < q; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
                c[i] = in.nextInt() - 1;
                d[i] = in.nextInt() - 1;
            }

            for (int i = 0; i < q; i++) {
                int max = Math.max(a[i], b[i]);
                int min = Math.min(a[i], b[i]);
                int k = (max + min) / (min + 1);

                StringBuilder sb = new StringBuilder();
                int cnt = 0;
                for (int j = 0; j < min + max; j++) {
                    if (a[i] > 0 && cnt < k && b[i] < (a[i] + 1) * k) {
                        a[i]--;
                        sb.append("A");
                        cnt++;
                    } else {
                        b[i]--;
                        sb.append("B");
                        cnt = 0;
                    }
                }

                out.println(sb.toString().substring(c[i], d[i] + 1));
            }
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

