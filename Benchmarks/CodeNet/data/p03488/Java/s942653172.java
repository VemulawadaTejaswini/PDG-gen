import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        DFTRobot solver = new DFTRobot();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFTRobot {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            char[] s = in.next().toCharArray();
            int[] x = new int[2];
            x[0] = in.nextInt();
            x[1] = in.nextInt();

            List<Integer>[] steps = new List[2];
            steps[0] = new ArrayList<>();
            steps[1] = new ArrayList<>();

            int cur = 0, dir = 0;
            for (char c : s) {
                if (c == 'T') {
                    steps[dir].add(cur);
                    cur = 0;
                    dir = (dir + 1) % 2;
                } else {
                    cur++;
                }
            }
            steps[dir].add(cur);

            x[0] -= steps[0].get(0);
            steps[0].set(0, 0);

            boolean answer = true;
            for (int i = 0; i < 2; i++) {
                answer &= possible(steps[i], x[i]);
            }

            out.println(answer ? "Yes" : "No");
        }

        private static boolean possible(List<Integer> steps, int x) {
            HashSet<Integer> possible = new HashSet<>();
            possible.add(0);

            for (int s : steps) {
                HashSet<Integer> newPossible = new HashSet<>();
                for (int p : possible) {
                    newPossible.add(p + s);
                    newPossible.add(p - s);
                }
                possible = newPossible;
            }

            return possible.contains(x);
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

