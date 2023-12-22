import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            int n = Integer.parseInt(line);
            for (int i = 0; i < n; i++) {
                reader.readLine();
                int[][] cells = new int[14][14];
                for (int j = 0; j < 8; j++) {
                    line = reader.readLine();
                    for (int k = 0; k < 8; k++) {
                        cells[j + 3][k + 3] = line.charAt(k) - '0';
                    }
                }
                int x = Integer.parseInt(reader.readLine()) + 2;
                int y = Integer.parseInt(reader.readLine()) + 2;
                solve(cells, x, y);
                out.println("Data " + (i + 1) + ":");
                for (int j = 0; j < 8; j++) {
                    for (int k = 0; k < 8; k++) {
                        out.print(cells[j + 3][k + 3] & 1);
                    }
                    out.println();
                }
            }
        }
    }

    private static void solve(int[][] cells, int x, int y) {
        cells[y][x] |= 2;
        if ((cells[y][x] & 1) == 0) {
            return;
        }
        cells[y][x] &= ~1;
        for (int[] flame : flames) {
            solve(cells, x + flame[0], y + flame[1]);
        }
    }

    private static int[][] flames = { { 1, 0 }, { 2, 0 }, { 3, 0 }, { 0, 1 },
            { 0, 2 }, { 0, 3 }, { -1, 0 }, { -2, 0 }, { -3, 0 }, { 0, -1 },
            { 0, -2 }, { 0, -3 } };
}