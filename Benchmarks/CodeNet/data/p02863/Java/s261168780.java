import java.util.*;

class Main{
    public static final int MOD = (int)1e9+7; 
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      int t = Integer.parseInt(sc.next());
      int[] a = new int[n];
      int[] b = new int[n];
      long[] x = new long[n];
      for(int i=0; i<n; i++){
        a[i] = Integer.parseInt(sc.next());
        b[i] = Integer.parseInt(sc.next());
        x[i] = ((long)a[i]<<32)|b[i];
      }
      Arrays.sort(x);
      int[] dp = new int[6060];
      for(int i=0; i<n; i++){ 
          int tb = (int)x[i];
          int ta = (int)(x[i]>>32);
          //System.out.println(ta);
          for(int j=t-1; j>=0; j--){
              dp[j+ta] = Math.max(dp[j+ta],dp[j]+tb);
          }
      }
      int ans = 0;
      for(int i=0; i<dp.length; i++){
          //System.out.println(dp[i]);
          ans = Math.max(dp[i], ans);
      }
      System.out.println(ans);
    }
}
