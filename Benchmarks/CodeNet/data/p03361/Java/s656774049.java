import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ZYCSwing
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        String[] g;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt();
            g = new String[h];
            for (int i = 0; i < h; ++i) g[i] = in.next();
            for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                    if (g[i].charAt(j) == '#') {
                        boolean ok = false;
                        for (int k = 0; k < 4; ++k) {
                            int x = i + dx[k];
                            int y = j + dy[k];
                            if (x < 0 || x >= h || y < 0 || y >= w || g[x].charAt(y) == '.') continue;
                            ok = true;
                            break;
                        }
                        if (!ok) {
                            out.println("No");
                            return;
                        }
                    }
                }
            }

            out.println("Yes");
        }

    }
}

