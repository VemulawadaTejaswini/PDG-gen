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
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DHandstand solver = new DHandstand();
        solver.solve(1, in, out);
        out.close();
    }

    static class DHandstand {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), k = in.nextInt();
            int[] s = new int[n];
            String input = in.next();
            for (int i = 0; i < n; i++) {
                s[i] = input.charAt(i) == '0' ? -1 : 1;
            }

            List<Integer> runs = new ArrayList<>();
            int curSize = 1;
            for (int i = 1; i < n; i++) {
                if (s[i] != s[i - 1]) {
                    runs.add(curSize * s[i - 1]);
                    curSize = 0;
                }
                curSize++;
            }
            runs.add(curSize * s[n - 1]);

            long answer = 0;
            int i = 0, j = 0;
            int flips = 0;
            long length = 0;
            while (i < runs.size()) {
                if (j < runs.size() && (flips < k || runs.get(j) > 0)) {
                    length += Math.abs(runs.get(j));
                    if (runs.get(j) < 0)
                        flips++;
                    j++;
                } else {
                    length -= Math.abs(runs.get(i));
                    if (runs.get(i) < 0)
                        flips--;
                    i++;
                }
                answer = Math.max(answer, length);
            }

            out.println(answer);
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

