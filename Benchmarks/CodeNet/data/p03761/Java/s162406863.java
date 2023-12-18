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
            String[] s = in.nextStringArray(n);

            int[] cnt = new int[26];
            for (int i = 0; i < s[0].length(); i++) {
                cnt[s[0].charAt(i) - 'a']++;
            }
            for (int i = 1; i < n; i++) {
                int[] tmp = new int[26];
                for (int j = 0; j < s[i].length(); j++) {
                    tmp[s[i].charAt(j) - 'a']++;
                }

                for (int j = 0; j < 26; j++) {
                    cnt[j] = Math.min(cnt[j], tmp[j]);
                }
            }

            String ans = "";
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < cnt[i]; j++) {
                    ans += (char) (i + 'a');
                }
            }

            out.println(ans);
        }

    }

    static class InputReader {
        private BufferedReader in;
        private StringTokenizer tok;

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

        public String[] nextStringArray(int n) {
            String[] res = new String[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextString();
            }
            return res;
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

