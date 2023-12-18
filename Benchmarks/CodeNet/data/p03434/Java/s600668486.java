import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            byte N = Byte.parseByte(in.next());
            Byte a[] = new Byte[N];
            for (byte i = 0; i < N; i++) {
                a[i] = Byte.parseByte(in.next());
            }
            Arrays.sort(a, Comparator.reverseOrder());
            byte Alice = 0;
            byte Bob = 0;
            for (byte i = 0; i < N; i += 2) {
                Alice += a[i];
            }
            for (byte i = 1; i < N; i += 2) {
                Bob += a[i];
            }
            out.println(Alice - Bob);
        }

    }
}

