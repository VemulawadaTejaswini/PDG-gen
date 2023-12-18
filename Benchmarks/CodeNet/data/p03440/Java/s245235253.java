import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static int N, M;
  static long[] A;
  static ArrayList<ArrayList<Integer>> nei = new ArrayList<>();
  static PriorityQueue<Tree> cost = new PriorityQueue<>();

  public static void main(String[] args) {
    N = sc.nextInt();
    M = sc.nextInt();
    if ((N - 1 - M) * 2 > N) {
      System.out.println("Impossible");
      return;
    }
    if (M == N -1) {
      System.out.println(0);
      return;
    }
    A = new long[N];
    for (int i = 0; i < N; i++) {
      A[i] = Long.parseLong(sc.next());
      nei.add(new ArrayList<>());
    }
    for (int i = 0; i < M; i++) {
      int X = Integer.parseInt(sc.next());
      int Y = Integer.parseInt(sc.next());
      nei.get(X).add(Y);
      nei.get(Y).add(X);
    }
    boolean[] visited = new boolean[N];
    long ans = 0;
    int used = 0;
    for (int i = 0; i < N; i++) {
      if (visited[i]) continue;
      ArrayList<Integer> q = new ArrayList<>();
      ArrayList<Long> c = new ArrayList<>();
      q.add(i);
      c.add(A[i]);
      visited[i] = true;
      for (int j = 0; j < q.size(); j++) {
        for (int n : nei.get(q.get(j))) {
          if (visited[n]) continue;
          q.add(n);
          c.add(A[n]);
          visited[n] = true;
        }
      }
      Tree tree = new Tree();
      tree.cost.addAll(c);
      ans += tree.cost.poll();
      ++used;
      if (tree.size() > 0) cost.add(tree);
    }
    for (int i = used; i < (N - 1 - M) * 2; i++) {
      Tree t1 = cost.poll();
      Tree t2 = cost.poll();
      ans += t1.cost.peek() + t2.cost.peek();
      Tree nt = t1.removeMerge(t2);
      if (nt != null) cost.add(nt);
    }
    System.out.println(ans);
  }

  static class Tree implements Comparable<Tree> {
    PriorityQueue<Long> cost = new PriorityQueue<>();

    Tree removeMerge(Tree o) {
      this.cost.poll();
      o.cost.poll();
      if (this.size() == 0) {
        return o.size() == 0 ? null : o;
      } else if (o.size() == 0) {
        return this;
      }
      Tree ret = new Tree();
      if (this.size() < o.size()) {
        ret.cost = o.cost;
        ret.cost.addAll(this.cost);
      } else {
        ret.cost = this.cost;
        ret.cost.addAll(o.cost);
      }
      return ret;
    }

    int size() {
      return this.cost.size();
    }

    @Override
    public int compareTo(Tree o) {
      return Long.compare(this.cost.peek(), o.cost.peek());
    }
  }

}
