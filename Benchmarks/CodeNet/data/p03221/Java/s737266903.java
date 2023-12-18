import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

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

        City[] cities = new City[M];
        for (int i = 0; i < M; i++) {
            int[] py = in.readLineAsIntArray();
            cities[i] = new City(i, py[0], py[1]);
        }

        Arrays.parallelSort(cities, (City c1, City c2) -> (c1.pref == c2.pref) ? (c1.year - c2.year) : (c1.pref - c2.pref));
        int idx = 1;
        for (int i = 0; i < M - 1; i++) {
            cities[i].idName = String.format("%06d%06d", cities[i].pref, idx);
            if (cities[i].pref == cities[i + 1].pref) {
                idx++;
            } else {
                idx = 1;
            }
        }
        cities[M - 1].idName = String.format("%06d%06d", cities[M - 1].pref, idx);

        Arrays.parallelSort(cities, (City c1, City c2) -> c1.number - c2.number);

        for (int i = 0; i < M; i++) {
            System.out.println(cities[i].idName);
        }

    }

    class City {
        final int number;
        final int pref;
        final int year;
        String idName;

        public City(int num, int pref, int year) {
            this.number = num;
            this.pref = pref;
            this.year = year;
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