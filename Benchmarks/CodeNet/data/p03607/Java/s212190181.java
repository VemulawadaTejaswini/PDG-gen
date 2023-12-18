import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      if (set.contains(a)) {
        set.remove(a);
      } else {
        set.add(a);
      }
    }

    System.out.println(set.size());
  }
}