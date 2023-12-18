import java.io.*;
import java.util.*;

public class Main {
    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();

        final Solver solver = new Solver();
        System.out.println(solver.solve(N));
    }
}

class Solver {
    static final String YES = "Yes";
    static final String NO = "No";

    public String solve(long N) {
        for (int i = 1; i <= 9; i++) {
            if (N % i == 0 && N / i <= 9) {
                return YES;
            }
        }
        return NO;
    }
}

