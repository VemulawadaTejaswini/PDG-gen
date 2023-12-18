import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++)
      A[i] = sc.nextInt();
    sc.close();

    int[] n = new int[N + 1];
    for (int i = 0; i < N; i++) n[A[i]]++;

    BigInteger sum = BigInteger.ZERO;
    long[] c = new long[N + 1];
    for (int i = 0; i < N; i++)
      if (1 < n[i]) {
        c[i] = combination(n[i], 2);
        sum = sum.add(BigInteger.valueOf(c[i]));
      }
    System.out.println(sum);

    for (int i = 0; i < N; i++) {
      int a = A[i];
      long na = n[a];

      long ans = sum.subtract(BigInteger.valueOf(c[a])).longValue();
      if (2L < na) {
        ans += c[a] * (na- 2) / na;
      }
      System.out.println(ans);
    }
  }

  private static long combination(int n, int k) {
    int closer = Integer.min(n - k, k);
    long result = 1;
    for (int i = 1; i <= closer; i++)
      result = result * (n - closer + i) / i;
    return result;
  }
}