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
        AtCoder solver = new AtCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class AtCoder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int alice = in.nextInt();
            int bob = in.nextInt();
            if (alice == 1) alice = 14;
            if (bob == 1) bob = 14;

            if (alice == bob) {
                out.println("Draw");
            } else if (alice > bob) {
                out.println("Alice");
            } else {
                out.println("Bob");
            }
        }

    }
}

