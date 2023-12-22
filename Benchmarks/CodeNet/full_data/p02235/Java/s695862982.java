import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    static int longestCommonSubsequence(char[] X, char[] Y) {
        int m = X.length;
        int n = Y.length;
        int[][] c = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            c[i][0] = 0;
        }
        for (int i = 0; i < n; i++) {
            c[0][i] = 0;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X[i - 1] == Y[j - 1])
                    c[i][j] = c[i - 1][j - 1] + 1;
                else if (c[i - 1][j] >= c[i][j - 1])
                    c[i][j] = c[i - 1][j];
                else
                    c[i][j] = c[i][j - 1];
            }
        }
        return c[m][n];
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter out = new PrintWriter(System.out)) {
            int n = Integer.parseInt(in.readLine());
            for (int i = 0; i < n; i++) {
                char[] X = in.readLine().toCharArray();
                char[] Y = in.readLine().toCharArray();
                out.println(longestCommonSubsequence(X, Y));
            }
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

