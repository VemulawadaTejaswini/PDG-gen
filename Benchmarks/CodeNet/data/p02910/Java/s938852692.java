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
        abc141_b solver = new abc141_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc141_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.next();
            String aS[] = S.split("");
            boolean acceptable = true;
            for (int i = 0; i < aS.length; i += 2) {
                if ((aS[i].compareTo("R") == 0) ||
                        (aS[i].compareTo("U") == 0) ||
                        (aS[i].compareTo("D") == 0)) {
                } else {
                    acceptable = false;
                    break;
                }
            }
            if (!acceptable) {
                out.println("No");
                return;
            }
            for (int i = 1; i < aS.length; i += 2) {
                if ((aS[i].compareTo("L") == 0) ||
                        (aS[i].compareTo("U") == 0) ||
                        (aS[i].compareTo("D") == 0)) {
                } else {
                    acceptable = false;
                    break;
                }
            }
            if (acceptable) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }

    }
}

