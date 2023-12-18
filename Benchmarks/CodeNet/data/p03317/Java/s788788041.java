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
        int[] A = in.readLineAsIntArray();

        int left = 0;
        int right = 0;
        int i = 0;
        while (i < N && A[i] != 1) {
            left++;
            i++;
        }
        right = N - left - 1;

        int ans = 0;
        ans += left / (K - 1);
        ans += right / (K - 1);

        int m = (left % (K - 1) + right % (K - 1));
        if (m > 0 && m <= (K - 1)) {
            ans += 1;
        }
        if (m > (K - 1)) {
            ans += 2;
        }
        System.out.println(ans);
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