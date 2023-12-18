import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    sc.close();

    long g = gcd(A, B);

    HashMap<Long, Long> m = prime_factor(g);

    System.out.println(m.size() + 1);

  }

  static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  static HashMap<Long, Long> prime_factor(long N) {
    HashMap<Long, Long> map = new HashMap<>();
    for (long i = 2; i * i <= N; i++) {
      while (N % i == 0) {
        if (map.containsKey(i)) {
          long v_ = map.get(i);
          map.put(i, v_ + 1);
        } else {
          map.put(i, (long) 1);
        }
        N /= i;
      }
    }
    if (N != 1) {
      map.put(N, (long) 1);
    }
    return map;
  }

}