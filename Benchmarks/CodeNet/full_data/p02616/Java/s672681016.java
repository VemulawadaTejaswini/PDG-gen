import java.math.BigInteger;
import java.util.*;

public class Main {

  private static final int MOD = 1_000_000_007;

  public static void main(String[] args) {
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    long[] A = new long[n];
    for (int i = 0; i < n; i++) {
      A[i] = scanner.nextInt();
    }
    List<Long> pos = new ArrayList<>();
    List<Long> neg = new ArrayList<>();
    int zero = 0;
    for (long i : A) {
      if (i > 0) {
        pos.add(i);
      } else if (i < 0) {
        neg.add(i);
      } else {
        zero++;
      }
    }
    if (pos.size() + neg.size() < k || (n == k && zero > 0)) {
      System.out.println(0);
      return;
    }
    if (n == k) {
      long res = 1;
      for (long i : A) {
        res = (res * i) % MOD;
      }
      System.out.println(Math.floorMod(res, MOD));
      return;
    }
    Arrays.sort(A);
    BigInteger res = BigInteger.ONE;
    int j = A.length - 1;
    int i = 0;
    if (A[j] < 0 || k == 1) {
      for (; k > 0; k--) {
        res = res.multiply(BigInteger.valueOf(A[j--]));
      }
      System.out.println(res.remainder(BigInteger.valueOf(MOD)));
      return;
    }
    if (k % 2 != 0) {
      res = res.multiply(BigInteger.valueOf(A[j--]));
    }
    for (; k > 0; k -= 2) {
      BigInteger lft = BigInteger.valueOf(A[i]).multiply(BigInteger.valueOf(A[i + 1]));
      BigInteger rgt = BigInteger.valueOf(A[j]).multiply(BigInteger.valueOf(A[j - 1]));
      if (lft.compareTo(rgt) > 0) {
        res = res.multiply(lft);
        i += 2;
      } else {
        res = res.multiply(rgt);
        j -= 2;
      }
    }
    System.out.println(res.remainder(BigInteger.valueOf(MOD)));
  }

  private static final Scanner scanner = new Scanner(System.in);
}
