import java.util.*;
import java.lang.*;


class Main {

  static class Node {
    ArrayList<Integer> children = new ArrayList<Integer>();
    ArrayList<Integer> parents = new ArrayList<Integer>();
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int node_count = sc.nextInt();
    int q_count = sc.nextInt();
    
    Node[] nodes = new Node[node_count];
    int[] results = new int[node_count];
    for (int i = 0; i < node_count; i++) {
      nodes[i] = new Node();
      results[i] = 0;
    }

    for (int i = 0; i < node_count - 1; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      nodes[a].children.add(b);
      nodes[a].parents.forEach(p -> nodes[p].children.add(b));
      nodes[b].parents.add(a);
    }

    for (int j = 0; j < q_count; j++) {
      int p = sc.nextInt() - 1;
      int x = sc.nextInt();
      results[p] += x;
      nodes[p].children.forEach(c -> results[c] += x);
    }

    for(int r : results) {
      System.out.print(r + " ");
    }
  }
}