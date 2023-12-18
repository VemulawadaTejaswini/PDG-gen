import java.util.*;

public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] p = new int[N][3];
    int px = 0;
    int py = 0;
    int ph = 0;
    for (int i = 0; i < N; i++) {
      p[i][0] = sc.nextInt();
      p[i][1] = sc.nextInt();
      p[i][2] = sc.nextInt();
      if (p[i][2] > 0) {
        px = p[i][0];
        py = p[i][1];
        ph = p[i][2];
      }
    }
    
    for (int i = 0; i <= 100; i++) {
      for (int j = 0; j <= 100; j++) {
        int ch = Math.abs(px-i) + Math.abs(py-j) + ph;
        if (isValidH(p, i, j, ch)) {
          System.out.println(i + " " + j + " " + ch);
          return;
        }
      }
    }
  }
  
  private static boolean isValidH(int[][] p, int cx, int cy, int ch) {
    for (int k = 0; k < p.length; k++) {
      int x = p[k][0];
      int y = p[k][1];
      int h = p[k][2];
      if (ch != Math.abs(x-cx) + Math.abs(y-cy) + h) {
        return false;
      }
    }
    return true;
  }
}