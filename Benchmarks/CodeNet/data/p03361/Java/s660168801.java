import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height = sc.nextInt();
    int width = sc.nextInt();
    String[] square = new String[height];
    char[][] grid = new char[height + 2][width + 2];
    for (int i = 0; i < height; i++) {
      square[i] = sc.next();
     }
    for (int i = 0; i < height + 2; i++) {
      for (int j = 0; j < width + 2; j++) {
         if (i == 0 || j == 0 || i == (height + 1) ||  j == (width + 1)) {
           grid[i][j] = '.';
         } else {
           char[] c = square[i -1].toCharArray();
           grid[i][j] = c[j - 1];
         }

      }
    }
    boolean flag = true;
    for (int i = 1; i < height + 1; i++) {
      for (int j = 1; j < width + 1; j++ ) {
        if (grid[i][j] == '#' && grid[i - 1][j] == '.' && grid[i + 1][j] == '.' && 
                                                                         grid[i][j - 1] == '.' && grid[i][j + 1] == '.') {
          flag = false;
          break;
        }

      }
      if (!flag) break;
    }
    if (flag) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  

  }
}