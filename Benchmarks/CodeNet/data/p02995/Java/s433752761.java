import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long A;
        A = sc.nextLong();
        long B;
        B = sc.nextLong();
        long C;
        C = sc.nextLong();
        long D;
        D = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(A, B, C, D);
    }
}

class Solver {
    public void solve(long A, long B, long C, long D) {
        long top = num(B, C, D);
        long bottom = num(A - 1, C, D);
        long ans = top - bottom;

        System.out.println(ans);
    }

    private long num(long N, long C, long D) {
        long lcd = Math.abs(C * D) / gcd(C, D);
        return N - (N / C + N / D - N / lcd);
    }

    private long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
