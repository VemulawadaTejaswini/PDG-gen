import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        int[] nx = in.readLineAsIntArray();
        final int N = nx[0];
        final int X = nx[1];

        int[] cities = in.readLineAsIntArray();
        for (int i = 0; i < N; i++) {
            cities[i] -= X;
        }

        int d = Math.abs(cities[0]);
        for (int i = 1; i < N; i++) {
            d = gcd(d, Math.abs(cities[i]));
        }
        System.out.println(d);
    }

    private int gcd(int x, int y) {
        if (y > x) {
            return gcd(y, x);
        }
        int m = x % y;
        if (m == 0) {
            return y;
        } else {
            return gcd(y, m);
        }
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