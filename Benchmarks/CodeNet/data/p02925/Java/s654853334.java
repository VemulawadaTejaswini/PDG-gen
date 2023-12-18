import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    List<Queue<Integer>> lists = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      Queue<Integer> queue = new LinkedList<>();
      for (int j = 0; j < n - 1; j++) {
        queue.add(sc.nextInt() - 1);
      }
      lists.add(queue);
    }

    int count = 0;
    int day = 0;
    while (count < n * (n - 1) / 2) {
      Set<Integer> used = new HashSet<>();
      boolean found = false;
      for (int i = 0; i < n; i++) {
        if (used.contains(i) || lists.get(i).isEmpty()) continue;
        int j = lists.get(i).peek();
        if (used.contains(j) || lists.get(j).isEmpty()) continue;
        if (lists.get(j).peek() != i) continue;
        used.add(i); used.add(j);
        lists.get(i).remove();
        lists.get(j).remove();
        found = true;
        count++;
      }
      if (!found) {
        os.println(-1);
        return;
      }
      day++;
    }
    os.println(day);
  }
}