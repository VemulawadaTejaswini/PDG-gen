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
        DAxisParallelRectangle solver = new DAxisParallelRectangle();
        solver.solve(1, in, out);
        out.close();
    }

    static class DAxisParallelRectangle {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<GridPoint> al = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                al.add(new GridPoint(in.nextInt(), in.nextInt()));
            }

            long res = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int l = 0; l < n; l++) {
                        for (int m = 0; m < n; m++) {
                            long xl = al.get(i).x;
                            long xr = al.get(j).x;
                            long yl = al.get(l).y;
                            long yh = al.get(m).y;
                            int cnt = 0;
                            for (GridPoint gp : al) {
                                if (xl <= gp.x && gp.x <= xr && yl <= gp.y && gp.y <= yh) {
                                    cnt++;
                                }
                            }
                            if (cnt == k) {
                                res = Math.min(res, (xr - xl) * (yh - yl));
                            }
                        }
                    }
                }
            }
            out.println(res);

        }

    }

    static class GridPoint {
        public long x;
        public long y;

        public GridPoint(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "grid:(" + x + ", " + y + ')';
        }

    }
}

