import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  static BigInteger MOD = new BigInteger("1000000007");

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BigInteger k = new BigInteger(sc.next());
    String s = sc.next();
    BigInteger sLen = IntUtil.toBig(s.length());

    BigInteger allLen = k.add(sLen);

    BigInteger c26 = new BigInteger("26");
    BigInteger result = BigInteger.ONE;
    for (BigInteger i = BigInteger.ZERO; i.compareTo(k) < 0; i = i.add(BigInteger.ONE)) {
      result = result.multiply(c26).remainder(MOD);
    }
    // * allLen C sLen
    BigInteger c = BigInteger.ONE;
    for (BigInteger i = BigInteger.ONE; i.compareTo(sLen) <= 0; i = i.add(BigInteger.ONE)) {
      c = c.multiply(allLen.subtract(i).add(BigInteger.ONE)).remainder(MOD);
      c = c.multiply(i.modInverse(MOD)).remainder(MOD);
    }
    System.out.println(result.multiply(c).remainder(MOD));
  }
}

class IntUtil {
  public static BigInteger toBig(long i) {
    return new BigInteger(Long.toString(i));
  }

  /**
   * 拡張ユークリッドの互除法
   * @param x 数値1
   * @param y 数値2
   * @return [xとyの最大公約数r, a, b] (ただしa, bは ax + by = r となる整数)
   */
  static BigInteger[] gcd(BigInteger x, BigInteger y) {
    BigInteger r0 = x;
    BigInteger r1 = y;
    BigInteger a0 = BigInteger.ONE;
    BigInteger a1 = BigInteger.ZERO;
    BigInteger b0 = BigInteger.ZERO;
    BigInteger b1 = BigInteger.ONE;
    while(r1.compareTo(BigInteger.ZERO) > 0) {
      BigInteger[] tmp = r0.divideAndRemainder(r1);
      BigInteger q = tmp[0];
      BigInteger r = tmp[1];
      BigInteger a = a0.subtract(q.multiply(a1));
      BigInteger b = b0.subtract(q.multiply(b1));
      r0 = r1;
      r1 = r;
      a0 = a1;
      a1 = a;
      b0 = b1;
      b1 = b;
    }
    return new BigInteger[]{r0, a0, b0};
  }

  /**
   * 最小公倍数を求める。
   * @param x 数値1
   * @param y 数値2
   * @return 最小公倍数
   */
  public static BigInteger lcm(BigInteger x, BigInteger y) {
    BigInteger gcd = x.gcd(y);
    return x.multiply(y).subtract(gcd);
  }

  /**
   * nの平方根以下の最大の整数を返す
   * @param n 整数
   * @return nの平方根以下の最大の整数
   */
  public static BigInteger sqrtFloor(BigInteger n) {
    try {
      return new BigDecimal(Math.sqrt(n.longValueExact())).toBigInteger();
    } catch (ArithmeticException e) {
      BigDecimal nq = new BigDecimal(n);
      BigDecimal x = BigDecimal.ONE;
      BigDecimal d2 = BigDecimal.ONE.add(BigDecimal.ONE);
      BigInteger r = new BigInteger("1000000000");
      BigInteger r1 = r.add(BigInteger.ONE);
      while (!(r.multiply(r).compareTo(n) <= 0 && r1.multiply(r1).compareTo(n) > 0)) {
        for (int i = 0; i < 10; i++) {
          x = x.add(nq.divide(x, BigDecimal.ROUND_HALF_DOWN)).divide(d2);
        }
        r = x.toBigInteger();
        r1 = r.add(BigInteger.ONE);
      }
      return r;
    }
  }

  /**
   * 素因数分解
   * @param x 整数
   * @return 素因数分解の結果。[[素数1, 次数1], [素数2, 次数2], ...] (素数1 < 素数2 < ...)
   */
  public static ArrayList<Long[]> primeFactorization(long x) {
    ArrayList<Long[]> result = new ArrayList<>();
    for (long i = 2, len = (long) Math.floor(Math.sqrt(x)); i <= len; i++) {
      if (x % i == 0) {
        long count = 0;
        while(x % i == 0) {
          count++;
          x = x / i;
        }
        result.add(new Long[]{ i, count });
      }
    }
    if (x > 1) {
      result.add(new Long[] { x, 1L });
    }
    return result;
  }

  /**
   * 素因数分解
   * @param x 整数
   * @return 素因数分解の結果。[[素数1, 次数1], [素数2, 次数2], ...] (素数1 < 素数2 < ...)
   */
  public static ArrayList<BigInteger[]> primeFactorization(BigInteger x) {
    ArrayList<BigInteger[]> result = new ArrayList<>();
    for (BigInteger i = new BigInteger("2"), len = sqrtFloor(x); i.compareTo(len) <= 0; i = i.add(BigInteger.ONE)) {
      if (x.remainder(i).compareTo(BigInteger.ZERO) == 0) {
        BigInteger count = BigInteger.ZERO;
        while(x.remainder(i).compareTo(BigInteger.ZERO) == 0) {
          count = count.add(BigInteger.ONE);
          x = x.divide(i);
        }
        result.add(new BigInteger[]{ i, count });
      }
    }
    if (x.compareTo(BigInteger.ONE) > 0) {
      result.add(new BigInteger[] { x, BigInteger.ONE });
    }
    return result;
  }
}
