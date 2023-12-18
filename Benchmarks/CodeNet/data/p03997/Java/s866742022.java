import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Aeroui
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] a1 = in.next().toCharArray();
            char[] a2 = in.next().toCharArray();
            char[] a3 = in.next().toCharArray();

            int len = Math.min(a1.length, Math.min(a2.length, a3.length));
            char ans = '#';
            for (int i = 0; i < len; i++) {
                if (a1[i] == a2[i] && a2[i] == a3[i]) {
                    out.println((char) ('A' + a1[i] - 'a'));
                    return;
                } else if ((a1[i] == a2[i] || a1[i] == a3[i]) && ans == '#') {
                    ans = (char) ('A' + a1[i] - 'a');
                } else if ((a1[i] == a2[i] || a2[i] == a3[i]) && ans == '#') {
                    ans = (char) ('A' + a2[i] - 'a');
                }

            }

            out.println(ans);
        }

    }
}

