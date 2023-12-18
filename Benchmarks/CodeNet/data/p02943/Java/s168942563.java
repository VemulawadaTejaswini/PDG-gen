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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            String s = in.next();
            String t = s + reverse(s);
            String res = "" + ((char) ('z' + 1));
            if (k == 1) {
                for (int i = 0; i <= n; ++i) {
                    String cur = t.substring(i, i + n);
                    if (cur.compareTo(res) < 0) res = cur;
                }
                out.println(res);
                return;
            }
            char minLetter = s.charAt(0);
            for (char c : s.toCharArray()) if (c < minLetter) minLetter = c;
            int maxCount = 0;
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == minLetter) {
                    ++count;
                    maxCount = Math.max(maxCount, count);
                } else {
                    count = 0;
                }
            }
            maxCount = Math.max(maxCount, count * 2);
            int finalCount = maxCount;
            for (int stage = 1; stage < k; ++stage) {
                finalCount *= 2;
                if (finalCount >= n) {
                    StringBuilder b = new StringBuilder();
                    for (int i = 0; i < n; ++i) b.append(minLetter);
                    out.println(b.toString());
                    return;
                }
            }
            count = 0;
            for (int i = 0; i < n; ++i) {
                char c = s.charAt(i);
                if (c == minLetter) {
                    ++count;
                } else {
                    count = 0;
                }
                if (count == maxCount) {
                    int tailPos = 2 * n - (i + 1);
                    String cur = reverse(t.substring(tailPos - (n - finalCount), tailPos));
                    if (cur.compareTo(res) < 0) {
                        res = cur;
                    }
                }
            }
            if (count * 2 == maxCount) {
                int tailPos = n - count;
                String cur = reverse(t.substring(tailPos - (n - finalCount), tailPos));
                if (cur.compareTo(res) < 0) {
                    res = cur;
                }
            }
            StringBuilder b = new StringBuilder();
            for (int i = 0; i < finalCount; ++i) b.append(minLetter);
            b.append(res);
            out.println(b.toString());
        }

        private String reverse(String s) {
            StringBuilder b = new StringBuilder(s);
            b.reverse();
            return b.toString();
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

