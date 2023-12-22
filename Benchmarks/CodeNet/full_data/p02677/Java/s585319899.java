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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int longDistance = in.nextInt();
            int shortDistance = in.nextInt();
            int hour = in.nextInt();
            int minute = in.nextInt();

            double kakudo = ((double) (60 * hour + minute) / (60 * 12)) * 360;
            double kakudoShort = ((double) minute / 60) * 360;
            double diff = Math.abs(kakudo - kakudoShort);

            double ans = Math.pow(longDistance, 2) +
                    Math.pow(shortDistance, 2) -
                    (2 * longDistance * shortDistance * Math.cos(Math.toRadians(diff)));

            out.append(String.valueOf(Math.sqrt(ans)));

        }

    }
}

