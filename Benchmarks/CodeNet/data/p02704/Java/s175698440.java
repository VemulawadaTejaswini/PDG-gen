
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final int M = 64;

    private BigInteger[] S;
    private BigInteger[] T;
    private BigInteger[] U;
    private BigInteger[] V;
    private int[][][] mat;
    private BigInteger[][] ans;
    private int N;

    private void read(BigInteger[] v, int N) {
        for (int i = 0; i < N; i++) {
            v[i] = sc.nextBigInteger();
        }
    }

    private int bit(BigInteger v, int k) {
        return v.and(BigInteger.ONE.shiftLeft(k)).compareTo(BigInteger.ZERO) > 0 ? 1 : 0;
    }

    private boolean isAND1(BigInteger v1, BigInteger v2, int k) {
        return v1.compareTo(BigInteger.ZERO) == 0 && bit(v2, k) == 1;
    }

    private boolean isOR1(BigInteger v1, BigInteger v2, int k) {
        return v1.compareTo(BigInteger.ONE) == 0 && bit(v2, k) == 1;
    }

    private boolean isAND0(BigInteger v1, BigInteger v2, int k) {
        return v1.compareTo(BigInteger.ZERO) == 0 && bit(v2, k) == 0;
    }

    private void fill(int k) {
        // AND1 row
        for (int r = 0; r < N; r++) {
            if (isAND1(S[r], U[r], k)) {
                for (int c = 0; c < N; c++) {
                    mat[k][r][c] = 1;
                }
            }
        }

        // AND1 col
        for (int c = 0; c < N; c++) {
            if (isAND1(T[c], V[c], k)) {
                for (int r = 0; r < N; r++) {
                    mat[k][r][c] = 1;
                }
            }
        }

        int[] sumR = new int[N];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                sumR[r] += mat[k][r][c];
            }
        }

        int[] sumC = new int[N];
        for (int c = 0; c < N; c++) {
            for (int r = 0; r < N; r++) {
                sumC[c] += mat[k][r][c];
            }
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                // OR1 OR1
                if (isOR1(S[r], U[r], k) && isOR1(T[c], V[c], k)) {
                    mat[k][r][c] = 1;
                    ++sumR[r];
                    ++sumC[c];
                }

                // AND0 OR1
                if (isAND0(S[r], U[r], k) && isOR1(T[c], V[c], k)) {
                    if (mat[k][r][c] == 0 && sumC[c] == 0 && sumR[r] < N - 1) {
                        mat[k][r][c] = 1;
                        ++sumR[r];
                        ++sumC[c];
                    }
                }

                // OR1 AND0
                if (isOR1(S[r], U[r], k) && isAND0(T[c], V[c], k)) {
                    if (mat[k][r][c] == 0 && sumR[r] == 0 && sumC[c] < N - 1) {
                        mat[k][r][c] = 1;
                        ++sumR[r];
                        ++sumC[c];
                    }
                }
            }
        }
    }

    private boolean check() {
        for (int r = 0; r < N; r++) {
            BigInteger value = ans[r][0];
            for (int c = 1; c < N; c++) {
                value = S[r].compareTo(BigInteger.ZERO) == 0 ? (value.and(ans[r][c])) : (value.or(ans[r][c]));
            }
            if (value.compareTo(U[r]) != 0) {
                return false;
            }
        }

        for (int c = 0; c < N; c++) {
            BigInteger value = ans[0][c];
            for (int r = 1; r < N; r++) {
                value = T[c].compareTo(BigInteger.ZERO) == 0 ? (value.and(ans[r][c])) : (value.or(ans[r][c]));
            }
            if (value.compareTo(V[c]) != 0) {
                return false;
            }
        }
        return true;
    }

    private void solve() {
        N = sc.nextInt();
        S = new BigInteger[N]; T = new BigInteger[N]; U = new BigInteger[N]; V = new BigInteger[N];
        read(S, N); read(T, N); read(U, N); read(V, N);
        mat = new int[M][N][N];

        for (int k = 0; k < M; k++) {
            fill(k);
        }

        ans = new BigInteger[N][N];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                BigInteger value = BigInteger.ZERO;
                for (int k = M - 1; k >= 0; k--) {
                    value = value.shiftLeft(1).add(BigInteger.valueOf(mat[k][r][c]));
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
