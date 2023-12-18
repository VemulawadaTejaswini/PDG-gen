import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        String S;
        S = sc.next();
        String T;
        T = sc.next();

        final Solver solver = new Solver();
        solver.solve(N, S, T);
    }
}

class Solver {
    public void solve(long N, String S, String T) {
        for (int i = 0; i < N; i++) {
            System.out.print(S.charAt(i));
            System.out.print(T.charAt(i));
        }
        System.out.println();
    }
}

