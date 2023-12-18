import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ETree solver = new ETree();
        solver.solve(1, in, out);
        out.close();
    }

    static class ETree {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            String s = in.string();
            if (s.charAt(0) == '0' || !new StringBuilder("0" + s).reverse().toString().equals("0" + s)) {
                out.println(-1);
                return;
            }
            int anc = s.length();
            for (int i = s.length() - 1; i > 0; i--) {
                out.print(i);
                out.print(' ');
                out.println(anc);
                if (s.charAt(i - 1) == '1') {
                    anc = i;
                }
            }
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

    }
}

