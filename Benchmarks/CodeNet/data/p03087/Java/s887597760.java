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
        int[] nq = in.readLineAsIntArray();
        final int N = nq[0];
        final int Q = nq[1];
        final String S = in.readLine();

        int[] countAc = new int[N];
        countAc[0] = 0;
        for(int i=1; i<N; i++){
            countAc[i] = countAc[i - 1];
            if(S.charAt(i-1) == 'A' && S.charAt(i) == 'C'){
                countAc[i] += 1;
            }
        }

        for(int i=0; i<Q; i++){
            int[] lr = in.readLineAsIntArray();
            int l = lr[0];
            int r = lr[1];
            System.out.println(countAc[r - 1] - countAc[l - 1]);
        }
    }




    static class CustomReader extends BufferedReader {

        private static final int DEFAULT_BUF_SIZE = 2048;
        // private static final int DEFAULT_BUF_SIZE = 4096;
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