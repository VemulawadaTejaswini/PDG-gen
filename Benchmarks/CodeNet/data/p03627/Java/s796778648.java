import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
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
        CMakeARectangle solver = new CMakeARectangle();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMakeARectangle {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            HashSet<Long> seen = new HashSet<>();
            PriorityQueue<Long> max = new PriorityQueue<>(Comparator.reverseOrder());

            for (int i = 0; i < n; i++) {
                long a = in.nextInt();
                if (seen.contains(a)) {
                    max.add(a);
                    seen.remove(a);
                } else {
                    seen.add(a);
                }
            }

            long answer = max.size() >= 2 ? max.poll() * max.poll() : 0;

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

