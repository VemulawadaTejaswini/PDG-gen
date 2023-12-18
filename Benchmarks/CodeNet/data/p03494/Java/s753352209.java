import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.Scanner;

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
        ABC081BShiftOnly solver = new ABC081BShiftOnly();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC081BShiftOnly {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long[] a = IntStream.range(0, in.nextInt()).mapToLong(x -> in.nextLong()).toArray();
            for (int i = 0; ; i++) {
                long m = 1 << i;
                if (Arrays.stream(a).anyMatch(x -> (x & m) > 0)) {
                    out.println(i);
                    return;
                }
            }
        }

    }
}

