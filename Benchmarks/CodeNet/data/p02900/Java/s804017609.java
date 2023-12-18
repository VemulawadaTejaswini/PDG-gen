import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

import jdk.nashorn.internal.codegen.types.BitwiseType;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BigInteger a = new BigInteger(sc.next());
    BigInteger b = new BigInteger(sc.next());

    BigInteger s = a.compareTo(b) < 0 ? a : b;
    BigInteger l = a.compareTo(b) < 0 ? b : a;

    List<BigInteger[]> yakusuList = new ArrayList<>();
    for (BigInteger i = new BigInteger("2"), len = IntUtil.sqrtFloor(s); i.compareTo(len) <= 0; i = i.add(BigInteger.ONE)) {
      if (s.remainder(i).compareTo(BigInteger.ZERO) == 0) {
        int count = 0;
        while(s.remainder(i).compareTo(BigInteger.ZERO) == 0) {
          s = s.divide(i);
          if (l.remainder(i).compareTo(BigInteger.ZERO) == 0) {
            l = l.divide(i);
            count++;
          }
        }
        if (count > 0) {
          yakusuList.add(new BigInteger[]{ i, IntUtil.toBig(count) });
        }
      }
    }
    if (s.compareTo(BigInteger.ONE) > 0) {
      if (l.remainder(s).compareTo(BigInteger.ZERO) == 0) {
        yakusuList.add(new BigInteger[]{ s, BigInteger.ONE });
      }
    }
    
    System.out.println(yakusuList.size() + 1);
  }
}

/**
 * 整数ユーティリティー
 */
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
}
