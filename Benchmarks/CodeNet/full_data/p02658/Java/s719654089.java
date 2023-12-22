import java.util.*;
import java.math.BigInteger;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BigInteger[] A = new BigInteger[n];
    BigInteger max = new BigInteger("1000000000000000000");
    for (int i = 0; i < n; i++) {
      A[i] = sc.nextBigInteger();
    }
    Arrays.sort(A);
    BigInteger ans = BigInteger.ONE;
    for (int i = 0; i < n; i++) {
      ans = ans.multiply(A[i]);
      if (ans.compareTo(max) == 1 || ans.equals(0)) {
        break;
      }
    }
    if (ans.compareTo(max) == 1) {
      System.out.println(-1);
    } else {
      System.out.println(ans);
    }
  }
}
