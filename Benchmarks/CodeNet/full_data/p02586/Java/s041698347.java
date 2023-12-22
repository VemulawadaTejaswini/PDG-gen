import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int r = Integer.parseInt(tokenizer.nextToken());
        int c = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        long[][][] dp = new long[r][c][4];
        int[][] map = new int[r][c];
        for (int i = 0; i < k; i++) {
            tokenizer = new StringTokenizer(f.readLine());
            int r1 = Integer.parseInt(tokenizer.nextToken()) - 1;
            int c1 = Integer.parseInt(tokenizer.nextToken()) - 1;
            int v = Integer.parseInt(tokenizer.nextToken());
            map[r1][c1] = v;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i != 0) {
                    for (int l = 0; l < 4; l++) {
                        dp[i][j][0] =  Math.max(dp[i - 1][j][l], dp[i][j][0]);
                    }
                }
                if (j != 0) {
                    for (int l = 0; l < 4; l++) {
                        dp[i][j][l] = Math.max(dp[i][j - 1][l], dp[i][j][l]);
                    }
                }
                for (int l = 2; l >= 0; l--) {
                    if (dp[i][j][l] == 0 && l != 0) continue;
                    dp[i][j][l + 1] = Math.max(dp[i][j][l + 1], dp[i][j][l] + map[i][j]);
                }
            }
        }

        long max = 0;
        for (int i = 0; i < 4; i++) max = Math.max(max, dp[r - 1][c - 1][i]);

        /*
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(Arrays.toString(dp[i][j]) + " ");
            }
            System.out.println();
        } */

        out.println(max);

        out.close();
    }
}