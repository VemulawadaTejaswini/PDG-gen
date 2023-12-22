import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mehvix
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        abc168_b solver = new abc168_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc168_b {
        public void solve(int testNumber, Scanner fin, PrintWriter fout) {
            int k = fin.nextInt();
            String s = fin.next();
            if (s.length() <= k) fout.println(s);
            else fout.println(s.substring(0, k) + "...");
        }

    }
}

