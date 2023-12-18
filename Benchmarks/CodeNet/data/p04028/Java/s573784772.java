import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    TaskD solver = new TaskD();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskD {

    int MOD = (int) (1e9 + 7);

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int N = in.nextInt();
      int M = in.next().length();

      int res = solve(N, M);
      out.println(res);
    }

    private long[] computeStep(int N, int M) {
      int[][] stepDp = new int[N + 1][N + 1];
      stepDp[0][0] = 1;
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          stepDp[i + 1][j + 1] += stepDp[i][j];
          if (stepDp[i + 1][j + 1] >= MOD) {
            stepDp[i + 1][j + 1] -= MOD;
          }
          stepDp[i + 1][Math.max(0, j - 1)] += stepDp[i][j];
          if (stepDp[i + 1][Math.max(0, j - 1)] >= MOD) {
            stepDp[i + 1][Math.max(0, j - 1)] -= MOD;
          }
        }
      }
      long[] step = new long[N + 1];
      for (int i = 0; i < N + 1; i++) {
        step[i] = stepDp[i][M];
      }
      return step;
    }

    private int solve(int N, int M) {
      long[] step = computeStep(N, M);
      long[][] C = new long[N + 2][N + 1];
      for (int i = 0; i < C.length; i++) {
        for (int j = 0; j < i + 1 && j < C[i].length; j++) {
          C[i][j] = j == 0 ? 1 : C[i - 1][j - 1] + C[i - 1][j];
          if (C[i][j] >= MOD) {
            C[i][j] -= MOD;
          }
        }
      }

      long[] inv = new long[N + 2];
      for (int i = 0; i < N + 2; i++) {
        inv[i] = MathUtils.inverse(i, MOD);
      }

      int[][] det = new int[N + 1][N + 1]; // i歩で、j回 0 に戻る
      det[0][0] = 1;
      for (int i = 0; i < N + 1; i++) {
        if (i % 2 != 0) {
          continue;
        }
        int n = i / 2;
        for (int j = 0; j < n; j++) {
          long val = (j + 1) * C[2 * n - 2 - j][n - 1 - j] % MOD * inv[n] % MOD;
          if (n <= 4) {
//          System.err.printf("T(%d,%d): %d\n", n, j, val);
          }
          val = val * MathUtils.powMod(2, n - 1 - j, MOD) % MOD;
          det[i][j + 1] = (int) val;
        }
      }

      long res = 0;
      for (int t = 0; t < N + 1; t++) {
        for (int k = 0; k < N + 1; k++) {
          res = (res + C[N - t + 1][k] * step[N - t] % MOD * det[t][k]) % MOD;
        }
      }
      return (int) res;
    }

  }

  static class MathUtils {

    public static long powMod(long value, long exponent, int modulo) {
      if (exponent < 0) {
        throw new IllegalArgumentException("negative exponent");
      }
      if (modulo == 1) {
        return 0;
      }
      if (value >= modulo) {
        value %= modulo;
      }
      if (value < 0) {
        value = value % modulo + value;
      }
      long res = 1;
      while (exponent > 0) {
        if ((exponent & 1) == 1) {
          res = res * value % modulo;
        }
        value = value * value % modulo;
        exponent >>= 1;
      }
      return res;
    }

    public static long inverse(long value, int modPrime) {
      return powMod(value, modPrime - 2, modPrime);
    }

  }
}

