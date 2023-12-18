import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hsy
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task2 solver = new Task2();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int[] a = new int[3];
            for (int i = 0; i < s.length(); i++) {
                a[s.charAt(i) - 'a']++;
            }
            int l = s.length() / 3 + (s.length() % 3 == 0 ? 0 : 1);
            for (int i = 0; i < 3; i++) {
                if (a[i] > l) {
                    out.println("NO");
                    return;
                }
            }
            out.println("YES");
        }

    }
}

