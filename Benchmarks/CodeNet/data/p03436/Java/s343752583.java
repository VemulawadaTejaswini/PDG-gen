import java.util.*;

class Node implements Comparable<Node> {
  int i, j, step;
  Node(int i, int j, int step) {
    this.i = i;
    this.j = j;
    this.step = step;
  }

  public int compareTo(Node node) {
    return this.step - node.step;
  }
}

public class Main {
  private static int[] DI = new int[]{1, 0, -1, 0};
  private static int[] DJ = new int[]{0, 1, 0, -1};

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int h = in.nextInt();
    int w = in.nextInt();

    boolean[][] m = new boolean[h+2][w+2];
    int numWhite = 0;
    for (int i = 1; i <= h; i++) {
      String line = in.next();
      for (int j = 1; j <= w; j++) {
        m[i][j] = line.charAt(j - 1) == '.';
        if (m[i][j]) {
          numWhite++;
        }
      }
    }

    PriorityQueue<Node> q = new PriorityQueue<Node>();
    q.add(new Node(1, 1, 1));
    boolean[][] visited = new boolean[h+2][w+2];
    while (!q.isEmpty()) {
      Node node = q.poll();
      if (visited[node.i][node.j]) {
        continue;
      }
      if (node.i == h && node.j == w) {
        System.out.println(numWhite - node.step);
        return;
      }
      visited[node.i][node.j] = true;
      for (int k = 0; k < 4; k++) {
        int nextI = node.i + DI[k];
        int nextJ = node.j + DJ[k];
        if (!m[nextI][nextJ] || visited[nextI][nextJ]) {
          continue;
        }
        q.add(new Node(nextI, nextJ, node.step + 1));
      }
    }
    System.out.println(-1);
  }
}
