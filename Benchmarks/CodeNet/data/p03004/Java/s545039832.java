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
        F solver = new F();
        solver.solve(1, in, out);
        out.close();
    }

    static class F {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();

            long[] Rs = new long[]{-10000000000L, 10000000000L};
            long[] Ls = new long[]{-10000000000L, 10000000000L};
            long[] Us = new long[]{-10000000000L, 10000000000L};
            long[] Ds = new long[]{-10000000000L, 10000000000L};
            long[] xm = new long[]{-10000000000L, 10000000000L};
            long[] ym = new long[]{-10000000000L, 10000000000L};

            for (int i = 0; i < N; i++) {
                long x = in.nextLong();
                long y = in.nextLong();
                String d = in.next();
                switch (d) {
                    case "R":
                        Rs[0] = Math.max(Rs[0], x);
                        Rs[1] = Math.min(Rs[1], x);
                        ym[0] = Math.max(ym[0], y);
                        ym[1] = Math.min(ym[1], y);
                        break;
                    case "L":
                        Ls[0] = Math.max(Ls[0], x);
                        Ls[1] = Math.min(Ls[1], x);
                        ym[0] = Math.max(ym[0], y);
                        ym[1] = Math.min(ym[1], y);
                        break;
                    case "U":
                        xm[0] = Math.max(xm[0], x);
                        xm[1] = Math.min(xm[1], x);
                        Us[0] = Math.max(Us[0], y);
                        Us[1] = Math.min(Us[1], y);
                        break;
                    case "D":
                        xm[0] = Math.max(xm[0], x);
                        xm[1] = Math.min(xm[1], x);
                        Ds[0] = Math.max(Ds[0], y);
                        Ds[1] = Math.min(Ds[1], y);
                        break;
                }
            }

            double min = Long.MAX_VALUE;
            int diff = 0;
            while (true) {
                double xmax = Math.max(xm[0], Math.max(Rs[0] + diff / 2.0, Ls[0] - diff / 2.0));
                double xmin = Math.min(xm[1], Math.min(Rs[1] + diff / 2.0, Ls[1] - diff / 2.0));
                double ymax = Math.max(ym[0], Math.max(Us[0] + diff / 2.0, Ds[0] - diff / 2.0));
                double ymin = Math.min(ym[1], Math.min(Us[1] + diff / 2.0, Ds[1] - diff / 2.0));
                double temp = (xmax - xmin) * (ymax - ymin);
                if (temp < min) {
                    min = temp;
                    diff++;
                } else {
                    break;
                }
            }
            out.printf("%.9f", min);
        }

    }
}

