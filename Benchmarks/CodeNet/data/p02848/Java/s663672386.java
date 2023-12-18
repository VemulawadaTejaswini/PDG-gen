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
        for (int i = 0; i < S.length(); i++) {
            int up = (int) ((S.charAt(i) - 'A' + N) / 26);
            char alpha = (char) (S.charAt(i) + N - up * 26);

            System.out.print(alpha);
        }
        System.out.println();
    }
}

