import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.io.IOException;
import java.util.Deque;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.ArrayDeque;
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
        CPushpush solver = new CPushpush();
        solver.solve(1, in, out);
        out.close();
    }

    static class CPushpush {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            Deque<Integer> deque = new ArrayDeque<>();

            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                if (i % 2 == 0) {
                    deque.addLast(a);
                } else {
                    deque.addFirst(a);
                }
            }

            StringBuilder sb = new StringBuilder();
            if (n % 2 == 1) {
                while (!deque.isEmpty()) {
                    sb.append(deque.pollLast() + " ");
                }
            } else {
                while (!deque.isEmpty()) {
                    sb.append(deque.pollFirst() + " ");
                }
            }
            sb.deleteCharAt(sb.length() - 1);

            out.println(sb);
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

