/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());
    Node[] nodes = new Node[n];
    for (int i =0; i<n; i++) {
      nodes[i] = new Node(i);
    }
    for (int i=0; i<n-1; i++) {
      String[] s = br.readLine().split(" ");
      int a = Integer.parseInt(s[0])-1;
      int b = Integer.parseInt(s[1])-1;
      nodes[a].adj.add(b);
      nodes[b].adj.add(a);
    }
    LinkedList<Integer> q = new LinkedList<>();
    int nWhite = 1;
    int nBlack = 1;
    nodes[0].c = 2;
    nodes[n-1].c = 1;
    q.offer(0);
    q.offer(n-1);
    boolean[] visited = new boolean[n];
    visited[0] = true;
    visited[n-1] = true;
    // black goes first
    while (q.size()>0) {
      Node curr = nodes[q.poll()];
      for (int i:curr.adj) {
        if (!visited[i]) {
          nodes[i].c = curr.c;
          if (curr.c==2)
            nBlack++;
          else
            nWhite++;
          q.offer(i);
          visited[i] = true;
        }
      }
    }
    if (nBlack>nWhite) {
      System.out.println("Fennec");
    } else {
      System.out.println("Snuke");
    }
  }
}
class Node {
  int id;
  ArrayList<Integer> adj;
  // 0 no colour
  // 1 is white
  // 2 is black
  int c=0;
  public Node(int idd) {
    id = idd;
    adj = new ArrayList<Integer>();
  }
}
