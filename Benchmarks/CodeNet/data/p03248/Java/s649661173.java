import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ETree solver = new ETree();
        solver.solve(1, in, out);
        out.close();
    }

    static class ETree {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            int n = s.length;
            boolean[] comp = new boolean[n];
            for (int i = 0; i < n; i++) {
                comp[i] = (s[i] == '1');
            }
            if (comp[n - 1]) {
                out.println(-1);
                return;
            }
            if (n == 2) {
                if (comp[0]) {
                    out.println("1 2");
                } else {
                    out.println(-1);
                }
                return;
            }
            if (!comp[n - 2] || !comp[0]) {
                out.println(-1);
                return;
            }
            for (int i = 0; i < n - 1; i++) {
                if (comp[i] != comp[n - 2 - i]) {
                    out.println(-1);
                    return;
                }
            }
            int prev = 2;
            out.println("1 2");
            for (int i = 1; i < n - 1; i++) {
                out.print(prev);
                out.print(" ");
                out.println(i + 2);
                if (comp[i]) {
                    prev = i;
                }
            }
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

    }
}

