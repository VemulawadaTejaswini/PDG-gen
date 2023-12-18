import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    scan.close();

    int[][] dp = new int[N+1][K+1];

    for(int j=1; j<=K; j++) {
      dp[1][j] = 1;
    }

    int[][] gcdarray = new int[K+1][K+1];
    for(int j=1; j<=K; j++) {
      for(int jj=1; jj<=K; jj++) {
        gcdarray[j][jj] = gcd(j, jj);
      }
    }

    for(int i=2; i<=N; i++) {
      for(int j=1; j<=K; j++) {
        for(int jj=1; jj<=K; jj++) {
          dp[i][gcdarray[j][jj]] += dp[i-1][jj];
        }
      }
    }

    int sum = 0;
    for(int j=1; j<=K; j++) {
      sum += j * dp[N][j] % 1000000007;
    }

    System.out.println(sum);
  }

  public static int gcd(int a, int b) {
    int r = a % b;
    while(r != 0) {
      a = b;
      b = r;
      r = a % b;
    }
    return b;
  }
}