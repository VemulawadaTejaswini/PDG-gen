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
            String s = in.nextString();

            int[] wSum = new int[n + 1];
            int[] sSum = new int[n + 1];
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'W') {
                    wSum[i + 1] = 1;
                } else {
                    sSum[i + 1] = 1;
                }
            }
            for (int i = 0; i < n; i++) {
                wSum[i + 1] += wSum[i];
                sSum[i + 1] += sSum[i];
            }

            int min = n;
            for (int i = 0; i < n; i++) {
                int cnt = 0;
                cnt += wSum[i] - wSum[0];
                cnt += sSum[n] - sSum[i];

                min = Math.min(min, cnt);
            }

            out.println(min);
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

