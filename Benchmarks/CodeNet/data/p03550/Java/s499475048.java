import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int n = in.nextInt();
            int z = in.nextInt();
            int w = in.nextInt();
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) a.add(in.nextInt());

            if (n == 1) {
                out.println(Math.abs(a.get(0) - w));
            } else {
                out.println(Math.max(Math.abs(a.get(a.size() - 1) - w), Math.abs(a.get(a.size() - 2) - a.get(a.size() - 1))));
            }
        }

    }
}

