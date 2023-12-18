import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long K;
        K = sc.nextLong();
        String S;
        S = sc.next();

        final Solver solver = new Solver();
        solver.solve(N, K, S);
    }
}

class Solver {
    public void solve(long N, long K, String S) {
        int target = (int) (K - 1);
        for (int i = 0; i < N; i++) {
            if (i == target) {
                char n = (char) (S.charAt(target) - ('A' - 'a'));
                System.out.print(n);
                continue;
            }
            System.out.print(S.charAt(i));
        }
        System.out.println();
    }
}

