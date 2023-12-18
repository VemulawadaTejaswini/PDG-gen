import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Optional;
import java.io.BufferedReader;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            Map<String, Integer> map = new TreeMap<>();

            {
                int n = in.nextInt();
                for (int i = 0; i < n; i++) {
                    String s = in.nextString();
                    map.merge(s, 1, Integer::sum);
                }
            }

            {
                int n = in.nextInt();
                for (int i = 0; i < n; i++) {
                    String s = in.nextString();
                    map.merge(s, -1, Integer::sum);
                }
            }

            out.println(Math.max(0, map.values().stream().max(Integer::compareTo).get()));
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

