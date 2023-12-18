import java.util.*;

public class Main {
  static final int MAX_S = 50*50+10;
  static long dp[][]; // [頂点][銀貨] 頂点で銀貨を持った状態にかかる最小時間
  static PriorityQueue<Data> q = new PriorityQueue<>(); //最適としてありうる状態を全て保持しておく優先度つきキュー、時間xが小さいほど先頭
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int s = sc.nextInt();
    ArrayList<ArrayList<Edge>> g = new ArrayList<>(n); // g<頂点<辺>> 各頂点から出る辺
    dp = new long[n][MAX_S];
    for (int i = 0; i < n; i++) {
      g.add(new ArrayList<Edge>());
    }
    for (int i = 0; i < m; i++) { // gの初期化
      int u = sc.nextInt();
      int v = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      u--; v--;
      g.get(u).add(new Edge(v, a, b));
      g.get(v).add(new Edge(u, a, b));
    }
    for (int i = 0; i < n; i++) { // dpの初期化
      for (int j = 0; j < MAX_S; j++) {
        dp[i][j] = Long.MAX_VALUE;
      }
    }
    s = Math.min(s, MAX_S);
    push(0, s, 0);
    ArrayList<Integer> c = new ArrayList<>(); //c<頂点> 各頂点で得られる銀貨
    ArrayList<Integer> d = new ArrayList<>(); //d<頂点> 各頂点で銀貨を得るのにかかる時間
    for (int i = 0; i < n; i++) {
      c.add(sc.nextInt());
      d.add(sc.nextInt());
    }

    while (!q.isEmpty()) { // ダイクストラ法を回す
      Data hoge = q.poll();
      int v = hoge.v;
      s = hoge.s;
      long x = hoge.x;
      if (dp[v][s] <= x) continue; // Data(v, s, x)より最適なものが既出ならスキップ
      // 以下お金を増やすパターンと辺を辿るパターンの遷移
      int ns = Math.min(c.get(v) ,MAX_S);
      push(v, ns, x+d.get(v));
      for (Edge e: g.get(v)) {
        push(e.to, s-e.a, x+e.b);
      }
    }
    for (int i = 1; i < n; i++) {
      long res = Long.MAX_VALUE;
      for (int j = 0; j < MAX_S; j++) {
        res = Math.min(res, dp[i][j]);
      }
      System.out.println(res);
    }
    sc.close();
  }

  static void push(int v, int s, long x) { // Data(v, s, x)が最適である時dpに追加するメソッド
    if (s < 0) return;
    if (dp[v][s] <= x) return;
    dp[v][s] = x;
    q.add(new Data(v, s, x));
  }

  static class Data implements Comparable<Data> {
    int v, s; // 頂点v,銀貨s
    long x; // 時間x
    Data(int v, int s, long x) {
      this.v = v;
      this.s = s;
      this.x = x;
    }

    @Override
    public int compareTo(Data o) {
      return Long.compare(x, o.x);
    }
  }

  static class Edge {
    int to, a, b;
    Edge(int to, int a, int b) {
      this.to = to;
      this.a = a;
      this.b = b;
    }
  }
}