import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGoodSequence solver = new CGoodSequence();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGoodSequence {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int i = 0; i < n; i++) {
                count.merge(in.nextInt(), 1, Integer::sum);
            }
            int answer = 0;

            for (Map.Entry<Integer, Integer> e : count.entrySet()) {
                int key = e.getKey(), value = e.getValue();
                if (value - key >= 0 && value - key < value)
                    answer += value - key;
                else
                    answer += value;
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

