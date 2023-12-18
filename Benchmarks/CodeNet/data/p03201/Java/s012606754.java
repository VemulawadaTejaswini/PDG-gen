import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
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
        BPowersOfTwo solver = new BPowersOfTwo();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPowersOfTwo {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            Long[] a = new Long[n];
            HashMap<Long, Integer> count = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = (long) in.nextInt();
                count.put(a[i], count.getOrDefault(a[i], 0) + 1);
            }

            int answer = 0;
            Arrays.sort(a, Comparator.reverseOrder());
            for (int i = 0; i < n; i++) {
                if (count.getOrDefault(a[i], 0) == 0) {
                    continue;
                }
                long powerOfTwo = Long.highestOneBit(a[i]) * 2;
                long remaining = powerOfTwo - a[i];
                if (remaining != a[i]) {
                    if (count.getOrDefault(remaining, 0) > 0) {
                        count.put(remaining, count.get(remaining) - 1);
                        count.put(a[i], count.get(a[i]) - 1);
                        answer++;
                    }
                } else {
                    if (count.get(a[i]) >= 2) {
                        count.put(a[i], count.get(a[i]) - 2);
                        answer++;
                    }
                }
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

