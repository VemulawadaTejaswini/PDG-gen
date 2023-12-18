import java.util.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    int N, Q;
    Node[] nodes;
    int[] p, x;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      Q = sc.nextInt();
      nodes = new Node[N];
      for(int i = 0; i < N-1; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        Node nodeA = nodes[a-1];
        if ( nodeA == null ) {
          nodeA = new Node();
          nodes[a-1] = nodeA;
        }
        Node nodeB = nodes[b-1];
        if ( nodeB == null ) {
          nodeB = new Node();
          nodes[b-1] = nodeB;
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
    solve(nodes, p, x);
    System.out.print(nodes[0].getScore());
    for(int i = 1; i < N; i++) {
      System.out.print(" ");
      System.out.print(nodes[i].getScore());
    }
    System.out.println();
  }
  
  private static void solve(Node[] nodes, int[] p, int[] x) {
    int q = p.length;
    for(int j = 0; j < q; j++) {
      Node tmpRoot = nodes[p[j]-1];
      tmpRoot.addScore(x[j]);
    }
    nodes[0].propagateAll();
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
    }
    
    public void propagateAll() {
      for( Node child : children ) {
        child.addScore(score);
        child.propagateAll();
      }
    }

    public long getScore() {
      return score;
    }
  }

}
