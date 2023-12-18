import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CMaximalValue solver = new CMaximalValue();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMaximalValue {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = ReadInput.readIntArray(n - 1, in);
            long sum = Arrays.stream(a).sum();
            sum += a[0];
            out.println(sum);
        }

    }

    static class ReadInput {
        public static int[] readIntArray(int size, Scanner in) {
            int a[] = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = in.nextInt();
            }
            return a;
        }

    }
}

