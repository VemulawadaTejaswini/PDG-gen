import java.util.*;

public class Main {
  public static void main(String[] args) {
    int N, Q;
    Node[] nodes;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      Q = sc.nextInt();
      nodes = new Node[N];
      for(int i = 0; i < N; i++) {
        nodes[i] = new Node(i+1);
      }
      for(int i = 0; i < N-1; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        Node nodeA = nodes[a-1];
        Node nodeB = nodes[b-1];
        nodeA.addCounterPart(nodeB);
        nodeB.addCounterPart(nodeA);
      }
      for(int j = 0; j < Q; j++) {
        int p = sc.nextInt();
        int x = sc.nextInt();
        nodes[p-1].addScore(x);
      }
    }
    solve(nodes);
    System.out.print(nodes[0].getScore());
    for(int i = 1; i < N; i++) {
      System.out.print(" ");
      System.out.print(nodes[i].getScore());
    }
    System.out.println();
  }
  
  private static void solve(Node[] nodes) {
    Node dummyNode = new Node(-1);
    nodes[0].propagateAll(dummyNode);
  }
  
  private static class Node {
    private final int id;
    
    private final Collection<Node> counterPartCollection;
    
    private volatile int score;
    
    public Node(int id) {
      this.id = id;
      score = 0;
      counterPartCollection = new ArrayList<>();
    }
    
    public int hashCode() {
      return id;
    }
    
    public void addCounterPart(Node counterPart) {
      counterPartCollection.add(counterPart);
    }
    
    public void addScore(int value) {
      score += value;
    }
    
    public void propagateAll(Node except) {
      for(Node counterPart : counterPartCollection) {
        if ( counterPart.hashCode() == except.hashCode() ) {
          continue;
        }
        counterPart.addScore(score);
        counterPart.propagateAll(this);
      }
    }

    public int getScore() {
      return score;
    }
  }

}
