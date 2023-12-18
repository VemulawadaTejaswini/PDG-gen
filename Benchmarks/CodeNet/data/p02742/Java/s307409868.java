import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long H;
        H = sc.nextLong();
        long W;
        W = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(H, W);
    }
}

class Solver {
    public void solve(long H, long W) {
        long total = (long) Math.ceil(H / 2.0 * W);
        System.out.println(total);
    }
}

