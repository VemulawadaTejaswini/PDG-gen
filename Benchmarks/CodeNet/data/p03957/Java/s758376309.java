import java.io.*;
import java.util.*;

/**
 * Created by fcdkbear on 15.10.16.
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        new Task().solve(in, out);
        out.close();
    }


    static class Task {

        int[][] precompute;
        int[][][] dp;
        boolean[][][] wasInState;
        int h,w;

        int r(int shift0, int shift1, int shift2) {

            if ((shift1 == h) && (shift2 == h) && (shift0 == h)) {
                return 0;
            }
            if (wasInState[shift0][shift1][shift2]) {
                return dp[shift0][shift1][shift2];
            }
            wasInState[shift0][shift1][shift2] = true;
            int res = Integer.MAX_VALUE;
            if (shift0 != h) {
                res = Math.min(res, precompute[0][shift0 - shift1 + h] + r(shift0 + 1, shift1, shift2));
            }
            if (shift1 != h) {
                res = Math.min(res, precompute[0][shift0 - shift1 + h] + precompute[1][shift1 - shift2 + h] + r(shift0, shift1 + 1, shift2));
            }
            if (shift2 != h) {
                res = Math.min(res, precompute[1][shift1 - shift2 + h] + r(shift0, shift1, shift2 + 1));
            }
            dp[shift0][shift1][shift2] = res;
            return res;
        }

        public void solve(InputReader in, PrintWriter out) {

            h = in.nextInt();
            w = in.nextInt();
            String[] painting = new String[h];
            for (int i = 0; i < h; ++i) {
                painting[i] = in.next();
            }
            precompute = new int[w - 1][h + h + 1];
            for (int i = 0; i + 1 < w; ++i) {
                for (int difference = -h; difference <= h; ++difference) {
                    for (int j = 0; j < h; ++j) {
                        int neighbourJ = j + difference;
                        if ((neighbourJ >= 0) && (neighbourJ < h) && (painting[j].charAt(i) == painting[neighbourJ].charAt(i + 1))) {
                            precompute[i][difference + h]++;
                        }
                    }
                }
            }

            dp = new int[h + 1][h + 1][h + 1];
            wasInState = new boolean[h + 1][h + 1][h + 1];
            int res = r(0,0,0);
            out.println(res);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

}
