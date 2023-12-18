import java.util.*;

public class Main {
  private static void solve(int n, ArrayDeque<Integer>[] matches) {
    int count = 0;
    int finished = 0;
    Set<Integer> entry = new HashSet<>();
    while (finished < n) {
      entry.clear();
      for (int i = 0; i < n; i++) {
        if (entry.contains(i) || matches[i].size() == 0) {
          continue;
        }
        int enemy = matches[i].peek();
        if (entry.contains(enemy) || matches[enemy].size() == 0) {
          continue;
        }
        if (i == matches[enemy].peek()) {
          entry.add(i);
          entry.add(enemy);
          matches[i].poll();
          matches[enemy].poll();
          if (matches[i].size() == 0) finished += 1;
          if (matches[enemy].size() == 0) finished += 1;
        }
      }
      if (entry.size() == 0) {
        System.out.println(-1);
        return;
      }
      count++;
    }
    System.out.println(count);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    ArrayDeque<Integer>[] matches = new ArrayDeque[n];
    for (int i = 0; i < n; i++) {
      ArrayDeque<Integer> player = new ArrayDeque<>();
      String[] row = sc.nextLine().split(" ");
      for (int j = 0; j < n - 1; j++) {
        player.add(Integer.parseInt(row[j]) - 1);
      }
      matches[i] = player;
    }
    sc.close();
    solve(n, matches);
  }
}
