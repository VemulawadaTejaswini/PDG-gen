import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] X = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                X[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, X);
    }
}

class Solver {
    public void solve(long N, long[] X) {
        long min = Long.MAX_VALUE;
        for (int i = 0; i < 100; i++) {
            long sum = 0;
            for (int j = 0; j < N; j++) {
                sum += Math.pow(X[j] - i, 2);
            }

            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}
