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
        AGoodInteger solver = new AGoodInteger();
        solver.solve(1, in, out);
        out.close();
    }

    static class AGoodInteger {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int a = Integer.parseInt(s.substring(0, 3));
            int b = Integer.parseInt(s.substring(1, 4));
            out.println(a * b % 111 == 0 ? "Yes" : "No");
        }

    }
}

