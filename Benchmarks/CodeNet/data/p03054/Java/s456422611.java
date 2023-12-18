import java.io.*;
import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;

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

        int[] tLRUD = new int[4];
        int[] aLRUD = new int[4];

        for (int i = 0; i < N; i++) {
            char tc = takahashi.charAt(i);
            char ta = aoki.charAt(i);
            switch (tc) {
                case 'L':
                    tLRUD[0]++;
                    break;
                case 'R':
                    tLRUD[1]++;
                    break;
                case 'U':
                    tLRUD[2]++;
                    break;
                case 'D':
                    tLRUD[3]++;
                    break;
            }
            switch (ta) {
                case 'L':
                    aLRUD[0]++;
                    if (aLRUD[0] - tLRUD[1] < sc) {
                        aLRUD[0]--;
                    }
                    break;
                case 'R':
                    aLRUD[1]++;
                    if (aLRUD[1] - tLRUD[0] < W - sc + 1) {
                        aLRUD[1]--;
                    }
                    break;
                case 'U':
                    aLRUD[2]++;
                    if (aLRUD[2] - tLRUD[3] < sr) {
                        aLRUD[2]--;
                    }
                    break;
                case 'D':
                    aLRUD[3]++;
                    if (aLRUD[3] - tLRUD[2] < H - sr + 1) {
                        aLRUD[3]--;
                    }
                    break;
            }
            //left
            if (tLRUD[0] - aLRUD[1] > sc) {
                System.out.println(NO);
                return;
            }

            //right
            if (tLRUD[1] - aLRUD[0] > (W - sc + 1)) {
                System.out.println(NO);
                return;
            }

            //up
            if (tLRUD[2] - aLRUD[3] > sr) {
                System.out.println(NO);
                return;
            }

            //down
            if (tLRUD[3] - aLRUD[2] > (H - sr) + 1) {
                System.out.println(NO);
                return;
            }
        }
        System.out.println(YES);
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