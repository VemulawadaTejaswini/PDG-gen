import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author naruse
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Pyramid solver = new Pyramid();
        solver.solve(1, in, out);
        out.close();
    }

    static class Pyramid {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int x[] = new int[n];
            int y[] = new int[n];
            int h[] = new int[n];
            int sx = 0, sy = 0, sh = 0;
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
                h[i] = in.nextInt();
                if (h[i] > 0) {
                    sx = x[i];
                    sy = y[i];
                    sh = h[i];
                }
            }
            for (int i = 0; i < 101; i++) {
                for (int j = 0; j < 101; j++) {
                    int nowh = Math.max(sh + Math.abs(i - sx) + Math.abs(j - sy), 0);
                    boolean ok = (nowh > 0);
                    for (int k = 0; k < n; k++) {
                        int checkh = Math.max(h[k] + Math.abs(i - x[k]) + Math.abs(j - y[k]), 0);
                        if (nowh != checkh) {
                            if (h[k] == 0 && checkh >= nowh) continue;
                            ok = false;
                        }
                    }
                    if (ok) {
                        out.println(i + " " + j + " " + nowh);
                        return;
                    }
                }
            }
        }

    }
}

