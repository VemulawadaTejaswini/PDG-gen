import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Node[] nodes = new Node[N];
    for (int i = 0; i < N; i++) nodes[i] = new Node();
    for (int i = 0; i < N - 1; i++) {
      int a = scanner.nextInt() - 1;
      int b = scanner.nextInt() - 1;
      nodes[a].adjacent.add(nodes[b]);
      nodes[b].adjacent.add(nodes[a]);
    }
    int[] c = new int[N];
    long sum = 0;
    for (int i = 0; i < N; i++) {
      c[i] = scanner.nextInt();
      sum += c[i];
    }
    Arrays.sort(c);
    reverse(c);
    sum -= c[0];

    dfs(nodes[0], null, c, 0);
    System.out.println(sum);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      sb.append(nodes[i].value).append(' ');
    }
    sb.setLength(sb.length() - 1);
    System.out.println(sb.toString());
  }

  private static int dfs(Node node, Node from, int[] c, int cindex) {
    node.value = c[cindex++];
    for (Node a : node.adjacent) {
      if (a != from) {
        cindex = dfs(a, node, c, cindex);
      }
    }
    return cindex;
  }

  private static void reverse(int[] a) {
    int i = 0;
    int j = a.length - 1;
    while (i < j) {
      int tmp = a[i];
      a[i] = a[j];
      a[j] = tmp;
      i++;
      j--;
    }
  }

  private static class Node {
    private final List<Node> adjacent = new ArrayList<>();
    private int value = -1;
  }
}
