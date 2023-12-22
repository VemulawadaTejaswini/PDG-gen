import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Integer> memo = new HashMap<>();
    int n = sc.nextInt();
    int[] v_array = new int[n + 1];
    int[] w_array = new int[n + 1];
    for(int i = 1; i <= n; i++){
      v_array[i] = sc.nextInt();
      w_array[i] = sc.nextInt();
    }
    int q = sc.nextInt();
    for(int i = 0; i < q; i++){
      int v = sc.nextInt();
      int l = sc.nextInt();

      int[] dp = new int[l+ 1];
      int[] dp_old = new int[l + 1];
      while(v > 0){
        int curW = w_array[v];
        int curV = v_array[v];
        for(int j = 0; j <= l; j++){
          if(j >= curW){
            dp[j] = Math.max(dp_old[j - curW] + curV, dp_old[j]);
          }
        }
        System.arraycopy(dp, 0, dp_old, 0, dp.length);
        v /= 2;
      }
      System.out.println(dp[l]);
    }
  }
}