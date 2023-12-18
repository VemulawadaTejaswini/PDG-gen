import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++)
      a[i] = sc.nextInt();
    sc.close();

    long ans = 0;
    List<Long> list = Arrays.stream(a).mapToObj(Long::valueOf).collect(Collectors.toList());
    while (1 < list.size()) {
      long min = Long.MAX_VALUE;
      int idx = 0;
      for (int i = 1; i < list.size(); i++) {
        long s = list.get(i - 1) + list.get(i);
        if (s < min) {
          min = s;
          idx = i;
        }
      }
      list.remove(idx);
      list.set(idx - 1, min);
      ans += min;
    }
    System.out.println(ans);
  }
}
