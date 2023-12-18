import java.util.*;
import java.io.*;

class Main {


  

  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int H = in.nextInt();
    int W = in.nextInt();
    int MAX = 1000000007;
    char[][] A = new char[H][W];
    for (int i = 0; i < H; i++) {
      A[i] = in.next().toCharArray();
    }

    // for (int i = 0; i < H; i++) {
    //   for (int j = 0; j < W; j++) {
    //     System.out.print(A[i][j]);
    //   }
    //   System.out.println();
    // }

    int[][] dp = new int[H + 1][W + 1];
    dp[0][1] = 1;
    for (int i = 1; i <= H; i++) {
      for (int j = 1; j <= W; j++) {
        if (A[i - 1][j - 1] == '#') {dp[i][j] = 0;}
        else {
          dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MAX;
        }
      }
    }


    


    System.out.println(dp[H][W]);
  }

}