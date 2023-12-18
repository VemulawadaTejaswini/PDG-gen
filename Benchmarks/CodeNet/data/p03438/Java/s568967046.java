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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }
            long sumpos = 0;
            long sumneg = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] > b[i]) {
                    sumneg += a[i] - b[i];
                }
                if (a[i] < b[i]) {
                    sumpos += b[i] - a[i];
                }
            }

            if (sumneg * 2 > sumpos) {
                out.println("No");
            } else {
                out.println("Yes");
            }
        }

    }
}

