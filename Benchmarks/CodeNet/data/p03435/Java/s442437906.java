import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        ReaderC.init(System.in);
        int[][] grid = new int[3][3];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = ReaderC.nextInt();
            }
        }

        boolean correct = false;
        for (int i = -1000000; i <= 1000000; i++) {
            int a1 = i;
            int b1 = grid[0][0] - a1;
            int b2 = grid[0][1] - a1;
            int b3 = grid[0][2] - a1;
            int a2 = grid[1][0] - b1;
            if (grid[1][1] - b2 != a2) continue;
            if (grid[1][2] - b3 != a2) continue;
            int a3 = grid[2][0] - b1;
            if (grid[2][1] - b2 != a3) continue;
            if (grid[2][2] - b3 != a3) continue;

            correct = true;
            break;
        }

        System.out.println(correct ? "Yes" : "No");
    }
}

/**
 * Reader class based on the article at "https://www.cpe.ku.ac.th/~jim/java-io.html"
 */
class ReaderC {
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    static void init(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    //    Get a whole line.
    static String line() throws IOException {
        return reader.readLine();
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}

