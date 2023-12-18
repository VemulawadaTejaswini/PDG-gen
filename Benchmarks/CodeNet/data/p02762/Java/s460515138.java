// ref. https://atcoder.jp/contests/abc157/submissions/10472433
// @sunuke

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();
    UnionFind friendsGroup = new UnionFind(N);
    int[] friendSize = new int[100_000 + 5];
    Map<Integer, List<Integer>> block = new HashMap<>();
    for (int i = 0; i < M; i++) {
      int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
      friendSize[a]++;
      friendSize[b]++;
      friendsGroup.unite(a, b);
    }
    for (int i = 0; i < K; i++) {
      int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
      block.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
      block.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
    }
    for (int i = 0; i < N; i++) {
      int ans = friendsGroup.size(i) - 1 - friendSize[i];
      for (int to : block.getOrDefault(i, Collections.emptyList())) {
        if (friendsGroup.find(i) == friendsGroup.find(to)) ans--;
      }
      System.out.println(ans);
    }
  }
  static class UnionFind {
    int[] parent;
    int[] size;
    int[] rank;
    UnionFind(int n) {
      parent = new int[n];
      for (int i = 0; i < n; i++) {
        parent[i] = i;
      }
      size = new int[n];
      Arrays.fill(size, 1);
      rank = new int[n];
    }
    int size(int i) {
      return size[find(i)];
    }
    void unite(int a, int b) {
      int a1 = find(a), b1 = find(b);
      if (a1 == b1) return;
      if (rank[a1] > rank[b1]) {
        parent[b1] = a1;
        size[a1] += size[b1];
      } else {
        parent[a1] = b1;
        size[b1] += size[a1];
        if (rank[a1] == rank[b1]) {
          rank[a1]++;
        }
      }
    }
    int find(int a){
      if (parent[a] == a) return a;
      return  parent[a] = find(parent[a]);
    }
  }
}
