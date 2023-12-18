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
        int [] value = in.readLineAsIntArray();
        int[] cost = in.readLineAsIntArray();
        int maxProfit = 0;
        for (int i=0; i<N; i++){
            int gp = value[i] - cost[i];
            if (gp > 0) {
                maxProfit += gp;
            }
        }
        System.out.println(maxProfit);
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