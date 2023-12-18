import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        ReaderD.init(System.in);
        int h = ReaderD.nextInt();
        int w = ReaderD.nextInt();
        int d = ReaderD.nextInt();
        Map<Integer, Pair> coord = new HashMap<>();

        int[][] grid = new int[h][w];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = ReaderD.nextInt();
                coord.put(grid[i][j], new Pair(i + 1, j + 1));
            }
        }

        int[][] distTo = new int[d + 1][h*w + 1];
        for (int i = 1; i <= d; i++) {
            for (int j = i + d; j <= h*w; j += d) {
                int dist = Math.abs(coord.get(j).x - coord.get(j - d).x) + Math.abs(coord.get(j).y - coord.get(j - d).y);
                distTo[i][j] = distTo[i][j - d] + dist;
            }
        }

        int q = ReaderD.nextInt();
        for (int i = 0; i < q; i++) {
            int l = ReaderD.nextInt();
            int distToL = distTo[l % d == 0 ? d : l % d][l];
            int r = ReaderD.nextInt();
            int distToR = distTo[r % d == 0 ? d : r % d][r];
            System.out.println(distToR - distToL);
        }
    }
}

class Pair {
    int x, y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

/**
 * Reader class based on the article at "https://www.cpe.ku.ac.th/~jim/java-io.html"
 */
class ReaderD {
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    static void init(InputStream inputStream) {
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

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

//    static long nextLong() throws IOException {
//        return Long.parseLong(next());
//    }
//
//    //    Get a whole line.
//    static String line() throws IOException {
//        return reader.readLine();
//    }
//
//    static double nextDouble() throws IOException {
//        return Double.parseDouble(next());
//    }
}

