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
 *
 * @author acesine
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            List<Integer> s = new ArrayList<>();
            int g = 0;
            for (int i = 0; i < n; i++) {
                s.add(in.nextInt());
                g += s.get(i);
            }
            if (g % 10 != 0) {
                out.println(g);
            } else {
                Collections.sort(s);
                for (int c : s) {
                    if (c % 10 != 0) {
                        g -= c;
                        break;
                    }
                }
                if (g % 10 == 0) {
                    out.println(0);
                } else {
                    out.println(g);
                }
            }
        }

    }
}

