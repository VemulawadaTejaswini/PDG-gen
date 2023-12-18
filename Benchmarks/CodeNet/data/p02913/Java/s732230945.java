import java.util.Scanner;

public class Main {
  static class Node {
    Node[] children = new Node[26];
    final int start;

    Node(int start) {
      this.start = start;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String Sstring = sc.next();

    int[] S = new int[N];
    for (int i = 0; i < N; i++) {
      S[i] = Sstring.charAt(i) - 'a';
    }

    int ans = 0;
    Node root = new Node(0);
    for (int i = N - 1; i >= 0; i--) {
      Node node = root;
      for (int j = i; j < N; j++) {
        Node child = node.children[S[j]];
        if (child == null) {
          child = new Node(i);
          node.children[S[j]] = child;
        }
        node = child;

        if (j < node.start) {
          int depth = j - i + 1;
          ans = Math.max(ans, depth);
        }
      }
    }

    System.out.println(ans);
  }
}
