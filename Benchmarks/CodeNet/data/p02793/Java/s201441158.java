import java.util.*;
import java.lang.*;
import java.math.*;

class Main
{
  public void run()
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    BigInteger[] b = new BigInteger[n];
    for (int i = 0; i < n; i++) {
      b[i] = sc.nextBigInteger();
    }

    BigInteger bi = BigInteger.ONE;
    for (int i = 0; i < n; i++) {
      bi = bi.multiply(b[i]).divide(bi.gcd(b[i]));
    }

    BigInteger ans = BigInteger.ZERO;
    for (int i = 0; i < n; i++) {
      ans = ans.add(bi.divide(b[i]));
    }

    System.out.println(ans.remainder(BigInteger.valueOf(1000000007)));
  }


  public static void main(String[] args)
  {
    new Main().run();
  }
}
