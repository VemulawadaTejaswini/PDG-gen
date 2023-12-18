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
        TAskC solver = new TAskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TAskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int a = 0;
            out.println(a);
            out.flush();
            String sa = in.next();
            if (sa.equals("Vacant")) return;
            int b = n / 2;
            out.println(b);
            out.flush();
            String sb = in.next();
            if (sb.equals("Vacant")) return;
            if (((b - a) % 2 == 0) ^ (sa.equals(sb))) {
                // do nothing
            } else {
                a = b;
                b = n;
                String t = sa;
                sa = sb;
                sb = t;
            }
            while (true) {
                int c = (a + b) / 2;
                out.println(c);
                out.flush();
                String sc = in.next();
                if (sc.equals("Vacant")) return;
                if (((c - a) % 2 == 0) ^ (sa.equals(sc))) {
                    b = c;
                    sb = sc;
                } else {
                    a = c;
                    sa = sc;
                }
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

