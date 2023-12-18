import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] edge = new int[N][N];
    for(int i = 0; i < M; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      edge[a - 1][b - 1] = 1;
      edge[b - 1][a - 1] = 1;
    }
    int[] p = new int[N];
    int count = 0;
    public void dfs(int pos, int mask) {
      if(pos == N) {
        int c = 0;
        for(int i = 0; i < N - 1; i++) {
          if(edge[p[i]][p[i + 1]] == 0) {
            c++;
            break;
          }
        }
        if(c == 0) count++;
      }
      for(int i = 0; i < N; i++) {
        if(mask & (1 << i) != 0) {
          p[pos] = i;
          dfs(pos + 1, (mask ^ (1 << i)));
        }
      }
    }
    System.out.println(dfs(1, (1 << N) - 2));
  }
}