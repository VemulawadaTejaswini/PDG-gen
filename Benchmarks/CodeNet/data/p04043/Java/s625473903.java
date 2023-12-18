import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            Map<Integer, Integer> m = new HashMap<Integer, Integer>();
            int A = in.nextInt(), B = in.nextInt(), C = in.nextInt();
            m.put(A, m.getOrDefault(A, 0) + 1);
            m.put(B, m.getOrDefault(B, 0) + 1);
            m.put(C, m.getOrDefault(C, 0) + 1);
            if (m.getOrDefault(5, 0) == 2 && m.getOrDefault(7, 0) == 1) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }

    }
}

