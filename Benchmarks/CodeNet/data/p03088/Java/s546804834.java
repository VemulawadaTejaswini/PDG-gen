import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long MOD = (long)Math.pow(10, 9) + 7;
    long[][][][] dp = new long[100][4][4][4];
    for(int j = 0; j < 4; j++) {
      for(int k = 0; k < 4; k++) {
        for(int l = 0; l < 4; l++) {
          if(!(((j == 0) && (k == 2) && (l == 1)) || ((j == 2) && (k == 0) && (l == 1)) || ((j == 0) && (k == 1) && (l == 2)))) dp[2][j][k][l] = 1;
        }
      }
    }
    for(int i = 3; i < 100; i++) {
      for(int j = 0; j < 4; j++) {
        for(int k = 0; k < 4; k++) {
          for(int l = 0; l < 4; l++) {
            if(!(((j == 0) && (k == 2) && (l == 1)) || ((j == 2) && (k == 0) && (l == 1)) || ((j == 0) && (k == 1) && (l == 2)))) {
              if(l == 1) {
                if(k == 2) {
                  long sum = 0;
                  for(int m = 1; m < 4; m++) {
                    sum = (sum + dp[i - 1][m][j][k]) % MOD;
                  }
                  dp[i][j][k][l] = sum;                 
                } else {
                  if(j == 2) {
                    long sum = 0;
                    for(int m = 1; m < 4; m++) {
                      sum = (sum + dp[i - 1][m][j][k]) % MOD;
                    }
                    dp[i][j][k][l] = sum;                   
                  } else {
                    long sum = 0;
                    for(int m = 0; m < 4; m++) {
                      sum = (sum + dp[i - 1][m][j][k]) % MOD;
                    }
                    dp[i][j][k][l] = sum;                    
                  }
                }
              } else {
                long sum = 0;
                for(int m = 0; m < 4; m++) {
                  sum = (sum + dp[i - 1][m][j][k]) % MOD;
                }
                dp[i][j][k][l] = sum;
              }
            }
          }
        }
      }
    }
    long ans = 0;
    for(int j = 0; j < 4; j++) {
      for(int k = 0; k < 4; k++) {
        for(int l = 0; l < 4; l++) {
          ans = (ans + dp[n - 1][j][k][l]) % MOD;
        }
      }
    }
    System.out.println(ans);
  }
}