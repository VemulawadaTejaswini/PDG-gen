import java.io.*;
import java.util.*;

public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) {
        FastReader scanner = new FastReader();
        int N = scanner.nextInt();
        int W = scanner.nextInt();

        int[] wt = new int[N];
        int[] val = new int[N];

        for (int i = 0; i < N; i++) {
            wt[i] = scanner.nextInt();
            val[i] = scanner.nextInt();
        }
        long[][] DP = new long[2][W + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= W; j++) {
                if (wt[i - 1] <= j) {
                    DP[1][j] = Math.max(DP[0][j], DP[0][j - wt[i - 1]] + val[i - 1]);
                } else {
                    DP[1][j] = DP[0][j];
                }
            }
            if (W >= 0) System.arraycopy(DP[1], 1, DP[0], 1, W);
        }
        System.out.println(DP[1][W]);
    }
}