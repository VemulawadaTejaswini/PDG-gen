import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long X;
        X = sc.nextLong();
        long A;
        A = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(X, A);
    }
}

class Solver {
    public void solve(long X, long A) {
        if (X < A) {
            System.out.println(0);
        }
        else {
            System.out.println(10);
        }
    }
}

