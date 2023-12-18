import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC109D solver = new ABC109D();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC109D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int H = in.nextInt();
            int W = in.nextInt();
            int[][] m = new int[H][W];
            List<String> list = new ArrayList<String>();
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    m[i][j] = in.nextInt();
                }
            }
            while (true) {
                int x1 = -1;
                int y1 = -1;
                int x2 = -1;
                int y2 = -1;
                LOOP:
                for (int i = 0; i < H; i++) {
                    for (int j = 0; j < W; j++) {
                        if (m[i][j] % 2 == 1) {
                            if (x1 == -1) {
                                x1 = j;
                                y1 = i;
                            } else {
                                x2 = j;
                                y2 = i;
                                break LOOP;
                            }
                        }
                    }
                }
                if (x2 == -1) {
                    break;
                }
                if (x1 != x2) {
                    int xdiff = x1 < x2 ? 1 : -1;
                    for (int i = 0; i < Math.abs(x1 - x2); i++) {
                        list.add(((x1 + xdiff * i) + 1) + " " + (y1 + 1) + " " + ((x1 + (xdiff * i + 1)) + 1) + " " + (y1 + 1));
                    }
                }
                if (y1 != y2) {
                    int xdiff = y1 < y2 ? 1 : -1;
                    for (int i = 0; i < Math.abs(y1 - y2); i++) {
                        list.add((x1 + 1) + " " + ((y1 + xdiff * i) + 1) + " " + (x2 + 1) + " " + ((y1 + (xdiff * i + 1)) + 1));
                    }
                }
                m[y1][x1] = m[y1][x1] - 1;
                m[y2][x2] = m[y2][x2] + 1;
            }
            out.println(list.size());
            for (String s : list) {
                out.println(s);
            }
        }

    }
}

