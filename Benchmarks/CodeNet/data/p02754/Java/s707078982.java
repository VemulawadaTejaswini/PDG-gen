import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long A;
        A = sc.nextLong();
        long B;
        B = sc.nextLong();

        final Solver solver = new Solver();
        System.out.println(solver.solve(N, A, B));
    }
}

class Solver {
    public long solve(long N, long A, long B) {
        long T = A + B;

        long ans = 0;

        long count = N / T;
        ans += count * A;


        long rest = N % T;
        if (rest <= A) {
            ans += rest;
        }
        else {
            ans += A;
        }

        return ans;
    }
}

