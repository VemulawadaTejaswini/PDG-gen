import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long X;
        X = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(X);
    }
}

class Solver {
    public void solve(long X) {
        long ans = 0;
        ans += X / 500 * 1000;
        X %= 500;
        ans += X / 5 * 5;
        System.out.println(ans);
    }
}

