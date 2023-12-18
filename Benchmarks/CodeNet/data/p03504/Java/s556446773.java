import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        Recording solver = new Recording();
        solver.solve(1, in, out);
        out.close();
    }

    static class Recording {
        int[] S;
        int[] T;
        int[] C;
        int[] SUM;
        int[] TT;
        int MAX = 100000;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int CH = in.nextInt();
            S = new int[2 * MAX + 2];
            T = new int[2 * MAX + 2];
            C = new int[2 * MAX + 2];
            SUM = new int[2 * MAX + 2];
            TT = new int[2 * MAX + 2];

            for (int i = 0; i < N; i++) {
                S[i] = in.nextInt();
                T[i] = in.nextInt();
                C[i] = in.nextInt();
            }

            for (int c = 1; c <= CH; c++) {
                Arrays.fill(TT, 0);
                for (int i = 0; i < N; i++) {
                    if (C[i] == c) {
                        TT[2 * S[i] - 1]++;
                        TT[2 * T[i]]--;
                    }
                }

                for (int i = 1; i < TT.length; i++) {
                    TT[i] += TT[i - 1];
                }

                for (int i = 0; i < TT.length; i++) {
                    if (TT[i] > 0) SUM[i]++;
                }
            }

            int ans = 0;
            for (int i = 0; i < SUM.length; i++) {
                ans = Math.max(ans, SUM[i]);
            }
            out.println(ans);
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

