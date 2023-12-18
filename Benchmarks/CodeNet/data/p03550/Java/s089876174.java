import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
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
            if (n % 2 == 0) {
                List<Integer> a = new ArrayList<>();
                for (int i = 0; i < n + 2; i++) a.add(in.nextInt());
                Collections.sort(a);
                out.println(Math.abs(a.get(a.size() - 1) - a.get(a.size() - 2)));
            } else {
                List<Integer> even = new ArrayList<>();
                List<Integer> odd = new ArrayList<>();
                for (int i = 0; i < n + 2; i++) {
                    if (i % 2 == 0) even.add(in.nextInt());
                    else odd.add(in.nextInt());
                }
                Collections.sort(even);
                Collections.sort(odd);
                out.println(Math.abs(even.get(even.size() - 1) - odd.get(odd.size() - 1)));
            }
        }

    }
}

