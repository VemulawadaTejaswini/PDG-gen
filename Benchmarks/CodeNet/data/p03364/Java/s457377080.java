import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        init(System.in);
        int n = nextInt();
        bigGrid = new char[2*n][2*n];
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) grid[i] = next().toCharArray();
        for (int i = 0; i < bigGrid.length; i++) {
            for (int j = 0; j < bigGrid.length; j++) {
                bigGrid[i][j] = grid[i % n][j % n];
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isSymmetric(i, j, n)) ans++;
            }
        }

        System.out.println(ans);
    }

    private static char[][] bigGrid;
    private static boolean isSymmetric(int i, int j, int n) {
        boolean symmetric = true;
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                if (bigGrid[i + k][j + l] != bigGrid[i + l][j + k]) {
                    symmetric = false;
                    break;
                }
            }
            if (!symmetric) break;
        }

        return symmetric;
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

//    private static long nextLong() throws IOException {
//        return Long.parseLong(next());
//    }
//
//    //    Get a whole line.
//    private static String line() throws IOException {
//        return reader.readLine();
//    }
//
//    private static double nextDouble() throws IOException {
//        return Double.parseDouble(next());
//    }
}