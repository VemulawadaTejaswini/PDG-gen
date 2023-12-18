import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        BGCDSequence solver = new BGCDSequence();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGCDSequence {
        static final int m = 30;
        static final int BOUND = 30000;
        static final int[] initial = {5, 9, 16};
        static final int[] allowed = {2, 3, 4, 5, 6, 8, 9, 10, 12, 14};

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            List<Integer> answer = solve(n);

            StringBuilder sb = new StringBuilder();
            for (int x : answer) {
                sb.append(x + " ");
            }
            sb.deleteCharAt(sb.length() - 1);

            out.println(sb);
        }

        private static List<Integer> solve(int n) {
            int remaining = n;

            List<Integer> answer = new ArrayList<>(n);
            for (int x : initial) {
                answer.add(x);
                remaining--;
            }

            for (int mult = 3; mult * m <= BOUND && remaining > 0; mult++) {
                answer.add(mult * m);
                remaining--;
            }

            if (remaining % 2 == 1) {
                answer.add(m);
                remaining--;
            }

            int mult = 2;
            int next = 0;
            while (remaining > 0) {
                answer.add(mult * m + allowed[next]);
                answer.add(mult * m + (m - allowed[next]));
                remaining -= 2;
                next++;

                if (next == allowed.length) {
                    mult++;
                    next = 0;
                }
            }

            return answer;
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

