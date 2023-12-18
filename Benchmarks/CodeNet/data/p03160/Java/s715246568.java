package AtcoderDP;
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(reader.readLine());
    int[] h = new int[N + 1];
    String[] line = reader.readLine().split(" ");
    for(int i = 1; i <= line.length; i++){
      h[i] = Integer.parseInt(line[i-1]);
    }
    if( N == 2){
      System.out.println(h[2] - h[1]);
      return;
    }
    int[] dp = new int[N + 1];
//    dp[0] =
    dp[2] = Math.abs(h[2] - h[1]);
    for (int i = 3; i <= N; i++){
      dp[i] = Math.min(dp[i - 1] + Math.abs(h[i] - h[i - 1]),
              dp[i - 2] + Math.abs(h[i] - h[i - 2]));
    }
//    System.out.println(Arrays.toString(dp));
    System.out.println(dp[N]);

  }
}
