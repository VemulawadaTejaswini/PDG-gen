import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CBackAndForth solver = new CBackAndForth();
        solver.solve(1, in, out);
        out.close();
    }

    static class CBackAndForth {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int sx = in.nextInt();
            int sy = in.nextInt();
            int tx = in.nextInt();
            int ty = in.nextInt();

            int yoko = tx - sx;
            int tate = ty - sy;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < yoko; i++) {
                sb.append("R");
            }
            for (int i = 0; i < tate; i++) {
                sb.append("U");
            }
            for (int i = 0; i < yoko; i++) {
                sb.append("L");
            }
            for (int i = 0; i <= tate; i++) {
                sb.append("D");
            }
            for (int i = 0; i <= yoko; i++) {
                sb.append("R");
            }
            for (int i = 0; i <= tate; i++) {
                sb.append("U");
            }
            sb.append("LU");
            for (int i = 0; i <= yoko; i++) {
                sb.append("L");
            }
            for (int i = 0; i <= tate; i++) {
                sb.append("D");
            }
            sb.append("R");

            out.println(sb);
        }
    }
}

