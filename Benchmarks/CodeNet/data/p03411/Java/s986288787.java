import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static int N;

  public static void main(String[] args) {
    N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    int[] C = new int[N];
    int[] D = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      C[i] = sc.nextInt();
      D[i] = sc.nextInt();
    }
    BiMatching bm = new BiMatching(N, N);
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (A[i] < C[j] && B[i] < D[j]) {
          bm.addEdge(i, j);
        }
      }
    }
    System.out.println(bm.matching());
  }

  static class BiMatching {
    ArrayList<ArrayList<Integer>> left = new ArrayList<>();
    ArrayList<ArrayList<Integer>> right = new ArrayList<>();
    int[] l2r, r2l;

    BiMatching(int n, int m) {
      l2r = new int[n];
      r2l = new int[m];
      Arrays.fill(l2r, -1);
      Arrays.fill(r2l, -1);
      for (int i = 0; i < n; ++i) {
        left.add(new ArrayList<>());
      }
      for (int i = 0; i < m; ++i) {
        right.add(new ArrayList<>());
      }
    }

    void addEdge(int ln, int rn) {
      left.get(ln).add(rn);
      right.get(rn).add(ln);
    }

    int matching() {
      int res = 0;
      for (int i = 0; i < left.size(); ++i) {
        if (l2r[i] != -1) continue;
        boolean[] visited = new boolean[right.size()];
        for (int j = 0; j < left.get(i).size(); ++j) {
          if (dfs(left.get(i).get(j), visited)) {
            l2r[i] = left.get(i).get(j);
            r2l[left.get(i).get(j)] = i;
            ++res;
            break;
          }
        }
      }
      return res;
    }

    boolean dfs(int rn, boolean[] visited) {
      int l = r2l[rn];
      if (l == -1) {
        return true;
      }
      visited[rn] = true;
      for (int i = 0; i < left.get(l).size(); ++i) {
        int r = left.get(l).get(i);
        if (visited[r]) continue;
        if (dfs(r, visited)) {
          r2l[r] = l;
          l2r[l] = r;
          return true;
        }
      }
      return false;
    }
  }
}
