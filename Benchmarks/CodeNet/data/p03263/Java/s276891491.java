import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMakeThemEven solver = new DMakeThemEven();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMakeThemEven {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int h = in.nextInt();
            int w = in.nextInt();
            boolean[][] f = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    f[i][j] = in.nextInt() % 2 == 0;
                }
            }

            StringBuilder sb = new StringBuilder();
            int cnt = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w - 1; j++) {
                    if (!f[i][j]) {
                        cnt++;
                        sb.append(i + 1).append(" ")
                                .append(j + 1).append(" ")
                                .append(i + 1).append(" ")
                                .append(j + 2).append("\n");
                        f[i][j] = !f[i][j];
                        f[i][j + 1] = !f[i][j + 1];
                    }
                }
            }

            for (int i = 0; i < h - 1; i++) {
                if (!f[i][w - 1]) {
                    cnt++;
                    sb.append(i + 1).append(" ")
                            .append(w).append(" ")
                            .append(i + 2).append(" ")
                            .append(w).append("\n");
                    f[i][w - 1] = !f[i][w - 1];
                    f[i + 1][w - 1] = !f[i + 1][w - 1];
                }
            }

            out.println(cnt);
            out.print(sb);

        }

    }
}

