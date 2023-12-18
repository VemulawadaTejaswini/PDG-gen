import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long a;
        a = sc.nextLong();
        long b;
        b = sc.nextLong();
        long c;
        c = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(a, b, c);
    }
}

class Solver {
    public void solve(long a, long b, long c) {
        if (a + b + c < 22) {
            System.out.println("win");
        }
        else {
            System.out.println("bust");
        }
    }
}

