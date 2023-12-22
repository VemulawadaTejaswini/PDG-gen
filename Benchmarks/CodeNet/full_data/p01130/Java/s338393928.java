
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      int s = sc.nextInt();
      int g1 = sc.nextInt();
      int g2 = sc.nextInt();

      if(n == 0 && m == 0 && s == 0 && g1 == 0 && g2 == 0) break;

      s = s-1;
      g1 = g1-1;
      g2 = g2-1;

      int[][] cost = new int[n][n];


      int b1, b2;

      for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
          if(i == j) cost[i][j] = 0;
          else cost[i][j] = Integer.MAX_VALUE / 10;
        }
      }

      for(int i = 0; i < m; i++) {
        b1 = sc.nextInt()-1;
        b2 = sc.nextInt()-1;
        cost[b1][b2] = sc.nextInt();
      }
      
      for(int k = 0; k < n; k++) {
        for(int i = 0; i < n; i++) {
          for(int j = 0; j < n; j++) {
              cost[i][j] = Math.min(cost[i][j] , cost[i][k] + cost[k][j]);
          }
        }
      }

      int p4 = Integer.MAX_VALUE / 10;

      for(int k = 0; k < n; k++) {
        p4 = Math.min(p4, cost[s][k] + cost[k][g1] + cost[k][g2]);
      }

      System.out.println(p4);
  
    }
  }
}