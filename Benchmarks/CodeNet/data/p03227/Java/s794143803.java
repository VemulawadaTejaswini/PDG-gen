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
        TPBC_1 solver = new TPBC_1();
        solver.solve(1, in, out);
        out.close();
    }

    static class TPBC_1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.next();

            if (S.length() == 2) {
                out.println(S);
            } else {
                String outst[] = S.split("");
                out.println(outst[2] + outst[1] + outst[0]);
            }
        }

    }
}

