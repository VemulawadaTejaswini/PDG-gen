import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[][] divisor = createDivisorTable(N);
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= i; j++) {
        divisor[0][j] += divisor[i][j];
      }
    }

    // 75 = (4+1)*(4+1)*(2+1)
    // 75 = (14+1)*(4+1)
    // 75 = (24+1)*(2+1)
    // 75 = 74+1
    int more74 = 0;
    int more24 = 0;
    int more14 = 0;
    int more4 = 0;
    int more2 = 0;
    for (int i = 1; i <= N; i++) {
      int a = divisor[0][i];
      if (a >= 74) more74++;
      if (a >= 24) more24++;
      if (a >= 14) more14++;
      if (a >= 4) more4++;
      if (a >= 2) more2++;
    }
    int ans = more74 + more24*(more2-1) + more14*(more4-1)
      + more4*(more4-1)*(more2-2) / 2; 
    System.out.println(ans);
  }
  
  private static int[][] createDivisorTable(int n) {

    int[][] d = new int[n+1][n+1];
    for (int i = 1; i <= n; i++) {
      boolean isPrime = true;
      for (int j = 2, work = i; j < i; j++) {
        while (work % j == 0) {
          isPrime = false;
          work /= j;
          d[i][j]++;
        }
      }
      if (isPrime) {
        d[i][i] = 1;
      }
    }
    return d;
  }
}