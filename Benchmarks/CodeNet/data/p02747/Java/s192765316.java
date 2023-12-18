import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author EigenFunk
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AHitachiString solver = new AHitachiString();
        solver.solve(1, in, out);
        out.close();
    }

    static class AHitachiString {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String hi = in.nextLine();
            boolean itIs = true;
            if (hi.length() % 2 == 1) {
                itIs = false;
            }
            for (int i = 0; i < hi.length() / 2; i++) {
                if (!hi.substring(i * 2, i * 2 + 2).equals("hi")) {
                    itIs = false;
                    break;
                }
            }
            if (itIs) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }

    }
}

