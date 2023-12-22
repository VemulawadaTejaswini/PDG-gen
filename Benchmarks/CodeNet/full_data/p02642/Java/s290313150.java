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
    long count = 0;
    for (int i = 0, len = list.size(); i < len; i++) {
      Long aLong = list.get(i);
      if (collect.get(aLong).size() > 1) {
        continue;
      }
      boolean boo = true;
      for (int j = 0; j < i; j++) {
        if (aLong % list.get(j) == 0) {
          boo = false;
          break;
        }
      }
      if (boo) {
        count++;
      }
    }

    System.out.println(count);
  }
}
