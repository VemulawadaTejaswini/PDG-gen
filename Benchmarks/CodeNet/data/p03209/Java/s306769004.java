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
        ABC115_D solver = new ABC115_D();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC115_D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int X = in.nextByte();

            String[] berg = new String[N + 1];

            berg[0] = "P";

            for (int i = 1; i < N + 1; i++) {
                berg[i] = "B" + berg[i - 1] + "P" + berg[i - 1] + "B";
            }

            String buff = berg[N].substring(berg[N].length() - X);
            int cnt = 0;
            for (int i = 0; i < buff.length(); i++) {
                if (buff.charAt(i) == 'P') {
                    cnt++;
                }
            }
            out.println(cnt);
        }

    }
}

