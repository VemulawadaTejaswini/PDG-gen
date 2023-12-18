import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    List<Long> a = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      a.add(sc.nextLong());
    }
    if (n == 1) {
      long p = a.get(0);
      for (int i = 0; i < m; i++) {
        p = p / 2;
      }
      System.out.println(p);
      return;
    }
    a.sort(Comparator.reverseOrder());
    for (int i = 0; i < m; i++) {
      Long aLong = a.get(0);
      long newLong = aLong / 2;
      a.set(0, newLong);
      if (newLong < a.get(1)) {
        a.sort(Comparator.reverseOrder());
      }
    }
    System.out.println(a.stream().reduce(0L, Long::sum));
  }
}
