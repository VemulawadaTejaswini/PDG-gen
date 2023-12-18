import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Lamp solver = new Lamp();
        solver.solve(1, in, out);
        out.close();
    }

    static class Lamp {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            int max = Math.max(h, w);

            int[][] g = new int[h][w];
            for (int i = 0; i < h; i++) {
                char[] chars = in.next().toCharArray();
                for (int j = 0; j < w; j++) {
                    if (chars[j] == '#') {
                        g[i][j] = Integer.MAX_VALUE;
                    } else {
                        g[i][j] = 1;
                    }
                }
            }

            long result = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (g[i][j] > 1) {
                        continue;
                    }
                    // 横
                    int point = 1;
                    int yoko = 1;
                    while (true) {
                        if (j + yoko >= w) {
                            break;
                        }
                        if (g[i][j + yoko] > 1) {
                            break;
                        }
                        point++;
                        yoko++;
                    }
                    yoko = -1;
                    while (true) {
                        if (j + yoko < 0) {
                            break;
                        }
                        if (g[i][j + yoko] > 1) {
                            break;
                        }
                        point++;
                        yoko--;
                    }
                    int tate = 1;
                    while (true) {
                        if (i + tate >= h) {
                            break;
                        }
                        if (g[i + tate][j] > 1) {
                            break;
                        }
                        point++;
                        tate++;
                    }
                    tate = -1;
                    while (true) {
                        if (i + tate < 0) {
                            break;
                        }
                        if (g[i + tate][j] > 1) {
                            break;
                        }
                        point++;
                        tate--;
                    }
                    result = Math.max(result, point);
                }
            }
            out.println(result);

        }

    }
}

