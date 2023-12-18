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
 * @author kessido
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AFairness solver = new AFairness();
        solver.solve(1, in, out);
        out.close();
    }

    static class AFairness {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long A = in.NextInt();
            long B = in.NextInt();
            long C = in.NextInt();
            long K = in.NextLong();
            if (K % 2 == 0) {
                out.println(A - B);
            } else {
                out.println(B - A);
            }
//      0  A                          B                        C
//      1  B+C                     A+C                     A + B
//      2  2A+B+C                 A+2B+C                   A+B+2C
//      3  2A+3B+3C               3A+2B+3C                 3A+3B+2C
//      4  6A+5B+5C               5A+6B+5C                 5A+5B+6C
//      5  10A+11B+11C            11A+10B+11C              11A+11B+10C
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(next());
        }

        public long NextLong() {
            return Long.parseLong(next());
        }

    }
}

