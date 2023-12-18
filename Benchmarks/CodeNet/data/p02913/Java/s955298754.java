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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EWhoSaysAPun solver = new EWhoSaysAPun();
        solver.solve(1, in, out);
        out.close();
    }

    static class EWhoSaysAPun {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();

            int answer = 0;
            for (int i = 0; i < n; i++) {
                int[] z = Strings.zAlgorithm(s, i);
                for (int j = 0; j < z.length; j++) {
                    answer = Math.max(answer, Math.min(j, z[j]));
                }
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

    static class Strings {
        private Strings() {
        }

        public static int[] zAlgorithm(char[] s, int offset) {
            int n = s.length - offset;
            int[] z = new int[n];
            z[0] = n;

            for (int i = 1, l = -1, r = -1; i < n; i++) {
                z[i] = r > i ? Math.min(r - i, z[i - l]) : 0;
                while (i + z[i] < n && s[offset + i + z[i]] == s[offset + z[i]])
                    z[i]++;
                if (i + z[i] > r) {
                    l = i;
                    r = i + z[i];
                }
            }
            return z;
        }

    }
}

