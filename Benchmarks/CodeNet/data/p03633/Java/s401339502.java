import java.util.*;
import java.math.*;
import java.math.BigDecimal;

public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    BigInteger[] T = new BigInteger[N];
    for (int i=0; i<N; i++){
      T[i] = new BigInteger(sc.nextLine());
    }
    BigInteger tmp = getTest(T);
    System.out.println(tmp);
  }

  public static BigInteger getTest(BigInteger[] T){
    int length = (int) T.length;
    BigInteger tmp = BigInteger.valueOf(1);

    for (int i=0; i < length - 1; i++){
      tmp = lcm(tmp, T[i]);
    }
    tmp = lcm(tmp, T[length - 1]);
    return tmp;
  }

  private static BigInteger gcd(BigInteger m, BigInteger n) {
      if (m.compareTo(n) == -1) return gcd(n, m);
      if (n.compareTo(BigInteger.ZERO) == 0) return m;
      return gcd(n, m.remainder(n));
  }

  private static BigInteger lcm(BigInteger m, BigInteger n) {
      BigInteger out;
      out = n.divide(gcd(m, n));
      out = m.multiply(out);
      return out;
      // return m.multiply(n / gcd(m, n);
  }

}
