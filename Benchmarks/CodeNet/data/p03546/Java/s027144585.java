import java.util.*;
import java.io.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int[][] c = new int[10][10];
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++) {
        c[i][j] = sc.nextInt();
      } 
    }
    int sum = 0;
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        int curr = sc.nextInt();
        if(curr != -1 && curr != 1) {
          int min = Math.min(shortest1(c, curr), shortest2(c, curr));
          min = Math.min(shortest3(c, curr), min);
          min = Math.min(shortest4(c, curr), min);
          sum += min;
        }
      }
    }
    System.out.println(sum);
  }
  
  private static int shortest1(int[][] c, int n) {
    return c[n][1];
  }
  
  private static int shortest2(int[][] c, int n) {
    int min = 1000;
    for(int i = 0; i < 10; i++) {
      if(i != n || i != 1)
        min = Math.min(min, c[n][i]+c[i][1]);
    }
    return min;
  }
  
  private static int shortest3(int[][] c, int n) {
    int min = 1000;
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++)
        if(i != n || i != 1 || j != n || j != i) {
          int sum = c[n][i]+c[i][j]+c[j][1];
          min = Math.min(min, sum);
        }
    }
    return min;
  }
  
  private static int shortest4(int[][] c, int n) {
    int min = 1000;
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++)
        for(int k = 0; k < 10; k++)
          if(i != n || i != 1 || j != n || j != i || k != n || k != j) {
            int sum = c[n][i]+c[i][j]+c[j][k]+c[k][1];
            min = Math.min(min, sum);
          }
    }
    return min;
  }
}
