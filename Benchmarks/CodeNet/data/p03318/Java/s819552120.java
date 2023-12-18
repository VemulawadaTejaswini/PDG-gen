import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
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
        DSnukeNumbers solver = new DSnukeNumbers();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSnukeNumbers {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int k = in.nextInt();

            long[] answer = new long[k];
            int index = 0;
            long nines = 0;

            HashSet<Long> seen = new HashSet<>();

            outer:
            while (true) {
                long tens = nines + 1;
                for (int i = 1; ; i++) {
                    long candidate = tens * i + nines;
                    long opponent = tens * (i + 1) + nines;
                    if (isSnukier(candidate, opponent)) {
                        if (!seen.contains(candidate)) {
                            seen.add(candidate);
                            answer[index++] = candidate;
                            if (index == k) {
                                break outer;
                            }
                        }
                    } else {
                        break;
                    }
                }

                nines = nines * 10 + 9;
            }

            for (long x : answer) {
                out.println(x);
            }
        }

        static boolean isSnukier(long n, long other) {
            return (other * S(n) >= n * S(other));
        }

        static long S(long n) {
            long sum = 0;
            for (char c : Long.toString(n).toCharArray()) {
                sum += c - '0';
            }
            return sum;
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

