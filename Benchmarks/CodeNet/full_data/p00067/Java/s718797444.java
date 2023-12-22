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
        while (true) {
            String line = null;
            while (true) {
                line = reader.readLine();
                if (line == null) {
                    return;
                }
                if (!line.isEmpty()) {
                    break;
                }
            }
            int[][] map = new int[14][14];
            for (int y = 1; y <= 12; y++) {
                for (int x = 1; x <= 12; x++) {
                    map[y][x] = line.charAt(x - 1) - '0';
                }
                line = reader.readLine();
            }
            int result = 0;
            for (int y = 1; y <= 12; y++) {
                for (int x = 1; x <= 12; x++) {
                    if (map[y][x] == 0) {
                        continue;
                    }
                    erase(map, x, y);
                    result++;
                }
            }
            out.println(result);
        }
    }

    private static void erase(int[][] map, int x, int y) {
        if (map[y][x] == 0) {
            return;
        }
        map[y][x] = 0;
        erase(map, x + 1, y);
        erase(map, x - 1, y);
        erase(map, x, y + 1);
        erase(map, x, y - 1);
    }
}