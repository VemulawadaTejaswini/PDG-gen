import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final int NA = -1;
    private static final int TBD = -9;
    private int[] weather;
    private Cloth[] clothes;

    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        int[] dn = in.readLineAsIntArray();
        final int D = dn[0];
        final int N = dn[1];

        weather = new int[D];
        for (int i = 0; i < D; i++) {
            weather[i] = in.readLineAsInt();
        }

        clothes = new Cloth[N];
        for (int i = 0; i < N; i++) {
            int[] cl = in.readLineAsIntArray();
            clothes[i] = new Cloth(i, cl[0], cl[1], cl[2]);
        }

        int[][] memo = new int[D][N];
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], TBD);
        }
        int maxVal = 0;
        for (int i = 0; i < N; i++) {
            if (clothes[i].isWearable(D - 1)) {
                maxVal = Math.max(maxVal, goodChoice(D - 1, i, memo));
            }
        }

        System.out.println(maxVal);

    }

    private int goodChoice(int day, int clothId, int[][] memo) {
        if (memo[day][clothId] != TBD) {
            return memo[day][clothId];
        } else if (!clothes[clothId].isWearable(day)) {
            memo[day][clothId] = NA;
            return NA;
        } else if (day == 0) {
            memo[0][clothId] = 0;
            return 0;
        } else {
            int val = 0;
            for (int i = 0; i < clothes.length; i++) {
                int gcYesterday = goodChoice(day - 1, i, memo);
                if (gcYesterday != NA) {
                    val = Math.max(val, gcYesterday + Math.abs(clothes[clothId].C - clothes[i].C));
                }
                memo[day][clothId] = val;
            }
            return val;
        }
    }


    class Cloth {
        public final int id;
        public final int A;
        public final int B;
        public final int C;

        public Cloth(int id, int a, int b, int c) {
            this.id = id;
            A = a;
            B = b;
            C = c;
        }

        boolean isWearable(int today) {
            int t = weather[today];
            if (A <= t && t <= B) {
                return true;
            } else {
                return false;
            }
        }
    }


    static class CustomReader extends BufferedReader {

        private static final int DEFAULT_BUF_SIZE = 2048;
        // private static final int DEFAULT_BUF_SIZE = 4096;
        //private static final int DEFAULT_BUF_SIZE = 8192;
        //private static final int DEFAULT_BUF_SIZE = 16384;
        // private static final int DEFAULT_BUF_SIZE = 1048576;

        public CustomReader() throws IOException {
            super(new InputStreamReader(System.in), DEFAULT_BUF_SIZE);
        }


        public int readLineAsInt() throws IOException {
            return Integer.parseInt(this.readLine());
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
