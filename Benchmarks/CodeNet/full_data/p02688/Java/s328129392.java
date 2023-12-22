import java.util.*;

public class Main {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    int n = scan.nextInt();
    int k = scan.nextInt();

    for (int i = 0; i < n; i++) {
      set.add(i + 1);
    }
    for (int i = 0; i < k; i++) {
      int d = scan.nextInt();

      for (int j = 0; j < d; j++) {
        int s = scan.nextInt();
        set.remove(s);
      }
    }

    System.out.print(set.size());
  }
}