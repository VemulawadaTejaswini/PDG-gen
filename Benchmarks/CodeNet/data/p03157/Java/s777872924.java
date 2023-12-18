import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private int H;
    private int W;

    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        int[] hw = in.readLineAsIntArray();
        H = hw[0];
        W = hw[1];
        final int SZ = H * W;

        char[][] field = new char[H][];
        int[] parent = new int[H * W];

        for (int i = 0; i < H; i++) {
            field[i] = in.readLine().toCharArray();
        }

        Arrays.fill(parent, -1);

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int cellId = id(i, j);
                if (parent[cellId] == -1) {
                    dfs(i, j, field, cellId, parent);
                }
            }
        }

        int[] countBlack = new int[SZ];
        int[] countWhite = new int[SZ];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int cellId = parent[id(i, j)];
                if (field[i][j] == '#') {
                    countBlack[cellId]++;
                } else {
                    countWhite[cellId]++;
                }
            }
        }

        long totalCount = 0L;
        for (int i = 0; i < SZ; i++) {
            totalCount += countBlack[i] * countWhite[i];
        }
        System.out.println(totalCount);

    }

    private void dfs(int h, int w, char[][] field, int root, int[] parents) {
        if (parents[id(h, w)] != -1) {
            return;
        }
        parents[id(h, w)] = root;

       if (h - 1 >= 0 && field[h][w] != field[h - 1][w]) {
            dfs(h - 1, w, field, root, parents);
        }

        if (w - 1 >= 0 && field[h][w] != field[h][w - 1]) {
            dfs(h, w - 1, field, root, parents);
        }

        if (h + 1 < H && field[h][w] != field[h + 1][w]) {
            dfs(h + 1, w, field, root, parents);
        }

        if (w + 1 < W && field[h][w] != field[h][w + 1]) {
            dfs(h, w + 1, field, root, parents);
        }
    }

    private int id(int h, int w) {
        return h * W + w;
    }

    static class CustomReader extends BufferedReader {

        //private static final int DEFAULT_BUF_SIZE = 2048;
        // private static final int DEFAULT_BUF_SIZE = 4096;
         private static final int DEFAULT_BUF_SIZE = 8192;
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