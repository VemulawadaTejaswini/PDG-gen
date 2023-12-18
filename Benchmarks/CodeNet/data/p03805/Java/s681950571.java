import java.util.*;

public class Main {
  static int N = 0;
  static int[][] edge;
  static int ans = 0;
  static int[] permutation = new int[8];
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    edge = new int[N][N];
    int M = sc.nextInt();
    for(int i = 0; i < M; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      edge[a][b] = 1;
      edge[b][a] = 1;
    }
    dfs(1, 1);
    System.out.println(ans);
  }

  public static void dfs(int pos, int mask) {
    if(pos == N) {
      int count = 0;
      for(int i = 0; i < N - 1; i++) {
        if(edge[permutation[i]][permutation[i + 1]] == 0) count++;
      }
      if(count == 0) ans++;
    } else {
      for(int i = 0; i < N; i++) {
        if((mask & (1 << i)) == 0) {
          permutation[pos] = i;
          dfs(pos + 1, mask ^ (1 << i));
        } 
      }
    }
  }
}