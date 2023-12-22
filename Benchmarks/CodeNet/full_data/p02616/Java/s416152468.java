import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  private final static BigInteger MOD = new BigInteger("1000000007");

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    ArrayList<BigInteger> a = new ArrayList<>();
    int zeroCount = 0;
    for (int i = 0; i < n; i++) {
      BigInteger bigInteger = new BigInteger(sc.next());
      a.add(bigInteger);
      if (bigInteger.compareTo(BigInteger.ZERO) == 0) {
        zeroCount++;
      }
    }
    if (n - zeroCount < k) {
      System.out.println(0);
      return;
    } else if (n == k) {
      BigInteger result = BigInteger.ONE;
      for (int i = 0, len = k - 1; i < len; i++) {
        BigInteger bigInteger = a.get(i);
        result = mod(result.multiply(bigInteger));
      }
      System.out.println(result);
      return;
    }

    a.sort(Comparator.comparing(BigInteger::abs).reversed());
    BigInteger result = BigInteger.ONE;
    BigInteger minPos = null;
    BigInteger minNeg = null;
    int count = 0;
    for (int i = 0, len = k - 1; i < len; i++) {
      BigInteger bigInteger = a.get(i);
      result = mod(result.multiply(bigInteger));
      if (bigInteger.compareTo(BigInteger.ZERO) < 0) {
        minNeg = bigInteger;
        count++;
      } else {
        minPos = bigInteger;
      }
    }
    if (count % 2 == 0) {
      for (int i = k - 1; i < n; i++) {
        BigInteger bigInteger = a.get(i);
        if (bigInteger.compareTo(BigInteger.ZERO) > 0) {
          System.out.println(mod(result.multiply(bigInteger)));
          return;
        } else if (bigInteger.compareTo(BigInteger.ZERO) == 0) {
          break;
        }
      }
      if (minPos == null) {
        result = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
          BigInteger bigInteger = a.get(n - i - 1);
          result = mod(result.multiply(bigInteger));
        }
        System.out.println(result);
        return;
      }
      System.out.println(
          mod(mod(mod(result.multiply(minPos.modInverse(MOD)))
              .multiply(a.get(k - 1)))
              .multiply(a.get(k)))
      );
    } else {
      for (int i = k - 1; i < n; i++) {
        BigInteger bigInteger = a.get(i);
        if (bigInteger.compareTo(BigInteger.ZERO) < 0) {
          System.out.println(mod(result.multiply(bigInteger)));
          return;
        } else if (bigInteger.compareTo(BigInteger.ZERO) == 0) {
          break;
        }
      }
      System.out.println(
          mod(mod(mod(result.multiply(minNeg.modInverse(MOD)))
              .multiply(a.get(k - 1)))
              .multiply(a.get(k))));
    }
  }

  static BigInteger mod(BigInteger a) {
    if (a.compareTo(BigInteger.ZERO) == 0) {
      return BigInteger.ZERO;
    }
    BigInteger tmp = a.remainder(MOD);
    return tmp.compareTo(BigInteger.ZERO) > 0 ? tmp : tmp.add(MOD);
  }
}
