import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private List<int[]> prime_factorize(int N) {
        List<int[]> res = new ArrayList<int[]>();
        for (int a = 2; a * a <= N; a++) {
            if (N % a != 0) continue;
            int ex = 0;

            while (N % a == 0) {
                ++ex;
                N /= a;
            }

            res.add(new int[]{a, ex});
        }

        if (N != 1) res.add(new int[]{N, 1});
        return res;
    }

    private boolean check(List<int []> list) {
        for (int[] a : list) {
            if (a[1] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    private int dist2(int[][] X, int N, int D, int i, int j) {
        int sum = 0;
        for (int k = 0; k < D; k++) {
            int v = X[i][k] - X[j][k];
            sum += v * v;
        }
        return sum;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();

        int[][] X = new int[N][D];
        int[][] M = new int[N][D];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                X[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (i != j) {
                    // comapring i with j.
                    int s = dist2(X, N, D, i, j);
                    if (check(prime_factorize(s))) {
                        cnt++;
                    } else {
                    }
                }
            }
        }
        System.out.println(cnt);

        return;
    }

}