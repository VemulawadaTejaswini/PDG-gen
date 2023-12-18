import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long W;
        W = sc.nextLong();
        long H;
        H = sc.nextLong();
        long x;
        x = sc.nextLong();
        long y;
        y = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(W, H, x, y);
    }
}

class Solver {
    public void solve(long W, long H, long x, long y) {
        final double area = W * H / 2.0;
        final boolean multiple = W == (x + x) && H == (y + y);

        System.out.println(String.format("%f %b\n", area, multiple));
    }
}

