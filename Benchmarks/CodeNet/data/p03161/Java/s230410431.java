import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] h = new int[N+10];
    for (int i = 0; i < N; i++) {
      h[i] = sc.nextInt();
    }
    int[] dp = new int[N+10];

    dp[0] = 0;
    for (int i = 1; i <N ; i++) {
      //morau dp
      dp[i] = Integer.MAX_VALUE;

      for (int j =i-K ; j <i ; j++) {
        if(j >=0) {
          dp[i] = Math.min(dp[i], dp[j] + Math.abs(h[i]-h[j]));
        }
      }

    }
//    dp[0]=0;
//    for (int i = 0; i < N; i++) {
//      dp[i+1] = Math.min(dp[i+1], dp[i] + Math.abs(h[i] - h[i+1]));
//      dp[i+2] = Math.min(dp[i+2], dp[i] + Math.abs(h[i] - h[i+2]));
//    }

    System.out.println(dp[N-1]);


  }


}
