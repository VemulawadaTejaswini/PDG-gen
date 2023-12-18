import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        CSameIntegers solver = new CSameIntegers();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSameIntegers {
        static final int three = 3;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int[] x = new int[three];
            for (int i = 0; i < three; i++) {
                x[i] = in.nextInt();
            }

            Arrays.sort(x);
            int answer = 0;
            while (x[0] != x[2]) {
                if (x[2] == x[1]) {
                    x[0] += 2;
                } else {
                    x[0]++;
                    x[1]++;
                }
                answer++;
                Arrays.sort(x);
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
}

