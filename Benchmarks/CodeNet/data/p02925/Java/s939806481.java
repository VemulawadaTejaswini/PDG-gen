import java.util.*;

public class Main {
  private static void solve(int n, List<ArrayDeque<Integer>> matches) {
    int count = 0;
    int finished = 0;
    Set<Integer> entry = new HashSet<>();
    while (finished < n) {
      entry.clear();
      for (int i = 0; i < n; i++) {
        if (entry.contains(i)) {
          continue;
        }
        if (matches.get(i).size() == 0) {
          continue;
        }
        int enemy = matches.get(i).peek();
        if (entry.contains(enemy)) {
          continue;
        }
        if (i == matches.get(enemy).peek()) {
          entry.add(i);
          entry.add(enemy);
          matches.get(i).poll();
          matches.get(enemy).poll();
          if (matches.get(i).size() == 0) finished += 1;
          if (matches.get(enemy).size() == 0) finished += 1;
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
    List<ArrayDeque<Integer>> matches = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      ArrayDeque<Integer> player = new ArrayDeque<>();
      String[] row = sc.nextLine().split(" ");
      for (int j = 0; j < n - 1; j++) {
        player.add(Integer.parseInt(row[j]) - 1);
      }
      matches.add(player);
    }
    sc.close();
    solve(n, matches);
  }
}
