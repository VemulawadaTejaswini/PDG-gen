import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CMitsui solver = new CMitsui();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMitsui {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x = in.nextInt();
            int num = x / 100;
            int kosu = ((x % 100) + 4) / 5;
            out.println(num < kosu ? "0" : "1");
        }

    }
}

