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
        abc169_c solver = new abc169_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc169_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long A = in.nextLong();
            long B = (long) (in.nextDouble() * 100);

            out.println((A * B) / 100);
        

/*
        //String B = in.next();
        B = B.replace(".", "");
        long lb = Long.parseLong(B);
        long mult;

        mult = A * lb;
        //out.println(Mamult/100);
        String val = BigDecimal.valueOf(Math.floor(mult/100)).toPlainString();
        String ans[] = val.split("\\.");
        out.println(ans[0]);
*/

        }

    }
}

