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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.nextString();

            if (s.equals("zyxwvutsrqponmlkjihgfedcba")) {
                out.println(-1);
                return;
            }

            if (s.length() < 26) {
                boolean[] b = new boolean[26];
                for (int i = 0; i < s.length(); i++) {
                    b[s.charAt(i) - 'a'] = true;
                }

                for (int i = 0; i < 26; i++) {
                    if (!b[i]) {
                        out.println(s + (char) ('a' + i));
                        return;
                    }
                }
            }

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(s.length() - 2 - i) < s.charAt(s.length() - 1 - i)) {
                    char c = s.charAt(s.length() - 1 - i);
                    for (int j = s.length() - 1 - i; j < s.length(); j++) {
                        if (s.charAt(j) > s.charAt(s.length() - 2 - i)) {
                            c = s.charAt(j);
                        }
                    }
                    out.println(s.substring(0, s.length() - 2 - i) + c);
                    return;
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

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

