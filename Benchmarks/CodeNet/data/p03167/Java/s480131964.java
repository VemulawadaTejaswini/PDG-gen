import java.util.*;

public class Main {
    public static int solve(int n, int m, char[][] arr) {
      int[][] memo = new int[n][m];
      for(int i = 0; i < n; i++) {
        Arrays.fill(memo[i],-1);
      }
      
      return dfs(arr, n, m, 0, 0, 0,memo);
      //return 0;
    }

    private static int dfs(char[][] arr, int n, int m, int x, int y, int currentPath, int[][] memo) {
      if(x>= n || y >= m || arr[x][y] == '#')
        return 0;
      
      if(memo[x][y] != -1){
        return memo[x][y];
      }
      
      if(x == n - 1 && y == m - 1) {
        return 1;
      }
      
      int result = 0;
      arr[x][y] = '#';
      result += dfs(arr, n, m, x + 1, y, currentPath,memo) % 1000000007;
      result += dfs(arr, n, m, x, y + 1, currentPath, memo) % 1000000007;
      arr[x][y] = '.';
      memo[x][y] = result % 1000000007;
      return result % 1000000007;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
          char[] s = scanner.next().toCharArray();
          for(int j = 0; j < m; j++) {
            arr[i][j] = s[j];
          }
        }

      	int result = solve(n,m,arr);
        System.out.println(result);
    }
}