import java.math.*;
import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    sc.close();

    Map<Integer, Integer> lcm = new HashMap<>();
    for (int ai : A)
      for (Map.Entry<Integer, Integer> fAi : f(ai).entrySet())
        lcm.put(fAi.getKey(), Math.max(lcm.getOrDefault(fAi.getKey(), 0), fAi.getValue()));

    BigInteger BILcm = BigInteger.ONE;
    for (Map.Entry<Integer, Integer> lcm_p : lcm.entrySet())
      BILcm = BigInteger.valueOf(lcm_p.getKey()).pow(lcm_p.getValue()).multiply(BILcm);

    BigInteger mod = BigInteger.valueOf(1000000007);
    BigInteger ans = BigInteger.ZERO;
    for (int ai : A)
      ans = BILcm.divide(BigInteger.valueOf(ai)).add(ans).remainder(mod);

    System.out.println(ans.remainder(mod));
  }

  private static Map<Integer, Integer> f(int n) {
    Map<Integer, Integer> f = new HashMap<>();
    int m = n;
    int s = SIEVE[m - 1];
    while (s != 0) {
      f.put(s, f.getOrDefault(s, 0) + 1);
      m /= s;
      s = SIEVE[m - 1];
    }
    return f;
  }

  private static int[] SIEVE = sieve(1000000);

  private static int[] sieve(int n) {
    int [] sieve = new int[n];
    for (int i = 2; i <= n; i += 2) sieve[i - 1] = 2;
    int sqrt = (int) Math.sqrt(n);
    for (int i = 3; i <= n; i += 2) {
      if (sieve[i - 1] == 0) sieve[i - 1] = i;
      if (i <= sqrt)
        for (int j = i * i; j <= n; j += i)
          if (sieve[j - 1] == 0) sieve[j - 1] = i;
    }
    return sieve;
  }
}