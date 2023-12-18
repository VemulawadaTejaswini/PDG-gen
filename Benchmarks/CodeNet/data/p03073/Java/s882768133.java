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
        CColoringColorfully solver = new CColoringColorfully();
        solver.solve(1, in, out);
        out.close();
    }

    static class CColoringColorfully {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            boolean fl = true;
            int changes1 = 0, changes2 = 0;
            for (int i = 0, l = s.length(); i < l; i++, fl = !fl) {
                char cur = s.charAt(i);
                if (fl) {
                    if (cur == '0')
                        changes1++;
                    else
                        changes2++;
                } else {
                    if (cur == '1')
                        changes1++;
                    else
                        changes2++;
                }
            }
            out.println(Math.min(changes1, changes2));
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