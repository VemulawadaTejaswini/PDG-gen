import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author myob-_-
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
        double a = in.nextDouble();
        double b = in.nextDouble();
        double H = in.nextDouble();
        double M = in.nextDouble();
        double HH = H*30+ M/2;
        double MM = M*6;
        double ang = Math.abs(HH-MM);
        ang = Math.min(360-ang, ang);
        double result = Math.sqrt((a*a)+(b*b)-(2*a*b*Math.cos(Math.toRadians(ang))));
        out.println(String.format("%.10f", result));
    }

    }
}

