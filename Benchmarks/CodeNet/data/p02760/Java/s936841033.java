import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] A = new int[4][4];
    int count =0;
    for (int i =1; i<=3; i++) {
      for (int j =1; j<=3; j++) { 
      A[i][j] = sc.nextInt();
      }
    }
    int N = sc.nextInt();
    int[] B = new int[N+1];
    for (int i =1; i<=N; i++) {
      B[i] = sc.nextInt();
    }
    boolean[][] check = new boolean[N+1][N+1];
    for (int i =1; i<=N; i++) {
      for (int j =1; j<=3; j++) { 
        for (int k =1; k<=3; k++) { 
          if (B[i] == A[j][k]) {
            check[j][k] = true;
          }
        }
      }
    }
    for (int i =1; i<=3; i++) {
      if (check[i][1] && check[i][2] && check[i][3]) count++;
    }
    for (int i =1; i<=3; i++) {
      if (check[1][i] && check[2][i] && check[3][i] ) count++;
    }
    if(check[1][1] && check[2][2] && check[3][3]) count++;
    if(check[1][3] && check[2][2] && check[3][1]) count++;
    if (count != 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}