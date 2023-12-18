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
        BAcCepted solver = new BAcCepted();
        solver.solve(1, in, out);
        out.close();
    }

    static class BAcCepted {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            boolean answer = valid(s);

            out.println(answer ? "AC" : "WA");
        }

        private boolean valid(String s) {
            if (s.charAt(0) != 'A')
                return false;

            int c = 0;
            for (int i = 2; i <= (s.length() - 2); i++) {
                if (s.charAt(i) == 'C')
                    c++;
            }
            if (c != 1)
                return false;

            int notLower = 0;
            for (int i = 0; i < s.length(); i++) {
                if (!(s.charAt(i) <= 'z' && s.charAt(i) >= 'a'))
                    notLower++;
            }

            if (notLower != 2)
                return false;

            return true;
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

