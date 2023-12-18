import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int H;
    static int W;

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
        char[][] A = new char[H][W];
        for (int i = 0; i < H; i++) {
            String l = in.readLine();
            A[i] = l.toCharArray();
        }

        int[] turns = new int[H * W];
        Arrays.fill(turns, -1);
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (A[i][j] == '#') {
                    int addr = addr(i, j);
                    turns[addr] = 0;
                    queue.add(addr);
                }
            }
        }
        int turn = 0;
        while (!queue.isEmpty()) {
            int addr = queue.poll();
            turn = Math.max(turn, turns[addr]);
            int row = addr / W;
            int col = addr % W;
            if (row > 0 && turns[addr(row - 1, col)] == -1) {
                turns[addr(row - 1, col)] = turns[addr] + 1;
                queue.add(addr(row - 1, col));
            }
            if (row < H - 1 && turns[addr(row + 1, col)] == -1) {
                turns[addr(row + 1, col)] = turns[addr] + 1;
                queue.add(addr(row + 1, col));
            }
            if (col > 0 && turns[addr(row, col - 1)] == -1) {
                turns[addr(row, col - 1)] = turns[addr] + 1;
                queue.add(addr(row, col - 1));
            }
            if (col < W - 1 && turns[addr(row, col + 1)] == -1) {
                turns[addr(row, col + 1)] = turns[addr] + 1;
                queue.add(addr(row, col + 1));
            }
        }
        System.out.println(turn);
    }

    int addr(int row, int col) {
        return row * W + col;
    }

    int row(int addr) {
        return addr / W;
    }

    int col(int addr) {
        return addr % W;
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