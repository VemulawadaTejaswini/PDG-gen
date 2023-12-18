import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = sc.nextInt();
    int[][] imos = new int[c][100002];
    for(int i = 0; i < n; i++) {
      int s = sc.nextInt();
      int t = sc.nextInt();
      int u = sc.nextInt();
      imos[u - 1][s]++;
      imos[u - 1][t + 1]--;
    }
    for(int i = 0; i < c; i++) {
      for(int j = 1; j < 100002; j++) {
        imos[i][j] += imos[i][j - 1];
        if(imos[i][j] > 0) imos[i][j] = 1; 
      }
    }
    int ans = 0;
    for(int j = 1; j < 100002; j++) {
      int sum = 0;
      for(int i = 0; i < c; i++) {
        sum += imos[i][j];
      }
      ans = Math.max(ans, sum);
    }
    System.out.println(ans);
  }
}