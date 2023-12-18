import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long K;
        K = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(K);
    }
}

class Solver {
    public void solve(long K) {
        int[] a = {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
        System.out.println(a[(int) (K - 1)]);
    }
}

