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
        int[] nk = in.readLineAsIntArray();
        final int N = nk[0];
        final int K = nk[1];

        double p = 0.0;

        double mul = 1.0;

        int high = N;
        int k = K;
        while (high > 0) {
            if (high >= k) {
                p += (Math.max(high - k + 1, 0) * mul) / N;
                high = k - 1;
            } else {
            }
            if(k%2==0){
                k = k / 2;
            }else{
                k = k / 2 + 1;
            }
            mul *= 0.5;
        }
        System.out.println(p);

    }


    static class CustomReader extends BufferedReader {

        public CustomReader() throws IOException {
            super(new InputStreamReader(System.in));
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