import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long A;
        A = sc.nextLong();
        long B;
        B = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(A, B);
    }
}

class Solver {
    public void solve(long A, long B) {

        for (int i = 0; i < 10; i++) {
            double testA = A + 0.1 * i;
            int oriA = (int) Math.round(testA / 0.08);
            for (int j = 0; j < 10; j++) {
                double testB = B + 0.1 * j;
                int oriB = (int) Math.round(testB / 0.10);

                if (oriA == oriB) {
                    System.out.println(oriA);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}

