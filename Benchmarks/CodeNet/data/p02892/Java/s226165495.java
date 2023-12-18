import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    
    // matrix
    // boolean[][] matrix = new boolean[n][n];
    // list
    Map<Integer, List<Integer>> lists = new HashMap<>();
    
    for (int i = 0; i < n; i++) {
      String s = sc.next();
      List<Integer> list = new ArrayList<>();
      
      for (int j = 0; j < n; j++) {
        if (s.charAt(j) == '1') {
          // matrix[i][j] = true;
          list.add(j);
        }
      }
      lists.put(i, list);
    }
    
    // if there's no leaf, impossible. 
    int leaf = -1;
    for (int i = 0;i < n; i++) {
      if (lists.get(i).size() == 1) {
        leaf = i;
      }
    }
    if (leaf < 0) {
      os.println("-1");
      return;
    }
    
    Set<Integer> used = new HashSet<>();
    Set<Integer> level = new HashSet<>();
    Set<Integer> lastLevel = new HashSet<>();
    level.add(leaf);

    int count = 0;
    while (used.size() < n) {
      count++;
      Set<Integer> newLevel = new HashSet<>();
      for (int node : level) {
        List<Integer> nexts = lists.get(node);
        for (int next : nexts) {
          if (lastLevel.contains(next)) {
            // visited last time
            continue;
          }
          if (used.contains(next)) {
            // visiting again
            os.println("-1");
            return;
          }
          newLevel.add(next);
        }
        used.addAll(level);
      }
      lastLevel = level;
      level = newLevel;
    }
    os.println(count);
  }
}