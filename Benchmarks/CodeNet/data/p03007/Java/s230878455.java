import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayDeque;
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
        CSuccessiveSubtraction solver = new CSuccessiveSubtraction();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSuccessiveSubtraction {
        PrintWriter out;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            solve(n, a);
        }

        private void solve(int n, int[] a) {
            if (n == 2) {
                int big = Math.max(a[0], a[1]);
                int small = Math.min(a[0], a[1]);
                out.println(big - small);
                print(big, small);

                return;
            }

            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            ArrayDeque<Integer> positive = new ArrayDeque<>();
            ArrayDeque<Integer> negative = new ArrayDeque<>();
            for (int x : a) {
                max = Math.max(max, x);
                min = Math.min(min, x);
                if (x > 0) {
                    positive.addLast(x);
                } else {
                    negative.addLast(x);
                }
            }
            if (negative.isEmpty()) {
                positive.removeFirstOccurrence(min);
                negative.addLast(min);
            } else if (positive.isEmpty()) {
                negative.removeFirstOccurrence(max);
                positive.addLast(max);
            }

            int sum = 0;
            for (int pos : positive)
                sum += pos;
            for (int neg : negative)
                sum -= neg;

            out.println(sum);

            while (positive.size() >= 2) {
                int pos = positive.pollLast();
                int neg = negative.pollLast();
                print(neg, pos);
                int newNeg = neg - pos;
                negative.addLast(newNeg);
            }

            ASSERT(positive.size() == 1);

            while (negative.size() > 0) {
                int pos = positive.pollLast();
                int neg = negative.pollLast();
                print(pos, neg);
                int newPos = pos - neg;
                positive.addLast(newPos);
            }

            ASSERT(positive.size() == 1);
            ASSERT(negative.size() == 0);
            ASSERT(positive.peek() == sum);
        }

        private void print(int x, int y) {
            out.format("%d %d%n", x, y);
        }

        private static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
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

