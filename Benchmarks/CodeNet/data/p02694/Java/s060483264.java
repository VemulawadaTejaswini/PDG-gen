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
        abc165_b solver = new abc165_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc165_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long X = in.nextLong();
            long base = 100;
            long year = 1;
            while (true) {
                base += Math.floor(base / 100);
                if (X <= base) {
                    out.println(year);
                    return;
                } else {
                    year++;
                }
            }
        }

    }
}

