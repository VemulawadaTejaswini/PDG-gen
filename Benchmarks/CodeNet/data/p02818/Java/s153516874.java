import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long A;
        A = sc.nextLong();
        long B;
        B = sc.nextLong();
        long K;
        K = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(A, B, K);
    }
}

class Solver {
    public void solve(long A, long B, long K) {
        long a = Math.max(0, A - K);
        long b = Math.max(0, B - Math.max(0, K - A));
        System.out.println(a + " " + b);
    }
}

