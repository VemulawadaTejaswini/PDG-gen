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
        CADDi_2 solver = new CADDi_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class CADDi_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int H = in.nextInt();
            int W = in.nextInt();
            int co = 0;


            for (int i = 0; i < N; i++) {
                boolean Hok = false;
                boolean Wok = false;
                int pH = in.nextInt();
                int pW = in.nextInt();
                if (pH >= H) {
                    Hok = true;
                }
                if (pW >= W) {
                    Wok = true;
                }
                if ((Hok) && (Wok)) {
                    co++;
                }
            }
            out.println(co);
        }

    }
}

