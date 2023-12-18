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
        KStones solver = new KStones();
        solver.solve(1, in, out);
        out.close();
    }

    static class KStones {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            boolean[] f = new boolean[k + 1];

            for (int i = 0; i <= k; i++) {
                if (i < a[0]) {
                    f[i] = false;
                } else {
                    boolean g = true;
                    for (int j = 0; j < n; j++) {
                        if (i - a[j] >= 0) {
                            g = g && f[i - a[j]];
                        }
                    }
                    f[i] = !g;
                }
            }

            out.println(f[k] ? "First" : "Second");
        }

    }
}

