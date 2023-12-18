import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(N);
    }
}

class Solver {
    static char alphabet = 'a';

    public void solve(long N) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < N; i++) {
            str.append(alphabet);
        }

        append(str, 0, (int) N);
    }

    private void append(StringBuilder str, int current, int N) {
        if (current >= N) {
            System.out.println(str.toString());
            return;
        }

        for (int i = 0; i <= current; i++) {
            if (current > 1 && str.charAt(current - 1) + 1 < (alphabet + i)) continue;
            str.setCharAt(current, (char) (alphabet + i));
            append(str, current + 1, N);
        }
    }
}

