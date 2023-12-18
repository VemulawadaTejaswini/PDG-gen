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
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EDividingChocolate solver = new EDividingChocolate();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDividingChocolate {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            int k = in.nextInt();
            int a[][] = new int[h][w];
            for (int i = 0; i < h; i++) {
                String x = in.next();
                for (int j = 0; j < w; j++) {
                    a[i][j] = x.charAt(j) - '0';
                }
            }
            int ans = Integer.MAX_VALUE;
            for (int mask = 0; mask < 1 << (h - 1); mask++) {
                int flag = 1;
                int c = 0;
                int cuts = Integer.bitCount(mask);
                int temp[][] = new int[cuts + 1][w];
                for (int i = 0; i < h && flag > 0; i++) {
                    for (int j = 0; j < w; j++) {
                        if (a[i][j] == 1) {
                            temp[c][j]++;
                        }
                    }
                    if (((mask >> i) & 1) > 0) {
                        c++;
                    }
                }
                for (int i = 0; i <= c; i++) {
                    for (int l = 0; l < w; l++) {
//                    out.print(temp[i][l] +" ");
                        if (temp[i][l] > k) {
                            flag = 0;
                            break;
                        }
                    }
//                out.println();
                }
                int inc = 0;
                for (int l = 1; l < w; l++) {
                    inc = 1;
                    for (int i = 0; i <= c; i++) {
//                    out.print(temp[i][l] + temp[i][l-1] + " ");
                        if (temp[i][l] + temp[i][l - 1] > k) {
                            inc = 0;
                            cuts++;
                            break;
                        }
                    }
                    if (inc == 1) {
                        for (int i = 0; i <= c; i++) {
                            temp[i][l] += temp[i][l - 1];
                        }
                    }
                }
//            out.println();
                if (flag == 1) {
                    ans = Math.min(ans, cuts);
//                out.println(mask + " " + cuts);
                }
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

