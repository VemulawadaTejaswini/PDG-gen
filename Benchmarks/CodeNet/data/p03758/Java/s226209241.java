import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
  static final int BUCKET = 10;
  static final boolean LOCAL = false
  static final boolean DEBUG = LOCAL && true;
  static Scanner sc = new Scanner(System.in);
  static PrintWriter writer = new PrintWriter(System.out);
  static int N;
  static char[] query;
  static int[][] graph;
  static UnionFind uf;
  static int edges;
  static int qc;
  static long seed;

  public static void main(String[] args) {
    if (args.length >= 1) {
      seed = Long.parseLong(args[0]);
    }
    N = sc.nextInt();
    if (LOCAL) generate();
    query = new char[N];
    Arrays.fill(query, '0');
    graph = new int[N][N];
    uf = new UnionFind(N);
    boolean[] used = new boolean[N];
    for (int i = 0; i < N; i++) {
      int candI = -1;
      int minCount = 1 << 30;
      for (int j = 0; j < N; j++) {
        if (used[j]) continue;
        int count = 0;
        for (int k = 0; k < N; k++) {
          if (graph[j][k] == 0)++count;
        }
        if (count < minCount) {
          candI = j;
          minCount = count;
        }
      }
      used[candI] = true;
      solve(candI);
    }
    if (LOCAL) {
      System.out.println("validate:" + validate());
      System.out.println("query count:" + qc);
    } else {
      writer.print("!");
      for (int i = 0; i < N; i++) {
        for (int j = i + 1; j < N; j++) {
          if (graph[i][j] == 1) writer.print(" (" + i + "," + j + ")");
        }
      }
      writer.println();
      writer.flush();
    }
  }

  static void solve(int axis) {
    ArrayList<Integer> pos = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      if (uf.find(axis, i) || graph[axis][i] != 0) continue;
      pos.add(i);
      if (pos.size() == BUCKET) {
        solveOne(axis, pos);
        pos.clear();
      }
    }
    if (!pos.isEmpty()) {
      solveOne(axis, pos);
    }
  }

  static void solveOne(int axis, ArrayList<Integer> pos) {
    if (edges == N - 1) return;
    pos.add(axis);
    int v = query(pos);
    if (v == 0) {
      nonEdge(pos);
      pos.remove(pos.size() - 1);
      return;
    }
    pos.remove(pos.size() - 1);
    boolean general = v >= 4;
    if (!general) {
      int nv = query(pos);
      if (nv == v) {
        for (int p : pos) {
          graph[axis][p] = graph[p][axis] = -1;
        }
        return;
      } else if (nv > 0) {
        general = true;
      } else {
        nonEdge(pos);
      }
    }
    if (general) {
      ArrayList<Integer> sub = new ArrayList<>();
      for (int i = 0; i < pos.size() / 2; i++) {
        sub.add(pos.get(i));
      }
      solveSub(axis, sub);
      sub.clear();
      for (int i = pos.size() / 2; i < pos.size(); i++) {
        sub.add(pos.get(i));
      }
      solveSub(axis, sub);
    } else {
      solveEasy(axis, pos, v);
    }
  }

  static void solveEasy(int axis, ArrayList<Integer> pos, int expect) {
    if (edges == N - 1) return;
    if (expect == 0) {
      pos.add(axis);
      nonEdge(pos);
      return;
    } else if (expect == pos.size()) {
      for (int p : pos) {
        addEdge(axis, p);
      }
      return;
    }
    ArrayList<Integer> subPos = new ArrayList<>();
    for (int i = 0; i < pos.size() / 2; i++) {
      subPos.add(pos.get(i));
    }
    subPos.add(axis);
    int sv1 = query(subPos);
    subPos.remove(subPos.size() - 1);
    solveEasy(axis, subPos, sv1);

    ArrayList<Integer> subPos2 = new ArrayList<>();
    for (int i = pos.size() / 2; i < pos.size(); i++) {
      subPos2.add(pos.get(i));
    }
    subPos2.add(axis);
    solveEasy(axis, subPos2, expect - sv1);
    return;
  }

  static int solveSub(int axis, ArrayList<Integer> pos) {
    if (edges == N - 1) return 0;
    pos.add(axis);
    int v = query(pos);
    if (v == 0) {
      nonEdge(pos);
      pos.remove(pos.size() - 1);
      return v;
    }
    pos.remove(pos.size() - 1);
    if (pos.size() == 1 && v == 1) {
      addEdge(axis, pos.get(0));
    }
    if (pos.size() == 1) return v;
    ArrayList<Integer> subPos = new ArrayList<>();
    for (int i = 0; i < pos.size() / 2; i++) {
      subPos.add(pos.get(i));
    }
    int sv1 = solveSub(axis, subPos);
    if (v < 4 && sv1 == v) {
      for (int i = pos.size() / 2; i < pos.size(); i++) {
        for (int j = 0; j < i; j++) {
          graph[pos.get(i)][pos.get(j)] = graph[pos.get(j)][pos.get(i)] = -1;
        }
      }
      return v;
    }
    subPos.clear();
    for (int i = pos.size() / 2; i < pos.size(); i++) {
      subPos.add(pos.get(i));
    }
    int sv2 = solveSub(axis, subPos);
    if (pos.size() == 2 && v == 1 && sv1 == 0 && sv2 == 0 && graph[pos.get(0)][pos.get(1)] == 0) {
      addEdge(pos.get(0), pos.get(1));
      return v;
    }
    if (v < 4 && sv2 == v) {
      for (int i = 0; i < pos.size() / 2; i++) {
        for (int j = i + 1; j < pos.size(); j++) {
          graph[pos.get(i)][pos.get(j)] = graph[pos.get(j)][pos.get(i)] = -1;
        }
      }
    }
//    if (v < 4 && v - sv1 - sv2 > 0) {
//      ArrayList<Integer> left = new ArrayList<>();
//      for (int i = 0; i < pos.size() / 2; i++) {
//        left.add(pos.get(i));
//      }
//      solveGroup(left, subPos, v - sv1 - sv2);
//    }
    return v;
  }

  static int solveGroup(ArrayList<Integer> left, ArrayList<Integer> right, int expect) {
    if (expect > 0) {
      for (int i = 0; i < left.size(); i++) {
        for (int j = 0; j < right.size(); j++) {
          if (graph[left.get(i)][right.get(j)] == 1) --expect;
        }
      }
    }
    if (expect == 0) return 0;
    if (left.size() == 1 && right.size() == 1) {
      left.add(right.get(0));
      int v = expect == 1 ? 1 : query(left);
      if (v == 1) {
        addEdge(left.get(0), right.get(0));
      } else {
        nonEdge(left);
      }
      left.remove(1);
      return v;
    }
    if (right.size() == 1) {
      return solveGroup(right, left, expect);
    }
    int v = expect;
    if (expect < 0) {
      ArrayList<Integer> all = new ArrayList<>(left);
      all.addAll(right);
      v = query(all);
      if (v == 0) {
        nonEdge(all);
        return v;
      }
    }
    ArrayList<Integer> subRight = new ArrayList<>();
    for (int i = 0; i < right.size() / 2; i++) {
      subRight.add(right.get(i));
    }
    int sv1 = solveGroup(left, subRight, -1);
    if (v == sv1) {
      for (int i = 0; i < left.size(); i++) {
        for (int j = right.size() / 2; j < right.size(); j++) {
          if (graph[left.get(i)][right.get(j)] == 1) {
            System.err.println(left + "  " + right);
            System.err.println("erased:" + left.get(i) + " " + right.get(j));
          }
          graph[left.get(i)][right.get(j)] = graph[right.get(j)][left.get(i)] = -1;
        }
      }
      nonEdge(left);
      return v;
    }
    subRight.clear();
    for (int i = right.size() / 2; i < right.size(); i++) {
      subRight.add(right.get(i));
    }
    solveGroup(left, subRight, expect - sv1);
    return v;
  }


  static void nonEdge(ArrayList<Integer> pos) {
    for (int i = 0; i < pos.size(); i++) {
      for (int j = i + 1; j < pos.size(); j++) {
        graph[pos.get(i)][pos.get(j)] = graph[pos.get(j)][pos.get(i)] = -1;
      }
    }
  }

  static void addEdge(int a, int b) {
    if (graph[a][b] == 1) return;
    graph[a][b] = graph[b][a] = 1;
    uf.union(a, b);
    ++edges;
  }

  static int query(ArrayList<Integer> pos) {
    ++qc;
    int ret;
    for (int p : pos) {
      query[p] = '1';
    }
    if (LOCAL) {
      ret = processQuery();
    } else {
      writer.write("? " + String.valueOf(query) + "\n");
      writer.flush();
      ret = sc.nextInt();
    }
    for (int p : pos) {
      query[p] = '0';
    }
    return ret;
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

  static boolean[][] ans;

  static void generate() {
    ans = new boolean[N][N];
    SplittableRandom rnd = new SplittableRandom(seed);
    UnionFind uf = new UnionFind(N);
    int count = 0;
    while (true) {
      int a = rnd.nextInt(N);
      int b = rnd.nextInt(N);
      if (uf.find(a, b)) continue;
      ans[a][b] = ans[b][a] = true;
      uf.union(a, b);
      ++count;
      if (count == N - 1) break;
    }
  }

  static int processQuery() {
    boolean[] visited = new boolean[N];
    int ret = 0;
    for (int i = 0; i < N; i++) {
      if (query[i] == '0' || visited[i]) continue;
      int d = diameter(visited, i);
      ret += d * d;
    }
    if (DEBUG) {
      System.err.println("? " + String.valueOf(query) + " " + ret);
    }
    return ret;
  }

  static int diameter(boolean[] visited, int pos) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(pos);
    for (int i = 0; i < list.size(); i++) {
      int cur = list.get(i);
      OUT:
      for (int j = 0; j < N; j++) {
        if (query[j] == '0' || !ans[cur][j]) continue;
        for (int k = 0; k < i; k++) {
          if (list.get(k) == j) continue OUT;
        }
        list.add(j);
      }
    }
    int farest = list.get(list.size() - 1);
    list.clear();
    list.add(farest);
    visited[farest] = true;
    for (int d = 0; ; d++) {
      ArrayList<Integer> next = new ArrayList<>();
      for (int cur : list) {
        for (int i = 0; i < N; i++) {
          if (query[i] == '0' || !ans[cur][i] || visited[i]) continue;
          next.add(i);
          visited[i] = true;
        }
      }
      if (next.isEmpty()) return d;
      list = next;
    }
  }

  static boolean validate() {
    if (DEBUG) {
      System.err.println("expect");
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          System.err.print(ans[i][j] ? "1" : "0");
        }
        System.err.println();
      }
      System.err.println("actual");
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          System.err.print(graph[i][j] == 1 ? "1" : "0");
        }
        System.err.println();
      }
    }
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if ((graph[i][j] == 1) != ans[i][j]) return false;
      }
    }
    return true;
  }
}


