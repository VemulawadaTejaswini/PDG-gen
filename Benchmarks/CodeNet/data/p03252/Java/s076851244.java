import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
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
            int[] s = in.nextString().chars().map(c -> c - 'a').toArray();
            int[] t = in.nextString().chars().map(c -> c - 'a').toArray();

            int[] map = new int[26];
            int[] rev = new int[26];
            Arrays.fill(map, -1);
            Arrays.fill(rev, -1);
            for (int i = 0; i < s.length; i++) {
                if (map[s[i]] == -1) {
                    map[s[i]] = t[i];
                } else {
                    if (map[s[i]] != t[i]) {
                        out.println("No");
                        return;
                    }
                }

                if (rev[t[i]] == -1) {
                    rev[t[i]] = s[i];
                } else {
                    if (rev[t[i]] != s[i]) {
                        out.println("No");
                        return;
                    }
                }
            }

            out.println("Yes");
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

