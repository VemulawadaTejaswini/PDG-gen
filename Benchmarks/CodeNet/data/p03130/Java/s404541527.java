import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        YProcon_2 solver = new YProcon_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class YProcon_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[] city = new int[4 + 1];
            boolean first = true;

            for (int i = 0; i < 3; i++) {
                int a = in.nextInt(); //a1
                int b = in.nextInt();
                city[a] += 1;
                city[b] += 1;
            }

            int come2count = 0;
            for (int val : city) {
                if (val == 2) {
                    come2count++;
                }
            }
            if (come2count == 2) {
                out.println("YES");
            } else {
                out.println("NO");
            }

        }

    }
}

