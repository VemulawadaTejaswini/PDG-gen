import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        CSyntheticKadomatsu solver = new CSyntheticKadomatsu();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSyntheticKadomatsu {
        int[] l;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

            l = new int[n];
            for (int i = 0; i < n; i++) {
                l[i] = in.nextInt();
            }

            int answer = Integer.MAX_VALUE;

            for (int A = 1; A < (1 << n); A++) {
                for (int B = 1; B < (1 << n); B++) {
                    if ((A & B) != 0) {
                        continue;
                    }

                    for (int C = 1; C < (1 << n); C++) {
                        if ((A & C) != 0 || (B & C) != 0) {
                            continue;
                        }

                        int score = score(a, A) + score(b, B) + score(c, C);
                        answer = Math.min(answer, score);
                    }
                }
            }

            out.println(answer);
        }

        int score(int a, int comb) {
            for (int i = 0; i < l.length; i++) {
                if ((comb & (1 << i)) != 0) {
                    a -= l[i];
                }
            }

            return 10 * (Integer.bitCount(comb) - 1) + Math.abs(a);
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

