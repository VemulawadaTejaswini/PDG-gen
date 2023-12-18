import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long gcd = gcd(a, b);
      Map<Long, Long> factMap = new HashMap<>();
      primeFactor(gcd, factMap);

      System.out.println(1 + factMap.size());
  }

  private static void primeFactor(long num, Map<Long, Long> factMap) {
    for(long i = 2; i * i <= num; i++) {
      long cnt = 0;
      while(num % i == 0) {
        cnt++;
        num = num / i;
      }
      if(cnt > 0) factMap.put(i, cnt);
    }
    if(num != 1) factMap.put(num, 1L);
  }

  private static long gcd(long a, long b) {
    if(b == 0)
      return a;
    return gcd(b, a % b);
  }
}