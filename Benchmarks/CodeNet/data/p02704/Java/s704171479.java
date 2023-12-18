
import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final int M = 63;

    private long[] S;
    private long[] T;
    private long[] U;
    private long[] V;
    private int[][][] mat;
    private long[][] ans;
    private int N;

    private void read(long[] v, int N) {
        for (int i = 0; i < N; i++) {
            v[i] = sc.nextInt();
        }
    }

    private int bit(long v, int k) {
        return (v & (1L << k)) > 0 ? 1 : 0;
    }

    private boolean rowExist(int k, int r, int exclude, int value) {
        for (int c = 0; c < N; c++) {
            if (c != exclude && mat[k][r][c] == value) {
                return true;
            }
        }
        return false;
    }

    private boolean colExist(int k, int c, int exclude, int value) {
        for (int r = 0; r < N; r++) {
            if (r != exclude && mat[k][r][c] == value) {
                return true;
            }
        }
        return false;
    }

    private void fill(int k) {
        // AND1 row
        for (int r = 0; r < N; r++) {
            if (S[r] == 0 && bit(U[r], k) == 1) {
                for (int c = 0; c < N; c++) {
                    mat[k][r][c] = 1;
                }
            }
        }

        // AND1 col
        for (int c = 0; c < N; c++) {
            if (T[c] == 0 && bit(V[c], k) == 1) {
                for (int r = 0; r < N; r++) {
                    mat[k][r][c] = 1;
                }
            }
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                // OR1 OR1
                if (S[r] == 1 && bit(U[r], k) == 1 && T[c] == 1 && bit(V[c], k) == 1) {
                    mat[k][r][c] = 1;
                }

                // AND0 OR1
                if (S[r] == 0 && bit(U[r], k) == 0 && T[c] == 1 && bit(V[c], k) == 1) {
                    if (mat[k][r][c] == 0 && !colExist(k, c, r, 1) && rowExist(k, r, c, 0)) {
                        mat[k][r][c] = 1;
                    }
                }

                // OR1 AND0
                if (S[r] == 1 && bit(U[r], k) == 1 && T[c] == 0 && bit(V[c], k) == 0) {
                    if (mat[k][r][c] == 0 && !rowExist(k, r, c, 1) && colExist(k, c, r, 0)) {
                        mat[k][r][c] = 1;
                    }
                }
            }
        }
    }

    private boolean check() {
        for (int r = 0; r < N; r++) {
            long value = ans[r][0];
            for (int c = 1; c < N; c++) {
                value = S[r] == 0 ? (value & ans[r][c]) : (value | ans[r][c]);
            }
            if (value != U[r]) {
                return false;
            }
        }

        for (int c = 0; c < N; c++) {
            long value = ans[0][c];
            for (int r = 0; r < N; r++) {
                value = T[c] == 0 ? (value & ans[r][c]) : (value | ans[r][c]);
            }
            if (value != V[c]) {
                return false;
            }
        }
        return true;
    }

    private void solve() {
        N = sc.nextInt();
        S = new long[N]; T = new long[N]; U = new long[N]; V = new long[N];
        read(S, N); read(T, N); read(U, N); read(V, N);
        mat = new int[M][N][N];

        for (int k = 0; k < M; k++) {
            fill(k);
        }

        ans = new long[N][N];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                long value = 0;
                for (int k = M - 1; k >= 0; k--) {
                    value = (value << 1) + mat[k][r][c];
                }
                ans[r][c] = value;
            }
        }

        if (check()) {
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    System.out.print(ans[r][c]);
                    System.out.print(c == N - 1 ? "\n" : " ");
                }
            }
        } else {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
