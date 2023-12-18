import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int[][] c = new int[10][10];
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j< 10; j++) {
        c[i][j] = sc.nextInt();
      }
    }
    warshallFloyd(c);
    
    int ans = 0;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        int A = sc.nextInt();
        if (A != -1 && A != 1) {
          ans += c[A][1];
        }
      }
    }
    
    System.out.println(ans);
  }
  
  private static void warshallFloyd(int[][] c) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        for (int k = 0; k < 10; k++) {
          if (i != j && k != i && k != j) {
            c[i][j] = Math.min(c[i][j], c[i][k] + c[k][j]);
          }
        }
      }
    }
  }
}