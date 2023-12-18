import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Random;
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
        EMajorityOfBalls solver = new EMajorityOfBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMajorityOfBalls {
        InputReader in;
        PrintWriter out;
        int n;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.in = in;
            this.out = out;

            n = in.nextInt();

            int[] score = new int[2 * n];
            for (int i = 0; i < 210; i++) {
                int[] r = random();
                int s = query(r) ? 1 : 0;
                for (int j : r) {
                    score[j] += s;
                }
            }
            double avg = 0;
            for (int x : score)
                avg += x;
            avg /= (2 * n);
            boolean[] answer = new boolean[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                answer[i] = score[i] > avg;
            }
            printAnswer(answer);
        }

        private int[] random() {
            int[] r = new int[2 * n];
            for (int i = 0; i < r.length; i++) {
                r[i] = i;
            }
            Util.shuffle(r);
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = r[i];
            }
            return result;
        }

        private void printAnswer(boolean[] red) {
            StringBuilder output = new StringBuilder();
            output.append("! ");
            for (boolean b : red) {
                output.append(b ? 'R' : 'B');
            }
            out.println(output);
            out.flush();
        }

        private boolean query(int[] ints) {
            StringBuilder output = new StringBuilder();
            output.append("? ");
            for (int x : ints) {
                output.append(x + 1);
                output.append(' ');
            }
            output.deleteCharAt(output.length() - 1);
            out.println(output);
            out.flush();
            String s = in.next();
            return s.equals("Red");
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

    static class Util {
        public static void shuffle(int[] x) {
            Random r = new Random();

            for (int i = 0; i <= x.length - 2; i++) {
                int j = i + r.nextInt(x.length - i);
                swap(x, i, j);
            }
        }

        public static void swap(int[] x, int i, int j) {
            int t = x[i];
            x[i] = x[j];
            x[j] = t;
        }

    }
}

