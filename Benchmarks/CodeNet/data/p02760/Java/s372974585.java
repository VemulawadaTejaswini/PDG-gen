import java.io.*;
import java.util.*;

public class Main {
    static final String YES = "Yes";
    static final String NO = "No";

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long[][] A = new long[(int)(3)][(int)(3)];
        for(int i = 0 ; i < 3 ; i++){
                for(int j = 0 ; j < 3 ; j++){
                    A[i][j] = sc.nextLong();
                }
        }
        long N;
        N = sc.nextLong();
        long[] b = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                b[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(A, N, b);
    }
}

class Solver {
    public void solve(long[][] A, long N, long[] b) {
        boolean[][] hit = new boolean[(int)(3)][(int)(3)];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (A[j][k] == b[i]) {
                        hit[j][k] = true;
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (hit[i][0] && hit[i][1] && hit[i][2]) {
                System.out.println("Yes");
                return;
            }
            if (hit[0][i] && hit[1][i] && hit[2][i]) {
                System.out.println("Yes");
                return;
            }
        }

        if (hit[0][0] && hit[1][1] && hit[2][2]) {
            System.out.println("Yes");
            return;
        }
        if (hit[0][2] && hit[1][1] && hit[2][0]) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}

