import java.util.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    TreeNode[] nodes = new TreeNode[N];
    for (int i = 0; i < N; i++) {
      nodes[i] = new TreeNode();
    }
    for (int i = 0; i < N-1; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      nodes[a-1].children.add(nodes[b-1]);
    }
    int[] c = new int[N+1];
    for (int i = 1; i <= N; i++) {
      c[i] = sc.nextInt();
    }

    Arrays.sort(c);
    int cIndex = N;

    LinkedList<TreeNode> queue = new LinkedList<>();
    queue.add(nodes[0]);
    while (!queue.isEmpty()) {
      TreeNode node = queue.remove();
      node.val = c[cIndex--];
      for (TreeNode child : node.children) {
        queue.add(child);
      }
    }

    int sum = -1 * nodes[0].val;
    int[] ans = new int[N];
    for (int i = 0; i < N; i++) {
      //System.out.println(nodes[i].val);
      ans[i] = nodes[i].val;
      sum += nodes[i].val;
    }

    System.out.println(sum);
    for (int i = 0; i < N; i++) {
      if (i != 0) {
        System.out.print(" ");
      }
      System.out.print(ans[i]);
    }
  }
  
  private static class TreeNode {
    int val;
    List<TreeNode> children = new ArrayList<>();    
  }
}