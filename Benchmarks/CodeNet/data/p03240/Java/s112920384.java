import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void execute(CustomReader in) throws IOException {

        final int N = in.readLineAsInt();

        int[] cx = new int[N];
        int[] cy = new int[N];
        int[] ch = new int[N];

        for (int i = 0; i < N; i++) {
            int[] clue = in.readLineAsIntArray();
            cx[i] = clue[0];
            cy[i] = clue[1];
            ch[i] = clue[2];
        }

        for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100; y++) {
                int h = ch[0] + Math.abs(x - cx[0]) + Math.abs(y - cy[0]);
                boolean solved = true;
                for (int i = 1; i < N; i++) {
                    if (h != ch[i] + Math.abs(x - cx[i]) + Math.abs(y-cy[i])) {
                        solved = false;
                        break;
                    }
                }
                if(!solved){
                    continue;
                }
                System.out.printf("%d %d %d\n", x, y, h);
                return;
            }
        }
        throw new RuntimeException("reaching this line is impossible");
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