import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long H;
        H = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(H);
    }
}

class Solver {
    public void solve(long H) {
        long i = 0;
        while (H > 0) {
            i++;
            H /= 2;
        }

        System.out.println((long) (Math.pow(2, i) - 1));
    }
}

