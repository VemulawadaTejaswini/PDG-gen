import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void execute(CustomReader in) throws IOException {
        final int N = Integer.parseInt(in.readLine());
        int[] H = in.readLineAsIntArray();
        int cnt = 0;
        int border = 0;
        for (int i = 0; i < N; i++) {
            if (H[i] >= border) {
                cnt++;
                border = H[i];
            }
        }
        System.out.println(cnt);

    }

    static class CustomReader extends BufferedReader {

        //private static final int DEFAULT_BUF_SIZE = 2048;
        private static final int DEFAULT_BUF_SIZE = 4096;
        // private static final int DEFAULT_BUF_SIZE = 8192;
        //private static final int DEFAULT_BUF_SIZE = 16384;
        // private static final int DEFAULT_BUF_SIZE = 1048576;

        public CustomReader() throws IOException {
            super(new InputStreamReader(System.in), DEFAULT_BUF_SIZE);
        }

        public int[] readLineAsIntArray() throws IOException {
            String[] strArray = this.readLine().split(" ");
            int[] intArray = new int[strArray.length];
            for (int i = 0, n = strArray.length; i < n; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            return intArray;
        }

        public long[] readLineAsLongArray() throws IOException {
            String[] strArray = this.readLine().split(" ");
            long[] longArray = new long[strArray.length];
            for (int i = 0, n = strArray.length; i < n; i++) {
                longArray[i] = Long.parseLong(strArray[i]);
            }
            return longArray;
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