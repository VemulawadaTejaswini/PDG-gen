import java.util.Scanner;

public class Main {
  public static int[][] dp;
  public static int H;
  public static int W;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    H = scan.nextInt();
    W = scan.nextInt();
    char[][] S = new char[H][W];
    for(int i=0; i<H; i++) {
      String row = scan.next();
      for(int j=0; j<W; j++) {
        S[i][j] = row.charAt(j);
      }
    }
    scan.close();

    dp = new int[H][W];
    int max = 0;

    for(int ii=0; ii<H; ii++) {
      for(int jj=0; jj<W; jj++) {
        if(S[ii][jj] == '.') {

    for(int i=0; i<H; i++) {
      for(int j=0; j<W; j++) {
        if(S[i][j] == '#') {
          dp[i][j] = -1;
        }
        else if(S[i][j] == '.') {
          dp[i][j] = Integer.MAX_VALUE;
        }
      }
    }
    move(0, ii, jj);
    for(int i=0; i<H; i++) {
      for(int j=0; j<W; j++) {
        if(max < dp[i][j]) {
          max = dp[i][j];
        }
      }
    }

        }
      }
    }
    System.out.println(max);
  }

  public static void move(int step, int h, int w) {
    dp[h][w] = step;
    if(0 < h && dp[h-1][w] != -1) {
      if(dp[h-1][w] > step+1) {
        move(step+1, h-1, w);
      }
    }
    if(0 < w && dp[h][w-1] != -1) {
      if(dp[h][w-1] > step+1) {
        move(step+1, h, w-1);
      }
    }
    if(h < H-1 && dp[h+1][w] != -1) {
      if(dp[h+1][w] > step+1) {
        move(step+1, h+1, w);
      }
    }
    if(w < W-1 && dp[h][w+1] != -1) {
      if(dp[h][w+1] > step+1) {
        move(step+1, h, w+1);
      }
    }
  }
}