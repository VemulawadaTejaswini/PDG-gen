import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Set;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
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
        AKIBA solver = new AKIBA();
        solver.solve(1, in, out);
        out.close();
    }

    static class AKIBA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String dest = "AKIHABARA";
            String input = in.next();

            Set<String> possibleSources = new TreeSet<>();
            generate(dest, 0, "", possibleSources);

            out.println(possibleSources.contains(input) ? "YES" : "NO");
        }

        private void generate(String dest, int idx, String current, Set<String> possibleSources) {
            if (idx == dest.length()) {
                possibleSources.add(current);
            } else {
                if (dest.charAt(idx) == 'A') {
                    generate(dest, idx + 1, current, possibleSources);
                }
                generate(dest, idx + 1, current + dest.charAt(idx), possibleSources);
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

    }
}

