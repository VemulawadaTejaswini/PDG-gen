import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int days = Integer.parseInt(sc.next());
    int[][] action = new int[days][3];
    int[][] happiness = new int[days+1][3];
    for(int i = 0; i <= days; i++) {
      for(int j = 0; j < 3; j++) {
        happiness[i][j] = 0;
      }
    }
    for(int i = 0; i < days; i++) {
      for(int j = 0; j < 3; j++) {
        action[i][j] = Integer.parseInt(sc.next());
      }
    }
    for(int i = 0; i < days; i++) {
      for(int j = 0; j < 3; j++) {
        for(int k = 0; k < 3; k++) {
          if(j == k) continue;
          happiness[i+1][j] = Math.max(happiness[i+1][j], happiness[i][k] + action[i][j]);
        }
      }
    }
    int answer = maxThree(happiness[days][0], happiness[days][1], happiness[days][2]);
    System.out.println(answer);
  }

  public static int maxThree(int a, int b, int c) {
    int ans = a;
    if(ans < b) ans = b;
    if(ans < c) ans = c;
    return ans;
  }
}
