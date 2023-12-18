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
        int N = Integer.parseInt(in.readLine());
        int[] A = in.readLineAsIntArray();
        int[] gcdForward = new int[N];
        int[] gcdBackward = new int[N];
        gcdForward[0] = A[0];
        gcdBackward[N - 1] = A[N - 1];
        for (int i = 1; i < N; i++) {
            gcdForward[i] = gcd(gcdForward[i - 1], A[i]);
            gcdBackward[N - 1 - i] = gcd(gcdBackward[N - 1], A[N - 1 - i]);
        }

        int maxGcd = Math.max(gcdForward[N - 2], gcdBackward[1]);

        for (int i = 1; i < N - 1; i++) {
            maxGcd = Math.max(maxGcd, gcd(gcdForward[i - 1], gcdBackward[i + 1]));
        }

        System.out.println(maxGcd);
    }

    private int gcd(int x, int y) {
        if (y > x) {
            return gcd(y, x);
        }
        int r = x % y;
        if (r == 0) {
            return y;
        } else {
            return gcd(y, r);
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