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
        abc168_a solver = new abc168_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc168_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            String s[] = String.valueOf(N).split("");

            if ((s[s.length - 1].compareTo("0") == 0) ||
                    (s[s.length - 1].compareTo("1") == 0) ||
                    (s[s.length - 1].compareTo("6") == 0) ||
                    (s[s.length - 1].compareTo("8") == 0)) {
                out.println("pon");
                return;
            } else if (s[s.length - 1].compareTo("3") == 0) {
                out.println("bon");
            } else {
                out.println("hon");
            }

        }

    }
}

