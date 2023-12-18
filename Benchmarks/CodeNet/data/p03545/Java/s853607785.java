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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int a = Integer.parseInt(s.substring(0, 1));
            int b = Integer.parseInt(s.substring(1, 2));
            int c = Integer.parseInt(s.substring(2, 3));
            int d = Integer.parseInt(s.substring(3, 4));
            // kuso code ;;
            if (a + b + c + d == 7) out.println(a + "+" + b + "+" + c + "+" + d + "=" + 7);
            else if (a + b + c - d == 7) out.println(a + "+" + b + "+" + c + "-" + d + "=" + 7);
            else if (a + b - c + d == 7) out.println(a + "+" + b + "-" + c + "+" + d + "=" + 7);
            else if (a + b - c - d == 7) out.println(a + "+" + b + "-" + c + "-" + d + "=" + 7);
            else if (a - b + c + d == 7) out.println(a + "-" + b + "+" + c + "+" + d + "=" + 7);
            else if (a - b + c - d == 7) out.println(a + "-" + b + "+" + c + "-" + d + "=" + 7);
            else if (a - b - c + d == 7) out.println(a + "-" + b + "-" + c + "+" + d + "=" + 7);
            else if (a - b - c - d == 7) out.println(a + "-" + b + "-" + c + "-" + d + "=" + 7);
        }

    }
}

