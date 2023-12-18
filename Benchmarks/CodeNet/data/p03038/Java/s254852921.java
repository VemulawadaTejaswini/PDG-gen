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
        int[] nm = in.readLineAsIntArray();
        final int N = nm[0];
        final int M = nm[1];
        int[] A = in.readLineAsIntArray();
        Arrays.sort(A);

        for (int i = 0; i < M; i++) {
            int[] bc = in.readLineAsIntArray();
            int B = bc[0];
            int C = bc[1];
            if (C <= A[0]) {
                continue;
            }
            int idx = lowerBound(A, C);
            if (B >= idx) {
                Arrays.fill(A, 0, idx, C);
            } else {
                int k = 0;
                for (int j = B; j < idx; j++) {
                    A[k++] = A[j];
                }
                Arrays.fill(A, idx - B, idx, C);
            }
        }
        long sum = 0;

        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        System.out.println(sum);

    }


    static final int lowerBound(int[] sortedArray, int key) {
        int left = 0;
        int right = sortedArray.length;
        while (right > left) {
            int mid = (left + right) / 2;
            if (sortedArray[mid] < key) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
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