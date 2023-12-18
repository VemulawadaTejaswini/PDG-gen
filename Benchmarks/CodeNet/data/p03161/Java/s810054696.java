import java.util.Arrays;
import java.util.Scanner; // 文字列を標準入力からscanする

public class Main { 

  static long return_smaller(long a, long b){
    if(a > b){
      return b;
    }
      return a;
  }
    
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
		String str = "";
    str = scan.nextLine();
    String[] strs2 = str.split(" ");
    int N = Integer.parseInt(strs2[0]);
    int K = Integer.parseInt(strs2[1]);
    
    long[] hi = new long[N+K+1];
    long[] dp = new long[N+K+1];
    long oo = 1L << 60;
    Arrays.fill(dp, oo);

    str = scan.nextLine();
    String[] strs3 = str.split(" ");
    for(int i=0; i<strs3.length; i++) {
      hi[i] = Integer.parseInt(strs3[i]);
    }
    scan.close();

    int i = 0;
    int j = 0;

    dp[0] = 0;
    for (i = 0; i < N; i++) {
      for(j = 1; j <= K; j++){
        if(i-j < 0){
          break;
        }
        dp[i] = return_smaller(dp[i], dp[i-j] + Math.abs(hi[i] - hi[i-j]));
      }
    }

    System.out.println(dp[N-1]);

  }
}