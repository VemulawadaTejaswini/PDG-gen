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
    for (int i : A) {
      if (i >= 0) {
        pos.add(i);
      } else {
        neg.add(i);
      }
    }
    pos.sort(Comparator.reverseOrder());
    neg.sort(Comparator.reverseOrder());
    long[] posMul = new long[pos.size() + 1];
    long[] negMul = new long[neg.size() + 1];
    posMul[0] = 1;
    negMul[0] = 1;
    int mod = 1000000007;
    for (int i = 1; i < posMul.length; i++) {
      posMul[i] = posMul[i - 1] * pos.get(i - 1);
      posMul[i] %= mod;
    }
    for (int i = 1; i < negMul.length; i++) {
      negMul[i] = negMul[i - 1] * neg.get(i - 1);
      negMul[i] %= mod;
    }
    long res = Integer.MIN_VALUE;
    if (neg.size() == 0) {
      res = posMul[k];
      System.out.println(res < 0 ? res + mod : res % mod);
      return;
    }
    if (pos.size() == 0) {
      res = negMul[k];
      System.out.println(res < 0 ? res + mod : res % mod);
      return;
    }
    for (int i = 0; i <= Math.min(k, posMul.length) && k - i < negMul.length; i++) {
      res = Math.max(res, posMul[i] * negMul[k - i]);
    }
    for (int i = 0; i <= Math.min(k, negMul.length) && k - i < posMul.length; i++) {
      res = Math.max(res, negMul[i] * posMul[k - i]);
    }
    System.out.println(res < 0 ? res + mod : res % mod);
  }

  private static final Scanner scanner = new Scanner(System.in);
}
