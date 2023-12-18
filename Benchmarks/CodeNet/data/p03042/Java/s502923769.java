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
        String S = in.readLine();

        Integer a = Integer.parseInt(S.substring(0, 2));
        Integer b = Integer.parseInt(S.substring(2, 4));

        boolean yymm = false;
        boolean mmyy = false;
        if (1 <= b && b <= 12) {
            yymm = true;
        }
        if (1 <= a && a <= 12) {
            mmyy = true;
        }

        if(yymm && mmyy){
            System.out.println("AMBIGUOUS");
        }else if (yymm){
            System.out.println("YYMM");
        }else if (mmyy){
            System.out.println("MMYY");
        }else{
            System.out.println("NA");
        }


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