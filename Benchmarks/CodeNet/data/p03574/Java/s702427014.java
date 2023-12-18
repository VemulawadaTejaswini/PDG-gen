import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();

    String[][] data = new String[h][w];
    int[][] ans = new int[h][w];

    for (int i = 0; i < h; i++) {
      String s = sc.next();
      for (int j = 0; j < w; j++) {
        String k = s.substring(j,j+1);
        data[i][j] = k;
      }
    }

    if (h == 1 && w > 1) {
      for (int i = 0; i < w; i++) {
        if (data[0][i].equals("#")) {
          if (i == 0) {
            ans[0][i+1]++;
          } else if (i == w-1) {
            ans[0][i-1]++;
          } else {
            ans[0][i+1]++;
            ans[0][i-1]++;
          }
        }
      }
    } else if (h > 1 && w > 1) {
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          if (data[i][j].equals("#")) {
            if (i == 0) {
              if (j == 0) {
                ans[i][j+1]++;
                ans[i+1][j]++;
                ans[i+1][j+1]++;
              } else if (j > 0 && j < w-1) {
                ans[i][j+1]++;
                ans[i][j-1]++;
                ans[i+1][j]++;
                ans[i+1][j+1]++;
                ans[i+1][j-1]++;
              } else if (j == w-1) {
                ans[i][j-1]++;
                ans[i+1][j]++;
                ans[i+1][j-1]++;
              }
            } else if (i > 0 && i < h-1) {
              if (j == 0) {
                ans[i][j+1]++;
                ans[i+1][j]++;
                ans[i-1][j]++;
                ans[i-1][j+1]++;
                ans[i+1][j+1]++;
              } else if (j > 0 && j < w-1) {
                ans[i][j+1]++;
                ans[i][j-1]++;
                ans[i+1][j]++;
                ans[i-1][j]++;
                ans[i-1][j+1]++;
                ans[i+1][j+1]++;
                ans[i-1][j-1]++;
                ans[i+1][j-1]++;
              } else if (j == w-1) {
                ans[i][j-1]++;
                ans[i+1][j]++;
                ans[i-1][j]++;
                ans[i-1][j-1]++;
                ans[i+1][j-1]++;
              }
            } else if (i == h-1) {
              if (j == 0) {
                ans[i][j+1]++;
                ans[i-1][j]++;
                ans[i-1][j+1]++;
              } else if (j > 0 && j < w-1) {
                ans[i][j+1]++;
                ans[i][j-1]++;
                ans[i-1][j]++;
                ans[i-1][j+1]++;
                ans[i-1][j-1]++;
              } else if (j == w-1) {
                ans[i][j-1]++;
                ans[i-1][j]++;
                ans[i-1][j-1]++;
              }
            }
          }
        }
      }
    }

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (data[i][j].equals("#")) {
          System.out.print("#");
          continue;
        }
        System.out.print(ans[i][j]);
      }
      System.out.println();
    }

  }

}
