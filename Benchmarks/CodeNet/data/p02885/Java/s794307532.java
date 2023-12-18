import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long A;
        A = sc.nextLong();
        long B;
        B = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(A, B);
    }
}

class Solver {
    public void solve(long A, long B) {
        int ans = (int) (A - 2 * B);
        System.out.println(ans >= 0 ? ans : 0);
    }
}

