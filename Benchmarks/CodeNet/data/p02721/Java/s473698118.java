import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
 * @author Vadim Semenov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Yutori solver = new Yutori();
        solver.solve(1, in, out);
        out.close();
    }

    static final class Yutori {
        public void solve(int __, InputReader in, PrintWriter out) {
            int days = in.nextInt();
            int workDays = in.nextInt();
            int holidays = in.nextInt();
            char[] calendar = in.next().toCharArray();
            int[] nextWorkDay = new int[days + 1];
            Arrays.fill(nextWorkDay, -1);
            for (int i = days - 1; i >= 0; --i) {
                if (calendar[i] == 'o') {
                    nextWorkDay[i] = i;
                } else {
                    nextWorkDay[i] = nextWorkDay[i + 1];
                }
            }
            int[] dp = new int[days + 1];
            for (int i = days - 1; i >= 0; --i) {
                if (calendar[i] == 'o') {
                    dp[i] = 1;
                    int j = i + 1 + holidays;
                    j = j < nextWorkDay.length ? nextWorkDay[j] : -1;
                    if (j != -1) {
                        dp[i] += dp[j];
                    }
                }
            }
            List<Integer> candidates = new ArrayList<>(workDays);
            int current = nextWorkDay[0];
            while (current != -1) {
                candidates.add(current);
                current += 1 + holidays;
                current = current >= nextWorkDay.length ? -1 : nextWorkDay[current];
            }
            if (candidates.size() < workDays) {
                throw new AssertionError("POLUNDRA");
            }
            if (candidates.size() > workDays) {
                return;
            }
            for (int day : candidates) {
                int next = nextWorkDay[day + 1];
                if (next == -1 || dp[day] > dp[next]) {
                    out.println(day + 1);
                }
            }
        }

    }

    static class InputReader {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(readLine());
            }
            return tokenizer.nextToken();
        }

        public String readLine() {
            String line;
            try {
                line = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return line;
        }

    }
}

