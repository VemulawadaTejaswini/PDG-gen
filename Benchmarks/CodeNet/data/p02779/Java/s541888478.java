import java.io.*;
import java.util.*;

public class Main {
    static final String YES = "YES";
    static final String NO = "NO";

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] A = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                A[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, A);
    }
}

class Solver {
    public void solve(long N, long[] A) {
        TreeSet set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            set.add(A[i]);
        }
        System.out.println(set.size() == A.length ? "YES" : "NO");
    }
}

