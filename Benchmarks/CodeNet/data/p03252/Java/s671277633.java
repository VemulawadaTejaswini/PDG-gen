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

    private static final char NOT_DECIDED = 0;

    public void execute(CustomReader in) throws IOException {
        final String S = in.readLine();
        final String T = in.readLine();

        final int L = S.length();
        char[] s_to_t = new char[26];
        char[] t_to_s = new char[26];
        Arrays.fill(s_to_t, NOT_DECIDED);
        Arrays.fill(t_to_s, NOT_DECIDED);

        boolean mappable = true;


        for (int i = 0; i < L; i++) {
            char sc = S.charAt(i);
            char tc = T.charAt(i);
            if (s_to_t[idx(sc)] == NOT_DECIDED) {
                s_to_t[idx(sc)] = tc;
            }
            if (t_to_s[idx(tc)] == NOT_DECIDED) {
                t_to_s[idx(tc)] = sc;
            }

            if (s_to_t[idx(sc)] != tc || t_to_s[idx(tc)] != sc) {
                mappable = false;
                break;
            }
        }

        System.out.println(mappable ? "Yes" : "No");


    }

    private int idx(char c) {
        return c - 'a';
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