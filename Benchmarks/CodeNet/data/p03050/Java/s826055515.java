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
        Long N = Long.parseLong(in.readLine());
        System.out.println(favoriteSum(N));
    }

    long favoriteSum(long N){
        long sum = 0L;
        for (int r = 1, bound = (int) Math.sqrt(N); r <= bound; r++) {
            if (N % r == 0) {
                long m =  (N / r) - 1;
                if (m > r) {
                    sum += m;
                }
            }
        }
        return sum;
    }

    long simple(long N) {
        long sum = 0;
        for (int m = 1; m < N; m++) {
            long s = N / m;
            long r = N % m;
            if (s == r) {
                sum += m;
            }
        }
        return sum;
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