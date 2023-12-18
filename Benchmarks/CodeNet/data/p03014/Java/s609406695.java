import java.util.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    char[][] grid = new char[H][W];
    for (int i = 0; i < H; i++) {
      String string = sc.next();
      for (int j = 0; j < W; j++) {
        grid[i][j] = string.charAt(j);
      }
    }

    int maxValue = 0;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (grid[i][j] == '.') {
          int value = calc(grid, i, j);
          if (maxValue < value) {
            maxValue = value;
          }
        }
      }
    }
    
    System.out.println(maxValue);
  }
  
  private static int calc(char[][] grid, int i, int j) {

    int count = 1;
    // up
    int a = i-1;
    while (a >= 0 && grid[a][j] == '.') {
      a--;
      count++;
    }
    // down
    a = i+1;
    while (a < grid.length && grid[a][j] == '.') {
      a++;
      count++;
    }
    // right
    a = j+1;
    while (a < grid[i].length && grid[i][a] == '.') {
      a++;
      count++;
    }
    // left
    a = j-1;
    while (a >=0 && grid[i][a] == '.') {
      a--;
      count++;
    }
    
    return count;
  }
}