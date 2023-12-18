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
        TPBC_2 solver = new TPBC_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class TPBC_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            int K = in.nextInt();

            int AB[] = {A, B};
            int cycle = 0;

            for (int i = 0; i < K; i++) {
                if ((AB[cycle] % 2) > 0) {
                    AB[cycle] -= 1;
                }
                if (cycle == 0) {
                    AB[cycle + 1] += AB[cycle] / 2;
                    AB[cycle] /= 2;
                    cycle = 1;
                } else {
                    AB[cycle - 1] += AB[cycle] / 2;
                    AB[cycle] /= 2;
                    cycle = 0;
                }

            }
            out.println(AB[0] + " " + AB[1]);
            return;


        }

    }
}

