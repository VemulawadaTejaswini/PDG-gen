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
        Multiplication3 solver = new Multiplication3();
        solver.solve(1, in, out);
        out.close();
    }

    static class Multiplication3 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            String[] inputs = in.nextLine().split(" ");
            long a = Long.parseLong(inputs[0]);
            long b = Long.parseLong(inputs[1].replaceAll("\\.", ""));

            out.append(String.valueOf(a * b / 100));


        }

    }
}

