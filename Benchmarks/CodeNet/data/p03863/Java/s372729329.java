import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DAnOrdinaryGame solver = new DAnOrdinaryGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class DAnOrdinaryGame {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            out.println(s.charAt(0) == s.charAt(s.length() - 1) ^ s.length() % 2 == 1 ? "First" : "Second");
        }

    }
}

