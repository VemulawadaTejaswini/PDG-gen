import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();

    int[][] dp = new int[h][w];
    int[][] map = new int[h][w];
    int max = 0;

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        map[i][j] = sc.nextInt();
        if(map[i][j] == 1){
          dp[i][j] = 0;
        }else{
          dp[i][j] = 1;
          max |= dp[i][j];
        }
      }
    }

    for (int i = 1; i < h; i++) {
      for (int j = 1; j < w; j++) {
        if(map[i][j] == 1){
          dp[i][j] = 0;
        }else{
          dp[i][j] = min(dp[i-1][j], min(dp[i-1][j-1], dp[i][j-1])) + 1;
          max = max(max, dp[i][j]);
        }
      }
    }
    out.println(max*max);
	}
}
