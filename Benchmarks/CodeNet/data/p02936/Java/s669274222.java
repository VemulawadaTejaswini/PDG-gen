import java.util.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    int N, Q;
    Map<Integer,Node> nodeMap = new HashMap<>();
    int[] p, x;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      Q = sc.nextInt();
      for(int i = 0; i < N-1; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        Node nodeA = nodeMap.get(a);
        if ( nodeA == null ) {
          nodeA = new Node();
          nodeMap.put(a, nodeA);
        }
        Node nodeB = nodeMap.get(b);
        if ( nodeB == null ) {
          nodeB = new Node();
          nodeMap.put(b, nodeB);
        }
        nodeA.addChild(nodeB);
      }
      p = new int[Q];
      x = new int[Q];
      for(int j = 0; j < Q; j++) {
        p[j] = sc.nextInt();
        x[j] = sc.nextInt();
      }
    }
    solve(nodeMap, p, x);
    System.out.print(nodeMap.get(1).getScore());
    for(int i = 2; i <= N; i++) {
      System.out.print(" ");
      System.out.print(nodeMap.get(i).getScore());
    }
    System.out.println();
  }
  
  private static void solve(Map<Integer,Node> nodeMap, int[] p, int[] x) {
    int q = p.length;
    for(int j = 0; j < q; j++) {
      Node tmpRoot = nodeMap.get(p[j]);
      tmpRoot.addScore(x[j]);
    }
  }
  
  private static class Node {
    private final List<Node> children;
    
    private volatile long score;
    
    public Node() {
      children = new ArrayList<>();
    }
    
    public void addChild(Node child) {
      children.add(child);
    }
    
    public void addScore(long value) {
      score += value;
      for ( Node child : children ) {
        child.addScore(value);
      }
    }

    public long getScore() {
      return score;
    }
  }

}