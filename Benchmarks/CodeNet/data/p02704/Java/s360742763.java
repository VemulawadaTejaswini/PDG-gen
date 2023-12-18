
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final int M = 64;
    private static final int OR1 = 0;
    private static final int AND0 = 1;
    private static final int AND1 = 2;
    private static final int OR0 = 3;

    private BigInteger[] S;
    private BigInteger[] T;
    private BigInteger[] U;
    private BigInteger[] V;
    private int[][][] mat;
    private BigInteger[][] ans;
    private int N;
    private int[][] rowType;
    private int[][] colType;
    private BigInteger[] shift;

    private void read(BigInteger[] v, int N) {
        for (int i = 0; i < N; i++) {
            v[i] = sc.nextBigInteger();
        }
    }

    private int bit(BigInteger v, int k) {
        return v.and(shift[k]).compareTo(BigInteger.ZERO) > 0 ? 1 : 0;
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
            if (rowType[k][r] == AND1) {
                for (int c = 0; c < N; c++) {
                    mat[k][r][c] = 1;
                }
            }
        }

        // AND1 col
        for (int c = 0; c < N; c++) {
            if (colType[k][c] == AND1) {
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
                if (rowType[k][r] == OR1 && colType[k][c] == OR1) {
                    mat[k][r][c] = 1;
                    ++sumR[r];
                    ++sumC[c];
                }

                // AND0 OR1
                if (rowType[k][r] == AND0 && colType[k][c] == OR1) {
                    if (mat[k][r][c] == 0 && sumC[c] == 0 && sumR[r] < N - 1) {
                        mat[k][r][c] = 1;
                        ++sumR[r];
                        ++sumC[c];
                    }
                }

                // OR1 AND0
                if (rowType[k][r] == OR1 && colType[k][c] == AND0) {
                    if (mat[k][r][c] == 0 && sumR[r] == 0 && sumC[c] < N - 1) {
                        mat[k][r][c] = 1;
                        ++sumR[r];
                        ++sumC[c];
                    }
                }
            }
        }
    }

    private BigInteger toBigInteger(int[] t) {
        long tmp = 0;
        for (int k = M - 2; k >= 0; k--) {
            tmp = (tmp << 1) + t[k];
        }
        BigInteger value = BigInteger.valueOf(tmp);
        if (t[M - 1] > 0) {
            value = value.add(shift[M - 1]);
        }
        return value;
    }

    private boolean check() {
        for (int r = 0; r < N; r++) {
            int[] tmp = new int[M];
            boolean isAnd = S[r].compareTo(BigInteger.ZERO) == 0;
            for (int k = 0; k < M; ++k) {
                tmp[k] = mat[k][r][0];
            }
            for (int c = 1; c < N; c++) {
                for (int k = 0; k < M; ++k) {
                    tmp[k] = isAnd ? (tmp[k] & mat[k][r][c]) : (tmp[k] | mat[k][r][c]);
                }
            }

            BigInteger value = toBigInteger(tmp);
            if (value.compareTo(U[r]) != 0) {
                return false;
            }
        }

        for (int c = 0; c < N; c++) {
            int[] tmp = new int[M];
            boolean isAnd = T[c].compareTo(BigInteger.ZERO) == 0;
            for (int k = 0; k < M; ++k) {
                tmp[k] = mat[k][0][c];
            }
            for (int r = 1; r < N; r++) {
                for (int k = 0; k < M; ++k) {
                    tmp[k] = isAnd ? (tmp[k] & mat[k][r][c]) : (tmp[k] | mat[k][r][c]);
                }
            }

            BigInteger value = toBigInteger(tmp);
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

        shift = new BigInteger[M];
        for (int k = 0; k < M; ++k) {
            shift[k] = BigInteger.ONE.shiftLeft(k);
        }

        rowType = new int[M][N];
        colType = new int[M][N];
        for (int k = 0; k < M; ++k) {
            for (int r = 0; r < N; r++) {
                if (isOR1(S[r], U[r], k)) {
                    rowType[k][r] = OR1;
                } else if (isAND0(S[r], U[r], k)) {
                    rowType[k][r] = AND0;
                } else if (isAND1(S[r], U[r], k)) {
                    rowType[k][r] = AND1;
                } else {
                    rowType[k][r] = OR0;
                }
            }

            for (int c = 0; c < N; c++) {
                if (isOR1(T[c], V[c], k)) {
                    colType[k][c] = OR1;
                } else if (isAND0(T[c], V[c], k)) {
                    colType[k][c] = AND0;
                } else if (isAND1(T[c], V[c], k)) {
                    colType[k][c] = AND1;
                } else {
                    colType[k][c] = OR0;
                }
            }
        }

        for (int k = 0; k < M; k++) {
            fill(k);
        }

        ans = new BigInteger[N][N];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                long tmp = 0;
                for (int k = M - 2; k >= 0; k--) {
                    tmp = (tmp << 1) + mat[k][r][c];
                }
                ans[r][c] = BigInteger.valueOf(tmp);
                if (mat[M - 1][r][c] > 0) {
                    ans[r][c] = ans[r][c].add(shift[M - 1]);
                }
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
