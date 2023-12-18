import java.util.*;

public class Main {
  static int count = 0;

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
    dfs(N, edge, 0, new ArrayList<Integer>());
    System.out.println(count);
  }

  public static void dfs(int n, int[][] edge, int mask, ArrayList<Integer> list) {
    if(list.size() == n) {
      boolean flg = true;
      for(int i = 0; i < n - 1; i++) {
        if(edge[list.get(i)][list.get(i + 1)] == 0) {
          flg = false;
          break;
        }
      }
      if(flg) count++;
    } else {
      for(int j = 0; j < n; j++) {
        if((mask & (1 << j)) == 0) {
          ArrayList<Integer> list2 = (ArrayList<Integer>)list.clone();
          list2.add(j);
          dfs(n, edge, mask + (int)Math.pow(2, j), list2);
        }
      }
    }
  }
}