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
        CADDi_B solver = new CADDi_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class CADDi_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long x = in.nextLong();
            long y = in.nextLong();
            long a, b;
            long ans = 0;
            for (int i = 0; i < n; i++) {
                a = in.nextLong();
                b = in.nextLong();

                if (a >= x && b >= y) {
                    ans++;
                }
            }

            out.print(ans);


        }

    }
}

