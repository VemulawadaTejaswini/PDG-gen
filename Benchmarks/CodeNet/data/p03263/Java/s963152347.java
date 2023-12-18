import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

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
            int[][] n = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    n[i][j] = in.nextInt();
                }
            }

            int cnt = 0;
            ArrayList<Pair> bef = new ArrayList<>();
            ArrayList<Pair> aft = new ArrayList<>();
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w - 1; j++) {
                    if (n[i][j] % 2 != 0) {
                        cnt++;
                        bef.add(new Pair(i + 1, j + 1));
                        aft.add(new Pair(i + 1, j + 2));
                        n[i][j]--;
                        n[i][j + 1]++;
                    }
                }
            }

            for (int i = 0; i < h - 1; i++) {
                if (n[i][w - 1] % 2 != 0) {
                    cnt++;
                    bef.add(new Pair(i + 1, w));
                    aft.add(new Pair(i + 2, w));
                    n[i][w - 1]--;
                    n[i + 1][w - 1]++;
                }
            }

            out.println(cnt);
            for (int i = 0; i < cnt; i++) {
                out.println(bef.get(i).toSimpleStr() + " " + aft.get(i).toSimpleStr());
            }

        }

    }

    static class Pair {
        public long x;
        public long y;

        public Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public String toSimpleStr() {
            return x + " " + y;
        }

    }
}

