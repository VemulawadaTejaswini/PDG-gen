import java.util.Scanner;

class Main {
  public static final int INF = 10000;
  public static int N;

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    int[][] roots = new int[N][N];
    Node[] nodes = new Node[N];

    for (int i = 0; i < N; i++) {
      nodes[i] = new Node();
      for (int j = 0; j < N; j++) {
        roots[i][j] = sc.nextInt();
      }
    }

    nodes[0].cost = 0;

    int min;
    int u = 0;
    while (true) {
      min = INF;

      for (int i = 0; i < N; i++) {
        if (!nodes[i].selected && nodes[i].cost < min) {
          min = nodes[i].cost;
          u = i;
        }
      }

      if (min == INF) {
        break;
      }

      nodes[u].selected = true;

      for (int v = 0; v < N; v++) {
        if (!nodes[v].selected && roots[u][v] != -1) {
          if (roots[u][v] < nodes[v].cost) {
            nodes[v].cost = roots[u][v];
          }
        }
      }
    }

    int result = 0;
    for (Node node : nodes) {
      result += node.cost;
    }

    System.out.println(result);
  }
}

class Node {
  public static final int INF = 10000;
  public int cost = INF;
  public boolean selected;

  public Node() { }
}

