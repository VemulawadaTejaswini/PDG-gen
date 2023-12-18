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
 * @author Abhas Jain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CDifferBy1Bit solver = new CDifferBy1Bit();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDifferBy1Bit {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.ni();
            long a = in.nl();
            long b = in.nl();
            long diff = a ^ b;
            int count = cnt(diff);
            //out.println(count);
            if (count % 2 == 0 || (1L << n) < count) {
                out.print("NO");
            } else {
                out.println("YES");
                long pr = a;
                out.print(pr + " ");
                long times = (1L << n) - 1L;
                for (int i = 32; i >= 0; --i) {
                    if (((1L << i) & diff) != 0) {
                        pr ^= (1L << i);
                        out.print(pr + " ");
                        times--;
                    }
                }
                while (times != 0) {
                    pr ^= (1);
                    out.print(pr + " ");
                    times--;
                }
            }
        }

        int cnt(long val) {
            int ret = 0;
            for (int i = 32; i >= 0; --i) {
                if (((1L << i) & val) != 0) {
                    ret++;
                }
            }
            return ret;
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

        public int ni() {
            return Integer.parseInt(next());
        }

        public long nl() {
            return Long.parseLong(next());
        }

    }
}

