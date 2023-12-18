import java.io.*;
import java.util.*;

public class Main {

    public static final String YES = "YES";
    public static final String NO = "NO";

    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        int[] hwn = in.readLineAsIntArray();
        final int H = hwn[0];
        final int W = hwn[1];
        final int N = hwn[2];

        int[] start = in.readLineAsIntArray();
        int sr = start[0];
        int sc = start[1];

        String takahashi = in.readLine();
        String aoki = in.readLine();

        int leftBound = 1;
        int rightBound = W;
        int upBound = 1;
        int downBound = H;

        for (int i = N - 1; i >= 0; i--) {
            char ca = aoki.charAt(i);
            switch (ca) {
                case 'L':
                    rightBound = Math.min(rightBound + 1, W);
                    break;
                case 'R':
                    leftBound = Math.max(1, leftBound - 1);
                    break;
                case 'U':
                    downBound = Math.min(downBound + 1, H);
                    break;
                case 'D':
                    upBound = Math.max(1, upBound - 1);
                    break;
            }
            char ct = takahashi.charAt(i);
            switch (ct) {
                case 'L':
                    leftBound++;
                    break;
                case 'R':
                    rightBound--;
                    break;
                case 'U':
                    upBound++;
                    break;
                case 'D':
                    downBound--;
                    break;
            }
            if (leftBound > rightBound) {
                break;
            }
        }
        if (leftBound <= sc && sc <= rightBound && upBound <= sr && sr <= downBound) {
            System.out.println(YES);
        } else {
            System.out.println(NO);
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