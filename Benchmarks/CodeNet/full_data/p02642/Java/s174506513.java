import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    List<Long> a = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      a.add(sc.nextLong());
    }
    Map<Long, List<Long>> collect = a.stream().collect(Collectors.groupingBy(Function.identity()));
    List<Long> list = collect.keySet().stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    Set<Long> less = new TreeSet<>();
    long count = 0;
    for (int i = 0, len = list.size(); i < len; i++) {
      Long aLong = list.get(i);
      boolean boo = true;
      try {
        collect.get(aLong).get(1);
        boo = false;
      } catch (Throwable e) {
      }
      if (!boo) {
        continue;
      }
      for (long j = 1, jlen = (long) Math.floor(Math.sqrt(aLong)); j <= jlen; j++) {
        if (aLong % j == 0) {
          if (less.contains(j) || less.contains(aLong / j)) {
            boo = false;
            break;
          }
        }
      }
      if (boo) {
        count++;
      }
      less.add(aLong);
    }

    System.out.println(count);
  }
}
