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
        public static final String UNRESTORABLE = "UNRESTORABLE";

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.nextString();
            String t = in.nextString();

            if (t.length() > s.length()) {
                out.println(UNRESTORABLE);
                return;
            }

            int d = s.length() - t.length();
            out:
            for (int i = 0; i <= d; i++) {
                for (int j = 0; j < t.length(); j++) {
                    if (s.charAt(s.length() - 1 - i - j) == '?') continue;

                    if (s.charAt(s.length() - 1 - i - j) != t.charAt(t.length() - 1 - j)) continue out;
                }

                char[] ans = new char[s.length()];
                for (int j = 0; j < s.length(); j++) {
                    if (s.length() - t.length() - i <= j && j < s.length() - i) {
                        ans[j] = t.charAt(j - (s.length() - t.length() - i));
                    } else {
                        if (s.charAt(j) == '?') {
                            ans[j] = 'a';
                        } else {
                            ans[j] = s.charAt(j);
                        }
                    }
                }
                out.println(String.valueOf(ans));
                return;
            }

            out.println(UNRESTORABLE);
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

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

