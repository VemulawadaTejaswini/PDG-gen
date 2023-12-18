import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[][] a = new int[N][N];
    for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) a[i][j] = scanner.nextInt();

    long[] dp = new long[1 << N];
    for (int i = 1; i < (1 << N); i++) {
      int msb = msb(i);
      dp[i] = dp[i ^ (1 << msb)];

      int k = i;
      int j = 0;
      while (k > 0) {
        if (k % 2 == 1) {
          dp[i] += a[msb][j];
        }
        k /= 2;
        j++;
      }
    }

    for (int i = 1; i < (1 << N); i++) {
      int nOnes = countOnes(i);
      int[] elems = new int[nOnes];
      {
        int k = i;
        int j = 0;
        int l = 0;
        while (k > 0) {
          if (k % 2 == 1) elems[j++] = l;
          k /= 2;
          l++;
        }
      }
      for (int j = 1; j < (1 << nOnes) - 1; j++) {
        int n = 0;
        int k = j;
        int l = 0;
        while (k > 0) {
          if (k % 2 == 1) {
            n ^= (1 << elems[l]);
          }
          k /= 2;
          l++;
        }
        dp[i] = Math.max(dp[i], dp[n] + dp[i ^ n]);
      }
    }

    long max = 0;
    for (int i = 0; i < (1 << N); i++) {
      max = Math.max(max, dp[i]);
    }
    System.out.println(max);
  }


  private static int countOnes(int n) {
    int cnt = 0;
    while (n > 0) {
      n &= n - 1;
      cnt++;
    }
    return cnt;
  }

  private static int msb(int n) {
    int i = -1;
    while (n > 0) {
      n /= 2;
      i++;
    }
    return i;
  }
}
