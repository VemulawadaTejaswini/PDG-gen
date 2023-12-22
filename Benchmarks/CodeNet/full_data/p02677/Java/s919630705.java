import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mehvix
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        abc168_c solver = new abc168_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc168_c {
        public void solve(int testNumber, Scanner fin, PrintWriter fout) {
            double a = fin.nextInt();  // hr len
            double b = fin.nextInt();  // min len
            double h = fin.nextInt();
            double m = fin.nextInt();

            double minAng = (m * 6.0);
            double hrAng = (h * 30.0 + minAng / 12.0);
            double diffAngl = Math.abs(hrAng - minAng);

//        System.out.println(diffAngl);

            fout.println(Math.sqrt((a * a + b * b - 2 * a * b * Math.cos((Math.toRadians(diffAngl))))));

        }

    }
}

