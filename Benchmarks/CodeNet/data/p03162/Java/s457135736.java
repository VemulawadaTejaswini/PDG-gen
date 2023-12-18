import java.util.*;
import java.util.stream.IntStream;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] A = new int[N][3];
    int[][] dp = new int[N][3];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < 3; j++) {
        A[i][j] = sc.nextInt(); 
      }
    }
    for (int i = 0; i < 3; i++) {
      dp[0][i] = A[0][i]; 
    }
    for (int i = 1; i < N; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          if (j == k) continue;
          dp[i][j] = Math.max(dp[i][j], A[i][j] + dp[i-1][k]);
        }
      }
      //System.out.println(Arrays.toString(dp[i]));
    }
    System.out.println(IntStream.of(dp[N-1]).max().getAsInt());
  }
}