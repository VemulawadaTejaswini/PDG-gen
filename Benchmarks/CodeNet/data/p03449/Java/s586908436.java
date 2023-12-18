import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] a = new int[2][n];
    int[] sum1 = new int[n];
    int[] sum2 = new int[n];
    for(int i = 0; i < 2; i++) {
      for(int j = 0; j < n; j++) {
        a[i][j] = sc.nextInt();
        if(i == 0) sum1[j] += a[i][j];
        if(i == 1) sum2[j] += a[i][j]; 
      }
    }
    int ans = sum1[0] + sum2[n - 1];
    for(int i = 1; i < n; i++) {
      ans = Math.max(ans, sum1[i] + sum2[n - 1] - sum2[i - 1]);
    }
    System.out.println(ans);
  }
}
