import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int H = nextInt(), W = nextInt();
        StringBuilder obstacles = new StringBuilder();
        for (int i = 0; i < W + 2; i++) obstacles.append("#");

        String[] grid = new String[H + 2];
        grid[0] = obstacles.toString();
        grid[grid.length - 1] = obstacles.toString();
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < grid.length - 1; i++) grid[i] = "#" + next() + "#";

        ObstacleBoundary[][] lightHorizontal = new ObstacleBoundary[H + 2][W + 2];
        ObstacleBoundary[][] lightVertical = new ObstacleBoundary[H + 2][W + 2];

        for (int i = 0; i < grid.length; i++) {
            int start = 0;
            for (int j = 0; j < grid[i].length(); j++) {
                if (grid[i].charAt(j) == '#') {
                    lightHorizontal[i][j] = new ObstacleBoundary(0, 0);
                    start = j;
                }
                else lightHorizontal[i][j] = new ObstacleBoundary(start, 0);
            }

            int end = grid[i].length() - 1;
            for (int j = grid[i].length() - 1; j >= 0; j--) {
                if (grid[i].charAt(j) == '#') end = j;
                else lightHorizontal[i][j].end = end;
            }
        }

        for (int i = 0; i < grid[0].length(); i++) {
            int start = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j].charAt(i) == '#') {
                    lightVertical[j][i] = new ObstacleBoundary(0, 0);
                    start = j;
                }
                else lightVertical[j][i] = new ObstacleBoundary(start, 0);
            }

            int end = grid.length - 1;
            for (int j = grid.length - 1; j >= 0; j--) {
                if (grid[j].charAt(i) == '#') end = j;
                else lightVertical[j][i].end = end;
            }
        }

        for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) max = Math.max(max, lightHorizontal[i][j].size() + lightVertical[i][j].size() - 1);

        System.out.println(max);
    }

    private static class ObstacleBoundary {
        int start, end;

        ObstacleBoundary(int start, int end) {
            this.start = start;
            this.end = end;
        }

        int size() {
            return end - start - 1;
        }

        @Override
        public String toString() {
            return start + " " + end;
        }
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
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
}