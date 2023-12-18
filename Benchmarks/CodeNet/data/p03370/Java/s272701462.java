import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.OptionalInt;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BBitterAlchemy solver = new BBitterAlchemy();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBitterAlchemy {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), x = in.nextInt();
            int[] m = IntStream.range(0, n).map(i -> in.nextInt()).toArray();
            int min = Arrays.stream(m).min().orElse(0);
            int sum = Arrays.stream(m).sum();
            out.println((x - sum) / min + n);
        }

    }
}

