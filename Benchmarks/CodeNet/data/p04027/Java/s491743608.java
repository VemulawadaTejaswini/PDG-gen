import java.util.*;

public class Main{

  public static final long MOD = 1000000007;

  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int[] x = new int[n];
    long[][] dp = new long[n+1][c+1];
    long result = 0;


    for(int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }
    for(int i=0; i<n; i++){
      b[i] = sc.nextInt();
    }

    // 初期値設定
    for(int i=0; i<n+1; i++){
      for(int j=0; j<c+1; j++){
        dp[i][j] = -1;
        if(j==0){
          dp[i][j] = 1;
        }else if(i==0 && j!=0){
          dp[i][j] = 0;
        }
      }
    }

    for(int i=0; i<n; i++){
      x[i] = a[i];
    }
    result = cal_dp(n,c,x,dp);
    pl(result);

  }

   private static long cal_dp(int i,  int j, int[] x, long[][] dp){
    
    if(dp[i][j]!=-1){
      return dp[i][j];
    }else{
      long sum = 0;
      for(int k=0; k<j+1; k++){
        sum += cal_dp(i-1,j-k,x,dp) * my_pow(x[i-1],k);
        while(sum > MOD){
          sum = sum - MOD;
        }
      }
      return dp[i][j] = sum;
    }
     
  }

  private static long my_pow(int a, int b){
    long sum = 1;
    for(int i=0; i<b; i++){
      sum = sum * a;
      while(sum > MOD){
        sum = sum - MOD;
      }
    }
    return sum;
  }

  private static void pr(Object o){
    System.out.print(o);
  }
  private static void pl(Object o){
    System.out.println(o);
  }

}
