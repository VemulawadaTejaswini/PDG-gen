import java.util.Arrays;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] h = new int[N+10];
    for (int i = 0; i < N; i++) {
      h[i] = sc.nextInt();
    }
    int[] dp = new int[N+10];

    Arrays.fill(dp,Integer.MAX_VALUE);

    dp[0] = 0;
    dp[1] = Math.abs(h[0]-h[1]);
    for (int i = 2; i <N ; i++) {

      //kubaru dp
      dp[i] = Math.min(
          ( dp[i-2] + Math.abs(h[i-2]-h[i]))  ,
          ( dp[i-1] + Math.abs(h[i-1]-h[i]))
          );
    }
//    dp[0]=0;
//    for (int i = 0; i < N; i++) {
//      dp[i+1] = Math.min(dp[i+1], dp[i] + Math.abs(h[i] - h[i+1]));
//      dp[i+2] = Math.min(dp[i+2], dp[i] + Math.abs(h[i] - h[i+2]));
//    }

    System.out.println(dp[N-1]);


  }


}
