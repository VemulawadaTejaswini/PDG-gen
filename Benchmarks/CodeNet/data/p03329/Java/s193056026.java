import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] dp=new int[n+1];
    int[] a={6,9,36,81,216,729,1296,6561,7776,46656,59049};
    Arrays.fill(dp,Integer.MAX_VALUE-7);
    dp[n]=0;
    for(int i=n;i>=0;i--){
      if(dp[i]!=Integer.MAX_VALUE-7){
        for(int j=0;j<11;j++){
          if(i>=a[j]){
            dp[i-a[j]]=Math.min(dp[i]+1,dp[i-a[j]]);
          }
        }
      }
    }
    int min=Integer.MAX_VALUE;
    for(int i=0;i<6&&i<dp.length;i++){
      min=Math.min(dp[i]+i,min);
    }
    System.out.println(min);
  }
}
