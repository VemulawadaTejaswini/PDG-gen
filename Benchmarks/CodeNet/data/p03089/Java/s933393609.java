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
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ALimitedInsertion solver = new ALimitedInsertion();
        solver.solve(1, in, out);
        out.close();
    }

    static class ALimitedInsertion {

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(in.nextInt());
            }
            int[] ans = new int[n];
            for (int t = n - 1; t >= 0; t--) {
                boolean found = false;
                for (int i = a.size() - 1; i >= 0; i--) {
                    if (a.get(i) == i + 1) {
                        ans[t] = a.get(i);
                        a.remove(i);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    out.println(-1);
                    return;
                }
            }
            for (int i = 0; i < n; i++) {
                out.print(ans[i]);
                out.print(' ');
            }
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

