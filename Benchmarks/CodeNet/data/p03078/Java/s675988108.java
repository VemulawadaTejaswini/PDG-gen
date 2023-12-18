import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int k = sc.nextInt();
    Long[] a = new Long[x];
    Long[] b = new Long[y];
    Long[] c = new Long[z];
    for (int i = 0; i < x; i++) {
      a[i] = sc.nextLong();
    }
    for (int i = 0; i < y; i++) {
      b[i] = sc.nextLong();
    }
    for (int i = 0; i < z; i++) {
      c[i] = sc.nextLong();
    }
    Main abc123D = new Main();
    for (long i : abc123D.solve(a, b, c, k)) {
      System.out.println(i);
    }
  }

  public List<Long> solve(Long[] a, Long[] b, Long[] c, int k) {
    Arrays.sort(a, Comparator.reverseOrder());
    Arrays.sort(b, Comparator.reverseOrder());
    Arrays.sort(c, Comparator.reverseOrder());
    List<Long> list1 = new LinkedList<>();
    List<Long> list2 = new LinkedList<>();
    for (int i = 0; i < Math.min(a.length, k); i++) {
      for (int j = 0; j < Math.min(b.length, k); j++) {
        list1.add(a[i] + b[j]);
      }
    }
    list1.sort(Comparator.reverseOrder());
    for (int i = 0; i < Math.min(list1.size(), k); i++) {
      for (int j = 0; j < Math.min(c.length, k); j++) {
        list2.add(list1.get(i) + c[j]);
      }
    }
    list2.sort(Comparator.reverseOrder());
    return list2.subList(0, k);
  }
}
