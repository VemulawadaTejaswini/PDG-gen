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
            int n = in.nextInt();
            String[] s = in.nextStringArray(3);

            int ans = 0;
            for (int i = 0; i < n; i++) {
                char c0 = s[0].charAt(i);
                char c1 = s[1].charAt(i);
                char c2 = s[2].charAt(i);
                if (c0 == c1 && c0 == c2) {

                } else if (c0 == c1 || c1 == c2 || c2 == c0) {
                    ans++;
                } else {
                    ans += 2;
                }
            }

            out.println(ans);
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

    }
}

