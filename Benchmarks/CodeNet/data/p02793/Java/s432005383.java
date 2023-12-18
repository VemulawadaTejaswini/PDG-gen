import java.math.*;
import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = sc.nextInt();
    sc.close();

    BigInteger lcm = BigInteger.valueOf(1);
    for (int i = 0; i < N; i++)
      lcm = lcm(lcm, BigInteger.valueOf(A[i]));

    BigInteger mod = BigInteger.valueOf(1000000007);
    BigInteger ans = BigInteger.ZERO;
    for (int i = 0; i < N; i++) {
      ans = ans.add(lcm.divide(BigInteger.valueOf(A[i]))).mod(mod);
    }
    System.out.println(ans);
  }

  private static BigInteger lcm(BigInteger a, BigInteger b) {
    return a.divide(a.gcd(b)).multiply(b);
  }
}