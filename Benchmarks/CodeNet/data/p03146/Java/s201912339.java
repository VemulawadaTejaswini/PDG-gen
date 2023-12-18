import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

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
        ABC116_B solver = new ABC116_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC116_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>();
            array.add(n);
            int a = n;

            while (true) {
                if (a % 2 == 0) {
                    a = a / 2;
                } else {
                    a = a * 3 + 1;
                }
                if (array.contains(a)) {
                    out.print(array.size() + 1);
                    break;
                }
                array.add(a);
            }
        }

    }
}

