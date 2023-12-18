import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;

    public static void main(final String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));

        try {
            final int A = readInt();
            final int P = readInt();

            final Solver solver = new Solver();

            System.out.println(solver.solve(A, P));

        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}

class Solver {
    public int solve(final int A, final int P) {
        final int pieces = A * 3 + P;

        return pieces / 2;
    }
}