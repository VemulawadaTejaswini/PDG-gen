import java.util.*;

class Node {
  Node parent;
  int id;
  int rank;

  Node(int id) {
    this.parent = null;
    this.id = id;
    this.rank = 0;
  }

  public Node getRoot() {
    if (parent == null) {
      return this;
    }
    Node root = parent.getRoot();
    parent = root;
    return root;
  }

  public long getRootId() {
    return getRoot().id;
  }

  public static void merge(Node a, Node b) {
    Node aRoot = a.getRoot();
    Node bRoot = b.getRoot();

    if (aRoot.rank > bRoot.rank) {
      bRoot.parent = aRoot;
    } else if (aRoot.rank < bRoot.rank) {
      aRoot.parent = bRoot;
    } else if (aRoot != bRoot) {
      aRoot.parent = bRoot;
      bRoot.rank = bRoot.rank + 1;
    }
  }
}

public class Main {
  public static long getCityId(Node roadGroup, Node railGroup) {
    return (roadGroup.getRootId() << 32) | railGroup.getRootId();
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String line = s.nextLine();
    String[] token = line.split(" ");
    int n = Integer.parseInt(token[0]);
    int k = Integer.parseInt(token[1]);
    int l = Integer.parseInt(token[2]);
    Node[] roadGroup = new Node[n];
    Node[] railGroup = new Node[n];
    for (int i = 0; i < n; i++) {
      roadGroup[i] = new Node(i);
      railGroup[i] = new Node(i);
    }
    for (int i = 0; i < k; i++) {
      line = s.nextLine();
      token = line.split(" ");
      int p = Integer.parseInt(token[0]) - 1;
      int q = Integer.parseInt(token[1]) - 1;
      Node.merge(roadGroup[p], roadGroup[q]);
    }
    for (int i = 0; i < l; i++) {
      line = s.nextLine();
      token = line.split(" ");
      int r = Integer.parseInt(token[0]) - 1;
      int ss = Integer.parseInt(token[1]) - 1;
      Node.merge(railGroup[r], railGroup[ss]);
    }
/*
    HashMap<Long, Integer> cityCounter = new HashMap<Long, Integer>();
    for (int i = 0; i < n; i++) {
      long id = getCityId(roadGroup[i], railGroup[i]);
      if (cityCounter.get(id) == null) {
        cityCounter.put(id, 1);
      } else {
        cityCounter.put(id, cityCounter.get(id) + 1);
      }
    }
    for (int i = 0; i < n; i++) {
      long id = getCityId(roadGroup[i], railGroup[i]);
      if (i > 0) {
        System.out.print(" ");
      }
      System.out.print(cityCounter.get(id));
    }
    System.out.println();
*/
  }
}
