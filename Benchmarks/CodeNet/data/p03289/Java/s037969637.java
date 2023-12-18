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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.nextString();
            String wa = "WA";

            if (s.charAt(0) != 'A') {
                out.println(wa);
                return;
            }

            if (Character.isUpperCase(s.charAt(1))) {
                out.println(wa);
                return;
            }

            boolean flg = false;
            for (int i = 2; i < s.length(); i++) {
                if (s.charAt(i) == 'C') {
                    if (flg) {
                        out.println(wa);
                        return;
                    }
                    flg = true;
                } else if (Character.isUpperCase(s.charAt(i))) {
                    out.println(wa);
                    return;
                }
            }

            out.println(flg && s.charAt(s.length() - 1) != 'C' ? "AC" : wa);
        }

    }

    static class InputReader {
        private BufferedReader br;
        private StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            st = new StringTokenizer("");
        }

        public String nextString() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return st.nextToken();
        }

    }
}

