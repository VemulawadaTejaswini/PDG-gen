import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] h = new int[n+k];
    for(int i=0;i<n;i++){
      h[i]=sc.nextInt();
    }
    int[] dp = new int[n+k];
    Arrays.fill(dp,Integer.MAX_VALUE);
    dp[0]=0;
    dp[1]=Math.abs(h[0]-h[1]);
    
    for(int i=0;i<n-1;i++){
      for(int j=1;j<=k;j++){
        dp[i+j]=Math.min(dp[i]+Math.abs(h[i]-h[i+j]),dp[i+j]);
      }
    }
    
    System.out.println(dp[n-1]);
  }
}