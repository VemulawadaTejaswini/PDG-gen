import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    D_Ki();
  }

  private static class Node {

    int id;
    long counter = 0;
    Node parent = null;
    List<Node> children = new ArrayList<>();

    Node(int id) {
      this.id = id;
    }
  }

  private static void D_Ki() {

    final Scanner sc = new Scanner(System.in);
    final int numberOfNodes = sc.nextInt();
    final int numberOfOperations = sc.nextInt();

    final Node[] nodes = new Node[numberOfNodes];
    for (int i = 0; i < nodes.length; i++) {
      nodes[i] = new Node(i + 1);
    }

    for (int i = 0; i < nodes.length - 1; i++) {
      int idOfNodeA = sc.nextInt();
      int idOfNodeB = sc.nextInt();

      Node nodeA = nodes[idOfNodeA - 1];
      Node nodeB = nodes[idOfNodeB - 1];
      if (nodeB.parent == null) {
        nodeB.parent = nodeA;
        nodeA.children.add(nodeB);
      } else {
        nodeA.parent = nodeB;
        nodeB.children.add(nodeA);
      }
    }

    for (int i = 0; i < numberOfOperations; i++) {
      int rootNodeIdOfTargetSubtree = sc.nextInt();
      int numberToBeAdded = sc.nextInt();

      nodes[rootNodeIdOfTargetSubtree - 1].counter += numberToBeAdded;
    }

    for (Node child : nodes[0].children) {
      count(child);
    }

    for (Node node : nodes) {

      if (node.id != 1) {
        System.out.print(" ");
      }

      System.out.print(node.counter);
    }
  }

  private static void count(Node node) {
    node.counter += node.parent.counter;

    for (Node child : node.children) {
      count(child);
    }
  }
}
