import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] m = new int[10][10];
    for (int i = 1; i <= N; i++ ) {
      int l = i;
      while (l/10 > 0) {
        l /= 10;
      }
      int r = i%10;
      m[l][r]++;
    }
    
    long ans = 0;
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        ans += (long)m[i][j]*m[j][i];
      }
    }
    
    System.out.println(ans);
  }
}