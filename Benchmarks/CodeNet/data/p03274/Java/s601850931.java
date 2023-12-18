import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {


    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        int[] nk = in.readLineAsIntArray();
        final int N = nk[0];
        final int K = nk[1];

        int[] x = in.readLineAsIntArray();


        int nm = 0;
        int np = 0;
        for (int i = 0; i < N; i++) {
            if (x[i] >= 0) {
                break;
            }
            nm++;
        }
        np = N - nm;

        int[] minus = new int[nm + 1];
        int[] plus = new int[np + 1];
        for (int i = nm; i < N; i++) {
            plus[i - nm + 1] = x[i];
        }

        for (int j = 1; j <= nm; j++) {
            minus[j] = Math.abs(x[nm - j]);
        }

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i <= nm && i <= K; i++) {
            if (K - i <= np) {
                minCost = Math.min(minCost, 2 * minus[i] + plus[K - i]);
            }
        }

        for (int i = 0; i <= np && i <= K; i++) {
            if (K - i <= nm) {
                minCost = Math.min(minCost, 2 * plus[i] + minus[K - i]);
            }
        }
        System.out.println(minCost);

    }


    static class CustomReader extends BufferedReader {
        public CustomReader() throws IOException {
            super(new InputStreamReader(System.in));
        }

        public int readLineAsInt() throws IOException {
            return Integer.parseInt(readLine());
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

        public char[][] readAsCharMatrix(int rows) throws IOException {
            char[][] matrix = new char[rows][];
            for (int i = 0; i < rows; i++) {
                matrix[i] = this.readLine().toCharArray();
            }
            return matrix;
        }

    }

}