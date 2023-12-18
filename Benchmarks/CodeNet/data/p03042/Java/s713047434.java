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
 * @author deepanshu
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BYYMMOrMMYY solver = new BYYMMOrMMYY();
        solver.solve(1, in, out);
        out.close();
    }

    static class BYYMMOrMMYY {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            int firstpart = Integer.parseInt(s.substring(0, 2));
            int secondpart = Integer.parseInt(s.substring(2));
            if ((firstpart > 12 || firstpart == 00) && (secondpart <= 12 && secondpart >= 1))
                out.println("YYMM");

            else if ((firstpart <= 12 && firstpart >= 1) && (secondpart > 12 || secondpart == 0))
                out.println("MMYY");

            else if ((firstpart <= 12 && firstpart >= 1) && (secondpart <= 12 && secondpart >= 1))
                out.println("AMBIGUOUS");
            else
                out.println("NA");
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

