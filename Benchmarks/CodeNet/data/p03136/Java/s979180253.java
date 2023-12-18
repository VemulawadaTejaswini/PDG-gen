import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        ABC117_2 solver = new ABC117_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC117_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] L = new int[N];

            for (int i = 0; i < N; i++) {
                L[i] = in.nextInt();
            }
            Arrays.sort(L);
            int MAX = L[L.length - 1];
            int Othersum = 0;
            for (int i = L.length - 2; i >= 0; i--) {
                Othersum += L[i];
            }
            if (MAX < Othersum) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }

    }
}

