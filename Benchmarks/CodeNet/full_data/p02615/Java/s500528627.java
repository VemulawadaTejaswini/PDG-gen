import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Problem solver = new Problem();
        solver.solve(0, in, out);
        out.close();
    }

    static class Problem {

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int[] players = new int[N];
            for (int i = 0; i < N; i++)
                players[i] = in.nextInt();

            if(N == 0) {
                out.println(0);
                return;
            }

            if(N == 1) {
                out.println(players[0]);
                return;
            }

            Arrays.sort(players);
            long maxComfort = players[players.length - 1];
          	int i = players.length - 2;
            N -= 2;
            while (N > 0) {
                maxComfort += 2 * players[i];
                N -= 2;
                i--;
            }

            if(N == -1) {
                maxComfort -= players[i + 1];
            }

            out.println(maxComfort);

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

