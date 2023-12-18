import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long M = sc.nextLong();
    sc.close();
  
    long d = M / N;

    Set<Long> v = divisor(M);

    long answer = 0;
 
    for (Long value : v) {
      if (value <= d) {
        answer = Math.max(answer, value);
      }
    }

    System.out.println(answer);

  }

  static Set<Long> divisor (long N) {
    Set<Long> res = new HashSet<Long>();
    for (long i = 1; i * i <= N; i++) {
      if (N % i == 0) {
        res.add(i);
        if (i != N / i) {
          res.add(N / i);
        }
      }
    }
    return res;
  }

}