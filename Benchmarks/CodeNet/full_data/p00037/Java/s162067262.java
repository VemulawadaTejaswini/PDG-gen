import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        List<String> lines = new ArrayList<String>();
        while (true) {
            String line = reader.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            lines.add(line);
        }
        int width = lines.get(0).length();
        int height = lines.size() / 2;
        int[][] nodes = new int[height + 1][width + 1];
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            int y = i / 2;
            if (i % 2 == 0) {
                for (int x = 0; x < width; x++) {
                    if (line.charAt(x) == '1') {
                        nodes[y][x] |= 1;
                        nodes[y][x + 1] |= 1 << 2;
                    }
                }
            } else {
                for (int x = 0; x <= width; x++) {
                    if (line.charAt(x) == '1') {
                        nodes[y][x] |= 1 << 1;
                        nodes[y + 1][x] |= 1 << 3;
                    }
                }
            }
        }
        int cx = 0;
        int cy = 0;
        int cd = 0;
        while (true) {
            int node = nodes[cy][cx];
            for (int i = 3; i <= 6; i++) {
                int nd = (cd + i) % 4;
                int mask = 1 << nd;
                if ((node & mask) > 0) {
                    cd = nd;
                    break;
                }
            }
            if (cd == 0) {
                cx += 1;
            } else if (cd == 1) {
                cy += 1;
            } else if (cd == 2) {
                cx -= 1;
            } else {
                cy -= 1;
            }
            out.print(chars[cd]);
            if (cx == 0 && cy == 0) {
                out.println();
                break;
            }
        }
    }

    private static final char[] chars = { 'R', 'D', 'L', 'U' };
}