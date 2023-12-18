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
        abc160_b solver = new abc160_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc160_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long X = in.nextLong();
            long amari = 0;
            long score = 0;

            score += ((int) (X / 500)) * 1000;
            amari = X % 500;
            score += ((int) (amari / 5)) * 5;
            out.println(score);
        }

    }
}

