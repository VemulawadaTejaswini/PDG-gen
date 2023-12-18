import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    //   N     +--X
    // W + E   |
    //   S     Y

    private static final int[] DIR_NE = {1, -1};

    private static final int[] DIR_NW = {-1, -1};

    private static final int[] DIR_SE = {1, 1};

    private static final int[] DIR_SW = {-1, 1};

    private final int w;

    private final int h;

    //private final BitSet bits;
    private final boolean[][] bits;

    private Main(int width, int height) {
        w = width;
        h = height;
        //bits = new BitSet(w * h);
        bits = new boolean[h][w];
    }

    void set(int x, int y) {
        //bits.set(x + y * w);
        bits[y][x] = true;
    }

    boolean isSet(int x, int y) {
        //return bits.get(x + y * w);
        return bits[y][x];
    }

    int countEquilateral() {
        int result = 0;
        for (int y = 0; y < h; ++y) {
            for (int x = 0; x < w; ++x) {
                if (isSet(x, y)) {
                    result += sub1(x, y);
                }
            }
        }
        return result;
    }

    private int sub1(int x, int y) {
        int result = 0;
        for (int d = 1; x + d < w && y + d < h; ++d) {
            if (isSet(x + d, y + d)) {
                result += sub2(x + d + d, y, DIR_NW, d);
                result += sub2(x - d, y + d, DIR_SE, d);
            }
        }
        for (int d = 1; x - d >= 0 && y + d < h; ++d) {
            if (isSet(x - d, y + d)) {
                result += sub2(x - d, y - d, DIR_SW, d);
                result += sub2(x, y + d + d, DIR_NE, d);
            }
        }
        return result;
    }

    private int sub2(int x, int y, int[] dir, int d) {
        int result = 0;
        for (int i = 0; i < d; ++i) {
            if (0 <= x && x < w && 0 <= y && y < h && isSet(x, y)) {
                ++result;
            }
            x += dir[0];
            y += dir[1];
        }
        return result;
    }

    public static void main(String[] args) {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out))
        {
            final int H = in.nextInt();
            final int W = in.nextInt();

            Main appl = new Main(W, H);
            for (int i = 0; i < H; ++i) {
                String line = in.next();
                for (int j = 0; j < W; ++j) {
                    if (line.charAt(j) == '#') {
                        appl.set(j, i);
                    }
                }
            }
            out.println(appl.countEquilateral());
        }
    }
}
