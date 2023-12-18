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
            int n = in.nextInt();
            int[] a = in.nextIntArray(n);

            boolean pflg = false;
            boolean nflg = false;
            for (int i = 0; i < n; i++) {
                if (a[i] >= 0) pflg = true;
                if (a[i] <= 0) nflg = true;
            }

            int positive = 0;
            int negative = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > a[positive]) positive = i;
                if (a[i] < a[negative]) negative = i;
            }

            if (!pflg || -a[negative] > a[positive]) {
                out.println(2 * (n - 1));
                for (int i = 0; i < n; i++) {
                    if (i == negative) continue;
                    out.println((negative + 1) + " " + (i + 1));
                }
                for (int i = 0; i < n - 1; i++) {
                    out.println((n - i) + " " + (n - 1 - i));
                }
            } else {
                out.println(2 * (n - 1));
                for (int i = 0; i < n; i++) {
                    if (i == positive) continue;
                    out.println((positive + 1) + " " + (i + 1));
                }
                for (int i = 0; i < n - 1; i++) {
                    out.println((i + 1) + " " + (i + 2));
                }
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

        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

