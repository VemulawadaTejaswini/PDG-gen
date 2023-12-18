import java.util.Arrays;
import java.util.Scanner; // 文字列を標準入力からscanする

public class Main { 

  static long return_smaller(long a, long b){
    if(a > b){
      return b;
    }
      return a;
  }

  static long return_bigger(long a, long b){
    if(a > b){
      return a;
    }
      return b;
  }
    
  public static void main(final String[] args) {
    int N = 0;
    int W = 0;
    int i = 0;
    int value = 0;

    Scanner scan = new Scanner(System.in);
		String str = "";
    str = scan.nextLine();
    String[] strs2 = str.split(" ");
    N = Integer.parseInt(strs2[0]);
    W = Integer.parseInt(strs2[1]);

    int[] wi = new int[N+1];
    int[] vi = new int[N+1];

    for(i=1; i<=N; i++){
      str = scan.nextLine();
      String[] strs3 = str.split(" ");
      wi[i] = Integer.parseInt(strs3[0]);
      vi[i] = Integer.parseInt(strs3[1]);
    }
    scan.close();

    int V = Arrays.stream(vi).sum();
    long oo = 1L << 60;
    long[][] dp = new long[N+1][V+1];
    for(i=0; i<=N; i++){
      Arrays.fill(dp[i], oo);
    }
    dp[0][0] = 0;

    for(i=1; i<=N; i++){
      for(value = 0; value <= V; value++){
        dp[i][value] = return_smaller(dp[i][value], dp[i-1][value]);

        if(value >= vi[i]){
          dp[i][value] = return_smaller(dp[i][value], dp[i-1][value - vi[i]] + wi[i]);
        }
      }
    }

    int ans = 0;
    for(value = V; value >= 0; value--){
      if(dp[N][value] <= W){
        ans = value;
        break;
      }
    }

    System.out.println(ans);

  }
}