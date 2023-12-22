import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FThreeVariablesGame solver = new FThreeVariablesGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class FThreeVariablesGame {
        PrintWriter out;
        int[] a;
        List<Integer> moves;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            int n = in.nextInt();
            a = in.readIntArray(3);
            moves = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                boolean valid = process(in.next());
                if (!valid) {
                    out.println("No");
                    return;
                }
            }

            out.println("Yes");
            for (int s : moves) {
                out.println("ABC".charAt(s));
            }
        }

        private boolean process(String s) {
            if (s.equals("AB")) {
                return process(0, 1);
            } else if (s.equals("BC")) {
                return process(1, 2);
            } else {
                return process(0, 2);
            }
        }

        private boolean process(int i, int j) {
            if (a[i] <= 0 && a[j] <= 0) {
                return false;
            }
            if (a[i] < a[j]) {
                int t = i;
                i = j;
                j = t;
            }
            a[i]--;
            a[j]++;
            Util.ASSERT(a[i] >= 0);
            moves.add(i);
            return true;
        }

    }

    static class Util {
        public static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
        }

        private Util() {
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

        public int[] readIntArray(int n) {
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextInt();
            }
            return x;
        }

    }
}

