import java.util.Arrays;
import java.util.Scanner;

class Card {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] cards = new int[N][2];
    int[][] dp = new int[N][N];

    for(int i = 0; i < N; i++) {
      cards[i][0] = sc.nextInt();
      cards[i][1] = sc.nextInt();
    }

    for(int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if(j==i) {
          dp[j][i] = 0;
        } else {
          dp[j][i] = Integer.MAX_VALUE/2;
        }
      }
    }

    for(int i = 1; i < N; i++) {
      for(int j = 0; j + i < N; j++) {
        for (int k = j; k < j + i; k++) {
          dp[j][j + i] = Math.min(dp[j][j+i],dp[j][k] + dp[k+1][j+i] + cards[j][0] * cards[k][1]* cards[k+1][0] * cards[j+i][1]);
        }
      }
    }

    System.out.println(dp[0][N-1]);

  }
}