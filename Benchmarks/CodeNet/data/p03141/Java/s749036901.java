import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Pair> list1 = new ArrayList<>(n);
    ArrayList<Pair> list2 = new ArrayList<>(n);
    Map<Pair, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      Pair p = new Pair(a, b);
      list1.add(p);
      list2.add(p);
      int current = map.getOrDefault(p, 0);
      map.put(p, current + 1);
    }
    list1.sort((o1, o2) -> {
      if (o2.a == o1.a) {
        return o2.b - o1.b;
      }
      return o2.a - o1.a;
    });
    list2.sort((o1, o2) -> {
      if (o2.b == o1.b) {
        return o2.a - o1.a;
      }
      return o2.b - o1.b;
    });
    int list1Cursor = 0;
    int list2Cursor = 0;
    long total1 = 0;
    long total2 = 0;
    boolean isTurnList1 = true;
    for (int i = 0; i < n; i++) {
      if (isTurnList1) {
        for (;;) {
          Pair pair = list1.get(list1Cursor);
          list1Cursor += 1;
          int current = map.get(pair);
          if (current <= 0) continue;
          map.put(pair, current - 1);
          total1 += (long) pair.a;
          break;
        }
      } else {
        for (;;) {
          Pair pair = list2.get(list2Cursor);
          list2Cursor += 1;
          int current = map.get(pair);
          if (current <= 0) continue;
          map.put(pair, current - 1);
          total2 += (long) pair.b;
          break;
        }
      }
      isTurnList1 = !isTurnList1;
    }
    System.out.println(total1 - total2);
  }

  private static class Pair {
    private final int a;
    private final int b;

    private Pair(int a, int b) {
      this.a = a;
      this.b = b;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Pair pair = (Pair) o;
      return a == pair.a &&
              b == pair.b;
    }

    @Override
    public int hashCode() {
      return Objects.hash(a, b);
    }
  }
}