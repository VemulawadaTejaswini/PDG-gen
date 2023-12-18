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
        while (!isPrime(X)) X++;
        System.out.println(X);
    }

    private boolean isPrime(long a) {
        if (a <= 1) return false;
        for (int i = 2; i * i < a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}

