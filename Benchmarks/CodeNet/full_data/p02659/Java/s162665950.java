import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
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
        abc169_c solver = new abc169_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc169_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            double A = in.nextLong();
            double B = in.nextDouble();

            double mult = A * B;
            String val = BigDecimal.valueOf(Math.floor(mult)).toPlainString();
            String ans[] = val.split("\\.");
            out.println(ans[0]);

        }

    }
}

