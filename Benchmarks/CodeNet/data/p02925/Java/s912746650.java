import java.util.*;

public class Main {
  private static void solve(int n, ArrayDeque<Integer>[] matches) {
    int count = 0;
    int finished = 0;
    Set<Integer> entry = new HashSet<>();
    Deque<Integer> queue = new ArrayDeque<>();
    for (int i = 0; i < n; i++) queue.add(i);
    while (true) {
      entry.clear();
      while (!queue.isEmpty()) {
        int i = queue.poll();
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
          queue.remove(enemy);
          if (matches[i].size() == 0) finished += 1;
          if (matches[enemy].size() == 0) finished += 1;
        }
      }
      if (entry.isEmpty()) {
        break;
      }
      queue.addAll(entry);
      count++;
    }
    if (finished < n) {
      System.out.println(-1);
    } else {
      System.out.println(count);
    }
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
