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
        AAISing_2019_B solver = new AAISing_2019_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class AAISing_2019_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int one = 0, two = 0, three = 0;
            int p;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                p = in.nextInt();
                if (p <= a) {
                    one++;
                } else if (a < p && p <= b) {
                    two++;
                } else if (b < p) {
                    three++;
                }
            }

            out.print(Math.min(Math.min(one, two), three));


        }

    }
}

