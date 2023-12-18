import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    List<Integer>[] groups = new List[M];
    for (int i = 0; i < M; i++) groups[i] = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      groups[a % M].add(a);
    }

    int count = groups[0].size() / 2;
    if (M % 2 == 0) count += groups[M / 2].size() / 2;
    for (int i = 1; i < M / 2 + M % 2; i++) {
      count += count(groups[i], groups[M - i]);
    }
    System.out.println(count);
  }

  private static int count(List<Integer> s, List<Integer> t) {
    if (t.size() < s.size()) return count(t, s);
    Collections.sort(t);
    int count = 0;
    for (int i = 0; i < t.size() - 1; i++) {
      if (t.get(i).equals(t.get(i + 1))) {
        count++;
        i++;
      }
    }
    return Math.min(count, (t.size() - s.size()) / 2) + s.size();
  }
}
