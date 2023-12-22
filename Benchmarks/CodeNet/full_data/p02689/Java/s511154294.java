import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    Node[] nodes = new Node[n + 1];
    for (int i = 0; i < n; i++) {
      nodes[i + 1] = new Node(i + 1, Integer.parseInt(sc.next()));
    }
    for (int j = 0; j < m; j++) {
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      nodes[a].addOther(nodes[b].h);
      nodes[b].addOther(nodes[a].h);
    }
    int ans = 0;
    for (int i = 1; i < n + 1; i++) {
      if (nodes[i].isGood()) {
        ans++;
      }
    }
    pw.println(ans);
  }

  static class Node {

    int i;
    int h;
    int otherH = 0;

    public Node(int i, int h) {
      this.i = i;
      this.h = h;
    }

    void addOther(int otherH) {
      this.otherH = Math.max(this.otherH, otherH);
    }

    boolean isGood() {
      return h > otherH;
    }
  }
}
