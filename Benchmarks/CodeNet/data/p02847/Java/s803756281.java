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
        A_Holiday solver = new A_Holiday();
        solver.solve(1, in, out);
        out.close();
    }

    static class A_Holiday {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.nextLine();
            int ans = 0;
            if (s.equals("SUN")) ans = 7;
            else if (s.equals("MON")) ans = 6;
            else if (s.equals("TUE")) ans = 5;
            else if (s.equals("WED")) ans = 4;
            else if (s.equals("THU")) ans = 3;
            else if (s.equals("FRI")) ans = 2;
            else if (s.equals("SAT")) ans = 1;

            out.println(ans);


        }

    }
}

