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
        ABC119_1 solver = new ABC119_1();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC119_1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.next();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/mm/dd");
//        LocalDate ldt = LocalDate.parse( S , formatter );
//        LocalDate date_EndOf_Heisei = LocalDate.parse( "2019/04/30", formatter);

            if (S.compareTo("2019/04/30") > 0) {
                out.println("TBD");
            } else {
                out.println("Heisei");
            }
        }

    }
}

