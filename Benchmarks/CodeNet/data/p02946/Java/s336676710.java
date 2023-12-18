import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BOneClue solver = new BOneClue();
        solver.solve(1, in, out);
        out.close();
    }

    static class BOneClue {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int k = in.nextInt();
            int x = in.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            a.add(x);
            if (x - k + 1 >= -1000000)
                for (int i = 1; i <= k - 1; i++) {
                    a.add(x - i);
                }
            if (x + k - 1 <= 1000000)
                for (int i = 1; i <= k - 1; i++) {
                    a.add(x + i);
                }
            Collections.sort(a);
            for (int i = 0; i < a.size(); i++) {
                out.print(a.get(i) + " ");
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

