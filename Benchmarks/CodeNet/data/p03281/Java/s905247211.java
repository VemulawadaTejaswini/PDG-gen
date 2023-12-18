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
        ABC106_2 solver = new ABC106_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC106_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int count = 0;
            int anscount = 0;
            for (int j = N; j >= 0; j--) {
                for (int i = 1; i <= j; i++) {
                    if ((j % i) == 0) {
                        if ((i % 2) == 1) {
                            count++;
                        }
                    }
                }
                if (count == 8) {
                    anscount++;
                }
                count = 0;
            }
            out.println(anscount);

        }

    }
}

