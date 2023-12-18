import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static PrintWriter writer = new PrintWriter(System.out);
  static int N;
  static char[] query;
  static boolean[][] graph;
  static UnionFind uf;
  static int count = 0;

  public static void main(String[] args) {
    N = sc.nextInt();
    query = new char[N];
    Arrays.fill(query, '0');
    graph = new boolean[N][N];
    uf = new UnionFind(N);
    for (int i = 0; i < N; i++) {
      solve(i);
    }
    writer.print("!");
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if (graph[i][j]) writer.print(" (" + i + "," + j + ")");
      }
    }
    writer.println();
    writer.flush();
  }

  static void solve(int axis) {
    final int BUCKET = 20;
    ArrayList<Integer> pos = new ArrayList<>();
    for (int i = axis + 1; i < N; i++) {
      pos.add(i);
      if (pos.size() == BUCKET) {
        solveSub(axis, pos);
        pos.clear();
      }
    }
    if (!pos.isEmpty()) {
      solveSub(axis, pos);
    }
  }

  static int solveSub(int axis, ArrayList<Integer> pos) {
    if (count == N - 1) return 0;
    pos.add(axis);
    int v = query(pos);
    pos.remove(pos.size() - 1);
    if (v == 0) return v;
    if (pos.size() == 1 && v == 1) {
      graph[axis][pos.get(0)] = graph[pos.get(0)][axis] = true;
      uf.union(axis, pos.get(0));
      ++count;
    }
    if (pos.size() == 1) return v;
    ArrayList<Integer> subPos = new ArrayList<>();
    for (int i = 0; i < pos.size() / 2; i++) {
      subPos.add(pos.get(i));
    }
    int sv = solveSub(axis, subPos);
    if (sv == v) return v;
    subPos.clear();
    for (int i = pos.size() / 2; i < pos.size(); i++) {
      subPos.add(pos.get(i));
    }
    solveSub(axis, subPos);
    return v;
  }

  static int query(ArrayList<Integer> pos) {
    for (int p : pos) {
      query[p] = '1';
    }
    writer.write("? " + String.valueOf(query) + "\n");
    writer.flush();
    for (int p : pos) {
      query[p] = '0';
    }
    return sc.nextInt();
  }

  static class UnionFind {
    int[] set;

    UnionFind(int n) {
      set = new int[n];
      Arrays.fill(set, -1);
    }

    void union(int a, int b) {
      int rtA = root(a);
      int rtb = root(b);
      if (rtA == rtb) {
        return;
      }
      set[rtA] += set[rtb];
      set[rtb] = rtA;
    }

    boolean find(int a, int b) {
      return root(a) == root(b);
    }

    int root(int a) {
      if (set[a] < 0) {
        return a;
      } else {
        set[a] = root(set[a]);
        return set[a];
      }
    }

    int size(int a) {
      return -set[root(a)];
    }
  }

}


