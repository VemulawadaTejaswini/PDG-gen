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
    List<Integer> leaves = new ArrayList<>();
    for (int i = 0;i < n; i++) {
      if (lists.get(i).size() == 1) {
        leaves.add(i);
      }
    }
    if (leaves.isEmpty()) {
      os.println("-1");
      return;
    }
    
    int max = -1;
    for (int leaf : leaves) {
      max = Math.max(depth(leaf, lists), max);
    }
    os.println(max);
  }
  
  private static class Node {
    int node;
    Set<Integer> parents = new HashSet<>();
  }
  
  private static int depth(int start, Map<Integer, List<Integer>> lists) {
    Set<Integer> visited = new HashSet<>();
    Set<Node> curr = new HashSet<>();
    Node s = new Node();
    s.node = start;
    curr.add(s);

    int count = 0;
    while (visited.size() < lists.size()) {
      count++;
      Map<Integer, Node> next = new HashMap<>();
      for (Node n : curr) {
        List<Integer> nexts = lists.get(n.node);
        for (int nx : nexts) {
          if (n.parents.contains(nx)) {
            // parent. ignore
            continue;
          }
          if (visited.contains(nx)) {
            // visiting again
            return -1;
          }
          Node node;
          if (next.containsKey(nx)) {
            node = next.get(nx);
          } else {
            node = new Node();
            node.node = nx;
            next.put(nx, node);
          }
          node.parents.add(n.node);
        }
        for (Node c : curr) {
          visited.add(c.node);
        }
      }
      curr = new HashSet<>(next.values());
    }
    return count;
  }
}