import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(br.readLine());
    br.close();
    System.out.println(solve(k));
  }

  static String solve(int k) {
    String ret = "";
    if (k < 10) {
      return String.valueOf(k);
    }
    int lunCnt = 9;
    int[][] dp = new int[32][10];
    for (int i = 0; i <= 9; i++) {
      dp[1][i] = 1;
    }
    int digit = 1;
    int pos = 0;
    int remain = 0;

    loop:
    {
      while (true) {
        digit++;
        for (int i = 0; i <= 9; i++) {
          for (int j = Math.max(0, i - 1); j <= Math.min(9, i + 1); j++) {
            dp[digit][i] += dp[digit - 1][j];
          }
          if (i != 0) {
            if (lunCnt + dp[digit][i] >= k) {
              remain = k - lunCnt;
              pos = i;
              break loop;
            } else {
              lunCnt += dp[digit][i];
            }
          }
        }
      }
    }
    ret += pos;
    digit--;
    while(digit > 0){
      for(int i = Math.max(0, pos - 1); i <= Math.min(9, pos + 1); i++){
        if(remain > dp[digit][i]){
          remain -= dp[digit][i];
        } else {
          ret += i;
          pos = i;
          break;
        }
      }
      digit--;
    }
    return ret;
  }
}
