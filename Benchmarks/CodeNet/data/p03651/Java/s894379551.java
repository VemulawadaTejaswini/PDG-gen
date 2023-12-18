import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author PRANJAL AGNIHOTRI
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
            int N = in.nextInt();
            int K = in.nextInt();
            int max = 0;
            int gcd = 0;
            for (int i = 0; i < N; i++) {
                int a = in.nextInt();
                max = Math.max(max, a);
                gcd = findGCD(max, a);
            }
            if (K <= max && K % gcd == 0) {
                out.println("POSSIBLE");
            } else {
                out.println("IMPOSSIBLE");
            }
        }

        private int findGCD(int a, int b) {
            while (b > 0) {
                int t = a % b;
                a = b;
                b = t;
            }
            return a;
        }

    }
}

