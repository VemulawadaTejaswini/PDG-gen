import java.util.*;

public class Main {

  public static void main(String[] args) {
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int[] A = new int[n];
    for (int i = 0; i < n; i++) {
      A[i] = scanner.nextInt();
    }
    List<Integer> pos = new ArrayList<>();
    List<Integer> neg = new ArrayList<>();
    int mod = 1000000007;
    int zero = 0;
    long all = 1;
    for (int i : A) {
      if (i > 0) {
        pos.add(i);
      } else if (i < 0) {
        neg.add(i);
      } else {
        zero++;
      }
      all = (all * i) % mod;
    }
    if (pos.size() + neg.size() < k || (n == k && zero > 0)) {
      System.out.println(0);
      return;
    }
    if (n == k) {
      System.out.println(Math.floorMod(all, mod));
      return;
    }
    pos.sort(Comparator.reverseOrder());
    neg.sort(Comparator.reverseOrder());
    long[] posMulLft = new long[pos.size() + 1];
    long[] negMulLft = new long[neg.size() + 1];
    long[] negMulRgt = new long[neg.size() + 1];
    posMulLft[0] = 1;
    negMulLft[0] = 1;
    negMulRgt[negMulRgt.length - 1] = 1;
    for (int i = 1; i < posMulLft.length; i++) {
      posMulLft[i] = (posMulLft[i - 1] * pos.get(i - 1)) % mod;
    }
    for (int i = 1; i < negMulLft.length; i++) {
      negMulLft[i] = (negMulLft[i - 1] * neg.get(i - 1)) % mod;
    }
    for (int i = negMulRgt.length - 2; i >= 0; i--) {
      negMulRgt[i] = (negMulRgt[i + 1] * neg.get(i)) % mod;
    }
    if (neg.size() == 0) {
      System.out.println(Math.floorMod(posMulLft[k], mod));
      return;
    }
    if (pos.size() == 0) {
      System.out.println(Math.floorMod(negMulLft[k], mod));
      return;
    }
    long res = Long.MIN_VALUE;
    for (int i = 0; i < Math.min(k + 1, posMulLft.length); i++) {
      if (k - i < negMulLft.length) {
        res = Math.max(res, (posMulLft[i] * negMulLft[k - i]) % mod);
      }
    }
    if (k <= neg.size() && k % 2 == 0) {
      res = Math.max(res, (negMulRgt[negMulRgt.length - 1 - k]) % mod);
    }
    System.out.println(Math.floorMod(res, mod));
  }

  private static final Scanner scanner = new Scanner(System.in);
}
