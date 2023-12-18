// baa x
// b
// ba
// b a
//  a
//  aa x
//   a
// ___
// 2^3-1-2

// 2^4-1

// 5
// abcab
// 2^5-1-1-2^(5-2)+1-2^(5-2)+1+2^(2-1)-1
// = 32-1-1-7-7+1= 17
// 2^2x2x2+1
import java.util.*;

public class Main {
  private static final int 1_000_000_007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      char c = S.charAt(i);
      map.put(c, map.getOrDefault(c, 0)+1);
    }
    long ans = 0;
    int kind = map.size();
    for (int count : map.values()) {
      ans += power(size-1)*count%MOD;
      ans %= MOD;
    }
    System.out.println(ans);
  }
  private static long power(int n) {
    if (n == 0) {
      return 1;
    }
    if (n%2 == 1) {
      return power(n/2)*2%MOD;
    }
    long half = power(n/2);
    return half*half%MOD;
  }
}
