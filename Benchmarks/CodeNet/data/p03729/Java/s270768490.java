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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[][] arr = new char[3][];

            for (int i = 0; i < 3; i++) {
                arr[i] = in.next().toCharArray();
            }

            if (arr[0][arr[0].length - 1] == arr[1][0] && arr[1][arr[1].length - 1] == arr[2][0]) {
                out.println("YES");
            } else out.println("NO");

        }

    }
}

