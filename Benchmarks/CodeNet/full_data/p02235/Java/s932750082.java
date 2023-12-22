import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < q; i++) {
            char[] X = br.readLine().toCharArray();
            char[] Y = br.readLine().toCharArray();
            sb.append(LCS(X, Y));
            sb.append('\n');
        }

        System.out.print(sb);
    }

    private static int LCS(char[] X, char[] Y) {
        int m = X.length;
        int n = Y.length;
        int i, j;
        int[][] len = new int[m+1][n+1];

        for (i = 0; i < m; i++) {
            len[i][0] = 0;
        }
        for (j = 0; j < n; j++) {
            len[0][j] = 0;
        }

        for (i = 1; i <= m; i++) {
            for (j = 1; j <= n; j++) {
                if (X[i-1] == Y[j-1]) {
                    len[i][j] = len[i-1][j-1] + 1;
                } else {
                    len[i][j] = Math.max(len[i][j-1], len[i-1][j]);
                }
            }
        }

        return len[m][n];
    }
}