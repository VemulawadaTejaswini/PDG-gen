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
        AKIBA solver = new AKIBA();
        solver.solve(1, in, out);
        out.close();
    }

    static class AKIBA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String base = "KIHBR";
            String base2 = "KIH";
            String base3 = "AA";
            String fin = "AKIHABARA";
            String s = in.next();

            String T = s.replaceAll("A", "");
            boolean ans = true;
            ans &= s.length() <= fin.length();
            ans &= base.equals(T);
            ans &= !s.contains(base3);
            ans &= s.contains(base2);

            out.println(ans ? "YES" : "NO");
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

