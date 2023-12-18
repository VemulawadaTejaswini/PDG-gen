import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Long> p = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      p.add(sc.nextLong());
    }
    long result = 0;
    for (int l = 0, len = n - 1; l < len; l++) {
      long pl1 = p.get(l);
      long pl2 = p.get(l + 1);
      long max = Math.max(pl1, pl2);
      long max2 = Math.min(pl1, pl2);
      result += max2;
      for (int r = l + 2; r < n; r++) {
        long pr = p.get(r);
        if (pr > max) {
          max2 = max;
          max = pr;
        } else if (pr > max2) {
          max2 = pr;
        }
        result += max2;
      }
    }
    System.out.println(result);
  }
}
