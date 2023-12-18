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
        DLamp solver = new DLamp();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLamp {
        boolean[][] blocked;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt();

            blocked = new boolean[h + 2][w + 2];
            for (int i = 1; i <= h; i++) {
                char[] s = in.next().toCharArray();
                for (int j = 1; j <= w; j++) {
                    blocked[i][j] = (s[j - 1] == '#');
                }
            }

            h += 2;
            w += 2;

            for (int i = 0; i < h; i++) {
                blocked[i][0] = true;
                blocked[i][w - 1] = true;
            }
            for (int j = 0; j < w; j++) {
                blocked[0][j] = true;
                blocked[h - 1][j] = true;
            }

            int[][] horiz = new int[h][w];
            for (int i = 0; i < h; i++) {
                int leftBlock = 0;
                for (int j = 1; j < w; j++) {
                    if (!blocked[i][j]) {
                        horiz[i][j] = leftBlock;
                    } else {
                        horiz[i][leftBlock] = j;
                        leftBlock = j;
                    }
                }
            }
            int[][] vert = new int[h][w];
            for (int j = 0; j < w; j++) {
                int topBlock = 0;
                for (int i = 1; i < h; i++) {
                    if (!blocked[i][j]) {
                        vert[i][j] = topBlock;
                    } else {
                        vert[topBlock][j] = i;
                        topBlock = i;
                    }
                }
            }

//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < w; j++) {
//                out.print(horiz[i][j] + "\t");
//            }
//            out.println();
//        }
//        for (int i = 0; i < h; i++) {
//            for (int j = 0; j < w; j++) {
//                out.print(vert[i][j] + "\t");
//            }
//            out.println();
//        }

            int answer = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (blocked[i][j]) continue;
                    int score = 0;
                    int leftBlock = horiz[i][j];
                    score += (horiz[i][leftBlock] - leftBlock) - 1;
                    int topBlock = vert[i][j];
                    score += (vert[topBlock][j] - topBlock) - 1;
                    score -= 1;
                    answer = Math.max(answer, score);
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

