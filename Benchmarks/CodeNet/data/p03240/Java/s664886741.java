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
        CPyramid solver = new CPyramid();
        solver.solve(1, in, out);
        out.close();
    }

    static class CPyramid {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
        /*
        気合のO(N^3)でよさそう
        頂点座標を(a,b)としたときにすべてつじつまが合えばよい
         */
            int n = in.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
                h[i] = in.nextInt();
            }

            for (int i = 0; i <= 100; i++) {
                for (int j = 0; j <= 100; j++) {
                    int height;
                    int xx = Math.abs(i - x[0]);
                    int yy = Math.abs(j - y[0]);
                    height = h[0] + xx + yy;
                    boolean f = true;
                    for (int l = 0; l < n; l++) {
                        int dx = Math.abs(i - x[l]);
                        int dy = Math.abs(j - y[l]);
                        f = f && height - dx - dy == h[l];
                    }
                    if (f) {
                        out.println(i + " " + j + " " + height);
                        return;
                    }
                }
            }

        }

    }
}

