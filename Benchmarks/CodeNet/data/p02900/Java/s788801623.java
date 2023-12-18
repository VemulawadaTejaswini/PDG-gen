import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();

    List<Long> ky = new ArrayList<>();

    ky.add((long)1);
    
    boolean ok = true;
    long max = 0;
    while (ok) {
      ok = false;
      for (long i = 2; i <= Math.min(a, b); i++) {
        if (a % i == 0 && b % i == 0) {
          a /= i;
          b /= i;
          boolean issosu = sosu(i);
          if (issosu && i > max) {
            ky.add(i);
          }
          max = Math.max(max, i);
          ok = true;
          break;
        }
      }
    }

    System.out.println(ky.size());
    
  }

  private static boolean sosu(long m) {
    if (m == 0) return false;
    if (m <= 2) return true;
    for (long i = 2; i < m; i++) {
      if (m % i == 0) return false;
    }
    return true;
  }
}