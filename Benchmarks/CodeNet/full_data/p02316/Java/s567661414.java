import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        int[] nw = in.readLineAsIntArray();
        final int N = nw[0];
        final int W = nw[1];

        int[][] dp = new int[N + 1][W + 1];
        Arrays.fill(dp[0], 0);
        for (int i = 1; i <= N; i++) {
            int[] vw = in.readLineAsIntArray();
            int v = vw[0];
            int w = vw[1];
            dp[i][0] = 0;
            for (int j = 1; j <= W; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= w) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - w] + v);
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - w] + v);
                }
            }
        }
        System.out.println(dp[N][W]);
    }


    static class CustomReader extends BufferedReader {

        public CustomReader() throws IOException {
            super(new InputStreamReader(System.in));
        }

        public int readLineAsInt() throws IOException {
            return Integer.parseInt(this.readLine());
        }

        public int[] readLineAsIntArray() throws IOException {
            String[] strArray = this.readLine().split(" ");
            int[] intArray = new int[strArray.length];
            for (int i = 0, n = strArray.length; i < n; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            return intArray;
        }

        public int[][] readAsIntMatrix(int rows, int columns) throws IOException {
            int[][] matrix = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                String[] r = this.readLine().split(" ");
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = Integer.parseInt(r[j]);
                }
            }
            return matrix;
        }
    }
}
