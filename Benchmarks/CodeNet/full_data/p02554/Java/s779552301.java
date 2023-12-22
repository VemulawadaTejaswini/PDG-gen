import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args){
    BigInteger MOD = new BigInteger("1000000007");
    BigInteger ten = new BigInteger("10");
    BigInteger nine = new BigInteger("9");
    BigInteger eight = new BigInteger("8");

    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    BigInteger all = BigInteger.ONE;
    BigInteger non0 = BigInteger.ONE;
    BigInteger non9 = BigInteger.ONE;
    BigInteger non09 = BigInteger.ONE;
    for (int i = 0; i < n; i++) {
      all = all.multiply(ten).remainder(MOD);
      non0 = non0.multiply(nine).remainder(MOD);
      non9 = non9.multiply(nine).remainder(MOD);
      non09 = non09.multiply(eight).remainder(MOD);
    }
    System.out.println(sub(all, non0.add(non9).remainder(MOD), MOD).add(non09).remainder(MOD));
  }
  static BigInteger sub(BigInteger a, BigInteger b, BigInteger mod) {
    BigInteger result = a.subtract(b);
    if (result.compareTo(BigInteger.ZERO) < 0) {
      return result.add(mod);
    } else {
      return result;
    }
  }
}
