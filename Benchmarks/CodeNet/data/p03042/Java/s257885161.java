import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhijeetkns
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BYYMMOrMMYY solver = new BYYMMOrMMYY();
        solver.solve(1, in, out);
        out.close();
    }

    static class BYYMMOrMMYY {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int val1 = Integer.parseInt(s.substring(0, 2));
            int val2 = Integer.parseInt(s.substring(2, 4));
            if ((val1 >= 1 && val1 <= 12) && (val2 >= 1 && val2 <= 12)) out.println("AMBIGUOUS");
            else if ((val1 >= 1 && val1 <= 12)) out.println("MMYY");
            else if (val2 >= 1 && val2 <= 12) out.println("YYMM");
            else out.println("NA");
        }

    }
}

