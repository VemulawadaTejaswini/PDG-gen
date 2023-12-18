import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
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
            final int l = in.nextInt();
            final int r = in.nextInt();
            int count = 0;
            for (int i = l; i <= r; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(i));
                if (sb.toString().equals(sb.reverse().toString())) count++;
            }
            out.println(count);
        }

    }
}

