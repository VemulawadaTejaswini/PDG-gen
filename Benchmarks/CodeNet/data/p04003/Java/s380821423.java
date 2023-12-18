import java.util.*;

class Node implements Comparable<Node> {
  static int n;
  static ArrayList<ArrayList<Integer>> destinations;
  static ArrayList<ArrayList<Integer>> companies;

  int position;
  int company;
  int cost;

  public Node(int position, int company, int cost) {
    this.position = position;
    this.company = company;
    this.cost = cost;
  }

  public ArrayList<Node> getNextNode() {
    ArrayList<Node> output = new ArrayList<Node>();
    for (int i = 0; i < destinations.get(position).size(); i++) {
      output.add(new Node(
          destinations.get(position).get(i),
          companies.get(position).get(i),
          cost + (company != companies.get(position).get(i) ? 1 : 0)));
    }
    return output;
  }

  public int compareTo(Node node) {
    return this.cost - node.cost;
  }

  public boolean equals(Object object) {
    Node node = (Node)object;
    return this.position == node.position && this.company == node.company;
  }

  public int hashCode() {
    return (this.position << 17) | company;
  }

  public boolean isGoal() {
    return position == n;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    Node.n = n;
    Node.destinations = new ArrayList<ArrayList<Integer>>();
    Node.companies = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i <= n; i++) {
      Node.destinations.add(new ArrayList<Integer>());
      Node.companies.add(new ArrayList<Integer>());
    }
    for (int i = 0; i < m; i++) {
      int p = s.nextInt();
      int q = s.nextInt();
      int c = s.nextInt();
      Node.destinations.get(p).add(q);
      Node.destinations.get(q).add(p);
      Node.companies.get(p).add(c);
      Node.companies.get(q).add(c);
    }
    HashSet<Node> visited = new HashSet<Node>();
    PriorityQueue<Node> queue = new PriorityQueue<Node>();
    queue.add(new Node(1, -1, 0));
    while (!queue.isEmpty()) {
      Node node = queue.poll();
      if (visited.contains(node)) {
        continue;
      }
      if (node.isGoal()) {
        System.out.println(node.cost);
        return;
      }
      visited.add(node);
//      System.out.printf("%d %d %d\n", node.position, node.company, node.cost);
      for (Node next : node.getNextNode()) {
        if (visited.contains(next)) {
          continue;
        }
        queue.add(next);
      }
    }
    System.out.println(-1);
  }
}
