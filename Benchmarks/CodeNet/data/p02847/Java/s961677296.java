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
        abc146_a solver = new abc146_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc146_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.next();
            if (S.compareTo("SUN") == 0) {
                out.println(7);
            } else if (S.compareTo("SAT") == 0) {
                out.println("1");
            } else if (S.compareTo("FRI") == 0) {
                out.println(2);

            } else if (S.compareTo("THU") == 0) {
                out.println(3);
            } else if (S.compareTo("WED") == 0) {
                out.println(4);

            } else if (S.compareTo("TUE") == 0) {
                out.println(5);
            } else if (S.compareTo("MON") == 0) {
                out.println(6);
            }


        }

    }
}

