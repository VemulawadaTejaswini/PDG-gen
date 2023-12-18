import java.util.*;

public class Main {
  static long MOD = (long)Math.pow(10, 9) + 7;
  static long ans = 1;
  static ArrayList[] tree;
  static long[] kai;
  static long k;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    k = sc.nextLong();
    tree = new ArrayList[n + 1];
    for(int i = 1; i < n + 1; i++) {
      tree[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < n - 1; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      ArrayList<Integer> ta = tree[a];
      ArrayList<Integer> tb = tree[b];
      ta.add(b);
      tb.add(a);
      tree[a] = ta;
      tree[b] = tb;
    }
    kai = new long[100001];
    kai[0] = 1;
    for(long i = 1; i < 100001; i++) {
      kai[(int)i] = (kai[(int)i - 1] * i) % MOD;
    }
    ans = k;
    dfs(1, 0);
    System.out.println(ans);
  }

  public static void dfs(int now, int from) {
    ArrayList<Integer> list = tree[now];
    long x = list.size();
    if(now > 1) x--;
    long t = 1;
    if(now > 1) t = kai[(int)k - 2];
    if(now == 1) t = kai[(int)k - 1];
//    long t1 = kai[(int)x];
    long t2 = 1;
    if(now > 1) t2 = kai[(int)(k - 2 - x)];
    if(now == 1) t2 = kai[(int)(k - 1 - x)];
//    t1 = func(t1, MOD - 2);
    t2 = func(t2, MOD - 2);
    t = (t * t2) % MOD;
//    t = (t * t2) % MOD;
    ans = (ans * t) % MOD;
    for(int i = 0; i < list.size(); i++) {
      int g = list.get(i);
      if(g != from) dfs(g, now);
    }
  }

  public static long func(long a, long x) {
    if(x == 0) return 1;
    if(x % 2 == 0) {
      long t = func(a, x / 2);
      return (t * t) % MOD;
    } else {
      long t = func(a, x / 2);
      t = (t * t) % MOD;
      return (a * t) % MOD;      
    }
  }
}