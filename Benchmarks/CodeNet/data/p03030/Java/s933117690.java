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
        BGuidebook solver = new BGuidebook();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGuidebook {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            BGuidebook.R[] r = new BGuidebook.R[n];
            for (int i = 0; i < n; i++) {
                String name = in.next();
                int score = in.nextInt();
                r[i] = new BGuidebook.R(score, name, i + 1);
            }

            Arrays.sort(r);

            for (BGuidebook.R x : r) {
                out.println(x.i);
            }
        }

        static class R implements Comparable<BGuidebook.R> {
            final int score;
            final String name;
            final int i;

            R(int score, String name, int i) {
                this.score = score;
                this.name = name;
                this.i = i;
            }

            public int compareTo(BGuidebook.R o) {
                if (!name.equals(o.name)) {
                    return name.compareTo(o.name);
                }
                return -Integer.compare(score, o.score);
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

