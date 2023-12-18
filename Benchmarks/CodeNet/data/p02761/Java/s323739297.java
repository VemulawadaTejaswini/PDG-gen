import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGuessTheNumber solver = new CGuessTheNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGuessTheNumber {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int a[] = new int[n];
            Arrays.fill(a, -1);
            for (int i = 0; i < m; i++) {
                int p = in.nextInt() - 1;
                int q = in.nextInt();
                if (p >= n) {
                    out.println(-1);
                    return;
                }
                if (a[p] != -1 && a[p] != q) {
                    out.println(-1);
//                out.println("here" +a[p] +  " " + m);
                    return;
                }
                a[p] = q;
            }
            int ans = 0;
            int j = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] == -1 && i == 0) a[i] = 1;
                if (a[i] == -1) a[i] = 0;
                ans = ans * 10 + a[i];
            }
            if (Integer.toString(ans).length() != n) {
                out.println(-1);
                return;
            }
            out.println(ans);
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

    }
}

