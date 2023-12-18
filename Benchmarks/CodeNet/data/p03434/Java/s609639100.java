import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
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
        BCardGameForTwo solver = new BCardGameForTwo();
        solver.solve(1, in, out);
        out.close();
    }

    static class BCardGameForTwo {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = Integer.parseInt(in.next());
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(Integer.parseInt(in.next()));
            }
            a.sort(Comparator.comparingInt(c -> -c));

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    count += a.get(i);
                } else {
                    count -= a.get(i);
                }
            }
            out.println(count);
        }

    }
}

