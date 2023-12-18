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
        ACatsAndDogs solver = new ACatsAndDogs();
        solver.solve(1, in, out);
        out.close();
    }

    static class ACatsAndDogs {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt(), b = in.nextInt(), x = in.nextInt() - a;
            out.println(0 <= x && x <= b ? "YES" : "NO");
        }

    }
}

