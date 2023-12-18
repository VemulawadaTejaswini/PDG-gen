import java.util.*;

class Node {
  Node parent;
  int id;

  Node(int id) {
    this.parent = null;
    this.id = id;
  }

  public Node getRoot() {
    if (parent == null) {
      return this;
    }
    Node root = parent.getRoot();
    parent = root;
    return root;
  }

  public int getRootId() {
    return getRoot().id;
  }

  public static void merge(Node a, Node b) {
    Node aRoot = a.getRoot();
    Node bRoot = b.getRoot();

    if (aRoot != bRoot) {
      aRoot.parent = bRoot;
    }
  }
}

public class Main {
  public static int getCityId(Node roadGroup, Node railGroup) {
    return (roadGroup.getRootId() << 16) | railGroup.getRootId();
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    Node[] roadGroup = new Node[n];
    Node[] railGroup = new Node[n];
    for (int i = 0; i < n; i++) {
      roadGroup[i] = new Node(i);
      railGroup[i] = new Node(i);
    }
    int k = s.nextInt();
    int l = s.nextInt();
    for (int i = 0; i < k; i++) {
      int p = Integer.parseInt(s.next()) - 1;
      int q = Integer.parseInt(s.next()) - 1;
      Node.merge(roadGroup[p], roadGroup[q]);
    }
    for (int i = 0; i < l; i++) {
      int r = Integer.parseInt(s.next()) - 1;
      int ss = Integer.parseInt(s.next()) - 1;
      Node.merge(railGroup[r], railGroup[ss]);
    }
    HashMap<Integer, Integer> cityCounter = new HashMap<Integer, Integer>();
    for (int i = 0; i < n; i++) {
      int id = getCityId(roadGroup[i], railGroup[i]);
      if (cityCounter.get(id) == null) {
        cityCounter.put(id, 1);
      } else {
        cityCounter.put(id, cityCounter.get(id) + 1);
      }
    }
    for (int i = 0; i < n; i++) {
      int id = getCityId(roadGroup[i], railGroup[i]);
      if (i > 0) {
        System.out.print(" ");
      }
      System.out.print(cityCounter.get(id));
    }
    System.out.println();
  }
}
