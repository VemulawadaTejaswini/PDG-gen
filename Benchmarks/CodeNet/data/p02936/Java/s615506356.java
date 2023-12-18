import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int q = Integer.parseInt(sc.next());
    Node[] nodes = new Node[n + 1];
    for (int i = 1; i <= n; i++) {
      nodes[i] = new Node(i, n + 1);
    }
    Node root = nodes[1];
    for (int i = 0; i < n - 1; i++) {
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      nodes[a].addRelation(nodes[b]);
      nodes[b].addRelation(nodes[a]);
    }
    for (int i = 0; i < q; i++) {
      int p = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      nodes[p].addCount(x);
    }
    root.propagateCountToChildren(n);
    pw.println(
      Arrays.stream(nodes, 1, n + 1)
        .map(node -> String.valueOf(node.count))
        .collect(Collectors.joining(" ")));
  }

  static class Node {

    int id;
    List<Node> relatedNode;
    long count = 0;

    public Node(int id, int maxNodes) {
      this.id = id;
      this.relatedNode = new ArrayList<>(maxNodes);
    }

    void addRelation(Node n) {
      relatedNode.add(n);
    }

    void addCount(long x) {
      count += x;
    }

    void propagateCountToChildren(int nunOfChild) {
      boolean[] exclude = new boolean[nunOfChild + 1];
      exclude[id] = true;
      propagateCountExclude(exclude);
    }

    void propagateCountExclude(boolean[] exclude) {
      relatedNode.stream()
        .filter(node -> !exclude[node.id])
        .forEach(child -> {
          exclude[child.id] = true;
          child.addCount(count);
          child.propagateCountExclude(exclude);
        });
    }
  }
}
