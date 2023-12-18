import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC111_3 solver = new ABC111_3();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC111_3 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] v = new int[n];

            for (int i = 0; i < n; i++) {
                v[i] = in.nextInt();
            }

            int on = v[0];
            int off = v[1];
            int count = 0;
        /*
        if (on<=off) {
            count += 1;
        }
        */
            for (int i = 0; i < n; i++) {
                if (i == 0 || (i % 2) == 0) {
                    if (on != v[i]) {
                        count += 1;
                        on = v[i];
                    }
                } else {
                    if (off != v[i]) {
                        count += 1;
                        off = v[i];
                    }
                    if (on == off) {
                        count += 1;
                    }
                }
            }
            out.println(count);
        }

    }
}

