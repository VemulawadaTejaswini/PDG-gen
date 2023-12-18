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
        HonestOrUnkind2 solver = new HonestOrUnkind2();
        solver.solve(1, in, out);
        out.close();
    }

    static class HonestOrUnkind2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int a[][] = new int[n][n];
            for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) a[i][j] = -1;
            for (int i = 0; i < n; i++) {
                int k = in.nextInt();
                for (int j = 0; j < k; j++) {
                    int x = in.nextInt();
                    int y = in.nextInt();
                    x--;
                    a[i][x] = y;
                }
            }
            int ans = 0;
            for (int i = 0; i < (1 << n); i++) {
                boolean ok = true;
                for (int j = 0; j < n; j++) {
                    int now = (i >> j) % 2;
                    for (int k = 0; k < n; k++) {
                        if (a[j][k] == -1) continue;
                        if (now == 0) {
                            //
                        } else {
                            if (a[j][k] == 1 && (i >> k) % 2 == 0) {
                                ok = false;
                            } else if (a[j][k] == 0 && (i >> k) % 2 == 1) {
                                ok = false;
                            }
                        }
                    }
                    if (!ok) break;
                }
                if (ok) {
                    int cnt = 0;
                    for (int j = 0; j < n; j++) {
                        if ((i >> j) % 2 == 1) cnt++;
                    }
                    ans = Math.max(ans, cnt);
                }
            }
            out.println(ans);
        }

    }
}

