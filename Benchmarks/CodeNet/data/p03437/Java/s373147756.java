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
        APC001A solver = new APC001A();
        solver.solve(1, in, out);
        out.close();
    }

    static class APC001A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long a = in.nextLong();
            long b = in.nextLong();
            long ca = a * b + a;

            long ans = ca % b == 0 ? -1 : ca;
            out.println(ans);
        }

    }
}

