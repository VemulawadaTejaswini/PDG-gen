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
        CStrawberryCakes solver = new CStrawberryCakes();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStrawberryCakes {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt();
            int k = in.nextInt();
            int[][] s = new int[h][w];
            for (int i = 0; i < h; i++) {
                char[] row = in.next().toCharArray();
                for (int j = 0; j < w; j++) {
                    s[i][j] = (row[j] == '#') ? 1 : 0;
                }
            }

            int[] count = new int[h];
            for (int i = 0; i < h; i++) {
                for (int x : s[i])
                    count[i] += x;
            }

            int[][] answer = new int[h][w];
            int p = 1;
            for (int i = 0; i < h; i++) {
                if (count[i] > 0) {
                    int c = 0;
                    for (int j = 0; j < w; j++) {
                        answer[i][j] = p;
                        c += s[i][j];
                        if (s[i][j] > 0 && c < count[i]) {
                            p++;
                        }
                    }
                    if (c == count[i])
                        p++;
                }
            }

            for (int i = 1; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (answer[i][j] == 0) {
                        answer[i][j] = answer[i - 1][j];
                    }
                }
            }

            for (int i = h - 2; i >= 0; i--) {
                for (int j = 0; j < w; j++) {
                    if (answer[i][j] == 0) {
                        answer[i][j] = answer[i + 1][j];
                    }
                }
            }

            for (int[] row : answer) {
                out.println(Util.join(row));
            }
        }

    }

    static class Util {
        public static String join(int... i) {
            StringBuilder sb = new StringBuilder();
            for (int o : i) {
                sb.append(o);
                sb.append(" ");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
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

