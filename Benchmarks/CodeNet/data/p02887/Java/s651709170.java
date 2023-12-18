import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        String S;
        S = sc.next();

        final Solver solver = new Solver();
        solver.solve(N, S);
    }
}

class Solver {
    public void solve(long N, String S) {
        int ans = 1;
        char current = S.charAt(0);
        for (int i = 1; i < N; i++) {
            if (current != S.charAt(i)) {
                ans++;
                current = S.charAt(i);
            }
        }
        System.out.println(ans);
    }
}

