import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGacha solver = new CGacha();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGacha {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            HashSet<String> hs = new HashSet<>();
            for (int i = 0; i < n; i++) {
                hs.add(in.next());
            }
            out.println(new ArrayList<String>(hs).size());
        }

    }
}

