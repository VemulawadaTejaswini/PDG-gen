import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      if (set.contains(a)) set.remove(a);
      else set.add(a);
    }
    System.out.println(set.size());
  }
}
