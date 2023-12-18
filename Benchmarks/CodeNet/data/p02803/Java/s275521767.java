import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      char[][] grid = new char[h][w];
      for(int i = 0; i < h; i++)
        grid[i] = sc.next().toCharArray();

      int maxDist = Integer.MIN_VALUE; 
      for(int i = 0; i < h; i++) {
        for(int j = 0; j < w; j++) {
          if(grid[i][j] == '#') continue;
          maxDist = Math.max(maxDist, bfs(grid, i, j));
        }
      }
      System.out.println(maxDist);
  }

  private static int bfs(char[][] grid, int row, int col) {
      int rows = grid.length;
      int cols = grid[row].length;

      Queue<Integer> queue = new LinkedList<>();
      queue.offer(row * cols + col);
      Set<Integer> visited = new HashSet<>();
      visited.add(row * cols + col);
      int step = 0;
      int[] rowsArr = new int[]{-1, 1, 0, 0};
      int[] colsArr = new int[]{0, 0, -1, 1};
      while(!queue.isEmpty()) {
          int size = queue.size();
          for(int i = 0; i < size; i++) {
              int idx = queue.poll();
              int r = idx / cols;
              int c = idx % cols;
              for(int d = 0; d < rowsArr.length; d++) {
                int nextRow = r + rowsArr[d];
                int nextCol = c + colsArr[d];
                if(!isValid(grid, visited, nextRow, nextCol)) continue;
                queue.offer(nextRow * cols + nextCol);
                visited.add(nextRow * cols + nextCol);
              }
          }
          if(!queue.isEmpty())
            step++; 
      }
      return step;
  }

  private static boolean isValid(char[][] grid, Set<Integer> visited, int row, int col) {
    if(row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || grid[row][col] == '#' || visited.contains(row * grid[row].length + col))
      return false;
    return true;
  }
}