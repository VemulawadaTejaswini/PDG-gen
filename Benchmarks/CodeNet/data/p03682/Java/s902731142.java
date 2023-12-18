import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    int n = 0;
    Point[] p = null;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      n = Integer.parseInt(br.readLine());
      p = new Point[n];
      for (int i=0;i<n;i++) {
        String[] s = br.readLine().split("\\s+");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        p[i] = new Point(x,y,i);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    Edge[] graph = new Edge[2*n-2];
    Arrays.sort(p,Comparator.comparingInt(pt -> pt.x));
    for (int i=0;i<n-1;i++) {
      graph[i] = new Edge(p[i].id,p[i+1].id,(long)(p[i+1].x-p[i].x));
    }
    Arrays.sort(p,Comparator.comparingInt(pt -> pt.y));
    for (int i=0;i<n-1;i++) {
      graph[i+n-1] = new Edge(p[i].id,p[i+1].id,(long)(p[i+1].y-p[i].y));
    }
    Arrays.sort(graph,Comparator.comparingLong(e -> e.cost));
    UnionFind uf = new UnionFind(n);
    long cost = 0L;
    for (Edge e : graph) {
      if (!uf.same(e.from,e.to)) {
        cost += e.cost;
        uf.unite(e.from,e.to);
      }
    }
    System.out.println(cost);
  }
  private class Point {
    private int x;
    private int y;
    private int id;
    Point(int x,int y,int id) {
      this.x = x;
      this.y = y;
      this.id = id;
    }
  }
  private class Edge {
    private int from;
    private int to;
    private long cost;
    Edge(int from,int to,long cost) {
      this.from = from;
      this.to = to;
      this.cost = cost;
    }
  }
  private class UnionFind {
    int n;
    int[] par;
    int[] rank;
    int[] size;
    UnionFind(int n) {
      this.n = n;
      par = new int[n];
      rank = new int[n];
      size = new int[n];
      for (int i=0;i<n;i++) {
        par[i] = i;
        size[i] = 1;
      }
    }
    private int find(int i) {
      if (par[i] == i) return i;
      return par[i] = find(par[i]);
    }
    private boolean same(int i,int j) {
      return find(i) == find(j);
    }
    private int size(int i) {
      return size[find(i)];
    }
    private void unite(int i,int j) {
      i = find(i);
      j = find(j);
      if (i == j) return;
      if (rank[i] < rank[j]) {
        par[i] = j;
        size[j] += size[i];
      } else {
        par[j] = i;
        size[i] += size[j];
        if (rank[i] == rank[j]) rank[i]++;
      }
    }
  }
}