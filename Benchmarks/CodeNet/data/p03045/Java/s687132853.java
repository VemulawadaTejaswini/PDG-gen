import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
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
        OneorTwo solver = new OneorTwo();
        solver.solve(1, in, out);
        out.close();
    }

    static class OneorTwo {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            List<Set<Integer>> list = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                int z = in.nextInt();

                boolean added = false;
                for (Set<Integer> set : list) {
                    if (set.contains(x)) {
                        set.add(y);
                        added = true;
                    }
                    if (set.contains(y)) {
                        set.add(x);
                        added = true;
                    }
                }
                if (!added) {
                    HashSet<Integer> s = new HashSet<>();
                    s.add(x);
                    s.add(y);
                    list.add(s);
                }
            }

            for (Set<Integer> set : list) {
                n -= set.size();
            }
            n += list.size();
            out.print(n);
        }

    }
}

