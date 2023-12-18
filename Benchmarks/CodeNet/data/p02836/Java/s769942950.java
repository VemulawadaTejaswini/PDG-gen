import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedInputStream;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BPalindromePhilia solver = new BPalindromePhilia();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPalindromePhilia {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            int ans = 0;
            int i = 0, j = s.length - 1;
            while (i < j) {
                if (s[i] != s[j]) {
                    ++ans;
                }
                ++i;
                --j;
            }
            out.println(ans);
        }

    }

    static class InputReader {
        private StringTokenizer st;
        private BufferedReader reader;

        public InputReader(InputStream is) {
            st = null;
            reader = new BufferedReader(new InputStreamReader(new BufferedInputStream(is, 1 << 18)));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

    }
}

